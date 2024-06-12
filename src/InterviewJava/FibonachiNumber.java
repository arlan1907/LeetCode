package InterviewJava;

import java.util.Scanner;

public class FibonachiNumber {
    public static void main(String[] args) {
        // Calculate first "given" Fibonacci number
        Scanner input = new Scanner(System.in);

        System.out.println("Give a number to calculate digits of Fibonacci number :");
        int given = input.nextInt();
        // we know that fib numbers starts from zero and every next fib number is nextFib of previous two fib number
        // so we need declare first two element of fib number to keep execute loop to have third and next ones

        int fib1 = 0;
        int fib2 = 1;
        int nextFib = 0;
        // as we know first two element we output them manually before loop and rest will give loop give us

        if (given <= 0 ){
            System.out.println("Nothing to calculate, give a valid number");
        }else if(given == 1) {
            System.out.println("First " + given + " element of fib number : "+ fib1 );
        }else {

            System.out.print("First " + given + " element of fib number : " + fib1 + " " + fib2 + " ");
            // after first two element taken to avoid have more than "given" will start looping from 2
            for (int i = 2; i < given; i++) {

                nextFib = fib1 + fib2;
                // to jump next element on each iteration declare them as following
                fib1 = fib2;
                fib2 = nextFib;
                // after each iteration loop will store nextFib as output
                System.out.print(nextFib + " ");
            }
            System.out.println();
        }

            // calculate all fib number below given number


            System.out.println("Give a number to calculate all fib numbers below");
            int given2 = input.nextInt();
//
//
            int fibi1 = 0;
            int fibi2 = 1;
            int nextFibi = 0;

            // to avoid to have 1 three time we will start output from fibi1
        if (given2 <= 0 ){
            System.out.println("Nothing to calculate, give a valid number");
        }else if(given2 == 1) {
            System.out.println("First " + given + " element of fib number : "+ fib1 );
        }else {
            System.out.print("All fib number below " + given2 + " are : "+ fibi1 + " ");


            while (nextFibi<given2) {
                nextFibi = fibi1 + fibi2;
                // to jump next element on each iteration declare them as following
                fibi1 = fibi2;
                fibi2 = nextFibi;
                System.out.print(fibi1 + " "); // we need to return fibi1 to avoid the last digit method will return will more than given number

            }
        }

    }












    }

//    private static void calculateFibannacciNumber(int given) {
//        if (given < 0 ){
//            System.out.println("Nothing to calculate, give a valid number");
//        }
//        if(given == 1) {
//            System.out.println(given);
//        }
//        int fib1 = 0;     // 0  1  1  2  3  5  8  13
//        int fib2 = 1;
//        int nextFib =0;
//        System.out.print(fib1+" "+fib2 +" ");
//
//        for (int i = 2; i < given ; i++) {
//            nextFib = fib1+fib2;
//            fib1=fib2;
//            fib2 = nextFib;
//            System.out.print(nextFib + " ");
//        }
//    }
//    private static void calculateFibonacciNumberBelow(int number) {
//        if (number < 0 ){
//            System.out.println("Nothing to calculate, give a valid number");
//        }
//        if(number == 1) {
//            System.out.println(number);
//        }
//        int fib1 = 0;     // 0  1  1  2  3  5  8  13
//        int fib2 = 1;
//        int nextFib =0;
//        System.out.print(fib1+" ");
//
//        while (nextFib<number) {
//            nextFib = fib1+fib2;
//            fib1=fib2;
//            fib2 = nextFib;
//            System.out.print(fib1 + " "); // we need to return fib1 t avoid the last digit method will return will more than given number
//        }
//    }

