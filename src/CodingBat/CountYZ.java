package CodingBat;

public class CountYZ {
    //Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
    // but not the 'y' in "yellow" (not case sensitive).
    // We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
    // (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
    public static void main(String[] args) {

        String word = "fay:zay";
        System.out.println(countYZ(word));

        int a =5;
        int b =6;
        System.out.println(Math.abs(a-b));

    }
    public static int countYZ(String str){
        int count = 0;

        String[] word = str.split(" ");

        for(int i=0; i<word.length; i++){
            if(word[i].charAt(word[i].length()-1)=='z' || word[i].charAt(word[i].length()-1)=='Z' ||
                    word[i].charAt(word[i].length()-1)=='y' || word[i].charAt(word[i].length()-1)=='Y'){
                count++;

            }
        }

        return count;
    }
}
