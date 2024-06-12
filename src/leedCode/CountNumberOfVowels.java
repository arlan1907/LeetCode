package leedCode;

public class CountNumberOfVowels {
    /*
    You are given a 0-indexed array of string words and two integers left and right.
    A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.
    Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].



        Example 1:
        Input: words = ["are","amy","u"], left = 0, right = 2
        Output: 2
        Explanation:
        - "are" is a vowel string because it starts with 'a' and ends with 'e'.
        - "amy" is not a vowel string because it does not end with a vowel.
        - "u" is a vowel string because it starts with 'u' and ends with 'u'.
        The number of vowel strings in the mentioned range is 2.

        Example 2:

        Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
        Output: 3

     */
    public static void main(String[] args) {
        String[] str = {"are","amy","u"};
        System.out.println(vowelStrings(str, 0, 2));

    }
    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiuo";

        for (int i = left; i <= right; i++) {
            if(vowels.contains(words[i].substring(0, 1)) &&
                    vowels.contains(words[i].substring(words[i].length()-1))){
                count++;
            }
        }
        return count;
    }}
