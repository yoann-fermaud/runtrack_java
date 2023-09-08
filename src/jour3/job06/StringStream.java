package jour3.job06;

import java.util.List;
import java.util.stream.Stream;

public class StringStream {
    private Stream<String> stream;

    public StringStream(List<String> strings) {
        this.stream = strings.stream();
    }

    public void print() {
        this.stream.filter(e -> e.startsWith("a")).filter(e -> e.length() == 3).forEach(System.out::println);
    }
}
