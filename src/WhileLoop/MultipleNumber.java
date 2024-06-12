package WhileLoop;

import java.util.Scanner;

public class MultipleNumber {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type the number please: ");
        int users = input.nextInt();
        int multp = 1;

        while(users>1){
            multp = multp * users;
            System.out.println( multp);
            users--;
        }
        System.out.println("multp " + multp);

    }
}
