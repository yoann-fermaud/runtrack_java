package jour2.job04;

public class DivisionTest extends Exception {
    public static void main(String[] args) throws DivisionException {
        try {
            System.out.println(division(args[0], args[1]));
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int division(String arg0, String arg1) throws DivisionException {
        int numerator = Integer.parseInt(arg0);
        int denominator = Integer.parseInt(arg1);

        if (denominator == 0) {
            throw new DivisionException();
        }
        return numerator / denominator;
    }
}
