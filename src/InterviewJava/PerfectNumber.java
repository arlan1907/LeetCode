package InterviewJava;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //Write java program to find perfect number or not
        // A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.

        // 1. find all factors (divisors) ;
        // 2. add all divisors
        // check if result == number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  number : ");

        int number = input.nextInt();

        int factors = 0;

        for (int i = 1; i <number ; i++) {
            if(number%i ==0 ) {
                System.out.print(i+" ");
                factors = factors + i;
            }
        }
        System.out.println();
        if(number == factors ){
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }

    }
}
