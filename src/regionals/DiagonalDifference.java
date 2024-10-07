package regionals;

import java.util.*;

import static java.lang.Math.abs;


//You are given a square matrix of integers. Your task is to find the absolute difference between the sums of its diagonals.
//Consider a square matrix, arr, of size n x n, where n is the number of rows (and columns) in the matrix.
// The primary diagonal is the set of elements where the row index is equal to the column index (i.e., arr[i][i]).
// The secondary diagonal is the set of elements where the row index plus the column index is equal to n - 1 (i.e., arr[i][n - 1 - i]).
//Your goal is to calculate the absolute difference between the sums of the primary diagonal and the secondary diagonal.
// Specifically, find: |sum(primary diagonal) - sum(secondary diagonal)|

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        int[][] array = new int[size][size];
        System.out.println("Enter the elements of the square matrix: ");

        for (int i = 0; i < size; i++) {
            String temp = scanner.nextLine().trim();
            String[] splittedLine = temp.split(" ");
            for (int j = 0; j < size; j++) {
                array[i][j] = Integer.parseInt(splittedLine[j]);
            }
        }
        System.out.println(getDiagonalDiff(array));
    }

    static int getDiagonalDiff(int[][] array) {
        int leftDiag = 0;
        int rightDiag = 0;
        int temp = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            leftDiag += array[i][i];
            rightDiag += array[i][temp];
            temp--;
        }

        System.out.println(leftDiag);
        System.out.println(rightDiag);
        return abs(leftDiag - rightDiag);
    }

}
