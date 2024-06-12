package leedCode;

import java.util.HashMap;

import static java.lang.Math.abs;

public class ContainDuplicates {
    public static void main(String[] args) {
        //Given an integer array nums and an integer k,
        // return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
        int[] nums = {1,2,3,1};

        System.out.println(containsNearbyDuplicate(nums, 3));




    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]) && Math.abs(hm.get(nums[i])-i)<=k){
                return true;
            }else{
            hm.put(nums[i],i);}
        }
        return false;
    }
}
