package Algos;

public class HeapSort {
    
    public static void main(String[] args) {
        int[] arr = {22,13,17,11,10,12};
        HeapSort hs = new HeapSort();
        hs.sort(arr);
        hs.printArray(arr);
    }

    void sort(int[] arr){
        int length = arr.length;

        for(int i = length/2-1;i>=0;i--){
            heapify(arr,length,i);
        }
        for(int i = length-1;i>=0;i--){                  //largest element will swapped and heapify again
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i] = temp;

            heapify(arr,i,0);
        }        
    }

    void heapify(int[] arr,int n ,int i){
        int largest = i;                                //it is the parent nodeindex position
        int leftIndex = 2*i+1;                          //left child node index position
        int rightIndex = 2*i+2;                         //right child node index position

        if(leftIndex < n && arr[leftIndex] > arr[largest]){
            largest=leftIndex;
        }

        if(rightIndex < n && arr[rightIndex] > arr[largest]){
            largest = rightIndex;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    void printArray(int[] arr){
        for( int i=0; i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }
}
