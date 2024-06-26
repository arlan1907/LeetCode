package CodingBat;

public class CanBalance {
    /*
    Given a non-empty array, return true if there is a place to split the array
    so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true

     */
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 2, 1};
        System.out.println(canBalance(nums));

    }

    public static boolean canBalance(int[] nums){
        boolean balance = false;
        int leftSum =0;
        for (int i = 0; i < nums.length-1; i++) {
              leftSum += nums[i]; //2
            int rightSum =0;
            for (int j = i+1; j < nums.length; j++) {
                rightSum += nums[j];
                if(rightSum==leftSum && j== nums.length-1) balance =  true;
            }
        }
        return balance;
    }
}
