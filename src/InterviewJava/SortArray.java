package InterviewJava;

import java.util.Arrays;


public class SortArray {
    public static void main(String[] args) {
        int[] arr = {12,1,34,5,78,99,43};


        System.out.println("before sort "+ Arrays.toString(arr));
        sortedArray(arr);
    }

    private static void sortedArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {                  // 12,  1,  11,  7
            for (int j = i+1; j < arr.length; j++) {            // temp = 12; 12 = 1; 1 = temp
                if(arr[i]>arr[j]){                          // 1   12   11   7
                    int temp = arr[i];                      // 1   11   12   7
                    arr[i] = arr[j];                        // 1   7   11   12
                    arr[j] = temp;                          // 1  7   11  12
                }
            }
        }
        System.out.println("after sort "+ Arrays.toString(arr));

    }


}
