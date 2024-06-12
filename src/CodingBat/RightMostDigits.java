package CodingBat;

public class RightMostDigits {
    // Given three ints, a b c, return true if two or more of them have the same rightmost digit.
    // The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
    public static void main(String[] args) {

        int num1=13;
        int num2=19;
        int num3=3;
        System.out.println(lastDigit(num1, num2, num3));

    }

    public static boolean lastDigit(int a, int b, int c) {
        if(a%10 == b%10 || a%10 == c%10 || c%10 == b%10){
            return true;
        }
return false;
    }
}
