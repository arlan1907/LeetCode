package InterviewJava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        //Write java program to find Armstrong number in java
        /*
        An Armstrong number is a positive m-digit number that is equal to the sum of the math powers of their digits.
        It is also known as pluperfect, or Plus Perfect, or Narcissistic number. It is an OEIS sequence A005188.
        Let’s understand it through an example.
        153: 1(3) + 5(3) + 3(3) = 1 + 125+ 27 = 153
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  number : ");

        int number = input.nextInt();

        checkNumberForArmstrong(number);


    }
    public static void checkNumberForArmstrong(int number){

        int digit = 0;
        int last ;
        int temp = number;
        int sum = 0;


        while (temp != 0){
            temp/=10;
            digit++;
        }

        temp=number;

        while (temp!=0){
            last = temp % 10;
            sum+= Math.pow(last, digit);
            temp=temp/10;
        }

        if(sum == number) {
            System.out.println("Given number is Armstrong");
        }else {
            System.out.println("Given number is not Armstrong");
        }
    }
}
