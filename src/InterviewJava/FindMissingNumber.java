package InterviewJava;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        // Write java program to find a missing number in an array
        // after sorting the array if any number breaking the order
        int[] numbers = new int[]{2,3,4,6,8,1,9,5};

        Arrays.sort(numbers);
        int num = numbers[0];       // after sorting the array we know starting point of compare is element at the index 0
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == num){
                num++;
                        // whenever any element of array is not equal to our growing number chain will break
            }else {
                System.out.println("Missing number is  " + num);
                break;
            }
        }
    }
}
