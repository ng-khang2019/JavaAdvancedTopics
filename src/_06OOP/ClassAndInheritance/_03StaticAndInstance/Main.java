package _06OOP.ClassAndInheritance._03StaticAndInstance;

public class Main {
    public static void main(String[] args) {
        NewBank bank1 = new NewBank("Tuart Hill");
        System.out.println(bank1.getBranchName() +  " bank ID: " +  bank1.getBranchId());
        System.out.println("Number of branches: " + bank1.getBranchesCount()); // 1 because there is only 1 bank created

        NewBank bank2 = new NewBank("Leederville");
        System.out.println(bank2.getBranchName() +  " bank ID: " +  bank2.getBranchId());
        System.out.println("Number of branches: " + bank2.getBranchesCount()); // 2  becauce there are 2 banks created


        // These shows the same value because branchesCount is static and is shared
        // between all instances of NewBank
        System.out.println("Total number of branches: ");
        System.out.println(bank1.getBranchesCount());
        System.out.println(bank2.getBranchesCount());
        // Or
        System.out.println(NewBank.getBranchesCount());
    }
}
