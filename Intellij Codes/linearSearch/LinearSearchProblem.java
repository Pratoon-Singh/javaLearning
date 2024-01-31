package linearSearch;

import java.util.Arrays;

public class LinearSearchProblem {
    /*
    Given an array nums of integers, return how many of them contain an even number of digits.

    Example 1:

    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.
    Example 2:

    Input: nums = [555,901,482,1771]
    Output: 1
    Explanation:
    Only 1771 contains an even number of digits.


     */

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(numberCount2(-78654));
        System.out.println(findEvenDigits(nums));
    }


    static int findEvenDigits(int [] nums ){
        int count = 0;
        for (int num : nums){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int nums) {
        int numberOfdigits = numberCount(nums);
        return numberOfdigits % 2 == 0;

    }
    static int numberCount2(int nums){
        // Other way of getting the count of all number given in int array
        if(nums<0) nums = nums*-1;
        return (int)(Math.log10(nums) + 1);
    }
    static int numberCount(int nums) {

        if(nums<0) nums = nums*-1;
        if(nums==0) return 1;
        int count = 0;
        while (nums > 0) {
            count++;
            nums = nums / 10;
        }
        return count;
    }
}