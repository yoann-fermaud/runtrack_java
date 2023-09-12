package jour5.job03;

import java.util.HashMap;
import java.util.Map;

public class HashMapArgumentTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < args.length; i += 2) {
            hashMap.put(args[i], args[i + 1]);
        }

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
