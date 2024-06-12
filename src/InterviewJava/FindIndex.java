package InterviewJava;

public class FindIndex {
    //Given a sorted array of distinct integers and a target value, return the index if the target is found.
    // If not, return the index where it would be if it were inserted in order.

    //Input: nums = [1,3,5,6], target = 5
    //Output: 2
    public static void main(String[] args) {
        int[] number = {1,3,5,6};
        System.out.println(findIndex(number,5));
    }

    public static int findIndex(int[] nums, int target){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                index = i;
            }else if(target>i && target<(i+1)){
                index=(i+1);
            }
        }
        return index;
    }
}
