package _06OOP.ClassAndInheritance._05ObjectClass;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Student pesho = new Student("Pesho", "SoftUni");
        System.out.println(pesho);

        PrimaryStudent stamat = new PrimaryStudent("Stamat", "Talated Angels", 2,"Samantha");
        System.out.println(stamat);

        Student student1 = new Student("Ivan", "Telerik");
        Student student2 = student1.clone();

        System.out.println(student1 == student2); // False - Different objects or references
        System.out.println(student1.equals(student2)); // True - Same student ID
        System.out.println("Student 1 ID: " + student1.getStudentId());
        System.out.println("Student 2 ID: " + student2.getStudentId());

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(pesho);
        studentSet.add(stamat);
        studentSet.add(student1);
        studentSet.add(student2);

        // 3 - Since student1 and student2 has the same ID,
        // and it is used to produce the same hash code
        System.out.println(studentSet.size());

    }
}
