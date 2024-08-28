import java.util.*;
public class TwosComplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder right = new StringBuilder();
        StringBuilder left = new StringBuilder();
        char[] array = line.toCharArray();
        int z = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == '0') {
                right.append(array[i]);
            } else {
                z = i;
                right.append(array[i]);
                break;
            }
        }
        for (int j = 0; j < z; j++) {
            if (array[j] == '0') {
                left.append("1");
            } else {
                left.append("0");
            }
        }
        String binary = left.toString() + right.reverse().toString();
        System.out.println(binary);
    }
}
