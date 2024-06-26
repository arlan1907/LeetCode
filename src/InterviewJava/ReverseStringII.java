package InterviewJava;

public class ReverseStringII {
    /*
    Given a string s and an integer k, reverse the first k characters for every
    2k characters counting from the start of the string.

    If there are fewer than k characters left, reverse all of them.
    If there are less than 2k but greater than or equal to k characters, then reverse the
    first k characters and leave the other as original.

    Example 1:
    Input: s = "abcdefg", k = 2
    Output: "bacdfeg"

    Example 2:
    Input: s = "abcd", k = 2
    Output: "bacd"
     */
    public static void main(String[] args) {

    }
    public static String reverseStr(String s, int k) {
        int i=0;

        String ans="";

        while(i<s.length()){
            if(i+(2*k)-1<s.length()||i+(2*k)-1>=s.length() && s.length()-i>=k){
                int index=i+(2*k)-1;
                StringBuilder str=new StringBuilder();
                String app=s.substring(i,i+k);
                str.append(app);
                str.reverse();
                ans+=str.toString();
                i=i+k;
                while(i<s.length()&&i<=index){
                    ans+=s.charAt(i);
                    i++;
                }
            }
            else{
                StringBuilder temp2=new StringBuilder();
                temp2.append(s.substring(i,s.length()));
                temp2.reverse();
                ans+=temp2.toString();
                break;
            }
        }
        return ans;


    }
}
