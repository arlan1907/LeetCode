package WhileLoop;

import java.util.Scanner;

public class pithagor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number : ");
        int number = input.nextInt();

        for (int i=1; i<=10; i++){

                System.out.println(number +" x " + i+ " = "+ (number*i));
            }
            System.out.println();
        }
    }

