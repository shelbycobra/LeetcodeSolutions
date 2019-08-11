import java.util.Map;
import java.util.HashMap;

public class MajorityElement {

    /*
Given an array of size n, find the majority element. 
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and 
the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3

Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
    */
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentMaxCount = 0;
        int currentMaxNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = 0;
            if (map.containsKey(nums[i])) {
                value = map.get(nums[i]);
                map.put(nums[i], ++value);
            } else {
                map.put(nums[i], 1);
                value = 1;
            }

            if (value > currentMaxCount) {
                currentMaxCount =  value;
                currentMaxNumber = nums[i];
            }
        }

        return currentMaxNumber;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,3,4, 1, 1, 1, 3, 4, 2, 1, 1, 1}));
    }
}