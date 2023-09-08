package jour3.job06;

import java.util.List;

public class StringStreamTest {
    public static void main(String[] args) {
        List<String> strings = List.of("ant", "ape", "cat");
        StringStream stringStream = new StringStream(strings);
        stringStream.print();
    }
}
