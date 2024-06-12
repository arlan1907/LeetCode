package leedCode;

import java.util.Arrays;

public class ValidAnagram {
    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
     */

    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) return false;

        char[] char1 = str1.toLowerCase().toCharArray();
        char[] char2 = str2.toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        for (int i = 0; i < char1.length; i++) {
            if (char1[i] != char2[i]) {
                return false;
            }
        }
        return true;
    }
}
