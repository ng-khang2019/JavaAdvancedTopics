package _06OOP.ClassAndInheritance.Exercise8;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private static final LocalDate today = LocalDate.now();
    private double annualSalary;
    private double dayLeaves;
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
        this.dayLeaves = 0;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getDayLeaves() {
        return dayLeaves;
    }

    public void setDayLeaves(double dayLeaves) {
        this.dayLeaves = dayLeaves;
    }

    @Override
    public double collectPay() {
        return annualSalary * getYearsWorked();
    }

    private double getYearsWorked() {
        LocalDate start = DateUtil.convertToLocalDate(this.getHireDate());
        LocalDate end = DateUtil.convertToLocalDate(this.getEndDate());
        end = end.isAfter(today) ? today : end;
        if (start.isAfter(today)) {
            System.out.println("Cannot calculate working hours. Employee has not yet started the job.");
            return 0;
        }
        return DateUtil.getYearsWorked(start, end, this.dayLeaves);
    }

    public void retire() {
        LocalDate startDate = DateUtil.convertToLocalDate(this.getHireDate());

        if (startDate.isAfter(today)) {
            System.out.println("Cannot retire this employee. Employee has not yet started the job.");
            return;
        }
            this.isRetired = true;
            terminate(DateUtil.convertToString(today));
            System.out.println(this.getName() + " retired.");
    }

    public boolean isRetired() {
        LocalDate startDate = DateUtil.convertToLocalDate(this.getHireDate());
        return !startDate.isAfter(today) && !this.isRetired;
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
