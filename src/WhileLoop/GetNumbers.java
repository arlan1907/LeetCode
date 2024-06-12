package WhileLoop;

import java.util.Scanner;

public class GetNumbers {
    public static void main(String[] arg){

        // ask number to give number and get output all number under it till 0

        Scanner input = new Scanner(System.in);
        System.out.println("Type the number :");
        int number = input.nextInt();

        while(number>0){
            System.out.print(number);
            number--;
        }
        System.out.println();

        for(int i=1; i<=10; i++)
        {
            System.out.print(i);
        }




    }
}
