package InterviewJava;

public class ReverseString1 {
    public static void main(String[] args) {
        //Reverse the String without converting to StringBuilder.

        String name = "Arslan Nurlyyev";

        // 1 way store in stringBuilder
        StringBuilder reversed = new StringBuilder();

        for (int i = name.length() - 1; i >= 0; i--) {
            reversed.append(name.charAt(i));
        }
        System.out.println(reversed);

// 2 way loop string and print charAt(i) starting from tail

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));

        }
        System.out.println();


        // 3 way store char from tail into another string
        String str = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            str = str + name.charAt(i);
        }
        System.out.println(str);

        // 4 way use stringBuilder reverse method

        StringBuilder aaa = new StringBuilder(name);
        System.out.println(aaa.reverse());

    }
}
