package _06OOP.ClassAndInheritance.Exercise8;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, long employeeId, String hiredDate, String endDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hiredDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + super.getName() + '\'' +
                ", birthday='" + super.getBirthDate() + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + super.getEndDate() + '\'' +
                '}';
    }
}
