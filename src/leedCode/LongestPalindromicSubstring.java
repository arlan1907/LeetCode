package leedCode;

public class LongestPalindromicSubstring {
    /*
    Given a string s, return the longest palindromic substring in s.

        Example 1:
        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.

        Example 2:
        Input: s = "cbbd"
        Output: "bb"
     */
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));

    }

    public static String longestPalindrome(String s) {
        StringBuilder temp = new StringBuilder();
        String rest = "";
        int length = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                String str = s.substring(i, j);
                String str1 = temp.append(str).reverse().toString();
                if (str.equals(str1) && str.length() > length) {
                    length = str.length();
                    rest = str;
                }
            }
        }

        return rest;
    }
}
