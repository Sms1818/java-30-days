/*
Problem

Given:

int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

Find the maximum subarray sum.

Expected Output
6

because the subarray:

[4, -1, 2, 1]

has sum 6.
*/

public class KadaneMaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // Brute Force
        // TC: n^2, SC:1
        int maximumSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];
                maximumSum=Math.max(maximumSum, currentSum);
            }
        }
        System.out.println("Maximum subarray sum (Brute Force): "+maximumSum);

        // Optimal Approach: Kadane's Algorithm
        // TC: n, SC:1
        int maximumSumKadane = Integer.MIN_VALUE;
        int currentSumKadane = 0;
        for(int i=0;i<arr.length;i++){
            currentSumKadane=Math.max(arr[i], currentSumKadane + arr[i]);
            maximumSumKadane=Math.max(maximumSumKadane, currentSumKadane);
        }

        System.out.println("Maximum subarray sum (Kadane's Algorithm): "+maximumSumKadane);
    }
}