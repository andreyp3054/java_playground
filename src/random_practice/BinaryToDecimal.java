package random_practice;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");

        int binary = scanner.nextInt();
        int weight = 1;
        int decimal = 0;

        while (binary != 0) {
            int remainder = binary % 10;
            decimal += remainder * weight;
            binary = binary / 10;
            weight = weight * 2;
        }


        System.out.println(decimal);
    }
}
