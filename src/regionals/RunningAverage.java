package regionals;
import java.util.*;

public class RunningAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.next());
        System.out.println("Enter the elements of the array, one per line:");
        float sum = 0;
        for (int i = 0; i < size; i++) {
            float element = scanner.nextFloat();
            sum += element;
            System.out.printf("Running Average at index " + i + ": ");
            float average =  sum / (i + 1);
            System.out.printf("%.2f", average);
        }
    }
}