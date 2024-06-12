package InterviewJava;

import Arraytraining.MaxMinValue;

import java.util.Arrays;

public class LargestElementOfArray {
    public static void main(String[] args) {
        // Write java program to find largest element in array in java

        int[] arr = {23, 45, 6, 76, 88,101, 11, 99};



        /**
         * easy way
        Arrays.sort(arr);
        System.out.println("largest element of an array is "+arr[arr.length-1]);
        **/

        largestElementOfArray(arr);

    }

    private static void largestElementOfArray(int[] arr) {
        int largest = arr[0];
        int index =0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
                index = i;
            }
        }
        System.out.println("largest element of an array is "+ largest);
        System.out.println(" index of largest element  is "+ index);
    }
}
