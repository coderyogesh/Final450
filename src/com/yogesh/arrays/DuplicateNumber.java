package com.yogesh.arrays;

public class DuplicateNumber {
    //geeks for geeks solution
    // JAVA code to find
// duplicates in O(n) time
      public static void main(String[] args) {
          int[] numRay = {0, 4, 3, 2, 7, 8, 2, 3, 1};
                for (int i = 0; i < numRay.length; i++) {
                    numRay[numRay[i] % numRay.length]+= numRay.length;
                }
                System.out.println("The repeating elements are : ");
                for (int i = 0; i < numRay.length; i++) {
                    if (numRay[i] >= numRay.length * 2) {
                        System.out.println(i + " ");
                    }
                }
            }

        // striver approach
//     static int findDuplicates(int[] arr) {
//        int  n = arr.length;
//        int [] freq = new int[n+1];
//        for (int i =0; i<n; i++) {
//            if (freq[arr[i]] == 0) {
//                freq[arr[i]] += 1;
//            }
//            else {
//                return arr[i];
//            }
//        }
//        return 0;
//     }
//
//    public static void main(String[] args) {
//        int[] arr = {1,3,4,2,3};
//        System.out.println(findDuplicates(arr));
//    }
}