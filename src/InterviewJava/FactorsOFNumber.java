package InterviewJava;

import java.util.Scanner;

public class FactorsOFNumber {
    public static void main(String[] args) {
        // Write java program to find factors of number from 1 to 100
        //  1 ->  100
        // 1 -> 1
        // 2 -> 1 2
        // 3 -> 1 3
        // 4 -> 1 2 4
        // 100 - > ....
        System.out.println("Enter the number to calculate factors below ? ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i <=number ; i++) {
      //      System.out.print("Factors of " + i + ": ");
            for (int j = 1; j <= i ; j++) {
                if(i % j == 0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }


    }
}
