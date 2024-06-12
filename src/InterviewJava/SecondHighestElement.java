package InterviewJava;

import java.util.Arrays;

public class SecondHighestElement {
    public static void main(String[] args) {
        // find second highest element {1,2,3,8,8,9,9,5}

        int[] num = {1,2,3,8,8,9,9,5};

        Arrays.sort(num);

        int largest = num[num.length-1];
        System.out.println("Largest element of an array is : " + largest);


        for (int i = num.length-1; i >= 0  ; i--) {
            if (num[i] < largest){
                System.out.println("second largest element " + num[i]);
                break;
            }

        }
    }
}
