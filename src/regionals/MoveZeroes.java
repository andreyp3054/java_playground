package regionals;

import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = Integer.parseInt(scanner.nextLine().trim());
//        System.out.println("Enter the elements of the array: ");
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = Integer.parseInt(scanner.nextLine().trim());
//        }
        int[] array = {6,0,2,9,0};
        System.out.print("Original Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(modifyArray(array)));
        //Expected Output: 6 2 9 0 0
    }

    //BySelection
    static int[] modifyArray(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for (int j = i + 1;  j < array.length; j++){
                if(array[i] == 0){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
