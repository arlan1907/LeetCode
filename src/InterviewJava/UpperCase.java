package InterviewJava;

public class UpperCase {
    /*
    Count how many upper case contains a string
     */
    public static void main(String[] args) {
        System.out.println(countUpperCase("Java is The Most lovely Programming Language"));

    }
    private static int countUpperCase(String str){
        int count = 0;

        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                count++;
            }
        }
             return count;
    }
}
