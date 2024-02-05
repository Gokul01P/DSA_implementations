package BitwiseOperators;

public class UniqueNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 4, 4, 7, 1, 1};
        System.out.println("Unique number in an array is " + ans(arr));
    }
    static int ans(int[] arr) {
        int unique = 0;
        for (int i : arr) {
            unique ^= i;
        }
        return unique;
    }
}
