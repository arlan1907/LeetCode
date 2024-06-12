package WhileLoop;


import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        int sumOdd = 0;
        int sumEven = 0;

        while (number > 0){

            if (number % 2 == 0){
                sumEven = sumEven + number;
                number --;
            }
            else {
                sumOdd = sumOdd + number;
                number --;
            }

        }
        System.out.println("Sum of odd numbers : " + sumOdd);
        System.out.println("Sum of even numbers : " + sumEven);
    }
}
