
import java.util.ArrayList;
import java.util.List;

/*
Problem Statement

Given an integer array nums, return all elements that appear more than ⌊n/3⌋ times.

🔍 Example
Input: [1,1,1,3,3,2,2,2]
Output: [1,2]

For n/3 → at most 2 majority elements possible

*/

public class MajorityElement2 {
    // Brute Force: Check each element and count its frequency, if frequency is
    // greater than n/3 return that element. Time Complexity: O(n^2) Space
    // Complexity: O(1)
    public static List<Integer> majorityBrute(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 3 && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }
        return result;
    }

    // Optimal Approach: Boyer-Moore Voting Algorithm for n/3
    // Time Complexity: O(n) Space Complexity: O(1)

    public static List<Integer> majorityOptimal(int[] nums) {
        int count1 = 0, count2 = 0;
        Integer candidate1 = null, candidate2 = null;
        for (int num : nums) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 2, 2, 2 };
        System.out.println("Majority Elements (Brute Force): " + majorityBrute(nums));
        System.out.println("Majority Elements (Optimal): " + majorityOptimal(nums));
    }

}
