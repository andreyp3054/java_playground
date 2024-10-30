package regionals;

import java.util.*;
import java.lang.*;
public class SumOfSquares {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int integer = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Sum of squares of the first " + integer + " natural numbers: ");
        int sum = 0;
        for(int i = 1; i <=
                integer; i++){
            sum+= (int) Math.pow(i,2);
        }
        System.out.print(sum);
    }

}
