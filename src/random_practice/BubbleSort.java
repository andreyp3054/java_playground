package random_practice;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] array = {4, 3, 2, 6, 20};
        int[] array = {12, 15, 11, 7, 4, 13, 55, 43, 5, 6};
//        bubbleSort(array);
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        return array;
    }

    //}
    static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minimumValue = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimumValue]) {
                    minimumValue = j;
                }
            }
                int temporary = array[minimumValue];
                array[minimumValue] = array[i];
                array[i] = temporary;
        }
        return array;
    }
}