package jour3.job03;

import java.util.Map;
import java.util.TreeMap;

public class StudentMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(
                101, "Pierre",
                103, "Jean",
                102, "Marie"
        );

        Map<Integer, String> treeMap = new TreeMap<Integer, String>(map);
        StudentMap.printMap(treeMap);
    }
}
