package random_practice;

import java.util.*;
public class PrimeNumber{
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if(counter == 2) {
            System.out.println("Prime Number");
        }
	    else{
                System.out.println("Not a Prime Number");
            }
        }
    }