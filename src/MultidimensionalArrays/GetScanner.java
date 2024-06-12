package MultidimensionalArrays;

import java.util.Scanner;

public class GetScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int row  = input.nextInt();
        System.out.println("Enter the column size : ");
        int col  = input.nextInt();

        int[][] target = new int[row][col];

        System.out.println("Enter the values of array :");
        for(int i = 0; i<row; i++){
            for(int j = 0; i<col; i++){
                System.out.println(target[i][j] +" ");
            }
        }

        for(int i = 0; i<row; i++){
            for(int j = 0; i<col; i++){
                System.out.print(target[i][j] +" ");
            }
            System.out.println();
        }
    }
}

