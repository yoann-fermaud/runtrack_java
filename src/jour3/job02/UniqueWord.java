package jour3.job02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueWord {
    private ArrayList<String> arrayList = new ArrayList<>();
    private Set<String> uniqueWordList = new HashSet<>();

    public void add(String word) {
        this.arrayList.add(word);
    }

    public void setUniqueWords() {
        uniqueWordList.addAll(this.arrayList);
    }

    public void displayList() {
        System.out.println("Words list: " + this.arrayList);
        System.out.println("Unique words: " + this.uniqueWordList);
    }
}
