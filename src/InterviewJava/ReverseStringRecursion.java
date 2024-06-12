package InterviewJava;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        // in java recursive call is to call a method inside own method in return row
        // if we wont be more careful with call recursion output will give stackflow exception

        String str  = "Hello world!";
        System.out.println(reverseString(str));

    }
    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);

        /**
         *after substring string , keep first character until substringing is impossible
         * - to be able to keep substring we need at least 2 characters
         * when substring is done it will build our string as we cut it
         ex:
                   "String"
                    S
                     t
                      r
                       i
                        n
                          g

                    gnirtS

                ==> substring beginning from index 1 until index become 0, then build string as we split it
        **/
    }
}

//  ello world! H
//  llo world! e H
