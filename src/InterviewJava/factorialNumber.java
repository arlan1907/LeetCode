package InterviewJava;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        // calculate factorial of given number
        // factorial is the product of all positive number less than or equal number

        Scanner input = new Scanner(System.in);
        System.out.println("Give a number : ");
        int number = input.nextInt();

        if(number < 0){                 // not work if given is negative
            System.out.println("Nothing to calculate");
        }else if(number == 0){          // no positive number below 0, so first element if factorial is 1;
            System.out.println("Factorial of "+ number + " is "+ 1);
        }else {
            int start = 1;              // we need starting point to start iteration till given number
            for (int i = 1; i <= number ; i++) {
                start *= i;
            }
            System.out.println("Factorial of " + number + " is => " +start);
        }



    }
}
