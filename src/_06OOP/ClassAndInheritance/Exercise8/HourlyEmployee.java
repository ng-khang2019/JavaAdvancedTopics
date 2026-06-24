package _06OOP.ClassAndInheritance.Exercise8;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private static final LocalDate today = LocalDate.now();

    private double hourlyPayRate;
    private double dayLeaves;
    private int bonusHours;

    public HourlyEmployee(String name,
                          String birthDate,
                          long employeeId,
                          double hourlyPayRate,
                          String hiredDate,
                          String endDate
                          ) {
        super(name, birthDate, employeeId, hiredDate, endDate);
        this.hourlyPayRate = hourlyPayRate;
        this.dayLeaves = 0;
        this.bonusHours = 0;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDayLeaves() {
        return dayLeaves;
    }

    public void setDayLeaves(double dayLeaves) {
        this.dayLeaves = dayLeaves;
    }

    public int getBonusHours() {
        return bonusHours;
    }

    public void setBonusHours(int bonusHours) {
        this.bonusHours = bonusHours;
    }

    public void getDoublePay(int hours) {
        this.bonusHours += hours;
    }

    @Override
    public double collectPay() {
        return bonusHours * hourlyPayRate * 2 + getWorkingHours() * hourlyPayRate ;
    }

    private double getWorkingHours() {
        LocalDate startDate = DateUtil.convertToLocalDate(this.getHireDate());
        LocalDate endDate = DateUtil.convertToLocalDate(this.getEndDate());
        endDate = endDate.isAfter(today) ? today : endDate;
        if (startDate.isAfter(today)) {
            System.out.println("Cannot calculate working hours. Employee has not yet started the job.");
            return 0;
        }
        double totalWorkingDays = DateUtil.getWorkingDays(startDate, endDate,this.dayLeaves);
       return  DateUtil.hoursWorked(totalWorkingDays);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + super.getEmployeeId() +
                ", name='" + super.getName() + '\'' +
                ", birthday='" + super.getBirthDate() + '\'' +
                ", hourlyPayRate=$" + hourlyPayRate +
                ", hireDate='" + super.getHireDate() + '\'' +
                ", endDate='" + super.getEndDate() + '\'' +
                '}';
    }
}
