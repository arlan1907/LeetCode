package leedCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    /*
    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by
    using the letters from magazine and false otherwise.

        Each letter in magazine can only be used once in ransomNote.

        Example 1:
        Input: ransomNote = "a", magazine = "b"
        Output: false

        Example 2:
        Input: ransomNote = "aa", magazine = "ab"
        Output: false

        Example 3:
        Input: ransomNote = "aa", magazine = "aab"
        Output: true
     */
    public static void main(String[] args) {
        String st = "aa";
        String abc = "ab";
        System.out.println(canConstruct(st, abc));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for (char c : ransomNote.toCharArray()){
            int count = map.getOrDefault(c, 0);
            if(count<=0){
                return false;
            }
            map.put(c, count-1);
        }




        for (int i = 0; i < magazine.length(); i++) {
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
            }else {
                map.put(magazine.charAt(i),1);
            }
        }
        System.out.println(map);

        for (int i = 0; i < ransomNote.length(); i++) {
            if(map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i))>0){
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
            }else {
                return false;
            }
        }
        return true;
    }
}
