package JavaInterwievCode;

public class ReverseNumbers {
    public static void main(String[] args) {
        /*
        Write java program to reverse a number in java
        int number = 12345 6 = > if(number % 2 == 0)
                    number % 10 = 0;


        int reverse = 6*10+5 = 11  65*10 +4 = 654
         */

        int number = 123456;
        System.out.println("original " + number);
        int remainder ;
        int reversed = 0;

                // true - my number is not equal 0
                // false - when my number become 0
        while (number!=0){      // 123456 -> 12345 -> 1234 -> 123 -> 12 -> 1 -> 0
            remainder=number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        System.out.println("reversed "+reversed);
    }
}
