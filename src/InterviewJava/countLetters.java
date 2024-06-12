package InterviewJava;

import java.util.HashMap;
import java.util.Map;

public class countLetters {
    public static void main(String[] args) {
        //Write a code that counts number of letters in String? String str=”Java”; output: J=1, a=2, v=1
        String str1 = "Java is unbelievable";
        System.out.println(countedLetters(str1));

    }
    private static Map<Character, Integer> countedLetters(String str1) {
        Map<Character, Integer> count = new HashMap<>();
        String replaced = str1.replaceAll(" ", "");
        for (int i = 0; i < replaced.length(); i++) {
            if(!count.containsKey(replaced.charAt(i))){
                count.put(replaced.charAt(i), 1);
            }else{
                count.put(replaced.charAt(i), count.get(replaced.charAt(i))+1);
            }
        }
        return count;
    }
}
