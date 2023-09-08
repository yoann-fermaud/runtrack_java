package jour3.job07;

import java.util.Optional;

public class OptionalString {

    public static String getLength(String string) {
        Optional<String> optional = Optional.ofNullable(string);
        return optional.map(e -> String.valueOf(string.length())).orElse("Chain not provided!");
    }
}
