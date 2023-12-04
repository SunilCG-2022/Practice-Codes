package Algos;
public class SelectionSortArray {

    int min,temp=0;
    
    //method to sort
    void sortArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            // created min so the index of i will be safe
            min = i;

            // here j=i+1 because we are comparing first value with second value so loop will be initialize from second value
            for(int j=i+1;j<arr.length;j++){
                //if the first value is bigger than second value
                if(arr[j]<arr[min]){
                    //then index value of j will be saved in min 
                    min = j;
                }
            }

            // here we will be swapping the values
            temp = arr[i];
            //swapping smalller value to index i(first position)
            arr[i]=arr[min];
            //and the first value that was there will be going to the index of smaller value 
            arr[min]=temp;
        }
    }

    // method to print the array
    void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        SelectionSortArray ss = new SelectionSortArray();
        //initialize an array
        int arr[] = {34,52,56,1,42,5,74,23,12};

        ss.sortArray(arr);
        ss.printArray(arr);

    }
}