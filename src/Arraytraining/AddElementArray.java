package Arraytraining;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[] {11,12,13,14,15,16,17,18,19,20};
        System.out.println("We have an array : ");
        System.out.println(Arrays.toString(number));
        System.out.println("Which index would you like new value : ");

        int user = input.nextInt();
        int value = 5;

        for(int i = number.length-1; i>user; i--){
            number[i] = number[i-1];
        }
        System.out.println(Arrays.toString(number));
        number[user] = value;
        System.out.println(Arrays.toString(number));



    }
}
