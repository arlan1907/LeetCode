package InterviewJava;

public class ArrayAddToTarget {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 9;

        for (int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("indexes to target :" + i+" " + j);
                    System.out.println("elements to target :" + nums[i]+", " + nums[j]);
                }
            }
        }
    }
}
