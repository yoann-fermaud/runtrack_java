package jour3.job05;

import java.util.ArrayList;
import java.util.List;

public class StreamOperationTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4, 6, 8);
        StreamOperation streamOperation = new StreamOperation(list);
        streamOperation.print();
    }
}
