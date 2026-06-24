package _06OOP.ClassAndInheritance.Exercise8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HourlyEmployee extends Employee {
    private static final LocalDate today = LocalDate.now();
    private static final int HOURS_PER_DAY = 8;
    private static final int DAYS_WORKING_PER_WEEK = 5;

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
        LocalDate startDate = convertToLocalDate(this.getHireDate());
        if (startDate.isAfter(today)) {
            System.out.println("Cannot calculate working hours. Employee has not yet started the job.");
            return 0;
        }
       return getWorkingDays(startDate, today) * HOURS_PER_DAY;
    }

    private double getWorkingDays(LocalDate start, LocalDate end) {
        // Swap in case start is after end (mis-input)
        if (start.isAfter(end)) {
            LocalDate temp = start;
            start = end;
            end = temp;
        }
        int totalDays = (int) ChronoUnit.DAYS.between(start, end) + 1;
        int fullWeeks = (int) ChronoUnit.WEEKS.between(start, end);
        int remainingDays = totalDays % 7;
        int daysWorked = fullWeeks * DAYS_WORKING_PER_WEEK;

        for (int i = 0;i < remainingDays;i++) {
            DayOfWeek day = start.plusDays(i).getDayOfWeek();
            if (day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
                daysWorked++;
            }
        }
        return (double) daysWorked - this.dayLeaves;
    }

    private LocalDate convertToLocalDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatter);
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
