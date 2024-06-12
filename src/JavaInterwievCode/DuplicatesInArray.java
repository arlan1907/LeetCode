package JavaInterwievCode;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
    public static void main(String[] args) {
        /*
        Write java program to find common elements between two arrays in java
        int[] arr1 = {12,13,14,15,16,17}
        int[] arr1 = {19,17,22,13,45,12}

        duplicates = 12, 13
         */

        int[] arr1 = {12,13,14,15,16,17};
        int[] arr2 = {19,17,22,13,45,12};
        Set<Integer> number = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) { // insertion order is not preserved
            number.add(arr1[i]);                // adding numbers randomly
        }

        for (int j = 0; j < arr2.length; j++) {
            if(!number.contains(arr2[j])){
                number.add(arr2[j]);
            }else {
                System.out.print(arr2[j] + " ");
            }
        }
        System.out.println();
        System.out.println(number);
    }
}

