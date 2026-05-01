/*
Problem

Given an integer array, find the contiguous subarray that has the maximum product.
It can contain negative numbers and zeros, which can affect the product.

Example:
Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] = 6
*/

public class MaximumProductSubarray {
    // TC: O(n) - We traverse the array once.
    // SC: O(1) - We use a constant amount of space to store the maximum and minimum
    // products.
    public static int maximumSubarray(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            result = Math.max(result, max);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, -2, 4 };
        System.out.println("Input: nums = [2,3,-2,4]");
        System.out.println("Output: " + maximumSubarray(nums));

    }
}
