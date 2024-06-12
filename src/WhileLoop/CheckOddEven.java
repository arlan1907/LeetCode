package WhileLoop;

public class CheckOddEven {
    public static void main(String[] args) {

        int number = 100;
        for(int i = 0; i<= number ; i++){
            if(i % 2 != 0){
                System.out.println(i+" ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
