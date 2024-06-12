package InterviewJava;

import java.util.Arrays;

public class FindLeastDifferenceInArray {
    public static void main(String[] args) {
        // Write a program to find the elements of an Array that has least difference in java? input = [3,9,50,15,99,7,98,65]

        int[] number = {3,9,50,15,99,7,93,65};

        findElementsWithLeastDifference(number);


        }

        public static void findElementsWithLeastDifference(int[] num){
            Arrays.sort(num);

            int difference = num[num.length-1] -num[0];

            for (int i = 0; i < num.length-1; i++) {
                if(num[i+1] - num[i] < difference){
                    difference = num[i+1] - num[i];
                }
            }
            for (int i = 0; i < num.length-1; i++) {
                if(num[i+1] - num[i] == difference){
                    System.out.println(num[i] + " " + num[i+1]);
                }
            }

        }
}

/*

        // Write a program to find the elements of an Array that has least difference in java?
        input = [3,9,50,15,99,7,98,65]
        [3,7,9,15,50,65,98,99]


    int[] nums={3,9,50,15,99,7,98,65};
        Arrays.sort(nums);
                System.out.println(Arrays.toString(nums));

                int leastDifference=nums[nums.length-1];
                int min=0;
                int max=0;

                for(int i=0; i<nums.length-1; i++){
        int difference= nums[i+1]-nums[i]; // 1
        if(difference<leastDifference){ // 1<2
        leastDifference=difference; // leastDifference=1;
        min=nums[i]; // 98
        max=nums[i+1]; // 99
        }
        }

        System.out.println("Two number that has least difference are: "+min+" - "+max);
 */