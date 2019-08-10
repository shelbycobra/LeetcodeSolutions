import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class SingleNumber {

    /*
    Given a non-empty array of integers, every element appears twice except for one.
    Find that single one.

    Note: Your algorithm should have a linear runtime complexity.
    Could you implement it without using extra memory?

    Example 1:

    Input: [2,2,1]
    Output: 1

    Example 2:

    Input: [4,1,2,1,2]
    Output: 4

*/

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.remove(nums[i]);
            else map.put(nums[i], nums[i]);
        }
        return (Integer) map.values().toArray()[0];
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

}