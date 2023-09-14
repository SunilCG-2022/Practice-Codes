package java8;
// Write a Java program to remove all duplicate elements from a list using streams.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("Original Lis : "+numList);

        List<Integer> removedDuplicateList = numList.stream()
        .distinct().map(Integer::intValue)
        .collect(Collectors.toList());

        System.out.println("Removed duplicates from the list : "+removedDuplicateList);
        
    }
}