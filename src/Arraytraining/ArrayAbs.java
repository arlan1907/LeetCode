package Arraytraining;

import java.util.Arrays;

public class ArrayAbs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Math.max(nums[nums.length/2],(Math.max(nums[0],nums[nums.length-1]))));
    }
}
