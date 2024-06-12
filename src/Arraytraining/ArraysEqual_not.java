package Arraytraining;

public class ArraysEqual_not {
    public static void main(String[] args){
        int[] number1 = {1,2,3,4,5,7};
        int[] number2 = {1,2,3,4,5,6};

        boolean equalOrNot = true;

        if(number1.length == number2.length){
            for(int i = 0; i<number1.length; i++){
                if(number1[i] != number2[i]){
                    equalOrNot = false;
                }
            }
        }
        else{
            equalOrNot = false;
        }
        if(equalOrNot){
            System.out.println("Two arrays are equal. ");
        }else {
            System.out.println("Two arrays are not equal. ");
        }
    }
}
