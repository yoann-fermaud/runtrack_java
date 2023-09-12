package jour5.job02;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetArgumentTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(args));
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}
