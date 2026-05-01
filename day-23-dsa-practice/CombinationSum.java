
import java.util.ArrayList;
import java.util.List;

/*
Problem

Given:

int[] candidates (distinct numbers)
target

Return all combinations where numbers sum to target.

👉 You can use the same number multiple times

Example:
Input:
candidates = [2,3,6,7]
target = 7

Output:
[
 [2,2,3],
 [7]
]
*/

public class CombinationSum {
    // TC: O(2^t) where t is the target value. In the worst case, we can have 2^t
    // combinations.
    // SC: O(t) for the recursion stack and the current combination list.
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, nums, target, current, res);
        return res;
    }

    public static void backtrack(int index, int[] nums, int target, List<Integer> current, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(current));
            return;
        }
        if (index == nums.length || target < 0)
            return;
        current.add(nums[index]);
        backtrack(index, nums, target - nums[index], current, res);
        current.remove(current.size() - 1);
        backtrack(index + 1, nums, target, current, res);
    }

    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }
}
