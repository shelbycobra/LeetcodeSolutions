public class ReverseString {

    /*
    Write a function that reverses a string. The input string is given as an array of characters char[].
    Do not allocate extra space for another array, you must do this by modifying the input array 
        in-place with O(1) extra memory.
    You may assume all the characters consist of printable ascii characters.
    */

    public static void reverseString(char[] s) {
        for (int i = 0, j = s.length -1; i < s.length; i++, j--) {
            if ( i < j) {
                char tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
            }
        }
    }
}