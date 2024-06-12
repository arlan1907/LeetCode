package WhileLoop;

import java.util.Scanner;

public class DoWhile {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int num1, num2;
        char choice ;

        do {
            System.out.println("Give numbers : ");
            num1 = input.nextInt();
            num2 = input.nextInt();

            System.out.println("Sum of numbers : " + (num1 + num2));

            System.out.println(" Would you like to continue? y/n ");
            choice = input.next().charAt(0);

        }while ((choice == 'y' || choice == 'Y'));

        System.out.println("Good bye");
    }
}
