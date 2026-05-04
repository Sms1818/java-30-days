public class FindDuplicateNumber {
    // Brute Force Approach: Use two nested loops to compare each element with every other element. Time Complexity: O(n^2), Space Complexity: O(1).
    // Better Approach: Using HashSet to track seen numbers. Time Complexity: O(n), Space Complexity: O(n).
    // Optimal Approach: Using the "Floyd's Tortoise and Hare" algorithm (Cycle Detection). Time Complexity: O(n), Space Complexity: O(1).
    public static int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums)); // Output: 2
    }
}