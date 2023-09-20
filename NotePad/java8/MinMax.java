import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,21,32,54,56,-22,43);

        System.out.println("Numbers : "+numbers);

        Integer minValue = numbers.stream()
        .min(Integer::compare)
        .orElse(null);

        Integer maxValue = numbers.stream()
        .max(Integer::compare)
        .orElse(null);

        System.out.println("Minimum Value : "+minValue);
        System.out.println("Maximum Value : "+maxValue);
    }
}
