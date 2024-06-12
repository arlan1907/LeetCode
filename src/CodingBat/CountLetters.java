package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {
        // Write me a code that gives the count of each letters out of a string?
        String word = "Tatiana is the most beautiful girl";
        //  map ->  {t=1}, {t=}

        System.out.println(countLetter(word));

    }
    public static Map<Character,Integer> countLetter(String str){
        Map<Character,Integer> letters = new HashMap<>();

        String str1 = str.toLowerCase().replaceAll(" ", "");

        for (int i = 0; i < str1.length(); i++) {
            if(!letters.containsKey(str1.charAt(i))){
                letters.put(str1.charAt(i), 1);
            }else {
                letters.put(str1.charAt(i), letters.get(str1.charAt(i))+1);
            }

        }


        return letters;


    }
}
