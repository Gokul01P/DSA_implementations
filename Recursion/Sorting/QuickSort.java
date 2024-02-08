package Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 5, 1, 23, 11, 10, 12};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int midEle = arr[mid];
        while (start <= end) {
            while (arr[start] < midEle) {
                start++;
            }
            while (arr[end] > midEle) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
