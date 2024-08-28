import java.io.*;
import java.util.*;

public class HourGlass {
    public static void main(String[] args) throws IOException {
        System.out.print("Input row and column: ");
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int row = Integer.parseInt(firstLine[0]);
        int column = Integer.parseInt(firstLine[1]);

        int[][] array2D = new int[row][column];

        for (int i = 0; i < row; i++){
            String[] line = scanner.nextLine().replace("\\s+$", "").split(" ");
            for (int j = 0; j < column; j++){
                array2D[i][j] = Integer.parseInt(line[j]);
            }
        }

//        int[][] array2D = {{0, 3, 0, 0, 0},
//                {0, 1, 0, 0, 0},
//                {1, 1, 1, 0, 0},
//                {0, 0, 2, 4, 4},
//                {0, 0, 0, 2, 4}
//        };

        ArrayList<Integer> sumList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i <= array2D.length / 2; i++) {
            for (int j = 0; j <= array2D.length /2; j++) {
                sum += array2D[i][j] + array2D[i][j + 1] + array2D[i][j + 2] + array2D[i + 1][j + 1] + array2D[i + 2][j] + array2D[i + 2][j + 1] + array2D[i + 2][j + 2];
                sumList.add(sum);
                sum = 0;
            }
        }
            System.out.println(sumList);
        System.out.println(Collections.max(sumList));
    }
}