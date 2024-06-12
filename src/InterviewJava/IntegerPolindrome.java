package InterviewJava;

public class IntegerPolindrome {
    // write a java program to check if given integer i palindrome
    public static void main(String[] args) {
        int num = 1221;

        checkIntPalindrome(num);

    }

    private static void checkIntPalindrome(int num) {
        int remainder;
        int temp = num;
        int reverse = 0;

        while (temp>0){
            remainder = temp%10;
            reverse = reverse*10 + remainder;
            temp = temp/10;
        }

        if (reverse== num) {
            System.out.println("given number is palindrome");
        }else{
            System.out.println("given number is not palindrome");

        }
    }

}
