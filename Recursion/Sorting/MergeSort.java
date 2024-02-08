package Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 1, 5, 6, 7, 8};
        sort(arr, 0, arr.length );
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid, end);

        merge(arr, start, mid, end);
    }
    static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int k = 0;
        int[] ans = new int[end - start];

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }
        while (i < mid) {
            ans[k++] = arr[i++];
        }
        while (j < end) {
            ans[k++] = arr[j++];
        }
        for (int l = 0; l < ans.length; l++) {
            arr[start + l] = ans[l];
        }
    }
}
