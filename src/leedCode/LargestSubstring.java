package leedCode;

import java.util.HashSet;
import java.util.Set;

public class LargestSubstring {
    public static void main(String[] args) {
        // Given a String s , find the length of the longest substring of the longest substring without repeating characters
        // input -> String str = "abcabcbba";  output should be 3=abc
        String str = "abcabcbba";

        findLargestSubstring(str);


    }
    public static void findLargestSubstring(String str){

        char[] letters = str.toCharArray();

        Set<Character> store = new HashSet<>();
        StringBuilder word = new StringBuilder();

       for(char el : letters){
           if(!store.contains(el)) {
               store.add(el);
               word.append(el);
           }
       }

        System.out.println(word + " = " + word.length());

    }
}
