package CodingBat;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmmitList {
    /*
    Given a list of integers, return a list of the integers, omitting any that are less than 0.

        noNeg([1, -2]) → [1]
        noNeg([-3, -3, 3, 3]) → [3, 3]
        noNeg([-1, -1, -1]) → []
     */
    public static void main(String[] args) {

        List<Integer> xyz = new ArrayList<>(Arrays.asList(-1, -1, -1));
        System.out.println(ommitedList(xyz));

    }
    public static List<Integer> ommitedList(List<Integer> num){
        List<Integer> numbers = new ArrayList<>();

        for (Integer integer : num) {
            if (integer > 0) {
                numbers.add(integer);
                num.remove(integer);
            }
        }
        return numbers;
    }
}
