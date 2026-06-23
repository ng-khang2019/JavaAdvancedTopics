package _01Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {

    void main() {
        inputThenPrintSumAndAverage2();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int input = scanner.nextInt();
                sum += input;
                count++;
                average = Math.round((double) sum/count);
            } catch (InputMismatchException e) {
                System.out.printf("SUM = %d AVG = %d",sum,average);
                break;
            }
        }
    }

    public static void inputThenPrintSumAndAverage2() {
        int sum = 0;
        long average = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            sum += input;
            count++;
            average = Math.round((double) sum/count);
        }
        System.out.printf("SUM = %d AVG = %d",sum,average);
    }
}
