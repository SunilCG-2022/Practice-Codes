package Algos;

public class MergeSort {

    int[] array;
    int [] tempMergeArray;
    int length;
    public static void main(String[] args) {
        int inputArray[] ={48,36,13,52,19,94,21}; //Creating a integer Array
        MergeSort ms = new MergeSort();
        ms.sort(inputArray);

        for(int i:inputArray){         //printing the sorte array
            System.out.print(i+" ");
        }
    }

    public void sort(int[] inputArray){ //passing that array to the method

        this.array=inputArray;                       // storing the input array to 'array'
        this.length = inputArray.length;             //finding the length of input array
        this.tempMergeArray = new int[length];       //creating a new temporary array with same length
        divideArray(0, length-1);         //providing the starting index and ending index of the array
    }

    public void divideArray(int lowerIndex, int higherIndex){      //created a divide array method so it will devide array and sort
        if(lowerIndex<higherIndex){
            int middle = lowerIndex+(higherIndex-lowerIndex)/2;    // dividing the array from middle

            divideArray(lowerIndex, middle);                       //this recurssion will sort the left side of array

            divideArray(middle+1, higherIndex);                    //this recurssion will sort right side of array

            mergeArray(lowerIndex, middle, higherIndex);

        }
    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex){     // create a method to merge all the divided arrays

        for(int i = lowerIndex;i<=higherIndex; i++){
            // storing the original array in a temporary array
            tempMergeArray[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;

        while (i <= middle && j<=higherIndex) { 

            //while the lower index less or equal to middle and middle+1 value is less than the higher index if else will be executed

            if(tempMergeArray[i] <= tempMergeArray[j]){
                //if tempMergeArray's lowerIndex position is less than tempMergeArray's middle+1 value
                //then the lower index value will be stored in original array
                array[k] = tempMergeArray[i];
                i++;
            }else{
                //if the middle+1 value of tempMergeArray is less then
                //it will store the lower value(middle+1) 
                array[k] = tempMergeArray[j];
                j++;
            }
            k++;  
        }
        while(i<=middle){   //while lowerIndex is smaller or equal 
            //the the lowerIndex value will be stored in array
            array[k] = tempMergeArray[i];
            k++;
            i++;
        }
    }
}
