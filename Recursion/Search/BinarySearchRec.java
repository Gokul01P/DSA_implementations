package Recursion.Search;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, 5, 6, 7};
        int tar = 5;
        int ans = binarySearch(arr, tar, 0, arr.length);
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element at index : " + ans);
        }
    }
    static int binarySearch(int[] arr, int tar, int strt, int end) {

        if (strt > end) {
            return -1;
        }
        int mid = strt + (end - strt) / 2;
        if (arr[mid] == tar) {
            return mid;
        } else if (arr[mid] < tar) {
            return binarySearch(arr, tar, mid + 1, end);
        } else {
            return binarySearch(arr, tar, strt, mid - 1);
        }
    }
}

