package Searching.TwoDSearch;

import java.util.Arrays;

public class LinearSearch2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 2, 4},
                {5, 11, 31, 22},
                {12, 32, 14, 10},
                {65, 6, 7, 15}
        };
        int target = 111;
        int[] ans = Lsearch(arr, target);
        if (ans[0] == -1 && ans[1] == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element at index : " + Arrays.toString(ans));
        }
    }

    static int[] Lsearch(int[][] arr, int target) {

        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
