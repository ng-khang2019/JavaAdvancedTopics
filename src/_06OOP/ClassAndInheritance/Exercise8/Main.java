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
                4595,
                "24/12/2025",
                "26/05/2028");
        Phoebe.setDayLeaves(8);
        System.out.printf("Phoebe paycheck up-to-date: $%,.2f\n",Phoebe.collectPay() );

        // Check retirement status
        System.out.println("Is " + Phoebe.getName() + " retired? " + (Phoebe.isRetired() ? "Yes" : "No"));
        Phoebe.retire();
        System.out.println("Is " + Phoebe.getName() + " retired? " + (Phoebe.isRetired() ? "Yes" : "No"));

        HourlyEmployee Kevin = new HourlyEmployee("Kevin",
                "29/05/2001",
                89632,
                35,
                "22/05/2026",
                "20/12/2026");
        Kevin.setDayLeaves(2);
        Kevin.setBonusHours(4);
        System.out.printf("Kevin paycheck up-to-date: $%,.2f",Kevin.collectPay() );

    }
}
