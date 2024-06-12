package InterviewJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddArrays {
    public static void main(String[] args) {
        //Combine two arrays into one array. int nums[]={2,4,3}; int nums2[]={1,8};
        int[] nums={2,4,3};
        int[] nums2={1,8};

        int[] result = new int[nums.length + nums2.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            result[index] = nums[i];
            index++;
        }
        for (int i = 0; i < nums2.length; i++) {
            result[index] = nums2[i];
            index++;
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));


    }
}
