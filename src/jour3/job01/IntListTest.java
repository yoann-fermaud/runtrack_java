package jour3.job01;

public class IntListTest {
    public static void main(String[] args) {
        IntList intList = new IntList();
        for (String arg : args) {
            intList.add(Integer.parseInt(arg));
        }
        intList.calculateEvenNumbers();
        intList.displayList();
    }
}
