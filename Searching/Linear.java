package Searching;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[] arr={1,2,3,4,5};
        int tar=in.nextInt();

        System.out.println(LinearSearchBoolean(arr,tar));
        System.out.println(LinearSearchIndex(arr,tar));

    }
    static boolean LinearSearchBoolean(int[] arr,int tar){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==tar){
                return true;
            }
        }return false;
    }
    static int LinearSearchIndex(int[] arr,int tar){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==tar){
                return i;
            }
        }return -1;
    }
}
