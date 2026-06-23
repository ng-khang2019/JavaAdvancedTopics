package _06OOP.ClassAndInheritance.Exercise1;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(700);
        account.deposit(2000);
    }
}
