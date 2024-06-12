package TrainingPackage;
import java.util.Scanner;
public class Scinner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name : ");
        String name = scan.nextLine() ;

        System.out.println("How old are you : ");
        int age = scan.nextInt();

        scan.nextLine() ;
        System.out.println("What is your favorite food : ");
        String food = scan.nextLine() ;

        System.out.println("What would you like on your chicken nuggets : ");
        String top = scan.nextLine() ;

        System.out.println("Hi " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your favorite food is " + food);
        System.out.println("So you mean " + top);











    }
}
