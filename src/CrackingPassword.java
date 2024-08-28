import java.util.*;

public class CrackingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select method: ");
        System.out.println("1- Crack your password");
        System.out.println("2- Crack my password");
        System.out.print("Enter selection: ");
        int selection = Integer.parseInt(scanner.nextLine());

        switch (selection) {
            case 1:
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();
                if (password.length() > 12) {
                    System.out.println("Password too long.");
                    break;
                }
                String lowerCase = password.toLowerCase();
                StringBuilder builder = new StringBuilder("");
                for (int i = 0; i < lowerCase.length(); i++) {
                    char    currentLetter = lowerCase.toCharArray()[i];
                    int guessLetter = 97;
                    while (!((int) currentLetter == guessLetter)) {
                        System.out.println("Tested password: " + builder.toString() + (char) guessLetter + " FAILED");
                        guessLetter++;
                    }
                    builder.append((char) guessLetter);
                    System.out.println("Tested password: " + builder.toString() + " FOUND");
                }
                System.out.println("Your password is " + builder.toString());
                break;


            case 2:
                System.out.print("Enter your password: ");
                String passcode = scanner.nextLine();
                String lowCase = passcode.toLowerCase();
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < lowCase.length(); i++) {
                    char letter = lowCase.toCharArray()[i];
                    char guess = scanner.nextLine().charAt(0);
                    while (!(letter == guess)) {
                        System.out.println("Tested password: " + stringBuilder.toString() + (char) guess + " FAILED");
                        guess = scanner.nextLine().charAt(0);
                    }
                    stringBuilder.append(guess);
                    System.out.println("Tested password: " + stringBuilder.toString() + " FOUND");
                }
                System.out.println("Your passsword is " + stringBuilder.toString());
                break;

            default:
                System.out.println("okay na");
        }

    }
}