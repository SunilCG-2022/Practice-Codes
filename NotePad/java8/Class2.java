

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Class2 {

    // Generic function to convert List of
    // String to List of Integer
    public static <K, V> Stream<K> convertMapToStream(Map<K, V> map) {

        return map.keySet().stream();
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Hi");
        map.put(3, "How are You");

        System.out.println("Map : " + map);

        Stream<Integer> stream = convertMapToStream(map);

        System.out.println("Stream : " + Arrays.toString(stream.toArray()));
    }

}
