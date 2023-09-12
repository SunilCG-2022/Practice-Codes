import java.util.Arrays;
import java.util.List;

public class class5 {
    public static double listSum(List < ? extends Number>list) {
        double sum =0.0;
        for(Number n:list) sum+=n.doubleValue();
        return sum;
    }
    public static void main(String[] args) {
        List<Double> id =Arrays.asList(1.4,7.0,2.6);
        System.out.println(listSum(id)); 
    }
}
