import java.util.*;

public class RomanToInt {

    //Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    /*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
    */
    static String keys = "IVXLCDM";
            
    static Map<Character, Integer> numerals = new HashMap<>();
    static Map<Character, Character> subtractBy = new HashMap<>();

    public static int romanToInt(String s) {

        int newNum = 0;

        setupSubtractBy();

        for (int i = s.length()-1; i > -1; i--) {
            // System.out.println("i ="+ i);
            char c = s.charAt(i);
            addKeyToMap(c);
            if (subtractBy.containsKey(c)) {
                int sum = numerals.get(c);
                char sub = subtractBy.get(c);
                if (i-1 > -1 && s.charAt(i-1) == sub) {
                    addKeyToMap(sub);
                    sum -= numerals.get(sub);
                    i--;
                }
                newNum += sum;
            } else
                newNum += numerals.get(c);
        }
        return newNum;
    }

    private static void addKeyToMap(char c) {
        if (!numerals.containsKey(c)) {
            int j = keys.indexOf(c);
            if (j == -1) return;
            int multiplier = (j % 2 == 0) ? 1 : 5;
            int exponent = j / 2;
            numerals.put(c, (int) (Math.pow(10, exponent) * multiplier));
        }
    }

    private static void setupSubtractBy() {
        subtractBy.put('M', 'C');
        subtractBy.put('D', 'C');
        subtractBy.put('C', 'X');
        subtractBy.put('L', 'X');
        subtractBy.put('V', 'I');
        subtractBy.put('X', 'I');
    }
    public static void main(String[] args) {

        System.out.println(romanToInt("LVIII"));
    }
}