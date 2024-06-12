package InterviewJava;

public class IntegerToString {
    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 3456;

        int a = 1234;

        String aString = Integer.toString(a);
        System.out.println(aString + " is string value of " + a);

        int b = Integer.parseInt(aString);
        System.out.println(b + " is integer value of " + aString);


//// integer to String
//        String number1 = Integer.toString(num1);
//        String number2 = Integer.toString(num2);
//        System.out.println(number1 + " is String value of " + num1);
//        System.out.println(number2 + " is String value of " + num2);
//
//        //String to integer
//        int num11 = Integer.parseInt(number1);
//        int num12 = Integer.parseInt(number2);
//        System.out.println(num11 + " is String value of " + number1);
//        System.out.println(num12 + " is String value of " + number2);

    }
}
