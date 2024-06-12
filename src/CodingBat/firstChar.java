package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
    /*
    Given an array of non-empty strings, return a Map<String, String> with a key for every different
    first character seen, with the value of all the strings starting with that character appended
    together in the order they appear in the array.

        firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
        firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
        firstChar([]) → {}
     */
    public static void main(String[] args) {
        String[] words = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        System.out.println(getFirstChar(words));
    }
    public static Map<String,String> getFirstChar(String[] str){
        Map<String, String> letter = new HashMap<>();

        for (String s : str) {
            if (!letter.containsKey(s.substring(0, 1))) {
                letter.put(s.substring(0, 1), s);
            } else {
                letter.put(s.substring(0, 1), letter.get(s.substring(0, 1)) + s);
            }
        }
        return letter;
    }
}
