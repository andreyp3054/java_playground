package number_to_text_converter;


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
            System.out.println(stringBuilder.toString());

        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

    }

    static String getMapValue(Map<Integer, String> map, int key) {
        return map.getOrDefault(key, "");
    }

    static String getExactWords(int value, int groupPosition) {
        StringBuilder stringBuilder = new StringBuilder();

        int hundredNumber = value / 100;
        int remainder = value % 100;

        if (hundredNumber > 0) {
            stringBuilder.append(getMapValue(numberWord, hundredNumber)).append(" Hundred ");
        }
        if (remainder > 0) {
            if (!numberWord.containsKey(remainder)) {
                //IF BELOW 20
                if (remainder < 20) {
                    stringBuilder.append(getMapValue(numberWord, remainder)).append("teen");
                } else {
                    int tens = remainder / 10;
                    int tensRemainder = remainder % 10;
                    stringBuilder.append(getMapValue(numberWord, tens)).append("ty-");
                    stringBuilder.append(getMapValue(numberWord, tensRemainder)).append(" ");
                }
            } else { // IF number is single digit
                stringBuilder.append(getMapValue(numberWord, remainder)).append(" ");
            }
        }


        stringBuilder.append(getMapValue(groupWord, groupPosition)).append(" ");

        return stringBuilder.toString();
    }


}
