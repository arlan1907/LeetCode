package CodingBat;

import java.util.Arrays;

public class TenRun {
    /*
    For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
    until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.


tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
     */

    public static int[] tenRun(int[] numbers) {
        int[] arr = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 10 == 0 && i>0) {
                arr[i] = numbers[i];
            } else arr[i] = 10;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num = {2, 10, 3, 4, 20, 5};
        System.out.println(Arrays.toString(tenRun(num)));

    }
}
