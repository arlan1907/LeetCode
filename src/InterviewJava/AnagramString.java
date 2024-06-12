package InterviewJava;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        /**

        // Write java program to check two strings are anagrams or not
        // Two strings are called anagrams if they contain same set of characters but in different order.

        //ex:   debit card    ->    bad credit
        //      keep       -> peek
         //
         **/

        String str1 = "haha";
        String str2 = "haah";

        System.out.println(isAnagrams(str1, str2));


    }

    public static boolean isAnagrams(String str1, String str2){

        if(str1.length() != str2.length()) return false;

        char[] char1 = str1.toLowerCase().toCharArray();
        char[] char2 = str2.toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        for (int i = 0; i < char1.length; i++) {
            if(char1[i] != char2[i]){
                return false;
            }
        }

        return true;
    }
}
