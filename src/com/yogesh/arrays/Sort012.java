package com.yogesh.arrays;

public class Sort012 {
    public static void sort012(int[] a,int n)
    {
        // code here
        int zero = 0;
        int one = 0;
        int sec = 0;

        for(int i = 0; i < n; i++)
        {
            if(a[i] == 0) zero++;

            if(a[i] == 1) one++;

            if(a[i] == 2) sec++;
        }
        int i = 0;
        while( i < zero) a[i++] = 0;

        i = zero;
        while( i < zero+one) a[i++] = 1;

        i = zero+one;
        while( i < zero+one+sec) a[i++] = 2;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 1, 0, 1, 2, 0, 1, 2 };
        int n= a.length;
        sort012(a,n);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        }
    }
