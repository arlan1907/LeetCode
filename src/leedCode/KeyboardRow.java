package leedCode;

import java.util.*;
import java.util.stream.Collectors;

public class KeyboardRow {
      /*
        Given an array of strings words, return the words that can be typed using letters of the alphabet
        on only one row of American keyboard like the image below.

            In the American keyboard:

            the first row consists of the characters "qwertyuiop",
            the second row consists of the characters "asdfghjkl", and
            the third row consists of the characters "zxcvbnm".

            Example 1:
            Input: words = ["Hello","Alaska","Dad","Peace"]
            Output: ["Alaska","Dad"]

            Example 2:
            Input: words = ["omk"]
            Output: []

            Example 3:
            Input: words = ["adsdf","sfd"]
            Output: ["adsdf","sfd"]
         */

    public static void main(String[] args) {

        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));

    }

    public static String[] findWords(String[] words) {
        List<String> rest = new ArrayList<>();

        String str1 = "qwertyuiop";
        Set<Character> setstr1 = str1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        String str2 = "asdfghjkl";
        Set<Character> setstr2 = str2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        String str3 = "zxcvbnm";
        Set<Character> setstr3 = str3.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());


        for (int i = 0; i < words.length; i++) {

            if (setstr1.containsAll(removeDuplicates(words[i]))) {
                rest.add(words[i]);
            }
            if (setstr2.containsAll(removeDuplicates(words[i]))) {
                rest.add(words[i]);
            }
            if (setstr3.containsAll(removeDuplicates(words[i]))) {
                rest.add(words[i]);
            }
        }
        return rest.toArray(new String[0]);
    }

    public static Set<Character> removeDuplicates(String str) {
        char[] ch = str.toLowerCase().toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c : ch) {
            set.add(c);
        }
        return set;
    }
}
