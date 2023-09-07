package jour2.job07;

public class ErrorTest {
    public static void main(String[] args) {
        try {
            String string = null;
            if (string == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] array = new int[4];
            if (array.length > 2) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            short numerator = 4;
            short denominator = 0;
            if (denominator == 0) {
                throw new ArithmeticException();
            }
            System.out.println(numerator / denominator);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
