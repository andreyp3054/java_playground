package random_practice;

import java.util.*;
public class OneLineScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] stringArray = inputLine.split(" ");
        int[] numberArray = new int[stringArray.length];
      for (int i = 0; i < stringArray.length; i++){
          numberArray[i] = Integer.parseInt(stringArray[i]);
      }
      for(int hi : numberArray){
          System.out.println(hi);
      }
    }
}
