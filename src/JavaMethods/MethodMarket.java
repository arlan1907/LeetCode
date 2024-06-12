package JavaMethods;

public class MethodMarket {
    public static void main(String[] args) {

        boolean member = true;
        int memberYear = 3;
        double originalPrice = 250;

        calculateDiscount(true,4,300);
        calculateDiscount(member,memberYear,originalPrice);
    }

    public static void calculateDiscount(boolean member, int memberYear, double originalPrice) {
        if(member){
            if(memberYear<5){
                System.out.println("Original price for product : " + originalPrice);
                System.out.println("Discount amount : " + originalPrice*0.1);
                System.out.println("Price with discount for product : " + (originalPrice-originalPrice*0.1));
            }else{
                System.out.println("Original price for product : " + originalPrice);
                System.out.println("Discount amount : " + originalPrice*0.15);
                System.out.println("Price with discount for product : " + (originalPrice-originalPrice*0.15));
            }
        }else{
            System.out.println("Original price for product : " + originalPrice);
            System.out.println("Discount amount : " + originalPrice*0.05);
            System.out.println("Price with discount for product : " + (originalPrice-originalPrice*0.05));

        }
    }

}
