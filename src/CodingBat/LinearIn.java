package CodingBat;

public class LinearIn {
    /**
     * Given two arrays of ints sorted in increasing order, outer and inner,
     * return true if all of the numbers in inner appear in outer.
     * The best solution makes only a single "linear" pass of both arrays,
     * taking advantage of the fact that both arrays are already in sorted order.
     *
     * linearIn([1, 2, 4, 6], [2, 4]) → true
     * linearIn([1, 2, 4, 6], [2, 3, 4]) → false
     * linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     */



    // not solved


    public static void main(String[] args) {
        int[] outer = {1, 2, 4, 6};
        int[] inner = {2, 3, 4};

        System.out.println(linearIn(outer, inner));

    }
    public static boolean linearIn(int[] outer, int[] inner){
        boolean linear = false;
        for (int i = 1; i < outer.length; i++) {
            for (int j = 0; j < inner.length; j++) {
                if(outer[i] == inner[j]){
                    i++;
                }
                linear = true;
            }
        }
        return linear;
    }
}
