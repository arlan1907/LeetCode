package CodingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMultiple {
    public static void main(String[] args) {


        // Given a list of integers, return a list where each integer is multiplied by 2.

        List<Integer> nums = Arrays.asList(1, 2, 3);

        System.out.println(multipleByTwo(nums));



    }
     public static List<Integer> multipleByTwo(List<Integer> numbers){
         List<Integer> result = new ArrayList<>();

         for (int i = 0; i < numbers.size(); i++) {
             result.add(numbers.get(i)*2);
         }
         return result;
    }


}
