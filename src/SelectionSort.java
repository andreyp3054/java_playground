import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 1, 5, 4};
        System.out.println(Arrays.toString(sortBySelection(array)));
    }

    //Selection Sort
    static int[] sortBySelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }
}
