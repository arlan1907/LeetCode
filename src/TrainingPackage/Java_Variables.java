package TrainingPackage;// byte equal to 8 bit contains between -128 and 127
// short equal to 16 bit contins between -32768 and 32767
// int equal to 32bit/4byte contins between -2 31   and 2 31 -1


public class Java_Variables {
    public static void main(java.lang.String[] args) {
        int a, b;
        a = 5;
        b = 6;
        boolean c = (a==b);                         // boolean (true or false)
        System.out.println(c);

        long x = 555558555;                          // long equal to 64bit/8byte contins between -2 63   and 2 63 -1
        long y = x*x;
        System.out.println(y);

        float z = - 212;                            // float equal to 32bit/4byte contins between -3.4*10 38   and 3.4*10 38
        float d = z/21;
        System.out.println(d);

        double q = -343.65;                         // double equal to 64bit/8byte contins between -1.7*10 308   and 1.7*10 308
        double p = z/23.65;
        System.out.println(p);

        char ella = 'a';                            // char equal to 16bit/2byte
        char bella = 's';
        System.out.println(bella + " + " + ella);




    }
}
