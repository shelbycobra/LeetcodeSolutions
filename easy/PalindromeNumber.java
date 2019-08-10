public class PalindromeNumber {

    //Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

    public static boolean isPalindrome(int x) {

        String num = new Integer(x).toString();
        for (int i = 0, j = num.length() - 1; i < num.length(); i++, j--) {
            if (i != j && num.charAt(i) != num.charAt(j))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));
    }
}