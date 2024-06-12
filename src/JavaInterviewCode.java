import java.util.Arrays;

public class JavaInterviewCode {
    public static void main(String[] args) {
        // Write a java program to reverse arrays
        //  {1,2,3,4,5,6}; --> {6,5,4,3,2,1}


        int[] number = {1,2,3,4,5,6};
        int[] reversed = new int[number.length];

        reversed[0] = number[5];
        reversed[1] = number[4];
        reversed[2] = number[3];
        reversed[3] = number[2];
        reversed[4] = number[1];
        reversed[5] = number[0];

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(reversed));

        reverseArray(number);


    }

    private static void reverseArray(int[] number) {

    }
}
