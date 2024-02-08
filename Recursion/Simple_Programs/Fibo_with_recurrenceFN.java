package Recursion.Simple_Programs;

public class Fibo_with_recurrenceFN {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    static long fibo(int n) {
        return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5)));
    }
}
