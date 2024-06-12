package CodingBat;

import java.util.Arrays;

public class XYZmiddle {
    /*
    Given a string, does "xyz" appear in the middle of the string? To define middle,
     we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
     This problem is harder than it looks.

        xyzMiddle("AAxyzBB") → true
        xyzMiddle("AxyzBB") → true
        xyzMiddle("AxyzBBB") → false
     */

    public static void main(String[] args) {
        String str = "AxyzBBB";
        System.out.println(xyzMiddle(str));

    }
    public static boolean xyzMiddle(String str){
        String[] lett = str.split("xyz");
        return Math.abs(lett[0].length() - lett[1].length()) <= 1;
    }
}
