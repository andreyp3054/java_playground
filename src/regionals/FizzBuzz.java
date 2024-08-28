package regionals;
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("FizzBuzz sequence from 1 to " + number);
        int i = 1;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}