package WhileLoop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number : ");
         int number = input.nextInt();
         int fact = 1;

         for (int i =1; i <=number; i++){
             fact = fact *i;
         }
        System.out.println("factorial : " + fact);
    }
}
