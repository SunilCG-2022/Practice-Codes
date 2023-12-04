package Algos;

public class SelectionSortString {
    int min;
    String temp="";
    
    //method to sort
    void sortArray(String arr[]){
        for(int i=0;i<arr.length;i++){
            // created min so the index of i will be safe
            min = i;

            // here j=i+1 because we are comparing first value with second value so loop will be initialize from second value
            for(int j=i+1;j<arr.length;j++){
                //if the first value is bigger than second value
                if(arr[j].compareTo(arr[min])<0){
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
    void printArray(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        SelectionSortString ss = new SelectionSortString();
        //initialize an array
        String arr[] = {"sunil","bikash","mukesh","manish","shyam"};

        ss.sortArray(arr);
        ss.printArray(arr);

    }
}
