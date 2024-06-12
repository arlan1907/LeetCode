package Arraytraining;

import java.util.Arrays;

public class WriteStars {
    public static void main(String[] args) {
        String[] words = {"be", "to", "not", "or", "be", "to", "sd"};
        String[] switched = new String[words.length];


        if (words.length % 2 == 0) {
            for(int i = 0; i < words.length-1; i+=2){

                String temp = words[i+1];
                switched[i+1] = words[i];
                switched[i]=temp;
            }

        }else{
            for(int i = 0; i < words.length-2; i+=2){

                String temp = words[i+1];
                switched[i+1] = words[i];
                switched[i]=temp;
            }
            switched[words.length-1]=words[words.length-1];
        }

        System.out.println(Arrays.toString(switched));
    }
}
