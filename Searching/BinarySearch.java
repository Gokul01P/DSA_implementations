package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int tar=5;

        int ans=BinSearchIndex(arr,tar);
        System.out.println(ans);
    }
    static int BinSearchIndex(int[] arr,int tar){

        int start=0;
        int end=arr.length;

        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==tar) {
                return mid;
            } else if (arr[mid]<tar) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }return -1;
    }
}
