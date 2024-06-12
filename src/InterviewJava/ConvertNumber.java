package InterviewJava;

public class ConvertNumber {
    public static void main(String[] args) {
        // reverse number 12345

        int number = 12345;
        reverseNumber(number);
        System.out.println(reverseNumber2(number));

    }

    public static void reverseNumber(int num) {
        StringBuilder str = new StringBuilder(String.valueOf(num));
        System.out.println(str.reverse());
    }

    public static int reverseNumber2(int num) {
        int remainder;
        int sum = 0;

        while (num > 0) {
            remainder = num % 10;
            sum = sum * 10 + remainder;
            num = num / 10;
        }
        return sum;
    }

}
