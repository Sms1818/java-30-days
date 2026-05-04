/*
Problem Statement

Given an array of integers, rearrange it into the next lexicographically greater permutation.

If such arrangement is not possible, rearrange it to the lowest possible order (ascending).

🔍 Example
Input:  [1,2,3]
Output: [1,3,2]
Input:  [3,2,1]
Output: [1,2,3]
Input:  [1,1,5]
Output: [1,5,1]
*/
public class NextPermutation {
    // Brute Force Approach: Generate all permutations and find the next one. This is inefficient with a time complexity of O(n * n!).
    // Optimal Approach:
    // 1. Traverse the array from the end and find the first pair of indices (i, j) such that nums[i] < nums[j]. If no such pair exists, reverse the array and return.
    // 2. If such a pair exists, find the smallest element to the right of index i that is greater than nums[i] and swap them.
    // 3. Reverse the subarray to the right of index i to get the next permutation.
    // Time Complexity: O(n) - We traverse the array a few times, but each traversal is O(n).
    // Space Complexity: O(1) - We are modifying the array in place.

    public static void nextPermutation(int[] nums){
        int n=nums.length;
        int index=-1;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        if(index==-1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }

        reverse(nums,index+1,n-1);
    }

    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.print("Next Permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
    }
    
}
