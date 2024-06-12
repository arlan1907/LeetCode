package InterviewJava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountMostElementsInArray {
    public static void main(String[] args) {
        // Given an array nums of size n, return the majority element.

        //The majority element is the element that appears more than ⌊n / 2⌋ times.
        // You may assume that the majority element always exists in the array.

        int[] nums = {1,2,3,2,3,2,2,4};

        Map<Integer,Integer> sort = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!sort.containsKey(nums[i])){
                sort.put(nums[i],1 );
            }else {
                sort.put(nums[i],sort.get(nums[i])+1);
            }
        }
        System.out.println(sort);


    }
}
