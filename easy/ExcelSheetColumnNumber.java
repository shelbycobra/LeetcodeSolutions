import java.lang.Math;

public class ExcelSheetColumnNumber {
    /*
Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...

Example 1:

Input: "A"
Output: 1

Example 2:

Input: "AB"
Output: 28

Example 3:

Input: "ZY"
Output: 701

    */

    public static int titleToNumber(String s) {
        int columnNum = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'A' + 1;
            columnNum += c * Math.pow(26, (s.length() - 1 - i));
        }

        return columnNum;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }

}