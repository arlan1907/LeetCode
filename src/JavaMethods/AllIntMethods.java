package JavaMethods;

import java.util.Scanner;

public class AllIntMethods {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Give two integer numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;

        System.out.println("Which process you would to see? " +
                "\n1 - Is it a Prime number?" +
                "\n2 - Is it a Fibonacci number? " +
                "\n3 - Is it a Palindrome? " +
                "\n4 - Find a factorial?" +
                "\n5 - Find deviders? ");
        int process = input.nextInt();

        switch (process){
            case 1: getPrime(sum);break;
            case 2: fibonacci(sum);break;
            case 3: palindrome(sum);break;
            case 4: getfactorial(sum);break;
            case 5: getDevider(sum);break;
            default:
                System.out.println("Type valid number ");
        }
    }

    private static void getDevider(int sum) {
        int devider = 2;
        for (int i = 2; i <= sum; i++){
            if (sum % i ==0){
                devider += 2;
            }
        }
        System.out.println("Sum of two given numbers : " + sum);
        System.out.println(sum + " has " + devider + " deviders");
    }

    private static void getfactorial(int sum) {
        int fact = 1;

        for(int i =1; i <= sum; i++){
            fact = fact * i;
        }
        System.out.println("Sum of two given numbers : " + sum);
        System.out.println(sum + "'s factorials" + fact);
    }

    private static void palindrome(int sum) {
        String sumStr = sum + "";
        String reverseSum = "";
        for (int i = 0; i < sumStr.length(); i++){
            reverseSum = reverseSum + sumStr.substring(i,i+1);
        }
        if (sumStr.equals(reverseSum)){
            System.out.println("Sum of two given numbers : " + sum);
            System.out.println(sum + " is a Palindrome");
        }else {
            System.out.println("Sum of two given numbers : " + sum);
            System.out.println(sum + " is not a Palindrome");
        }
    }

    private static void fibonacci(int sum) {
        int fib1 = 0;
        int fib2 = 0;
        int temp = 0;

        boolean flag = false;
        while(sum >= temp){
            temp = fib1 + fib2;
            fib2 = fib1;
            fib1 = temp;
            if (temp == sum) {
                System.out.println("Sum of two given numbers : " + sum);
                System.out.println(sum + " is fibonacci number");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Sum of two given numbers : " + sum);
            System.out.println(sum + " is not fibonacci number");
        }
    }

    private static void getPrime(int sum) {
        boolean flag = true;
        if (sum<2){
            System.out.println("Sum of two given numbers : " + sum);
            System.out.println(sum + " is not a prime number");
        }else {
            for(int i = 2; i<sum; i++){
                if(sum % i == 0){
                    flag = false;
                }
            }
            if (flag ) {
                System.out.println("Sum of two given numbers : " + sum);
                System.out.println(sum + " is a prime number");
            }else {
                System.out.println("Sum of two given numbers : " + sum);
                System.out.println(sum + " is not a prime number");
            }
        }
    }
}
