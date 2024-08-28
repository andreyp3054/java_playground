package BCD;

import java.util.*;

public class BCDToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("this is the 0001st line.");
        System.out.println("temperature: 00010101.0110 degree Celcius");
        System.out.println(BCDtoDecimalTemperature("000101010110"));
    }

    public static double BCDtoDecimalTemperature(String binary) {
        StringBuilder builder = new StringBuilder("");
        String[] binarySubArray = binary.split("\\.");
        for(int i = 0; i < binarySubArray.length; i++){
            int decimal = BCDToDecimal(binarySubArray[i]);
            builder.append(decimal);
            builder.append(".");
        }
        return Double.parseDouble(builder.toString());
    }

    public static int BCDToDecimal(String binarySubArray) {
        int number = 0;

        for (int i = 0; i < binarySubArray.length(); i+=4) {
            String subArray = binarySubArray.substring(i, i+4);

            int decimal = Integer.parseInt(subArray,2);

            number = number * 10 + decimal;
        }
        return number;
    }
}