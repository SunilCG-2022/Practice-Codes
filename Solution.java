import java.util.Arrays;

class Solution {

    public void trimMean(int[] arr) {
        Arrays.sort(arr);

        int size = (int) Math.ceil(arr.length * (0.05));
        System.out.println(size);
        double sum = 0;
        for (int i = size; i < arr.length - size; i++) {
            sum += arr[i];
        }

        System.out.println( sum / (arr.length - 2 * size));
    }

    

    public static void main(String[] args) {
        int[] array = new int[] {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3 };
        Solution solution = new Solution();
        solution.trimMean(array);
    }
}
