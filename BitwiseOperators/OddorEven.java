package BitwiseOperators;

public class OddorEven {
    public static void main(String[] args) {
        int n = 13;
        oddOrEven(n);
    }
    private static void oddOrEven(int n) {
        if ((n & 1) == 1) {
            System.out.println(n + " is an odd number");
        } else {
            System.out.println(n + " is an even number");
        }
    }

}
