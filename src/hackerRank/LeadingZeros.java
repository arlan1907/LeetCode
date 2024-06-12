package hackerRank;

import java.util.Scanner;

public class LeadingZeros {
    /*
    In each line of output there should be two columns:
    The first column contains the String and is left justified using exactly  characters.
    The second column contains the integer, expressed in exactly  digits;
    if the original input has less than three digits, you must pad your output's leading digits with zeroes.

    Sample Input

    java 100
    cpp 65
    python 50
    Sample Output

    ================================
    java           100
    cpp            065
    python         050
    ================================
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            /// Format and print the output
            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");

        // Close the scanner
        sc.close();

    }
}
