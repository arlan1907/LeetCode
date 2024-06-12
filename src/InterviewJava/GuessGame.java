package InterviewJava;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    /** Sulgun oyunyn serti su:
     * men icimden 1 bilen 100 arasynda bir san belleyan sen sol sany biljek bol
     *
     */
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        int number = (int)(Math.random()*100+1);
        System.out.println("icimden 1 bilen 100 arasynda san belledim, biljek bol");
        System.out.println("jemi 5 sansyn bar ");
        int guess = input.nextInt();
        int count = 5;

        while(guess!= number){
            if(number>guess){
                System.out.println("aklymdaky san mundnn beyik : ");
                System.out.println("Bilmedin basga san yaz");
            }else {
                System.out.println("aklymdaky san mundnn pes : ");
                System.out.println("Bilmedin basga san yaz");
            }
            count--;
            System.out.println("yene " + count + " sansyn galdy");
            guess= input.nextInt();
            if (count==0){
                System.out.println("ahli sansyn gutardy ");
                System.out.println("aklymda bellan sanym : " + number);
            }
        }


    }
}
