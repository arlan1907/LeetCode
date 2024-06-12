package interviewProject;

import java.util.Arrays;

public class CombineTwoArray {
    public static void main(String[] args) {
        /*
        23. Combine two arrays into one array. int nums[]={2,4,3}; int nums2[]={1,8};
         */

        int nums[]={2,4,3};
        int nums2[]={1,8};

        int[] combined = new int[nums.length+ nums2.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            combined[index] = nums[i];
            index++;
        }
        for (int i = 0; i < nums2.length; i++) {
            combined[index] = nums2[i];
            index++;
        }
        System.out.println(Arrays.toString(combined));
    }
}
