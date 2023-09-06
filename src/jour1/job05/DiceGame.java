package jour1.job05;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        int dice0 = new Random().nextInt(5 + 1) + 1;
        int dice1 = new Random().nextInt(5 + 1) + 1;
        int result = dice0 + dice1;

        System.out.println("Dice 1: " + dice0);
        System.out.println("Dice 2: " + dice1);
        System.out.println("Sum of dive: " + result);
    }
}
