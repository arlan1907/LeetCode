package JavaMethods;

import java.util.Arrays;

public class TESTtrainingClass {
    public static void main(String[] args) {

        MethodTrainingClass testMethods = new MethodTrainingClass();
        System.out.println(testMethods.stringMatch("xxcaazz","xxbaaz"));

        System.out.println(testMethods.stringX("xaxrxsxlxaxnx"));

        System.out.println(testMethods.altPairs("Chocolate"));

        System.out.println(testMethods.stringYak("yakpakyak"));

        int[] arr = {100,333,500,4,2,7,6,1,2,23,33,44,6,6,6,7};
        System.out.println(testMethods.threeAmigos(arr));

        System.out.println(testMethods.array667(arr));

        System.out.println(testMethods.noTriples(arr));

        System.out.println(testMethods.has271(arr));

        System.out.println();
        System.out.println("===========================");

        int[] nums = {1,2,3,4,5,6};
        int len = nums.length/2;
        System.out.println(len);
        System.out.println(nums[len]+nums[len+1]);
        int back = nums[0];
        int front = nums[nums.length-1];
        nums[0] = front;
        nums[nums.length-1] = back;

        System.out.println(Arrays.toString(nums));

        String str = "HiAxyzbc";
        String b = "abc";
        for(int i = 0; i < str.length()-4; i++){
            if (str.charAt(i) != '.' && str.substring(i+1,i+4).equals("xyz")){
                System.out.println("equal");
            }
                }
    }
}

