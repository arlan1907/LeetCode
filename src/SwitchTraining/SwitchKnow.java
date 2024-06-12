package SwitchTraining;

import java.util.Scanner;

public class SwitchKnow {
    public static void main(String[] args) {
        // haftalik diyet programimiz var
        // kullanicinin girdii gunde hangi diyeti uygulamamiz gerektigini yazdir

        Scanner gun = new Scanner(System.in);
        System.out.println("Write day of the week : ");
        int day = gun.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday menu: apple and grapes");
                break;
            case 2:
                System.out.println("Tuesday menu: grapes and avacado");
                break;
            case 3:
                System.out.println("Wednesday menu: banana and Shpinac");
                break;
            case 4:
                System.out.println("Thursday menu: lemon and Rice");
                break;
            case 5:
                System.out.println("Friday menu: Chicken and Rice");
                break;
            case 6:
                System.out.println("Saturday menu: potato and meat");
                break;
            case 7:
                System.out.println("Sunday menu: Fish and Rice");
                break;
            default:
                System.out.println("Please write one of the seven days of week :");

        }
    }
}
