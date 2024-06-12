package CodingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddStar {
    /*
    Given a list of strings, return a list where each string has "*" added at its end.

        addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
        addStar(["hello", "there"]) → ["hello*", "there*"]
        addStar(["*"]) → ["**"]

     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        List<String> strings1 = new ArrayList<>();


        for (String string : strings) {
            strings1.add(string+"*");
        }
        System.out.println(strings1);
    }
}
