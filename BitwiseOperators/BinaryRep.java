package BitwiseOperators;

public class BinaryRep {
    public static void main(String[] args) {
        int n = 5;
        System.out.print("Binary forms from 1 to "+ n + " : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(Integer.toBinaryString(i) + " ");
        }
    }
}
