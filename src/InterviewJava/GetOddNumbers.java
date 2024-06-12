package InterviewJava;

public class GetOddNumbers {
    public static void main(String[] args) {
        // Get only odd numbers from array. int[] nums={5,3,2,4,7,};

        int[] nums={5,3,2,4,7,};

        for (int i = 0; i < nums.length; i++) {
            if(i%2 != 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
