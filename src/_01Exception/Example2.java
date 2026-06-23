package _01Exception;

import java.util.Scanner;

public class Example2 {
    public static final int MAX = Integer.MAX_VALUE;
    public static final int MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        long sum = 0;
        int number = 1;
        Scanner scanner = new Scanner(System.in);
        while (number <= 5) {
            System.out.println("Enter number " + number);
            try {
                long input = Long.parseLong(scanner.nextLine());
                if (input > MAX || input < MIN) {
                    System.out.println("Number is out of range.");
                    continue;
                }
                sum += input;
                number++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
        System.out.printf("Sum of five numbers is: %,d%n",sum);
    }
}
