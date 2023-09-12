import java.util.ArrayList;
import java.util.List;

public class class2 {
    public static void main(String[] args) {
        List<Long> list =new ArrayList<>();
        try {
            for(long ele =Integer.MAX_VALUE; ele<=Long.MAX_VALUE;ele++){
                list.add(ele);
            }
            System.out.println(list.size());
        } catch (OutOfMemoryError e) {
           System.out.println("Occured");
        }
    }
}
