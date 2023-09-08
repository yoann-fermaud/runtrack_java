package jour3.job01;

import java.util.ArrayList;

public class IntList {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private int sumOfEvenNumber;

    public void add(int number) {
        this.arrayList.add(number);
    }

    public void calculateEvenNumbers() {
        for (int number : this.arrayList) {
            if (number % 2 == 0) {
                this.sumOfEvenNumber += number;
            }
        }
    }

    public void displayList() {
        System.out.println("List: " + this.arrayList);
        System.out.println("Sum of even numbers: " + this.sumOfEvenNumber);
    }
}
