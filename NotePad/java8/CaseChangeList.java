import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaseChangeList {

    public static void main(String[] args) {
        List<String> rangers = Arrays.asList("RED","Blue","green","wHITE","yEllOW");

        System.out.println("All power rangers : "+rangers);
        List<String> toUpperCase = rangers.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList()); 
        System.out.println("All power rangers in upper case : "+toUpperCase);

        List<String> toLowerCase = rangers.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());
        System.out.println("All power rangers in upper case : "+toLowerCase);
    }
    
}