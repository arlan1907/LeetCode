package leedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitStringBySeparator {
    /*
    Given an array of strings words and a character separator, split each string in words by separator.
Return an array of strings containing the new strings formed after the splits, excluding empty strings.

Notes:
separator is used to determine where the split should occur, but it is not included as part of the resulting strings.
A split may result in more than two strings.
The resulting strings must maintain the same order as they were initially given.

Example 1:
Input: words = ["one.two.three","four.five","six"], separator = "."
Output: ["one","two","three","four","five","six"]


Example 2:
Input: words = ["$easy$","$problem$"], separator = "$"
Output: ["easy","problem"]

     */

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> nm=new ArrayList<>();

        for (String word : words) {
            String[] arr = word.split("[" + separator + "]"); // using "[" to declare character in String regex
            for (String s : arr) {

                if (s.length() > 0) { // to avoid add empty strings
                    nm.add(s);
                }
            }
        }
        return nm;
    }

    public static void main(String[] args) {
        List<String> data = new ArrayList<>(Arrays.asList("$easy$","$problem$"));
        char given = '$';
        System.out.println(splitWordsBySeparator(data, given));
    }

}
