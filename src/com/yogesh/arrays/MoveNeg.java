package com.yogesh.arrays;

public class MoveNeg {
    //order of elements is not important
    // Approach 1
    //Partition process of quicksort
    public static void rearrange(int [] arr,int n){
        int j=0,temp;
        for(int i=0; i<n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    static void printArray(int [] arr,int n) {
        for (int i =0; i<n; i++)
            System.out.print(arr[i] + " ");
        }

        // 2nd approach
    //using Two Pointer Approach
     public static void shiftall(int[] arr,int l,int r)
     {
        while(l <= r) {
            if (arr[l] < 0 && arr[r]<0)
                l++;
         else if(arr[l] > 0 && arr[r] < 0)
     {
         int temp = arr[l];
         arr[l] = arr[r];
         arr[r] = temp;
         l++;
         r--;
     }
        else if (arr[l] > 0 && arr[r]>0)
            r--;

    else {
        l++;
        r--;
    }
        }
     }

    static void display(int [] arr,int r) {
        for (int i =0; i<=r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {-1,2,3,4,-5,-6,-7,8,9};
        int arr_size = arr.length;
        shiftall(arr,0,arr_size-1);
        display(arr,arr_size-1);
    }
}

