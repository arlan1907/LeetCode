package Arraytraining;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndexInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numbers));
        int given = input.nextInt();

        int index =0;

        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] != given){
                System.out.println("Array doesn't exist such a number ");
                break;
            }else {
                index = given-1;
            }
        }
        System.out.println("Given number is at index " + index);


    }
}
