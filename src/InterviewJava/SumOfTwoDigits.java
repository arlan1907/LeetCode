package InterviewJava;

public class SumOfTwoDigits {
    public static void main(String[] args) {

        // Write java program to find sum of digits of a number
        // ab  => b
        // ab  => a + b

        int number = 23;
        int b = number%10;
        int a = number/10;

        System.out.println(a+b);

    }
}
