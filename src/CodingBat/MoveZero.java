package CodingBat;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        // Given integer Array int[] nums = {1,34,0,12,0,0,43};

        int[] nums = {1,1,0,34,1,0,12,0,43,7,0};

        // result {0,34,0,12,43,7,0,0,0,0}

        System.out.println(Arrays.toString(moveZero(nums)));
    }


    public static int[] moveZero(int[] nums){
        int[] result = new int[nums.length]; // 10
        int index = 0; //7

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 1){
                result[index] = nums[i];
                index++;
            }
        }
        while(index<nums.length){
            result[index] = 1;
            index++;
        }

        return result;
    }

}
