package CodingBat;

public class AverageArray {

    //Given an array of scores, compute the int average of the first half and the second half,
    // and return whichever is larger. We'll say that the second half begins at index length/2.
    // The array length will be at least 2. To practice decomposition, write a separate helper method
    //int average(int[] scores, int start, int end) { which computes the average of the elements between indexes
    // start..end. Call your helper method twice to implement scoresAverage().
    // Write your helper method after your scoresAverage() method in the JavaBat text area.
    // Normally you would compute averages with doubles, but here we use ints so the expected results are exact.

    public static void main(String[] args) {
        int[] scores = {4, 4, 4, 2, 2, 2};
        //System.out.println(scoreAverage(nums));


        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i <scores.length/2 ; i++) {
            sumFirstHalf+=scores[i];
        }
        int firstAverage = sumFirstHalf/(scores.length/2); //   12/(6/2)


        for (int i = scores.length/2; i <scores.length ; i++) {
            sumSecondHalf+=scores[i];
        }
        int secondAverage = sumSecondHalf/(scores.length/2);

        System.out.println(Math.max(firstAverage,secondAverage));;
    }

    }

//    public static int scoreAverage(int[] scores){
//        return Math.max(calculateAverage(scores, 0, scores.length/2),
//                calculateAverage(scores, scores.length/2, scores.length));
//    }
//    public static int calculateAverage(int[] num, int start, int end){
//        int sum=0;
//        for (int i = start; i <end ; i++) {
//            sum+=num[i];
//        }
//        return sum/(end-start);
//    }

