package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class SetValueMap {
    public static void main(String[] args) {
        //Modify and return the given map as follows: if the key "a" has a value,
        // set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.

        Map<String, String> word = new HashMap<>();
        word.put("a", "aaa");
        word.put("b", "bbb");
        word.put("c", "ccc");
        System.out.println(setValue(word));


    }
    public static Map<String, String> setValue(Map<String, String> str){

        if(str.containsKey("a")){
            str.put("b", str.get("a"));
        }
            str.remove("c");
        return str;
    }
}
