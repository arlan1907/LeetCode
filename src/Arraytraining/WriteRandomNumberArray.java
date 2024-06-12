package Arraytraining;

import java.util.Random;

public class WriteRandomNumberArray {
    public static void main (String[] args){

        int[][] vertical = new int[10][10];

        Random guess = new Random();

        for (int i = 0; i<10; i++){

            for (int j = 0; j<10; j++){
                vertical[i][j] = guess.nextInt(10);
                System.out.print(" "+vertical[i][j]);
            }
            System.out.println();
        }
    }
}
