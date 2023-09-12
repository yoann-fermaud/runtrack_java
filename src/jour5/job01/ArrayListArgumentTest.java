package jour5.job01;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListArgumentTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(args));
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
