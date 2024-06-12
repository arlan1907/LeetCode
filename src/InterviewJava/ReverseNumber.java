package InterviewJava;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Write java program to reverse a number in java

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  number to be reversed");

        int number = input.nextInt();
        System.out.println(number);
        // 1  2  3   4 ->
        //           I   ->   number%10 ;
        // store          -> new number
        // each iteration number/10

        int reversed=0;
        int remainder ;

        while (number>0){
            remainder = number%10;
            reversed = reversed*10 + remainder;
            number/=10;
        }
        System.out.println(reversed);

        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System. out.print("Array in reverse order:  ");
        //Loop through the array in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }



    }
}
