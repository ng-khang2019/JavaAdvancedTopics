package _06OOP.ClassAndInheritance.Exercise8;

public class Main {
    public static void main(String[] args) {
        Worker Khang = new Worker("Khang","23/08/2000","29/03/2028");
        System.out.println(Khang.getName() + "'s age is " + Khang.getAge() + " years old.");
        Khang.terminate("21/06/2027");
        System.out.println(Khang.getEndDate());

        SalariedEmployee Phoebe = new SalariedEmployee("Phoebe",
                "04/06/2003",
                235415,
                65000,
                "11/12/2025",
                "26/05/2028");

        // Employee info
        System.out.println("Employee info:\n" + Phoebe);

        // Check retirement status
        System.out.println("Is " + Phoebe.getName() + " retired? " + (Phoebe.isRetired() ? "Yes" : "No"));
        Phoebe.retire();
        System.out.println("Is " + Phoebe.getName() + " retired? " + (Phoebe.isRetired() ? "Yes" : "No"));

        HourlyEmployee Kevin = new HourlyEmployee("Kevin",
                "29/05/2001",
                89632,
                35,
                "21/06/2026",
                "20/3/2028");

        System.out.println("Employee info:\n" + Kevin);
    }
}
