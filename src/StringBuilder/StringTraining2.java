package StringBuilder;

public class StringTraining2 {
    public static void main(String[] args) {
        String str = "helloworld";
        String need = str.substring(1,4);
        System.out.println(need);
        String frontEnd = str.substring(0, 1) + str.substring(4, str.length());
        System.out.println(frontEnd);
        System.out.println(str.charAt(1));

        System.out.println();
        int n = 2;
        String word = "hi";


    }
}
