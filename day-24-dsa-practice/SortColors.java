/*
Problem: Sort Colors

Given an array nums containing n elements where each element is one of:

0, 1, or 2

Sort the array in-place such that:

All 0s come first,
then all 1s,
then all 2s
🔍 Constraints
You must not use built-in sort
Solve it in one pass (O(n))
Use constant extra space (O(1))
🎯 Example
Input:
nums = [2, 0, 2, 1, 1, 0]
Output:
[0, 0, 1, 1, 2, 2]
*/

public class SortColors {

    // We can use the Dutch National Flag algorithm to sort the colors in one pass
    // with O(1) space.
    // TC: O(n) - We traverse the array once.
    // SC: O(1) - We use a constant amount of space for the pointers.
    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int curr = 0;
        while (curr <= high) {
            switch (nums[curr]) {
                case 0 -> {
                    swap(nums, low, curr);
                    low++;
                    curr++;
                }
                case 1 -> curr++;
                default -> {
                    swap(nums, curr, high);
                    high--;
                }
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        System.out.println("Input: nums = [2, 0, 2, 1, 1, 0]");
        sortColors(nums);
        System.out.print("Output: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
