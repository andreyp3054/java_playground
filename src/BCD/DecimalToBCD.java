package BCD;

import java.util.Scanner;

public class DecimalToBCD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String binaryText = scanner.nextLine();
        StringBuilder builder = new StringBuilder("");
        System.out.println(decimalToBCD(binaryText, builder));
    }

    public static String decimalToBCD(String binaryText, StringBuilder builder) {
        char[] binaryTextArray = binaryText.toCharArray();

        for (int i = 0; i <= binaryText.length() - 1; i++) {
            if (Character.isDigit(binaryTextArray[i])) {
                int decimal = decimalToBinary(Integer.parseInt(String.valueOf(binaryTextArray[i])));
                String decimalString = String.valueOf(decimal);
                int extraZeroes = 4 - decimalString.length();
                if (extraZeroes > 0) {
                    builder.append("0".repeat(extraZeroes));
                }
                builder.append(decimalString);
                builder.append(" ");
            } else {
                builder.append(binaryTextArray[i]);
            }

        }
        return builder.toString();
    }

    public static int decimalToBinary(int decimal) {
        int i = 1;
        int binary = 0;
        while (decimal != 0) {
            int remainder = decimal % 2;
            binary += remainder * i;
            decimal /= 2;
            i *= 10;
        }
        return binary;
    }
}