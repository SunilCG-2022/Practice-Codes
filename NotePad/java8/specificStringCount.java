package java8;

import java.util.Arrays;
import java.util.List;

// Write a Java program to count the number of strings in a list that start with a specific letter using streams.
public class specificStringCount {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown","Black");

        System.out.println("Colors : "+colors);
        char stringStartsWith = 'B';

        long count = colors.stream()
        .filter(s -> s.startsWith(String.valueOf(stringStartsWith))).count();

        System.out.println("counting the Stirngs that starts with : "+stringStartsWith+" is : "+count);
        
    }
}
