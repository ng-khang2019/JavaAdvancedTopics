package _06OOP.ClassAndInheritance._05ObjectClass;

import java.util.UUID;

public class Student implements Cloneable {
    // To use clone() method we need the class to implement Cloneable interface
    private String name;
    private UUID studentId;
    private String schoolName;

    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
        this.studentId = UUID.randomUUID();
    }
    public String getName() {
        return name;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public UUID getStudentId() {
        return studentId;
    }
    public void setSchoolName(String schoolName) {}
    public void setName(String name) {}

    @Override
    public Student clone()  {
        try {
            // Shallow copy
            return (Student) super.clone();
            // Use deep copy when you have a class with objects inside as fields
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    // If we override equals(), we also need to override hashCode()
    // That way we keep the contract between the equals() and hashCode() methods
    @Override
    public boolean equals(Object o) {
        // Same object (same reference)
        if (this == o) return true;

        // Make sure the Object being compared to is of the same class and not null
        if (o == null || getClass() != o.getClass()) return false;

        // Convert the Object to same class
        Student student = (Student) o;
        return studentId.equals(student.studentId);
        //or
        //return Objects.equals(studentId, student.studentId);
    }

    // Make sure that student id is used to produce the hash code
    @Override
    public int hashCode() {
        return studentId.hashCode();
    }

}
