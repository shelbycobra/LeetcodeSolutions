import java.util.Arrays;

/*
Given an array nums, write a function to move all 0's to the end of it while 
maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.

*/

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        
        // moveZeroes(nums, 0, nums.length-1);

        // SECOND ATTEMPT
        // int lastNonZero = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         nums[lastNonZero++] = nums[i];
        //     }
        // }

        // for (int i = lastNonZero; i < nums.length; i++)
        //     nums[i] = 0;


        // THIRD ATTEMPT -- OPTIMIZATION
        int lastNonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 ) {
                int tmp = nums[i];
                nums[i] = nums[lastNonZero];
                nums[lastNonZero++] = tmp;
            }
        }
        
        System.out.println(Arrays.toString(nums));
    }

    /*
    FIRST ATTEMPT:
    I thought that a divide-and-conquer recursive algorithm would do the trick.
    Turns out, it didn't hold up for longer strings.
    Looking at the solutions, it seems that you can achieve this using simple array manipulation.
    */
    public static void moveZeroes(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            moveZeroes(nums, mid +  1, end);
            moveZeroes(nums, start, mid);
            for (int i = start, j =mid + 1; i < end  && j < nums.length;  i++) {
                System.out.println("nums["+i+"] = " + nums[i]);
                if (nums[i] == 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        moveZeroes(new int[] {213, 34, 43, 24, -234, -345, 0, 435, -345, 0, 34, 234, 45, 435, 543, 0, 453, 6, 254, 453, 0, 324, 34, 5, 56, 8, 0, 435, 5, 7, 6, 0, 34, 4, 5, 6, 0});
    }
}