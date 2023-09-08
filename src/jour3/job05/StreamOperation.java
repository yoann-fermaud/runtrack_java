package jour3.job05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    private List<Integer> list;
    private Stream<Integer> stream;

    public StreamOperation(List<Integer> list) {
        this.stream = list.stream();
        this.list = this.stream.map(e -> e * 2).filter(e -> e < 10).collect(Collectors.toList());
    }

    public void print() {
        System.out.println("Result: " + this.list);
    }
}
