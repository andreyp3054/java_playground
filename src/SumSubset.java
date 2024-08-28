//import java.util.*;
//
//public class SumSubset {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("NUMBER OF ELEMENTS: ");
//        int numberOfElements = scanner.nextInt();
//        System.out.print("SUM: ");
//        int sum = scanner.nextInt();
//        int arraySum = 0;
//        int digitScanner;
//        int[] array = new int[numberOfElements];
//        for (int i = 0; i < numberOfElements; i++) {
//            digitScanner = scanner.nextInt();
//            array[i] = digitScanner;
//        }
//        System.out.print("ARRAY: ");
//        for (int iterator : array) {
//            System.out.print(iterator + " ");
//        }
//        for (int i = 0; i < numberOfElements; i++) {
//            for (int j = i; j < numberOfElements; j++) {
//                arraySum += array[j];
//            }
//            if (arraySum == sum) {
//                System.out.println("YES");
//            }
//            arraySum = 0;
//        }
//    }
//}
//
//


// A recursive solution for subset sum

import java.io.*;
import java.util.Collections;

class SumSubset {

    // Returns true if there is a subset
    // of set[] with sum equal to given sum
    static boolean isSubsetSum(int set[], int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0)
            return false;

        // If last element is greater than
        // sum, then ignore it
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);

        // Else, check if sum can be obtained
        // by any of the following
        // (a) including the last element
        // (b) excluding the last element
        return isSubsetSum(set, n - 1, sum)
                || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }

    // Driver code
    public static void main(String args[])
    {
//        int set[] = { 3, 34, 4, 12, 5, 2 };
//        int sum = 9;
        int set[] = {18, 23, 17, 29, 1, 6, 7, 30, 7, 6};
        int sum = 100;
        int n = set.length;
        if (isSubsetSum(set, n, sum)) {
            System.out.println("Found a subset"
                    + " with given sum");
        }
        else
            System.out.println("No subset with"
                    + " given sum");
    }
}

/* This code is contributed by Rajat Mishra */
