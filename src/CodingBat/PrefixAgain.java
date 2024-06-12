package CodingBat;

public class PrefixAgain {
    public static void main(String[] args) {
        // Given a string, consider the prefix string made of the first N chars of the string.
        // Does that prefix string appear somewhere else in the string?
        // Assume that the string is not empty and that N is in the range 1..str.length().

        String word = "xyzGHJKxyzKHJ";
        System.out.println(prefixAgain(word, 3));


    }

    public static boolean prefixAgain(String str, int n){
        for (int i = 1; i < str.length()-n; i++) {
            if(str.substring(0,n).equals(str.substring(i,i+n))){
                return true;
            }
        }
        return false;
    }
}
