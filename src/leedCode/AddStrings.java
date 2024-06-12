package leedCode;

import java.math.BigInteger;

public class AddStrings {
    /*
    Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

        You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
        You must also not convert the inputs to integers directly.

        Example 1:
        Input: num1 = "11", num2 = "123"
        Output: "134"

        Example 2:
        Input: num1 = "456", num2 = "77"
        Output: "533"

        Example 3:
        Input: num1 = "0", num2 = "0"
        Output: "0"
     */
    public static void main(String[] args) {
        System.out.println(addStrings("1111111111", "22"));

    }

    public static String addStrings(String num1, String num2) {

            BigInteger i=new BigInteger(num1);
            BigInteger j=new BigInteger(num2);
            BigInteger x =i.add(j);
            String s = x.toString();
            return s;
    }

}
