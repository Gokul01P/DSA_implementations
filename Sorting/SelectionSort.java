package Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,8,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        int last;
        for (int i = 0; i < arr.length; i++) {
            last=arr.length-i-1;
            int max=getmaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
     static int getmaxIndex(int[] arr, int start, int end) {
        int max=0;
         for (int j = start; j <= end; j++) {
             if(arr[max]<arr[j]){
                 max=j;
             }
         }return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
