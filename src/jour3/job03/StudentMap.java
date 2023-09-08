package jour3.job03;

import java.util.Map;
import java.util.TreeMap;

public class StudentMap {
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
