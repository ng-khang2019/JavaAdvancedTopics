package _06OOP.ClassAndInheritance.Exercise8;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name,
                          String birthDate,
                          long employeeId,
                          double hourlyPayRate,
                          String hiredDate,
                          String endDate
                          ) {
        super(name, birthDate, employeeId, hiredDate, endDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        this.hourlyPayRate *= 2;
        System.out.println("Pay rate is doubled: $" + (hourlyPayRate * 2) + " an hour");
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
