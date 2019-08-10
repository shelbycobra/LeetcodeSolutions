import java.util.Stack;

public class ValidParentheses {
/* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.
An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
Note that an empty string is also considered valid. */

    public static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        // if brackets is empty, add char
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
                brackets.push(c);
            else {
                char match = getMatchingOpenBracket(c);
                if (!brackets.isEmpty() && brackets.peek() == match)
                    brackets.pop();
                else return false;
            }
        }
        return brackets.isEmpty();
    }

    private static char getMatchingOpenBracket(char c) {
        if (c == ')') return '(';
        if (c == '}') return '{';
        if (c == ']') return '[';
        return ' ';
    }

    public static void main (String[] args) {
        System.out.println(isValid("]"));
    }
}