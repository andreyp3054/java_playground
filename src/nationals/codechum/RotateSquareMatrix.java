package nationals.codechum;

import java.util.*;

public class RotateSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (N x N): ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Enter the elements of the square matrix: ");


        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            String tempLine = scanner.nextLine().trim();
            String[] elements = tempLine.split(" ");
            for (int j = 0; j < size; j++) {
                array[i][j] = Integer.parseInt(elements[j]);
            }
        }

        System.out.println("Rotate Matrix:");
        rotateMatrix(array);
    }

    static void rotateMatrix(int[][] array) {
        int size = array.length;
        int newArray[][] = new int[size][size];
        //1. TRANSPOSE - convert columns to rows
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                newArray[i][j] = array[j][i];
            }
        }

        //2. REVERSE - the arrays and rows
        // in place manipulation (not creating new array)
        for(int i =  0; i < size; i++){
            int l = 0;
            int r = size - 1;
            while(l<r){
                int temp = newArray[i][l];
                newArray[i][l] = newArray[i][r];
                newArray[i][r] = temp;
                l += 1;
                r -= 1;
            }
        }

        //PRINT
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}