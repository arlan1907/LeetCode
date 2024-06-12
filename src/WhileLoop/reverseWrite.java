package WhileLoop;

import java.util.Scanner;

public class reverseWrite {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        int number = input.nextInt();

        int reverse = 0;
        int remainder = 0;

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse is : " + reverse);
    }




//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your number :");
//        int number = input.nextInt();
//        int remainder = 0;
//        int reverse = 0;
//
//        while (number>0) {
//            remainder = number % 10;
//            reverse = reverse * 10 + remainder;
//            number /= 10;
//        }
//        System.out.println("reverse : " + reverse);
//
//    }
}
