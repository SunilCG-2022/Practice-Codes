package Algos;

public class BubbleSortString {
    void sortArray(String arr[]){
        String temp;
        
        //this loop will be for number of rounds
        for(int i = 0;i<arr.length;i++){
            int flag=0;
            //for the two adjacent values
            // here arr.length-1-i because to ignore the last value which is a bigger value
            for(int j = 0;j<arr.length-1-i;j++){
                //check if the first adjacent value is greater than second value
                if(arr[j].compareTo(arr[j+1])>0){
                    //then swap the values
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    flag = 1;
                }
            }
            //here flag is for when we have a bigger array and the numbers are already swapped but the round will continue
            //so by putting the flag we can break that loop
            if(flag == 0){
                break;
            }
        }
    }
    void printArray(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        BubbleSortString bs= new BubbleSortString();
        String arr[] = {"sunil","bikash","mukesh","manish","shyam","vivek"};
        bs.sortArray(arr);
        bs.printArray(arr);
    }
}
