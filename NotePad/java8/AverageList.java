package java8;

//Write a Java program to calculate the average of a list of integers using streams.

import java.util.Arrays;
import java.util.List;

public class AverageList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,3,2,5,8,12,34);

        System.out.println("List of numbers : "+num);
        
        double average = num.stream()
        .mapToDouble(Integer::doubleValue)
        .average()
        .orElse(0.0);

        System.out.println("Average value of the numbers : "+average);
    }
    
}
