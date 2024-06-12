package InterviewJava;

public class MaximumSum {
    public static void main(String[] args) {
        // return a max number that can be generated from given N and S numbers.
        // N represents how many digits max number can be. S represents the total sum of N digits. S and N will be given.
        //
        //For example,  N=5 and S=12 the max number should be 93000. Meaning 9+3+0+0+0 = 12.

        // 4 -> 21  => 9930
        // 7 -> 45  => 9999900
        // 6 -> 51  => 999996

        System.out.println(getMaxNumber(7, 45));
    }
    public static int getMaxNumber(int d, int s){
        if (d <= 0 || s < 0 || s > 9 * d) {
            // Invalid input, return -1 or handle the error as needed.
            return -1;
        }

        int number = 0;

        while (d > 0) {
            int digit = Math.min(s, 9); // Use the minimum of s and 9 for the digit.
            number = number * 10 + digit;
            s -= digit;
            d--;
        }

        return number;
    }
}
