package InterviewJava;

public class CommonElementsInArray {
    public static void main(String[] args) {
        //Write java program to find common elements between two arrays in java

        int[] num1 = {1,3,5,7,9,11,13};
        int[] num2 = {2,3,5,7,11,14,13};
        calculateCommonElements(num1, num2);

        // iterate in nested loop to find out common elements


//        for (int i = 0; i < num1.length; i++) {
//            for (int j = 0; j < num2.length; j++) {
//                if(num1[i] == num2[j]){
//                    System.out.println("Common element is : "+num1[i]);
//                }
//            }
//        }

    }
    public static void calculateCommonElements(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    System.out.println("Common element is : "+a[i]);
                }
            }
    }
}
}
