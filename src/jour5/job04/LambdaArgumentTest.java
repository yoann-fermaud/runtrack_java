package jour5.job04;

import java.util.function.Predicate;

public class LambdaArgumentTest {
    public static void main(String[] args) {
        int stringLength = Integer.parseInt(args[1]);
        Predicate<String> predicate = (str) -> str.length() > stringLength;

        if (predicate.test(args[0])) {
            System.out.println("The string " + args[0] + " has a length greater than " + stringLength);
        } else {
            System.out.println("The string " + args[0] + " has a length less than " + stringLength);
        }
    }
}
