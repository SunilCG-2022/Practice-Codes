//Java program to convert Map<key,value> to stream.



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Class1 {

    public static <K,V> Stream<Entry<K, V>> convertMapToStream(Map<K,V> map){
        
        return map.entrySet().stream();
    }

    public static void main(String[] args) {
        Map<Integer,String> convertMap = new HashMap<Integer,String>();

        convertMap.put(1, "Hello!");
        convertMap.put(2, "Welcome");
        convertMap.put(3, "Happy Leanring");

        System.out.println("Map :"+convertMap);

        Stream<Map.Entry<Integer,String>> stream = convertMapToStream(convertMap);

        System.out.println("Stream : "+Arrays.toString(stream.toArray()));
    }
}