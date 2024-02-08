package Recursion.Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={-1,2,1,6,9,10,-21,4,12};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int max=maxIndex(arr,start,end);
        swap(arr,max,end);
        sort(arr,start,end-1);
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static int maxIndex(int[] arr,int start,int end){
        int maxInd=start;
        for (int i = start; i <=end ; i++) {
            if(arr[i]>arr[maxInd]){
                maxInd=i;
            }
        }
        return maxInd;
    }
}
