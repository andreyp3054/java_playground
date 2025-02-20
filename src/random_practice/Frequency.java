package random_practice;

import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();

        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();


        System.out.println("Enter the second name");
        String secondName = scanner.nextLine();

        String combined = firstName + secondName;
        char[] combinedArray = combined.toCharArray();

    }
}
