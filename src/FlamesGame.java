import java.util.*;
import java.lang.StringBuilder;

public class FlamesGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first person's name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the second person's name: ");
        String secondName = scanner.nextLine();

        StringBuilder combinedBuilder = new StringBuilder();

        for (int i = 0; i < firstName.length(); i++) {
            char currentChar = firstName.charAt(i);
            if (secondName.indexOf(currentChar) == -1) {
                combinedBuilder.append(currentChar);
            }
        }

        for (int i = 0; i < secondName.length(); i++) {
            char currentChar = secondName.charAt(i);
            if (firstName.indexOf(currentChar) == -1) {
                combinedBuilder.append(currentChar);
            }
        }

        String combinedString = combinedBuilder.toString();
        System.out.println("Combined string after removing common characters: " + combinedString);

        String[] flames = {"friends", "lovers", "affectionate", "marriage", "enemies", "siblings"};

        System.out.println("You are: " + flames[combinedString.length() % flames.length - 1]);
        scanner.close();

    }
}

