package InterviewJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupFromString {
    // remove duplicate characters from String
    public static void main(String[] args) {
        String str = "balloon";
        String result = "";

        char[] ch = str.toCharArray();

        for (char c : ch) {
            if (!result.contains(c + "")) {
                result += c + "";
            }
        }
        System.out.println(result);

    }
}
