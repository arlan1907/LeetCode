package InterviewJava;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a word to check :");
        String word = input.nextLine();

        checkPalindrome(word);
    }

    private static void checkPalindrome(String word) {
        String reverse =  "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse = reverse + word.charAt(i);
        }
        if(word.equalsIgnoreCase(reverse)){
            System.out.println("Given word is a Palindrome");
        }else{
            System.out.println("Given word is not a Palindrome");
        }
    }
}
