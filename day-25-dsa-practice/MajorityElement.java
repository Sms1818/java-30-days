
public class MajorityElement {
    // Brute Force will be to check each element and count its frequency, if
    // frequency is greater than n/2 return that element. Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int majorityBrute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    // Optimal Approach: Boyer-Moore Voting Algorithm
    // Time Complexity: O(n) Space Complexity: O(1)
    public static int majorityOptimal(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == candidate)
                count++;
        }
        return count > nums.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Majority Element (Brute Force): " + majorityBrute(nums));
        System.out.println("Majority Element (Optimal): " + majorityOptimal(nums));
    }
}
