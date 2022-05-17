package com.yogesh.arrays;

public class LargestSum {
    //find Largest sum contiguous Subarray [V. IMP] using kadane's algorithm
    static long maxSubArraySum(int[] arr, int n){

        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < n; i++)
        {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n=arr.length;
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(arr,n));
    }

}

//https://leetcode.com/problems/maximum-subarray/
//Leetcode Submitted Question
//class Solution {
//
//
//    public int maxSubArray(int[] nums) {
//
//        int max_so_far=Integer.MIN_VALUE,max_ending_here=0;
//
//        for(int i=0;i<nums.length;i++){
//
//            max_ending_here+=nums[i];
//
//            if(max_ending_here>max_so_far)
//                max_so_far=max_ending_here;
//
//            if(max_ending_here<0)
//                max_ending_here=0;
//        }
//        return max_so_far;
//    }

//}
