package InterviewJava;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        // Write a code that will reverse sentence.
        // String str=”String is immutable”; output: “immutable is String“;

        // 1 way - splitting into String array
        String str="String is immutable";
        System.out.println(str);
        System.out.println("======");

        // System.out.println(new StringBuilder(str).reverse());

        String[] splitted = str.split(" ");
        System.out.println("before reverse "+Arrays.toString(splitted));

        String reversed = "";


        for (int i = splitted.length-1; i >= 0 ; i--) {
            //System.out.print(splitted[i]+" ");
            reversed = reversed + splitted[i]+" ";
        }

        System.out.println(reversed.substring(0, reversed.length()-1)); // to avoid last space

    }

    }

