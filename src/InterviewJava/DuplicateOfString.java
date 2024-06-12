package InterviewJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateOfString {
    public static void main(String[] args) {
        //Write java program to print duplicates from a String in java

        String str = "jhsgdfhgfkjagdhgjdskfagskhgfksj";

        List<Character> duplicates = new ArrayList<>(); // to avoid print duplicate elements created List to store duplicates in it and give as an statement

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {

                if (chars[i] == chars[j] && !duplicates.contains(chars[i])){        // if my list do not contain the duplicate then print it to me / else skip this element
                   // System.out.println(chars[i] + " found duplicate");
                    duplicates.add(chars[i]);
                    i++;
                }
            }
        }
        System.out.println("Duplicate elements in string "+duplicates);

    }
}
