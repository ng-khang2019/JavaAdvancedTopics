package _06OOP.ClassAndInheritance._02Constructor;

public class Main {
    public static void main(String[] args) {
        // Default constructor
        Account bobAccount = new Account();
        bobAccount.deposit(1000);
        bobAccount.withdraw(500);
        bobAccount.withdraw(700);
        bobAccount.deposit(2000);

        // Parameterized constructor
        Account aliceAccount = new Account("53166",6564.5,"Alice","alice@email.com","007");
        aliceAccount.deposit(1000);

        // Constructor chaining
        Account jakeAccount = new Account("Jake","jake@email.com","(08) 599");
        System.out.println("Jake's account balance $" + jakeAccount.getBalance());
    }
}
