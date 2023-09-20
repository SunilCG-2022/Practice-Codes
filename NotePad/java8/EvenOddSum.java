

import java.util.Arrays;
import java.util.List;

//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
public class EvenOddSum {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,3,4,2,5,1,13,42,32,12,11,13);

        System.out.println("Numbers List"+numList);

        int evenSum = numList.stream()
        .filter(num -> num % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();

        System.out.println("Sum of even numbers : "+evenSum);

        int oddSum = numList.stream()
        .filter(num -> num % 2 != 0).mapToInt(Integer::intValue)
        .sum();

        System.out.println("Sum of odd numbers : "+oddSum);
    }
    
}
