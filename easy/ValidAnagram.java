import java.util.*;

public class ValidAnagram {

    /*
Given two strings s and t, write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

    */

    // First Attempt - 27ms (faster than 5.91%); 37.5 mb (less than 76.77%)
    /*
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c: s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c: t.toCharArray()) {
            if (map.containsKey(c)) {
                int value = map.get(c);
                if (value == 1)
                    map.remove(c);
                else
                    map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }

        return map.values().size() == 0;
    }
    */

    // Second Attempt -  Sort char arrays first, then see if they match
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ac", "bb"));
    }
}