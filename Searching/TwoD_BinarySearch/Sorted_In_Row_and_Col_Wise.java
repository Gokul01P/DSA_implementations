package Searching.TwoD_BinarySearch;

import java.util.Arrays;

public class Sorted_In_Row_and_Col_Wise {
    public static void main(String[] args) {
        int[][] matriix={
                {1,2,3},
                {12,13,21},
                {11,20,31}
        };
        System.out.println(Arrays.toString(search(matriix,31)));
    }
    static int[] search(int[][] arr,int target){
        int row=0;
        int col=arr[0].length-1;

        while (row< arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            } else if (arr[row][col]>target) {
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
