package nationals.problems;

import java.util.*;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        float[] array = new float[line.length];
        for(int i = 0; i < line.length; i++){
            array[i] = Integer.parseInt(line[i]);
        }

        float median = 0;
        if(array.length % 2 == 0){
            int left = (array.length / 2) - 1;
            System.out.println(left + " hey");
            int right = (array.length/2);
            System.out.println("right" + right);
            median = (array[left] + array[right]) / 2;
        }

        System.out.println("median: " + median);


    }
}
