// Write a Java program to find the second smallest and largest elements in a list of integers using streams.

import java.util.Arrays;
import java.util.List;

public class SecondSmallestLarge {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,21,32,54,56,-22,43);

        System.out.println("Numbers:" +numbers);

        Integer secondSmallest = numbers.stream()
        .distinct()
        .sorted()
        .skip(1)
        .findFirst()
        .orElse(null);

        Integer secondLargest = numbers.stream()
        .distinct()
        .sorted((a,b) -> Integer.compare(b,a))
        .skip(1)
        .findFirst()
        .orElse(null);

        System.out.println("Second smallest number: "+secondSmallest+" and second largest number : "+secondLargest );
    }
}
