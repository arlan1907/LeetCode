package InterviewJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListModify {
    public static void main(String[] args) {

        // We have a list of Strings.
        // 1. through them I want to get only name
        // 2 I need only countries

        List<String> address = new ArrayList<>(Arrays.asList("Arslan from chicago", "Sulgun from Mary", "Osman from Canada"));

        System.out.println(getNames(address));
        System.out.println(getCountry(address));

    }
    public static List<String> getNames(List<String> data){
        List<String> list = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            list.add(data.get(i).substring(0,data.get(i).indexOf(" ")));

        }
        return list;
    }
    public static List<String> getCountry(List<String> data){
        List<String> list = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            list.add(data.get(i).substring(data.get(i).lastIndexOf(" ")+1));

        }
        return list;
    }

}
