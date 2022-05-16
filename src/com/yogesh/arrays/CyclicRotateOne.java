package com.yogesh.arrays;

public class CyclicRotateOne {
    static void rotate(int[] arr, int n)
    {
        int lastItem = arr[n-1];
        int previousItem = arr[n-1];
        int swap = 0;

        for(int i = 0;i<n;i++){
            swap = arr[i];
            arr[i] = previousItem;
            previousItem = swap;
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        rotate(arr,n);
    }
}
