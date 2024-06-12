package InterviewJava;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        // How to swap two numbers in Java
        Scanner input = new Scanner(System.in);
        System.out.println("Give me first number ");
        int first  = input.nextInt();
        System.out.println("Give me second number ");
        int second = input.nextInt();

        System.out.println("Before Swap");
        System.out.println("first number " + first);
        System.out.println("second number " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After Swap");
        System.out.println("first number " + first);
        System.out.println("second number " + second);


    }
}
