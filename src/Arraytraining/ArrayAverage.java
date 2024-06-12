package Arraytraining;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give 6 integer numbers : ");

        int[] numbers = new int[6];

        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        numbers[2] = input.nextInt();
        numbers[3] = input.nextInt();
        numbers[4] = input.nextInt();
        numbers[5] = input.nextInt();

        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum +=numbers[i];

        }
        System.out.println(Arrays.toString(numbers));
        double average = sum / numbers.length;

        System.out.println("Average is : " + average );






    }
}
