package mockInterview;

public class NumberPalindrome {
/*
Given an integer x, return true if x is a palindrome
, and false otherwise.
if given num,ber is less than 0 return false;
if given number length is less than 2 return true;
 */
    public static boolean isPalindrome(int x){
        boolean palin = false;
        int remainder = 0;
        int reversed = 0;
        int temp = x;

        if(x<0) {
            palin = false;
        }
        while(x>=0){
            remainder = x%10;
            reversed = reversed*10 + remainder;
            x/=10;
        }

        if(temp == reversed){
            palin = true;
        }else {
            palin = false;
        }
        return palin;
    }

    public static void main(String[] arg){
        int number = 22;

        System.out.println(isPalindrome(number));
    }
}
