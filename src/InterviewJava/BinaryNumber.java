package InterviewJava;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {

        // Write java program to check given number is binary or not
        // binary number should be greater than 0 and all digits must be equal to 0 or 1 , not more
//11000, 1100, 1001
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  number :");
        int number = input.nextInt();

        checkNumberBinary(number);

    }

    private static void checkNumberBinary(int number) {
        //  1 1 0 1
        int temp = number;
        boolean isBinary = true;
        int remainder;

        while(temp!=0){
            remainder = temp %10;
            if(remainder>1){
                isBinary = false;
                break;
            }
            temp = temp/10;
        }

        if(isBinary){
            System.out.println(number + " is a binary");
        } else {
            System.out.println(number + " is not a binary");
        }





    }

}
