package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 31, 42, 53, 64};
        int tar = 31;

        System.out.println(LinearSearchBoolean(arr, tar));
        System.out.println("Element present at index: " + LinearSearchIndex(arr, tar));
    }
    static boolean LinearSearchBoolean(int[] arr, int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return true;
            }
        }
        return false;
    }
    static int LinearSearchIndex(int[] arr, int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }
}
