package Arraytraining;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {

        int[] num = {2,12,11,7,71};
        int target = 9;
        // find out index numbers of an array that gives target when they added each other;

        int[] result = new int[2];
        int index = num.length-1;

        for(int i = 0; i<num.length; i++){
            if(num[i] + num[index] == target){
                index--;

                result[0] = i;
                result[1] = index;
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(result));





    }
}
