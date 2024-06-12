package InterviewJava;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        // a number which divisible only by 1 and itself is prime number

        Scanner input =new Scanner(System.in);
        System.out.println("Give a number : ");
        int number  = input.nextInt();

        boolean isPrime = false;

        for (int i = 2; i <number ; i++) {
            if (number % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime){
            System.out.println(number + " is prime");
        }else {
            System.out.println(number + " is not prime");
        }
    }
}
