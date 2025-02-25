package ybll;

import java.util.Scanner;
import java.util.Calendar;

public class CalendarQuery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the days in a month in from any year");

        try {
            System.out.print("Enter month: ");
            int month = Integer.parseInt(scanner.nextLine()); //ensure no buffer left-overs using by scanning the line
            System.out.print("Enter year: ");
            int year = Integer.parseInt(scanner.nextLine());

            if (month < 1 || month > 12) {
                System.out.println("Please enter valid months 1 to 12 only. ");
                return;
            }
            scanner.close();

            //CREATE A CALENDAR AND SET IT TO PREFERENCE
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month - 1);      // calibrate the indexing of month ex. January - 0, Feb - 1
            calendar.set(Calendar.DAY_OF_MONTH, 1);     //start on day 1 of month, if this is 5, then day 5 of the month

            int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            printDays(daysInMonth, firstDayOfWeek);
        } catch (NumberFormatException error) {
            System.out.println("Please input valid format for number of month.");
        }
    }

    public static void printDays(int daysInMonth, int firstDayOfWeek) {
        System.out.println("| Sun| Mon| Tue| Wed| Thu| Fri| Sat|");

        // align the column of the day first
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("|    ");
        }

        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("|%3d ", i);
            if ((i + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println("|");
            }
        }

        //OPTIONAL
        // last row columns
//        int remainingDays = (daysInMonth + firstDayOfWeek - 1) % 7;
//        if (remainingDays > 0) {
//            for (int i = remainingDays; i < 7; i++) {
//                System.out.print("|    ");
//            }
//            System.out.println("|");
//        }
    }
}
