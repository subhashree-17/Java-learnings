package com.javalearnings.problems;
import java.util.Scanner;
public class ClockConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time in 24-hour format (HH:MM):");
        String time24 = scanner.nextLine();

        System.out.println("Converted time in 12-hour format: " + convertTo12HourFormat(time24));

        System.out.println("Enter the time in 12-hour format (HH:MM AM/PM):");
        String time12 = scanner.nextLine();

        System.out.println("Converted time in 24-hour format: " + convertTo24HourFormat(time12));

        scanner.close();
    }

    public static String convertTo12HourFormat(String time24) {
        int hour = Integer.parseInt(time24.substring(0, 2));
        int minute = Integer.parseInt(time24.substring(3));

        String period = "AM";

        if (hour >= 12) {
            period = "PM";
            if (hour > 12)
                hour -= 12;
        }

        if (hour == 0) {
            hour = 12;
        }

        return String.format("%02d:%02d %s", hour, minute, period);
    }

    public static String convertTo24HourFormat(String time12) {
        String[] parts = time12.split(" ");
        String[] timeParts = parts[0].split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);

        if (parts[1].equalsIgnoreCase("PM") && hour != 12) {
            hour += 12;
        } else if (parts[1].equalsIgnoreCase("AM") && hour == 12) {
            hour = 0;
        }

        return String.format("%02d:%02d", hour, minute);
    }
}
