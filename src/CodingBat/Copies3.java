package CodingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Copies3 {
    /*
    Given a list of strings, return a list where each string is replaced by 3 copies
    of the string concatenated together.

        copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
        copies3(["24", "a", ""]) → ["242424", "aaa", ""]
        copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
     */
    public static List<String> copied(List<String> list, int count){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            //result.add(list.get(i)+list.get(i)+list.get(i));
            result.add(list.get(i).repeat(count));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> data = new ArrayList<>(Arrays.asList("a","bb","12"));
        System.out.println(copied(data,5));
    }
}
