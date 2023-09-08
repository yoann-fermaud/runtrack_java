package jour3.job04;

public class GenericTest {
    public static void main(String[] args) {
        Generic<String> generic = new Generic<>("Hello");
        System.out.println(generic.getT());
    }
}
