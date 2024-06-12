package leedCode;

import java.util.Arrays;

public class LargestNumber {
    /*
    Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

        Since the result may be very large, so you need to return a string instead of an integer.

        Example 1:
        Input: nums = [10,2]
        Output: "210"

        Example 2:
        Input: nums = [3,30,34,5,9]
        Output: "9534330" 9534330


     */
    public static void main(String[] args) {
        int[] nums = {10,2};
        System.out.println(largestNumber(nums));

    }
    public static String largestNumber(int[] nums) {

        String[] str = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }


        for (int i = 0; i < str.length-1; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(str[i].charAt(0) < str[j].charAt(0)){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
       return String.join("", str);
    }
}
