package BitwiseOperators;

public class SetBits {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }
    static int setBits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n -= n & -n;
        }
        return count;
    }
}
