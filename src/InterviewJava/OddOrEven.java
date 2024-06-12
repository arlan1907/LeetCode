package InterviewJava;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number to check if its odd or even ");
        int number = input.nextInt();

        checkNumberOddOrEven(number);

}

    private static void checkNumberOddOrEven(int number) {
        if(number % 2 == 0)
            System.out.println("Given number " + number + " is even");
        else
            System.out.println("Given number " + number + " is odd");
    }
}
