package WhileLoop;

import java.util.Scanner;

public class SumOdd_SumEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = 0;
        char choice =' ';
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i<number; i++ ) {
            System.out.println(" Enter a number :");
            number = input.nextInt();

            if (number % 2 == 0){
                sumEven += number;
            }
            else {
                sumOdd += number;
            }

            System.out.println("sum of even numbers : " + sumEven);
            System.out.println("sum of odd numbers : " + sumOdd);

            System.out.println("Do you want to continue ?");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("sum of even numbers : " + sumEven);
        System.out.println("sum of odd numbers : " + sumOdd);

        }} //  do not work


