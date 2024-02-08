package Recursion.Search;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 23, 45, 10, -31, 0};
        int target = -31;
        int ans = lSearchRec(arr, target, 0, arr.length - 1);
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " + ans);
        }
    }
    static int lSearchRec(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        if (arr[start] == target) {
            return start;
        }
        return lSearchRec(arr, target, start + 1, end);
    }
}
