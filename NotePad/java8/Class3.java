

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Class3 {
    public static <K,V> Stream<V> convertMapToStream(Map<K,V> map){
        return map.values().stream();
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1, "Hi");
        map.put(2, "we are collecting");
        map.put(3,"only the values.");

        System.out.println("Map : "+map);

        Stream<String> stream = convertMapToStream(map);

        System.out.println("Stream of values : "+Arrays.toString(stream.toArray()));
    }
}
