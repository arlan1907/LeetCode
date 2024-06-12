package Arraytraining;

import java.util.Arrays;
import java.util.Random;

public class MaxMinValue {
    public static void main(String[] args) {

        int[] number = new int[10];

        int MaxValue = Integer.MAX_VALUE;
        int MinValue = Integer.MIN_VALUE;

        Random given = new Random();

        for(int i = 0; i < number.length; i++ ){
            number[i] = given.nextInt();
        }
        System.out.println(Arrays.toString(number));

        for (int i =0; i < number.length; i++){
            if (number[i] > MaxValue){
                MaxValue = number[i];
            }
            if(number[i]<MinValue){
                MinValue = number[i];
            }
        }
        System.out.println(MaxValue);
        System.out.println(MinValue);
    }
}
