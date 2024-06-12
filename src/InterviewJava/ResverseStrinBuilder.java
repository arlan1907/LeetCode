package InterviewJava;

import java.util.Arrays;

public class ResverseStrinBuilder {
    public static void main(String[] args) {
        //Write a code that will reverse sentence. String str=”String is immutable”; output: “immutable is String“;

        String str="String is immutable";

        String[] strArray = str.split(" ");
        System.out.println(Arrays.toString(strArray));
        StringBuilder strReversed = new StringBuilder();


        for (int i = strArray.length-1; i >= 0; i--) {
            strReversed.append(strArray[i]).append(", ");
        }
        System.out.println(strReversed);

    }
}
