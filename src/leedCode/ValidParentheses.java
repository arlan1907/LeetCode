package leedCode;

import java.util.Stack;

public class ValidParentheses {
    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

     */

    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));

    }

    public static boolean isValid(String str) {

        if (null == str || ((str.length() % 2) != 0)) { // if String is empty or length is not
            return false;                                //  divisible by 2 returns false. no need to go forward
        }

        char[] split = str.toCharArray();    //to loop it easy split it to char array
        Stack<Character> stack = new Stack<>(); // using Stack from collection because it gives us to
        // reach out last added element easily

        for (int i = 0; i < split.length; i++) {                        // there might be only these 3 types of brackets
            if(split[i] == '(' || split[i] == '{' || split[i] == '['){  // if element equal to any of that opened brackets just add them
                stack.push(split[i]);                                   // to stack, then when we face closed bracket
            }                                                           // we will reach last added open bracket of stack and remove it
            // at the end of loop if our stack is empty that gives us to know that all opened brackets have their opponents .

            else if (split[i] == ')'  && !stack.isEmpty() && stack.peek() == '(') {  // lets start look up opponent brackets
                stack.pop();                                    // get last added element from stack if my condition is true and remove it
            } else if (split[i] == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (split[i] == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false; // Invalid bracket encountered
            }
        }
        return stack.isEmpty();

    }
}
