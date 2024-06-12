package hackerRank;

public class Test01 {
    public static void main(String[] args)  {
        int N = 2;
        returnMultiples(N);

    }
    public static void returnMultiples( int N){
        for (int i =1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
