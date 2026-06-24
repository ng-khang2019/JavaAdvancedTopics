package _06OOP.ClassAndInheritance._05ObjectClass;

public class PrimaryStudent extends Student{
    private int grade;
    private String parentName;

    public PrimaryStudent(String name, String schoolName) {
        super(name, schoolName);
        this.grade = 1;
        this.parentName = "Unknown";
    }

    public PrimaryStudent(String name, String schoolName, int grade, String parentName) {
        super(name, schoolName);
        this.grade = (grade > 5) ? 5 : (grade < 1) ? 1 : ( grade);
        this.parentName = parentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", School: " + super.getSchoolName() +
                "\tPrimaryStudent{" +
                "grade=" + grade +
                ", parentName='" + parentName + '\'' +
                "} ";
    }
}
