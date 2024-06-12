package InterviewJava;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Write a java program to reverse array

        int[] originalArr = {1,2,3,4,5};
        int[] reversed = new int[originalArr.length];
        int index = 0;

        for (int i = originalArr.length-1; i >=0 ; i--) {
            reversed[index] = originalArr[i];
            index++;
        }
        System.out.println(Arrays.toString(reversed));

    }
}
