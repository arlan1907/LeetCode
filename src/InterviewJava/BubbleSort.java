package InterviewJava;

import Arraytraining.Array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //Write java program to implement bubble sort
        // bubble sort is sorting index only one next index (sorting only neighbors)

        int[] arr = {12,1,34,5,78,99,43, 3, 7};
        System.out.println("before any sort" + Arrays.toString(arr));

        bubbleSortArray(arr);

        Arrays.sort(arr);
        System.out.println("After sort method " + Arrays.toString(arr));


    }

    private static void bubbleSortArray(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {        // [ 2,  1,  45,  22,  9,  12 ]
            if(arr[i] > arr[i+1]){                      // temp =2; 2 = 1; 1 = temp;
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("after bubble sort " + Arrays.toString(arr));
    }
}
