package leedCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    //Write an algorithm to determine if a number n is happy.
    //
    //A happy number is a number defined by the following process:
    //
    //Starting with any positive integer, replace the number by the sum of the squares of its digits.
    //Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    //Those numbers for which this process ends in 1 are happy.
    //Return true if n is a happy number, and false if not.
    //
    //
    //
    //Example 1:
    //
    //Input: n = 19
    //Output: true
    //Explanation:
    //12 + 92 = 82
    //82 + 22 = 68
    //62 + 82 = 100
    //12 + 02 + 02 = 1

    public static void main(String[] args) {

        int input = 2;
        System.out.println(isHappy(input));

    }

    public static boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();
        int m = n;                  // calculations without modifying the original value of n.
        while (m != 1 && !seenNumbers.contains(m)) {   // This loop continues as long as m is not 1 and m has not been seen before (to avoid cycles).
            seenNumbers.add(m);
            int sum = 0;
            while (m > 0) {
                int digit = m % 10;  // 19 -> 9
                sum += digit * digit; // -> 9*9 =81
                m /= 10;
            }
            m = sum; // 81
        }
        return m == 1;
    }
}
