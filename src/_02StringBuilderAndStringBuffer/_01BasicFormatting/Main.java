package _02StringBuilderAndStringBuffer._01BasicFormatting;

public class Main {
    public static void main(String[] args) {

        // Traditional way to print a text block
        String traditional = "Student information:\n" +
                "\t\u2022Name: Luke\n"  +
                "\t\t\u2022Course: Computer Science\n"  +
                "\t\t\t\u2022Year: 2025\n"  +
                "\t\t\t\t\u2022Semester: 2\n" +
                "\t\t\t\t\t\u2022Campus: Joondalup";

        // Text Block
        String textBlock = """
                Student information:
                    \u2022Name: Luke
                        \u2022Course: Computer Science
                            \u2022Year: 2025
                                \u2022Semester: 2
                                    \u2022Campus: Joondalup""";

        System.out.println(traditional);
        System.out.println(textBlock);

        // String Formatting
        String format = String.format("Hello, %s! You have %d new messages.", "Peter", 56);
        System.out.println(format);

        String name = "Khang";
        double salary = 85000.0;
        System.out.printf("Hello, %s! Your annual salary is $%,.2f%n",name, salary);

        for (int i = 1, j =10; i < 7; i++, j *= 10) {
            System.out.printf("Print line %d: |%10d|%n",i,j);
        }
    }
}
