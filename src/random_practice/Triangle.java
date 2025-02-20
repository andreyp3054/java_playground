package random_practice;

import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= numberOfLines - i; j++) {
                System.out.print(" ");
            }

            for (int z = 1; z <= 2 * i - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}