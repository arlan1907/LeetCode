package leedCode;

import java.util.Arrays;

public class SortColors {
    /*
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
    with the colors in the order red, white, and blue.
    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    You must solve this problem without using the library's sort function.

    Example 1:
    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]

    Example 2:
    Input: nums = [2,0,1]
    Output: [0,1,2]
     */
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);

    }
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
