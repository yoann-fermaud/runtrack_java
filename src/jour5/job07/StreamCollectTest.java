package jour5.job07;

import java.util.ArrayList;
import java.util.List;

public class StreamCollectTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (String arg : args) {
            int parseIntArg = Integer.parseInt(arg);
            list.add(parseIntArg);
        }

        List<Integer> listTree = list.stream().filter(e -> e < list.get(0)).toList();

        System.out.print("Numbers less than " + list.get(0) + ": ");
        for (int i = 0; i < listTree.size(); i++) {
            System.out.print(listTree.get(i));
            if (i < listTree.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
