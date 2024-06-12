package leedCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowelsOfString {
    /*
    Given a string s, reverse only all the vowels in the string and return it.

        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

        Example 1:
        Input: s = "hello"
        Output: "holle"

        Example 2:
        Input: s = "leetcode"
        Output: "leotcede"
     */
    public static void main(String[] args) {
        System.out.println(reverseVowels("arA"));

    }

    public static String reverseVowels(String str) {
        String vowel = "aeuioAIUEO";
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(vowel.contains(str.charAt(i)+"")){
                list.add(str.charAt(i));
            }
        }
        int index = list.size()-1;
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(vowel.contains(arr[i]+"")){
                arr[i] = list.get(index--);
            }
        }
        return new String(arr);
    }
}
