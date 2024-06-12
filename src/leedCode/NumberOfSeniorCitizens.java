package leedCode;

public class NumberOfSeniorCitizens {
    /*
    You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:

        - The first ten characters consist of the phone number of passengers.
        - The next character denotes the gender of the person.
        - The following two characters are used to indicate the age of the person.
        - The last two characters determine the seat allotted to that person.
        - Return the number of passengers who are strictly more than 60 years old.

Example 1:
Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
Output: 2

Example 2:
Input: details = ["1313579440F2036","2921522980M5644"]
Output: 0
     */

    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));

    }

    public static int countSeniors(String[] details) {
        int count = 0;

        for (int i = 0; i < details.length; i++) {
            int age = Integer.parseInt(details[i].substring(11,13));
            if(age>=60) {
                count++;
            }

        }
return count;
    }
}
