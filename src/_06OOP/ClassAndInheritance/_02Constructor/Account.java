package _06OOP.ClassAndInheritance._02Constructor;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        System.out.println("Empty constructor called!");
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        // Constructor chaining can only be done at the first line of the constructor
        this("9999",1000,customerName,customerEmail,customerPhone);
        System.out.println("Constructor chaining called!");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        System.out.println("Parameterized constructor called!");
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited  $" + amount + " to the account. The balance is now $" + this.balance);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds! You have only $" + this.balance + " in your account.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + " from the account. The balance is now $" + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
