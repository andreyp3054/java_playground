package number_to_text_converter;//package number_to_text_converter;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberToTextConverter {

    public static Map<Integer, String> numberWord = new HashMap<>();
    public static Map<Integer, String> groupWord = new HashMap<>();

    public static void main(String[] args) {


        groupWord.put(2, "Thousand");
        groupWord.put(3, "Million");
        groupWord.put(4, "Billion");
        groupWord.put(5, "Trillion");
        groupWord.put(6, "Quadrillion");
        groupWord.put(7, "Quintillion");
        groupWord.put(8, "Sextillion");


        numberWord.put(1, "One");
        numberWord.put(2, "Two");
        numberWord.put(3, "Three");
        numberWord.put(4, "Four");
        numberWord.put(5, "Five");
        numberWord.put(6, "Six");
        numberWord.put(7, "Seven");
        numberWord.put(8, "Eight");
        numberWord.put(9, "Nine");
        numberWord.put(10, "Ten");
        numberWord.put(11, "Eleven");
        numberWord.put(12, "Twelve");
        numberWord.put(13, "Thirteen");
        numberWord.put(15, "Fifteen");
        numberWord.put(18, "Eighteen");
        numberWord.put(20, "Twenty");
        numberWord.put(30, "Thirty");
        numberWord.put(40, "Forty");
        numberWord.put(50, "Fifty");
        numberWord.put(80, "Eighty");

        //Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Number-To-Text Converter!");
        System.out.print("Enter number: ");
        String userInput = scanner.nextLine();


        //Convert
        try {
            double numberInput = Double.parseDouble(userInput);
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            String formattedText = decimalFormat.format(numberInput);

            String[] groups = formattedText.split(",");

            //PRINT THE NUMBERS FIRST
            for (int i = 0; i < groups.length; i++) {
                System.out.print(groups[i]);
                if (i != groups.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();

            //START THE CONVERSION
            int groupPosition = groups.length;
            StringBuilder stringBuilder = new StringBuilder();
            for (String currentGroup : groups) {
                int value = Integer.parseInt(currentGroup);
                if (value == 0) {
                    groupPosition--;
                    continue;
                }
                stringBuilder.append(getExactWords(value, groupPosition));
                groupPosition--;
            }
            System.out.println(stringBuilder);

        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

    }

    static String getMapValue(Map<Integer, String> map, int key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    static String getExactWords(int value, int groupPosition) {
        StringBuilder stringBuilder = new StringBuilder();

        int hundredNumber = value / 100;
        int remainder = value % 100;

        if (hundredNumber > 0) {
            stringBuilder.append(String.format("%s %s ", getMapValue(numberWord, hundredNumber, ""), "Hundred"));
        }
        if (remainder > 0) {
            if (!numberWord.containsKey(remainder)) {
                //IF BELOW 20
                if (remainder < 20) {
                    stringBuilder.append(String.format("%s%s ", getMapValue(numberWord, remainder - 10, ""), "teen"));
                } else {
                    int tenths = remainder / 10;
                    int tenthsRemainder = remainder % 10;


                    String notFoundTenthsWord = String.format("%s%s", getMapValue(numberWord, tenths, ""), "ty");
                    //Find default tenths words first like "TWENTY" before moving to number + "ty"
                    stringBuilder.append(String.format("%s", getMapValue(numberWord, tenths * 10, notFoundTenthsWord)));
                    if (tenthsRemainder != 0) {
                        stringBuilder.append(String.format("-%s ", getMapValue(numberWord, tenthsRemainder, "")));
                    }
                }
            } else { // If exact number key is already present
                stringBuilder.append(String.format("%s ", getMapValue(numberWord, remainder, "")));
            }
        }


        stringBuilder.append(String.format("%s ", getMapValue(groupWord, groupPosition, "")));

        return stringBuilder.toString();
    }


}

