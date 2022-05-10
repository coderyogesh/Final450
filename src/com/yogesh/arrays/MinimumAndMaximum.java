package com.yogesh.arrays;

public class MinimumAndMaximum {

    /* Class Pair is used to return two values from getMinMax() */
    static class Pair {

        int min;
        int max;
    }

    static Pair Method1(int []arr , int n) {
        Pair minmax = new Pair();
        int i;

        /*If there is only one element then return it as min and max both*/
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }

        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        for (i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }

        return minmax;
    }




    static Pair Method2(int [] arr, int low,int high) {
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;

        //if only one element present
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }

        //if 2 elements are present
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }

        //if more than two elements
        mid = (low + high) / 2;
        mml = Method2(arr, low, mid);
        mmr = Method2(arr, mid + 1, high);

        //compare min of two parts

        if (mml.min < mmr.min){
            minmax.min = mml.min;
     } else {
            minmax.min = mmr.min;
        }

        //compare max of the two parts
        if (mml.max>mmr.max) {
            minmax.max = mml.max;
        } else {
            minmax.max = mmr.max;
        }
        return minmax;
    }


    static  Pair Method3(int[] arr,int n) {
        Pair minmax = new Pair();
        int i;

        //if array has even number of elements than initialize the first two elements as minimum and maximum

        if (n % 2 == 0) {
            if (arr[0] > arr[1] ) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            }  else {
                minmax.max = arr[1];
                minmax.min = arr[0];
            }
            i=2;
        }

        else {
            minmax.min = arr[0];
            minmax.max = arr[0];
            i=1;
        }

        while( i < n-1) {
            if (arr[i] >arr[i+1]) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                }
                if (arr[i + 1] < minmax.min) {
                    minmax.min = arr[i + 1];
                }
            } else {
                    if (arr[i+1] > minmax.max ) {
                        minmax.max = arr[i+1];
                    } if (arr[i] < minmax.min) {
                        minmax.min = arr[i];
                    }
                }
                i += 2;
            }
        return minmax;

    }


    /* Driver program to test above function */

    public static void main(String[] args) {
        int [] arr = { 1000,11,445,1,330,3000 };
        int arr_size = 6;
        Pair minmax = Method3(arr,arr_size);
        System.out.printf("The Minimum Element is= %d",minmax.min);
        System.out.println();
        System.out.printf("The Maximum Element is= %d",minmax.max);

    }
}