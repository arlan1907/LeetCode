package WhileLoop;

import java.util.Scanner;

public class FibonachiNumber {
    public static void main(String[] args) {
        // Calculate first "given" Fibonacci number
        Scanner input = new Scanner(System.in);

        System.out.println("Give a number to calculate digits of Fibonacci number :");
        int given = input.nextInt();
        System.out.println("First " + given + " digits of Fibonacci numbers");
        calculateFibannacciNumber(given);
        System.out.println();

        System.out.println("Give a number to calculate all below fibonacci number");
        int number = input.nextInt();
        calculateFibonacciNumberBelow(number);

    }

    private static void calculateFibannacciNumber(int given) {
        if (given < 0 ){
            System.out.println("Nothing to calculate, give a valid number");
        }
        if(given == 1) {
            System.out.println(given);
        }
        int fib1 = 0;     // 0  1  1  2  3  5  8  13
        int fib2 = 1;
        int nextFib =0;
        System.out.print(fib1+" "+fib2 +" ");

        for (int i = 2; i < given ; i++) {
            nextFib = fib1+fib2;
            fib1=fib2;
            fib2 = nextFib;
            System.out.print(nextFib + " ");
        }
    }
    private static void calculateFibonacciNumberBelow(int number) {
        if (number < 0 ){
            System.out.println("Nothing to calculate, give a valid number");
        }
        if(number == 1) {
            System.out.println(number);
        }
        int fib1 = 0;     // 0  1  1  2  3  5  8  13
        int fib2 = 1;
        int nextFib =0;
        System.out.print(fib1+" ");

        while (nextFib<number) {
            nextFib = fib1+fib2;
            fib1=fib2;
            fib2 = nextFib;
            System.out.print(fib1 + " "); // we need to return fib1 t avoid the last digit method will return will more than given number
        }
    }
}
