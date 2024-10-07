package regionals;

import java.text.DecimalFormat;
import java.util.*;
public class TwoTimesDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first time (HH:MM:SS): ");
        String firstTime = scanner.nextLine();
        System.out.print("Enter the second time (HH:MM:SS): ");
        String secondTime = scanner.nextLine();

        System.out.println("Time Difference: " + getTimeDifference(firstTime, secondTime));
    }

    public static String getTimeDifference(String firstTime, String secondTime) {
        String[] firstArray = firstTime.split(":");
        String[] secondArray = secondTime.split(":");
        String[] higherTime = new String[3];
        String[] lowerTime = new String[3];
        if (Integer.parseInt(firstArray[0]) > Integer.parseInt(secondArray[0])) {
            higherTime = firstArray;
            lowerTime = secondArray;
        } else {
            higherTime = secondArray;
            lowerTime = firstArray;
        }
        int higherHour = Integer.parseInt(higherTime[0]);
        int higherMinute = Integer.parseInt(higherTime[1]);
        int higherSeconds = Integer.parseInt(higherTime[2]);

        int lowerHour = Integer.parseInt(lowerTime[0]);
        int lowerMinute = Integer.parseInt(lowerTime[1]);
        int lowerSeconds = Integer.parseInt(lowerTime[2]);


        int newSecond = 0;
        int newMinute = 0;
        int newHour = 0;
        if (higherSeconds > lowerSeconds) {
            newSecond = higherSeconds - lowerSeconds;
        } else {
            newSecond = (higherSeconds + 60) - lowerSeconds;
            higherMinute -= 1;
        }
        if (higherMinute > lowerMinute) {
            newMinute = higherMinute - lowerMinute;
        } else {
            newMinute = (higherMinute + 60) - lowerMinute;
            higherHour -= 1;
        }
        newHour = Math.abs(higherHour - lowerHour);
        DecimalFormat format = new DecimalFormat("#00");

        return format.format(newHour) + ":" + format.format(newMinute) + ":" + format.format(newSecond);
    }

}