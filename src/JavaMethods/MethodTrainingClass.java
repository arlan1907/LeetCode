package JavaMethods;

public class MethodTrainingClass {

    // Given 2 strings, a and b, return the number of the positions
    // where they contain the same length 2 substring.
    // So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
    // and "az" substrings appear in the same place in both strings.


    public int stringMatch(String a, String b) {

        int length = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < length - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }
        System.out.println("returns : ");

        return count;
    }

    //Given a string, return a version where all the "x" have been removed.
    // Except an "x" at the very start or end should not be removed.

    public String stringX(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!((i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x")))) {
                result = result + str.substring(i, i + 1);
            }
        }
        return result;
    }
    // Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
    // so "kittens" yields "kien".

    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 2; i += 4) {
            result = result + str.substring(i, i + 2);
        }
        return result;
    }

    //Suppose the string "yak" is unlucky. Given a string, return a version where
    // all the "yak" are removed, but the "a" can be any char. The "yak"
    // strings will not overlap.

    public String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'y' && str.charAt(i+2) == 'k'){
                i=i+2;
            }else{
                result = result + str.charAt(i);
            }
        }
        return  result;
    }

    public int outOfOrder(int[] pages){
        for (int i = 0; i < pages.length-1; i++){

            if (pages[i]>pages[i+1]){
                return pages[i+1];
            }
        }
        return -1;
    }

    public String commonLetters(String value1, String value2){
        String value3 = value1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String value4 = value2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String commonLetter = "";



        for(int i = 0; i < value3.length(); ++i) {
            for(int j = 0; j < value4.length(); ++j) {
                if (value3.charAt(i) == value4.charAt(j)) {
                    commonLetter = commonLetter + value3.charAt(i);
                }
            }
        }

        return commonLetter;
    }

    public boolean threeAmigos(int[] array) {

        for(int i = 0; i < array.length-2; i++) {
            if ((array[i] % 2 != 0 && array[i+1] % 2 != 0 && array[i+2] % 2 != 0) ||
                    (array[i] % 2 == 0 && array[i+1] % 2 == 0 && array[i+2] % 2 == 0)){
                return true;
            }
        }
        return false;
    }

    //Given an array of ints, return the number of times that two 6's are next
    // to each other in the array. Also count instances where the second "6" is
    // actually a 7.

    public int array667(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if((i+1<nums.length && nums[i] == 6 && nums[i+1] == 6) ||
                    (i+1<nums.length && nums[i] == 6 && nums[i+1] == 7)){
                i++;
                count ++;
            }
        }return  count;
    }

    //Given an array of ints, we'll say that a triple is a value appearing 3 times
    // in a row in the array. Return true if the array does not contain any triples.

    public boolean noTriples(int[] nums) {
        for(int i = 0; i <nums.length; i++){
            if(i+2<nums.length && nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
                return true;
            }
        }return false;

    }
    //Given an array of ints, return true if it contains a 2, 7, 1 pattern:
    // a value, followed by the value plus 5, followed by the value minus 1.
    // Additionally the 271 counts even if the "1" differs by 2 or less from the
    // correct value.

    public boolean has271(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if (i+2<nums.length && nums[i+1] == nums[i]+5 && nums[i+2] == nums[i]-1){
                return true;
            }
        }
return  false;
    }

    String str = "arslan";

    int len = str.substring(2).length();



}
