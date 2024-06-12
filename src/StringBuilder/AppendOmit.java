package StringBuilder;

public class AppendOmit {
    public static void main(String[] args) {

        String a = "He";
        String b = "hiho";
        int aLen = a.length();
        int bLen = b.length();
        if(aLen > bLen){
            System.out.println(b + a.substring(a.length()-bLen));
        }else{
            System.out.println(a + b.substring(b.length()-aLen));
        }

        System.out.println();

    }
}
