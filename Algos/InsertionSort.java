package Algos;

public class InsertionSort {
    void sortArray(int arr[]){
        int temp,j;
        //starting the loop from second value(index 1)
        for(int i=1;i<arr.length;i++){
            temp=arr[i];                 //storing the second value to check
            j=i;                         //storing the index of second value in j
            while(j>0 && arr[j-1]>temp){ //here we are checking if the first value is bigger than the second value
                arr[j] = arr[j-1];       //if above is true then store the 0 index value to 1
                j=j-1;                   //then again to initialize from the previous value storing value j
            }
            arr[j]=temp;
        }
    }
    void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {5,1,6,2,4,3};
        InsertionSort is = new InsertionSort();
        is.sortArray(arr);
        is.printArray(arr);

        
    }
}
