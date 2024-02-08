package Recursion.Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,4,1,-1,0,31,21,12};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int len){
        if(len==1){
            return;
        }
        for (int i = 1; i < len; i++) {
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        sort(arr,len-1);
    }
}
