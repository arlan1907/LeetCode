package leedCode;

import javax.xml.stream.events.Characters;
import java.text.CharacterIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    /*
            Given a string s, find the length of the longest
        substring
         without repeating characters.

            Example 1:
            Input: s = "abcabcbb"
            Output: 3
            Explanation: The answer is "abc", with the length of 3.

            Example 2:
            Input: s = "bbbbb"
            Output: 1

            Example 3:
            Input: s = "pwwkew"
            Output: 3
            Explanation: The answer is "wke", with the length of 3.
            Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public static void main(String[] args) {
        String str = "bbbb";
        System.out.println(lengthOfLongestSubstring(str));

    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window
        int right = 0; // Right pointer of the sliding window
        Set<Character> charSet = new HashSet<>(); // Set to store unique characters

        while (right < s.length()) {
            if (!charSet.contains(s.charAt(right))) {
                // If the character is not in the set, add it and update the max length
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                // If the character is in the set, remove the leftmost character from the set
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
