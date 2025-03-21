package nationals.problems;

import java.util.*;
public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of numbers");
        String text = scanner.nextLine();
        String[] array = text.split(" ");
        int size = array.length;
        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = Double.parseDouble(array[i]);
        }
        double median = 0;
        if (size % 2 == 0) {
            median = (numbers[size / 2] + numbers[(size / 2) - 1]) / 2;
        } else {
            median = numbers[size / 2];
        }
        System.out.printf("%.0f", median);
    }
}