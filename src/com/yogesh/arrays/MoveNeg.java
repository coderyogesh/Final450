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

    //3rd Approach
    //Using Dutch National Flag Algorithm

        // a utility function to swap two elements of an array
        public static void swap(int[] arr, int i, int j)
        {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        public static void move(int[] arr)
        {
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                if (arr[low] <= 0)
                    low++;
                else
                    swap(arr, low, high--);
            }
        }

    public static void main(String[] args) {
        int [] arr = {1, 2, -4, -5, 2, -7, 3,
                2, -6, -8, -9, 3, 2, 1 };
        move(arr);
        for (int e : arr)
        System.out.print(e + " ");
    }
}

