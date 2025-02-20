package random_practice;

import java.util.*;
public class StaircaseM3Recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(climb(n));
    }

    static int climb(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return climb(n - 1) + climb(n - 2) + climb(n-3);
    }
}