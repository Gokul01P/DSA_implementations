package Recursion.Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={-1,2,4,1,0,12,13,11,9,47};
        sort(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int start,int end){
        if(end==arr.length){
            return;
        }
        for (int i = start+1; i <=end ; i++) {
            if(arr[i]<arr[i-1]){
                swap(arr,i,i-1);
            }
            sort(arr,start,end+1);
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
