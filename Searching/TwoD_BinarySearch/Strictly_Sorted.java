package Searching.TwoD_BinarySearch;

import java.util.Arrays;

public class Strictly_Sorted {
    public static void main(String[] args) {
        int[][] arr={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }
    public static int[] search(int[][] arr,int target){
        int rows= arr.length;
        int cols=arr[0].length;

        if(rows==1){
            return binarySearch(arr,0,0,cols,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        //run the loop till 2 rows are remaining:
        while (rStart < rEnd-1) {   // while this is true there will be more than two rows:
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (arr[mid][cMid] < target) {
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }

        // now we have 2 rows;
        //check whether the target in col of 2 rows are not:
        if (arr[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid] == target){
            return new int[]{rStart+1 , cMid};
        }
        //search in 1st half
        if(target <= arr[rStart][cMid-1]){
            return binarySearch(arr,rStart,0,cMid-1,target);
        }
        //search in 2nd half
        if(target >=arr[rStart][cMid+1] && target <= arr[rStart][cols-1]){
            return binarySearch(arr,rStart,cMid+1,cols-1,target);
        }
        //search in 3rd half
        if(target <=arr[rStart+1][cMid-1]){
            return binarySearch(arr,rStart+1,0,cMid-1,target);
        }
        //search in 4th half
        if(target >=arr[rStart+1][cMid+1]){
            return binarySearch(arr,rStart+1,cMid+1,cols-1,target);
        }
        return new int[]{-1,-1};
    }
    public static int[] binarySearch(int[][] arr,int rows, int cStart,int cEnd,int target){
        while (cStart <= cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(arr[rows][mid]==target){
                return new int[]{rows,mid};
            }
            if (arr[rows][mid] < target){
                cStart=mid+1;
            }else {
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
