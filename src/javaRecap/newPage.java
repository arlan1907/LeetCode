package javaRecap;

public class newPage {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(calculateWordNumberSum(word));


    }
    public static int calculateWordNumberSum(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int value = letter - 'a' + 1; // Calculate the value of the letter
            sum += value;

        }
        return sum;
    }
}
