import java.util.*;

public class FirstUniqueInString {
    /*
 Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters. 
*/

    public static int firstUniqueChar(String s) {
        // FIRST ATTEMPT
        Map<Character, Integer> map = new HashMap<>();
        int lastFirstAppearance = -1;
        int 
        for (int i = s.length() -1; i > -1 ; i--) {
            if (!map.containsKey(s.charAt(i))) {
                System.out.println("First appearance of " + s.charAt(i));
                map.put(s.charAt(i), 1);
                lastFirstAppearance = i;

            } else {
                System.out.println("Char "+s.charAt(i) + " has appeared before.");
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }

        // for (int i = 0; i < s.length(); i++) {
        //     if (map.get(s.charAt(i)) == 1)
        //         return i;
        // }
        return answer;

        // SECOND ATTEMPT
        // for (int i = 0; i < s.length(); i++) {
        //     System.out.println(s.substring(i+1));
        //     if (s.substring(i+1).indexOf(s.charAt(i)) == -1 && s.substring(0, i).indexOf(s.charAt(i)) == -1)
        //         return i;
        // }
        // return -1;
    }

    public static void main (String[] args) {
        System.out.println(firstUniqueChar("cc"));
    }
}