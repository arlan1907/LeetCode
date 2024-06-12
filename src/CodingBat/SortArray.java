package CodingBat;

import java.util.Arrays;

public class SortArray {
    /*
    String str = "am best I the";

write code two get output as -> "I am the best";
     */

    public static void main(String[] args) {
        String str = "am best I the number one";
        sortArray(str);

    }

    public static void sortArray(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].length() < words[i].length()) {
                    String temp = words[j];
                    words[j] = words[i];
                    words[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
