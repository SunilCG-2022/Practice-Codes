import java.util.ArrayList;
import java.util.Collections;

public class ArrayToArrayListByCollections {
    
    public static void func(String arr[]){
        ArrayList<String> arrayList = new ArrayList<String>();
        Collections.addAll(arrayList, arr);
        System.out.println(arrayList);
    }
    public static void main(String[] args) {
        String arr[] = {"ahf","hoaiw","hsdbk","hbf"};
        func(arr);
    }
}
