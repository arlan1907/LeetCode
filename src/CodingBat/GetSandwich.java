package CodingBat;

public class GetSandwich {
    /*
    A sandwich is two pieces of bread with something in between.
    Return the string that is between the first and last appearance of "bread" in the given string,
     or return the empty string "" if there are not two pieces of bread.

        getSandwich("breadjambread") → "jam"
        getSandwich("xxbreadjambreadyy") → "jam"
        getSandwich("xxbreadyy") → ""
     */

    /**
     not solved
     */
    public static void main(String[] args) {
       String word = "breadjambread";
        System.out.println(getSandwich(word));
    }

    public static String getSandwich(String str){
        boolean start = false;
        boolean end = false;

        for(int i = 0; i<str.length()/2-5; i++){
            if(str.substring(i,5).equals("bread")) start = true;
        }
        for(int i = str.length()-1 ; i<str.length()/2; i--){
            if(str.substring(i,str.length()-5).equals("bread")) end = true;
        }
        if(start && end) return str.substring(5,str.length()-5);
        return  "";

    }
}
