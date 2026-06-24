package _06OOP.ClassAndInheritance.Exercise8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateUtil {
    private static final int DAYS_WORKING_PER_WEEK = 5;
    private static final int HOURS_PER_DAY = 8;

    static LocalDate convertToLocalDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatter);
    }

    static String convertToString(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    static double hoursWorked(double daysWorked) {
        return daysWorked * HOURS_PER_DAY;
    }

    static double getWorkingDays(LocalDate start, LocalDate end, double dayLeaves) {
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
        return daysWorked - dayLeaves;
    }

    static double getYearsWorked(LocalDate start, LocalDate end, double dayLeaves) {
        // Swap in case start is after end (mis-input)
        if (start.isAfter(end)) {
            LocalDate temp = start;
            start = end;
            end = temp;
        }
        double totalDaysWorked = (double) ChronoUnit.DAYS.between(start, end) + 1 - dayLeaves;
        return Math.round ((totalDaysWorked / 365) *1000.0) / 1000.0;
    }
}
