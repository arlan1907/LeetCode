package interviewProject;

import java.util.Arrays;

public class ReverseString {
    /*
    Write a code that will reverse sentence. String str=”String is immutable”;
                                                            0    1   2
                                                            2    1   0
                                                output: “immutable is String“;

     */
    public static void main(String[] args) {

        String str="String is immutable";

        String[] arr = str.split(" ");
        String[] arrReversed = new String[arr.length];
        int index = 0;

        for (int i = arr.length-1; i >=0 ; i--) {
            arrReversed[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(arrReversed));
        StringBuilder aaa = new StringBuilder();
        for (String s : arrReversed) {
            aaa.append(s).append(", ");
        }
        System.out.println(aaa);
    }
}
