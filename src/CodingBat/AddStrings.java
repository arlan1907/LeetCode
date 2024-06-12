package CodingBat;

public class AddStrings {
    public static void main(String[] args) {
        //Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a,
        // the second char of b, and so on. Any leftover chars go at the end of the result.

        String a = "abcdefg";
        String b = "xyz";
        System.out.println(mixString(a,b));


    }
    public static String mixString(String a, String b) {
        String result = "";
        int smallerLength = Math.min(a.length(), b.length());

        for (int i = 0; i < smallerLength; i++) {
            result = result + a.charAt(i)+b.charAt(i);
        }
        return result+a.substring(smallerLength)+b.substring(smallerLength);
    }


    }
