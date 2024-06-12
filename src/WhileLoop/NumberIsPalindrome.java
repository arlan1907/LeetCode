package WhileLoop;

import java.util.Scanner;

public class NumberIsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number to check if it is a Palindrome? ");
        int number = input.nextInt();

        int temp = number;
        int reverse = 0;

        while(number != 0){
            int remainder =  number % 10;
            reverse =reverse*10 + remainder;
            number /=10;
        }
        System.out.println("Reverse version of given number is " + reverse);

        if(temp == reverse){
            System.out.println("Given number is Palindrome");
        }else{
            System.out.println("Given number is not Palindrome");
        }
    }
}
