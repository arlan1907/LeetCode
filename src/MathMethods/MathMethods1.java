package MathMethods;

public class MathMethods1 {
    public static void main(String[] args) {

        double x = 3.14;
        double y = 12;

        double z = Math.max(x,y); // Math.max method will compare two doubles and will assign the larger one
        System.out.println(z);

        z = Math.min(x,y);       // Math.min method will compare two number and will assign smallest one
        System.out.println(z);

        z = Math.atan2(x,y);
        System.out.println(z);

        z = Math.ceil(x);          // it will ceil (ceiling) , round the number up
        System.out.println(z);

        z = Math.round(x);          // it will round the number to the closest integer
        System.out.println(z);

        z = Math.floor(x);          // it will round the number to the downclosest integer
        System.out.println(z);






    }
}
