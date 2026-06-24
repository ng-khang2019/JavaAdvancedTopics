package _06OOP.ClassAndInheritance.Exercise8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee {
    private static final LocalDate today = LocalDate.now();
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name,
                            String birthDate,
                            long employeeId,
                            double annualSalary,
                            String hireDate,
                            String endDate) {
        super(name, birthDate, employeeId, hireDate, endDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }
    public void retire() {
        LocalDate startDate = convertToLocalDate(this.getHireDate());

        if (startDate.isAfter(today)) {
            System.out.println("Cannot retire this employee. Employee has not yet started the job.");
            return;
        }
            this.isRetired = true;
            terminate(convertToString(today));
            System.out.println(this.getName() + " retired.");
    }

    public boolean isRetired() {
        LocalDate startDate = convertToLocalDate(this.getHireDate());
        return !startDate.isAfter(today) && !this.isRetired;
    }

    // Format and convert the String to LocalDate
    private LocalDate convertToLocalDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatter);
    }

    // Format and convert LocalDate to String
    private String convertToString(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + super.getEmployeeId() +
                ", name='" + super.getName() + '\'' +
                ", birthday='" + super.getBirthDate() + '\'' +
                ", annualSalary=$" + annualSalary +
                ", hireDate='" + super.getHireDate() + '\'' +
                ", endDate='" + super.getEndDate() + '\'' +
                '}';
    }

}
