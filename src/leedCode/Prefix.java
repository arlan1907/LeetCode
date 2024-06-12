package leedCode;

public class Prefix {
    public static void main(String[] args) {
        // Write a function to find the longest common prefix string amongst an array of strings.

        //  If there is no common prefix, return an empty string "".

        // Input: str = ["flower","flow","flight"]
        // Output: "fl"
        String[] str = {"dog","racecar","car"};

        commanPrefix(str);
    }
    public static void commanPrefix(String[] str){
        String result = "";



        for (int i = 0; i < str.length-1; i++) {
            for (int j = i+1; j < str.length; j++) {

                if(str[i].charAt(i) == str[j].charAt(i) && !result.contains(Character.toString(str[i].charAt(i)))){
                    result = result + str[i].charAt(i);
                }
            }
        }
        System.out.println(result);

    }
}
