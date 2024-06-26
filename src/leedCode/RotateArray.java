package leedCode;

import java.util.Arrays;

public class RotateArray {
    /*
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

        Example 1:
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]

        Example 2:
        Input: nums = [-1,-100,3,99], k = 2
        Output: [3,99,-1,-100]
        Explanation:
        rotate 1 steps to the right: [99,-1,-100,3]
        rotate 2 steps to the right: [3,99,-1,-100]
     */
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotate(nums, k);

    }
    public static void rotate(int[] nums, int k) {
        int[] rest = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i>k){
                for (int j = i; j < nums.length; j++) {
                    rest[index] = nums[i];
                    index++;
                    i++;
                }
            }
        }
        int a = 0;
        while (index < nums.length){

            rest[index] = nums[a];
            index++;
            a++;
        }

        System.out.println(Arrays.toString(rest));
    }
}
