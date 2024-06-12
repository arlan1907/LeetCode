package Arraytraining;

import java.util.Scanner;

public class ArrayContains {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Give me an integer number : ");
        int given = input.nextInt();


        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] == given ){
                System.out.println("your number : " + given + " contains in array");
                break;
            }
        }
    }
    public String removeLetters(StringBuilder stb, char[] letters){

        String result =stb.toString();
        String[] end = result.split("");
        String[] temp = new String[]{};

        for(int i = 0; i<end.length; i++){
            for(int j =0; j< letters.length; j++){
                if( end[i].charAt(i)!=letters[j] ){
                    temp[i] = end[i];
                }
            }
        }


        return null;

    }
    public boolean threeAmigos(int[] array) {
        int count = 0;
        boolean ThreeNumber = false;

        for(int i = 0; i < array.length-2; i++) {

            if ((array[i] % 2 != 0 && array[i+1] % 2 != 0 && array[i+2] % 2 != 0) ) {
                count++;
            }
            if (array[i] % 2 == 0 && array[i+1] % 2 == 0 && array[i+2] % 2 == 0)  {
                count++;
            }
            if (count >= 3 ) {
                ThreeNumber = true;
            } else {
                ThreeNumber = false;
            }

        }
        return ThreeNumber;
    }


}
