package WhileLoop;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] arg){
        // ask for number und sum all digits under it

        Scanner input = new Scanner(System.in);
        System.out.println("Type the number please: ");
        int users = input.nextInt();
        int sum = 0;

        while(users>0){
            sum = sum + users;
            users--;
        }
        System.out.println("sum " + sum);
    }
}
