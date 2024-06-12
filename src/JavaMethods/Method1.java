package JavaMethods;

public class Method1 {
    public static void main(String[] args) {

        welcome();
       // multuple(7,9);
        multuple(8,9);
        devide(65,98.3);
        average();
        average2(23,34,54,24);



    }
    public static void welcome () {
        System.out.println("Welcome to my Channel");
    }
    public static void multuple (int a, int b) {
        System.out.println(a * b);
    }
    public static void devide (double x, double y) {
        System.out.println(x / y);
    }
    public static void average () {
        int a = 88;
        int b = 77;
        int c = 98;
        int d = 63;

        double p = (a+b+c+d) / 4.0;
        System.out.println("Ortalma : " + p);
    }
    public static void average2 (int a, int b, int c, int d){
        double ava = (a+b+c+d) / 4.0;
        System.out.println("ortalama 2 : " + ava);
    }


}
