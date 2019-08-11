public class SumOfTwoIntegers {

    public static int getSum(int a, int b) {
        int result = 0;
        int carry = 0;
        for (int i = 0; i < 32; i++) {
            
            int bita = (a >> i) & 1;
            int bitb = (b >> i) & 1;
            if (bita == bitb) {
                result |= (carry << i);
                carry = bita;
            } else 
                if (carry == 0)
                    result |= (1 << i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 15));
    }
}