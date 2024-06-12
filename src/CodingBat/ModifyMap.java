package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class ModifyMap {
    public static void main(String[] args) {
        //Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
        // If both keys are present, append their 2 string values together and store the result under the key "ab".

        Map<String, String> word = new HashMap<>();
        word.put("a", "Hi");
        word.put("b", "There");

        System.out.println(modifyMap(word));
    }
    public static Map<String, String> modifyMap(Map<String, String> str){
        if(str.containsKey("a") && str.containsKey("b")){
            str.put("ab", str.get("a")+str.get("b"));
        }
        return str;
    }
}
