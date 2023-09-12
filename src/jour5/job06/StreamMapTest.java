package jour5.job06;

import java.util.List;

public class StreamMapTest {
    public static void main(String[] args) {
        List<String> listLowercase = List.of(args);

        List<String> listUppercase = listLowercase.stream()
                .map(String::toUpperCase).toList();

        listUppercase.forEach(System.out::println);
    }
}
