package com.yogesh.arrays;

import java.util.Random;
//solution used from geeksforgeeks
public class KthMaxMin {

        static void swap(int[] arr, int l, int r) {
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
        }

        static int randomPartition(int[] arr, int l, int r) {
            int n = r - l + 1;
            Random rd = new Random();
            int pivot = rd.nextInt(n);
            swap(arr, l + pivot, r);
            return partition(arr, l, r);
        }

        static int kthSmallest(int[] arr, int l, int r, int k) {
            // If k is smaller than number of elements in array
            if (k > 0 && k <= r - l + 1) {
                // find a position for random partition
                int pos = randomPartition(arr, l, r);

                // if this pos gives the kth smallest element, then return
                if (pos - l == k - 1)
                    return arr[pos];

                // else recurse for the left and right half accordingly
                if (pos - l > k - 1)
                    return kthSmallest(arr, l, pos - 1, k);
                return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
            }

            return Integer.MAX_VALUE;
        }

        static int partition(int[] arr, int l, int r) {
            int x = arr[r], i = l;
            for (int j = l; j <= r - 1; j++) {
                if (arr[j] <= x) {
                    swap(arr, i, j);
                    i++;
                }
            }
            swap(arr, i, r);
            return i;
        }

        public static void main(String[] args) {
            int[] arr = {12, 3, 5, 7, 4, 19, 26};
            int n = arr.length, k = 5;
            System.out.println("K'th smallest element is "
                    + kthSmallest(arr, 0, n - 1, k));
        }
    }
