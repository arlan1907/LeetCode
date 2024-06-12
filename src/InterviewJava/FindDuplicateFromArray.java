package InterviewJava;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromArray {
    public static void main(String[] args) {
        //Write java program to find duplicate number in an array

        int[] arr1 = {22,4,1,5,67,87,99};
        int[] arr2 = {67,232,4,2,15,267,87,939};

        findDuplicates(arr1, arr2);

    }

    private static void findDuplicates(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    System.out.println("duplicate element of arrays " + arr1[i]);
                    System.out.println("duplicate elements at indexes of " + i + ", " + j);
                }
            }
        }
    }

    //       SET WAY ////
//    Set<Integer> nonDuplicate = new HashSet<>();
//    int element = 1;
//
//        for (int j : arr1) {
//        nonDuplicate.add(j);
//    }
//        for (int j : arr2) {
//        if (!nonDuplicate.contains(j)) {
//            nonDuplicate.add(j);
//        } else {
//            System.out.println(element + ". duplicate element " + j);
//            element++;
//        }
//    }
}
