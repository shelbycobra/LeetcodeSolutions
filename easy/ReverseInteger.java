import java.lang.Math;

public class ReverseInteger {

    // Given a 32-bit signed integer, reverse digits of an integer.
    public static int reverse(int x) {
        // BRUTE FORCE
        int reversed_x = 0;

        String num = new Integer(x).toString();
        int negative = 1;
        if (num.indexOf('-') != -1) {
            num = num.substring(1);
            negative = -1;
        }

        for (int i = 0; i < num.length(); i++) {
            reversed_x += (num.charAt(i) - '0') * Math.pow(10, i);
        }
        if (reversed_x == Integer.MAX_VALUE || reversed_x == Integer.MIN_VALUE)
            return 0;
        return reversed_x * negative;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}