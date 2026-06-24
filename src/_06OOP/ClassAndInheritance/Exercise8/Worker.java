package _06OOP.ClassAndInheritance.Exercise8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {
    private static final LocalDate today = LocalDate.now();
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getAge() {
        LocalDate birthDate = convertToLocalDate(this.birthDate);
        int age = today.getYear() - birthDate.getYear();
        // Check if the birthday has already occurred this year or not
        if (birthDate.isAfter(today.minusYears(age))) {
            age--;
        }
        return age;
    }

    public void terminate(String endDate) {
        LocalDate formattedDate = convertToLocalDate(endDate);
        if (formattedDate.isAfter(today)) {
            this.endDate = convertToString(formattedDate);
        } else {
            this.endDate = convertToString(today);
        }
        System.out.println(this.endDate + " will be "+  this.name + "'s last day");
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

    public double collectPay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

