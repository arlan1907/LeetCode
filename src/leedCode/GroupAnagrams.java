package leedCode;

import java.util.*;

public class GroupAnagrams {
    /*
    Given an array of strings strs, group the anagrams together. You can return the answer in any order.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
        typically using all the original letters exactly once.

        Example 1:
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        Example 2:
        Input: strs = [""]
        Output: [[""]]

        Example 3:
        Input: strs = ["a"]
        Output: [["a"]]
     */
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> dp = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String st = strs[i];
            char[] ar = st.toCharArray();
            Arrays.sort(ar);
            String token = new String(ar);
            List<String> exist = dp.getOrDefault(token,new ArrayList<String>());
            exist.add(st);
            dp.put(token,exist);
        }
        for(Map.Entry<String,List<String>> ent: dp.entrySet()){
            res.add(ent.getValue());
        }
        return res;
    }
}
