package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    /*
    Given an array of non-empty strings, create and return a Map<String, String> as follows:
    for each string add its first character as a key with its last character as the value.

        pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        pairs(["man", "moon", "main"]) → {"m": "n"}
        pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
     */
    public static void main(String[] args) {
        String[] words = {"man", "moon", "good", "night"};
        System.out.println(keyValue(words));


    }
    public static Map<String, String> keyValue(String[] strings){

        Map<String, String> result = new HashMap<>();

        for(String st : strings){
            result.put(String.valueOf(st.charAt(0)), st.substring(st.length()-1));

        }

        return result;
    }

}
