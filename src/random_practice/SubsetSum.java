package random_practice;

import java.util.*;
public class SubsetSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of Elements: ");
        int numberOfElements = Integer.parseInt(scanner.nextLine());
        System.out.print("Sum: ");
        int sum = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the elements: ");
        String[] line = scanner.nextLine().split(" ");
        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = Integer.parseInt(line[i]);
        }
        System.out.println(isSubset(numberOfElements, sum, array));
    }


    static boolean isSubset(int n, int sum, int[] array) {
        if (sum == 0) {
            return true;
        }

        if (n == 0) {
            return false;
        }
        // exclude the last if it is greater than the target sum

        if (array[n - 1] > sum) {
            return isSubset(n-1, sum, array);
        }
            // include the last element
        //exclude the last element
        return isSubset(n-1, sum, array) || isSubset(n-1, sum - array[n-1], array);
    }
}



























//    static boolean isSubset(int numberOfElements, int sum, int[] array) {
//        if (sum == 0) {
//            return true;
//        }
//        if (numberOfElements == 0) {
//            return false;
//        }
//        if (sum < array[numberOfElements - 1]) {
//            return isSubset(numberOfElements - 1, sum, array);
//        }
//
//        return isSubset(numberOfElements-1, sum, array) || isSubset(numberOfElements-1, sum - array[numberOfElements - 1], array);
//    }