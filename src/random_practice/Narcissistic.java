package random_practice;

import java.lang.Math;
public class Narcissistic {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));        //true
        System.out.println(isNarcissistic(1634));       //true
        System.out.println(isNarcissistic(112));        //false
    }

    public static boolean isNarcissistic(int number) {
        String stringNumber = String.valueOf(number);
        char[] array = stringNumber.toCharArray();
        int length = stringNumber.length();
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum += (int) Math.pow(Integer.parseInt(String.valueOf(array[i])), length);
        }
        return number == sum;
    }
}


