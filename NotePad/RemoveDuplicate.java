import java.util.Arrays;

// public class RemoveDuplicate {
//     public static int removeDuplicate(int[] num,int n){
//         if(n == 0 || n==1){
//             System.out.println(n);
//             return n;
//         }
        
//         int[] temp = new int[n];
//         int j = 0;

//         for(int i = 0;i<n-1;i++){
//             if(num[i] != num[i+1]){
//                 temp[j++] = num[i];
//             }
//         }
//         temp[j++] = num[n-1];
        
//         for(int i=0;i<j;i++){
//             num[i] = temp[i];
//         }
//         System.out.println(j);
//         return j;
//     }
//     public static void main(String[] args) {
        
//         int[] num = {1,1,3,3,2,4,4,4,5};
//         int n = num.length;

//         n=removeDuplicate(num, n);

//         for(int i=0;i<n;i++){
//             System.out.println(num[i] +" ");
//         }
//     }
// }

/**
 * RemoveDuplicate
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        int array[] = {1,2,3,3,4,4,5};

        int uniqueArray[] = removeDuplicates(array);

        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array){
        int n = array.length;

        Arrays.sort(array);
        int count = 1;

        for(int i = 1; i<n;i++){
            if(array[i] != array[i-1]){
                count++;
            }
        }

        int[] uniqueArray = new int[count];
        uniqueArray[0] = array[0];
        int index = 1;

        for(int i = 1; i<n;i++){
            if(array[i] != array[i-1]){
                uniqueArray[index] = array[i];
                index++;
            }
        }


        return uniqueArray;

    }
}