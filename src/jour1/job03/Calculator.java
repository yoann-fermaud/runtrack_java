package jour1.job03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num0 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num1 = scanner.nextFloat();

        String sum = String.valueOf(sum(num0, num1));
        String subtraction = String.valueOf(subtraction(num0, num1));
        String multiplication = String.valueOf(multiplication(num0, num1));
        String division = String.valueOf(division(num0, num1));

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }

    public static float sum(float num0, float num1) {
        return num0 + num1;
    }

    public static float subtraction(float num0, float num1) {
        return num0 - num1;
    }

    public static float multiplication(float num0, float num1) {
        return num0 * num1;
    }

    public static float division(float num0, float num1) {
        return num0 / num1;
    }
}
