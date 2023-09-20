
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

/**
 * AsceDesceSortingOrder
 */
public class AsceDesceSortingOrder {

    public static void main(String[] args) {
        
        List<String> colors = Arrays.asList("Red","Blue","Green","Yellow");
        
        System.out.println("Unsorted colors List : "+colors);

        List<String> ascendingOrder = colors.stream().sorted().collect(Collectors.toList());

        System.out.println("Ascending Order Collected colors List : "+ascendingOrder);

        List<String> descendingOrder = colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Descending order collected colors List : "+descendingOrder);
    }
    
}