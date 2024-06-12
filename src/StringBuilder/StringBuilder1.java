package StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mute");
        StringBuilder sb1 = new StringBuilder("amute");
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.append("k"));
        System.out.println(sb.compareTo(sb1));


    }
}
