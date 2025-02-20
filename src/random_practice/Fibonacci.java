package random_practice;

import java.util.*;
public class Fibonacci {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("bound: ");
        int numberOfTerms = scanner.nextInt();
        int firstTerm = 1;
        int secondTerm = 1;
        int nextTerm;
        for(int i = 0; i< numberOfTerms; i++){
            System.out.println(firstTerm + " ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}