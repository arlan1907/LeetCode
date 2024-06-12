package Arraytraining;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] friendsArray = {"Ahmet", "Turan", "Bob", "John"};
        int[] number = {1, 2, 3, 4, 5};
        System.out.println("First index of array is : " + number[0]);

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        int[] number2 = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Give the digits of an array : ");
        for (int i = 0; i < number2.length; i++) {
            number2[i] = input.nextInt();

        }

        for (int i = 0; i < number2.length; i++) {
           System.out.println(Arrays.toString(new int[]{number2[i]}));
        }
    }
}
