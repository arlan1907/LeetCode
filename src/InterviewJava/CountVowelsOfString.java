package InterviewJava;

public class CountVowelsOfString {
    public static void main(String[] args) {
        //Write java program to count number of vowels in String in java
        // e,u,i,o,a all vowels

        String str = "aeiOuoEutoerareaio";
        String str1 = str.toLowerCase();  // convert to lowercase to make loop simpler
        System.out.println(str1);

        int vowels = 0;

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == 'e' || str1.charAt(i) == 'u' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'a'){
                vowels++;
            }
        }
        System.out.println(vowels);
    }
}
