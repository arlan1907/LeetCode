package StringBuilder;

import java.util.Scanner;

public class StringTraining {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = "kitchen";
        String front = str.substring(0,n);
        System.out.println(front);
        String back = str.substring(n+1,str.length());
        System.out.println(back);

        System.out.println(front + back);
    }
}
