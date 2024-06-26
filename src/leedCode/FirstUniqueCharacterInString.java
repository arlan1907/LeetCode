package leedCode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    /*
    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

        Example 1:
        Input: s = "leetcode"
        Output: 0

        Example 2:
        Input: s = "loveleetcode"
        Output: 2

        Example 3:
        Input: s = "aabb"
        Output: -1
     */
    public static void main(String[] args) {
        System.out.println(firstUniqueChar("loveleetcode"));

    }
    public static int firstUniqueChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
