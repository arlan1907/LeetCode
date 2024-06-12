package Arraytraining;

import java.util.Arrays;
import java.util.Random;

public class ArrayCopy {
    public static void main (String[] args){


        int[] number = new int[10];

        Random given = new Random();

        for(int i = 0; i < number.length; i++){
            number[i] = given.nextInt(10);
        }
        System.out.println("original : "+ Arrays.toString(number));

        int[] copy = new int[number.length];
        int index = 0;

        for(int i = 0; i< number.length; i++){
            copy[index] = number[i];
            index++;
        }
        System.out.println("Copy array : " + Arrays.toString(copy));




    }
}
