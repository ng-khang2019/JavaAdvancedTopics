package _01Exception;

import java.util.Scanner;

public class Example1 {
    public static final int CURRENT_YEAR = 2026;
    public static void main(String[] args) {
        ageScannerInput();
    }

    public static void ageScannerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        boolean isValidYear = false;
        int yearBorn = 0;
        do {
            System.out.println("What's year were you born?");
            try {
                yearBorn = Integer.parseInt(scanner.nextLine());
                isValidYear = isYearValid(yearBorn);
                if (!isValidYear) {
                    System.out.println("Year born must be between 1900 and " + CURRENT_YEAR + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        } while (!isValidYear);
        System.out.println(name + " is " + (CURRENT_YEAR - yearBorn)  + " years old.");
    }

    public static boolean isYearValid(int year) {
        return year >= 1900 && year <= CURRENT_YEAR;
    }

    /*
        IntelliJ does not support console input yet. To run this code, we need to
        compile manually then execute the file in the terminal.
        $ javac -d out src/_01Exception/Example1.java
        $ java -cp out _01Exception.Example1
     */
    public static void ageConsoleInput() {
        System.out.println("What's your name?");
        String name = System.console().readLine();
        System.out.println("What's year were you born?");
        String birthYear = System.console().readLine();
        int age = CURRENT_YEAR - Integer.parseInt(birthYear);
        System.out.println(name + " is " + age + " yea(s old.");
    }
}
