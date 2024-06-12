package InterviewJava;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String str1 = "madam";

        String reverse = new StringBuilder(str1).reverse().toString();

        if(str.equals(reverse)){
            System.out.println("Given words are palindrome");
        }else {
            System.out.println("Given words are not palindrome");
        }
    }
}
