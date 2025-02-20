package random_practice;

import java.util.*;
public class FibonacciNthTerm{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preferredElement = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int nextTerm;
        for(int i = 0; i < preferredElement; i++){
            System.out.println(firstNumber);
            nextTerm = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextTerm;
        }
    }
}

