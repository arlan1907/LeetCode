package JavaMethods;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give 3 integer numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("Smallest number is : " + getSmallest(a,b,c));

    }

    public static double getSmallest(double a, double b, double c){
        return Math.min(Math.min(a,b),c);
    }

}
