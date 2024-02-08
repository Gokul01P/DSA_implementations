package Recursion.Sorting;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 1, 0, -11, 23, 10};
        int[]ans=sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArray(left, right);
    }

    static int[] mergeArray(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k++] = left[i++];
            } else {
                ans[k++] = right[j++];
            }
        }
        while (i < left.length) {
            ans[k++] = left[i++];
        }
        while (j < right.length) {
            ans[k++] = right[j++];
        }
        return ans;
    }
}
