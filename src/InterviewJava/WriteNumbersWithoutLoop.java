package InterviewJava;

public class WriteNumbersWithoutLoop {
    public static void main(String[] args) {
        //Write java program print numbers without using loops
        // write all numbers under 100

        int num = 100;

        printAll(num);

        System.out.println();
        // write number between 50 and 100
        int start = 50;
        int end = 100;
        System.out.println("numbers between " + start + " and "+ end);
        printNumbersBetween(start, end);
    }



    private static void printAll(int num) {
        if(num > 0)
        {
            printAll(num - 1);
            System.out.print(num + " ");
        }
    }

    private static void printNumbersBetween(int start, int end) {
        if(start>end){
            return;
        }
        System.out.print(start + " ");
        printNumbersBetween(start+1, end);
    }
}
