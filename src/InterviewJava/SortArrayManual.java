package InterviewJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayManual {
    public static void main(String[] args) {


        int[] array = new int[]{23, 3, 15, 51, 71, 19, 98, 6};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
