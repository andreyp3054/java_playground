package nationals.problems;

import java.util.*;

public class TimeDifference {
    public static void main(String[] args) {
        //  HH:MM:SS
        String firstTime = "03:49:02";
        String[] firstTimeStringArray = firstTime.split(":");
        int firstHour = Integer.parseInt(firstTimeStringArray[0]);
        int firstMinute = Integer.parseInt(firstTimeStringArray[1]);
        int firstSecond = Integer.parseInt(firstTimeStringArray[2]);

        String secondTime = "06:22:01";
        String[] secondTimeStringArray = secondTime.split(":");
        int secondHour = Integer.parseInt(secondTimeStringArray[0]);
        int secondMinute = Integer.parseInt(secondTimeStringArray[1]);
        int secondSecond = Integer.parseInt(secondTimeStringArray[2]);

        int firstDifference = firstHour - secondHour;
        int secondDifference = firstMinute - secondMinute;
        int thirdDifference = firstSecond - secondSecond;

        String formatHourDifference = String.format("%02d", firstDifference);
        String formatMinuteDifference = String.format("%02d", secondDifference);
        String formatSecondDifference = String.format("%02d", thirdDifference);

        System.out.println("Time Difference: " + formatHourDifference + ":" + ":" + formatMinuteDifference + ":" + formatSecondDifference);
    }
}
