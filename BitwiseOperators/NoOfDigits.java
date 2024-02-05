package BitwiseOperators;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 34567712;
        int b = 10;

        int ans = (int) ((Math.log(n)) / (Math.log(b)) + 1);

        System.out.println("Counting the number of digits : " + ans);
    }
}
