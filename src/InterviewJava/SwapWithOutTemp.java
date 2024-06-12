package InterviewJava;

import java.util.Scanner;

public class SwapWithOutTemp {
    public static void main(String[] args) {
        //How to swap two numbers without using temp variable

        Scanner input = new Scanner(System.in);
        System.out.println("Give me first number ");
        int first  = input.nextInt();
        System.out.println("Give me second number ");
        int second = input.nextInt();

        System.out.println("Before Swap");
        System.out.println("first number " + first);
        System.out.println("second number " + second);

        first = first - second;  // we do it only for our side/precondition
        second = first + second; // here it will take first as a calculation of above  =>  (first-second)+second
        first = second - first;  // here it will take second just above equation     => (first+second)-first

        System.out.println("After Swap");
        System.out.println("first number " + first);
        System.out.println("second number " + second);

    }

}
