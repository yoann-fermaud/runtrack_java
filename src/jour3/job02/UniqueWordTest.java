package jour3.job02;

public class UniqueWordTest {
    public static void main(String[] args) {
        UniqueWord uniqueWord = new UniqueWord();
        for (String arg : args) {
            uniqueWord.add(arg);
        }
        uniqueWord.setUniqueWords();
        uniqueWord.displayList();
    }
}
