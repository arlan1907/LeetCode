package JavaInterwievCode;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        Write a java program to reverse arrays
        int[] number = {1,2,3,4,5,6,7,8}
                        0 1 2 3 4 5 6 7
                        0
                        {8,7,6,5,4,3,2,1}
        String[] word = {"hello", "java", "world"}
         */
        int[] number = {1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(number));

        reverseArray(number);

    }

    private static void reverseArray(int[] number) {
        int[] reversed = new int[number.length];
        int index = 0;
        // number[] length = 8
        // last element located in index 7->6->5->4
        for (int i = number.length-1; i >=0 ; i--) { // i=-1
            reversed[index] = number[i];
            index++; //0->1->2->3
        }
        System.out.println("Reversed " + Arrays.toString(reversed));
    }
}
