package InterviewJava;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number to check : ");
        int number  = input.nextInt();

        checkNumberPalindrome(number);

    }

    private static void checkNumberPalindrome(int number) {
        int remainder = 0;
        int reversed = 0;
        int temp = number;

        while (number>0){
            remainder = number%10;
            reversed = reversed*10 + remainder;
            number/=10;
        }
        if (temp == reversed){
            System.out.println("Given number is palindrome");
        }else{
            System.out.println("Given number is not Palindrome");
        }

    }

}
