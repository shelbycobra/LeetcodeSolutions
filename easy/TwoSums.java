import java.util.Map;
import java.util.*;

public class TwoSums {

    public static int[] twoSum(int[] nums, int target) {
        // Create the result array
        int[] result = new int[2];

        //Create a Hashmap that will contain the numbers as you go through the nums array.
        // Everytime you move onto a new integer, you check to see if it exists in the hashmap (O(1)!!! VERY IMPORTANT),
        // add it to the Hashmap.
        // Using .containsKey is O(1)
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // First, check if the number is in the hashmap O(1)
            // ONLY ONE SOLUTION. You are checking for the EXACT different here!

            // Question: Why use keys instead of values? Is it because of the get function??
            // Answer: You only know the DIFFERENCE between the target and the current value in the nums array.
            // You DONT know the INDEX of that number. If it is stored already in the hashmap, then the index will also be stored.
            // Again, you know the other half of the nums, but not its index, which is why it is the value and not the key.
            System.out.println("i = " + i);
            if (numbers.containsKey(target - nums[i])) {

                System.out.println(nums[i]);
                return result = new int[] {numbers.get(target - nums[i]), i};
            }
            else
                numbers.put(nums[i], i);
        }

        return result;
    }

    public static void main (String[] args) {
        int[] nums = {2, 7,11, 15};
        int target = 9;
        int[] arr = twoSum(nums, target);
        System.out.println(arr[0] + ", " + arr[1]);
    }
}