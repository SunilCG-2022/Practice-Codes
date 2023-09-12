import java.util.ArrayList;

public class ArrayToArrayList {
    
    public static void arr(int[] array){
        ArrayList<Integer> arrayList = new ArrayList<>();

    for(int i=0;i<array.length;i++){
        arrayList.add(new Integer(array[i]));
    }
    System.out.println(arrayList);
    }
    public static void main(String[] args) {
        int[] array = {1,34,535,32,1,434,5,55};
        arr(array);
    }
}
