
import java.util.ArrayList;
import java.util.List;

/* 
Problem

You are given a list of intervals:

[ [start1, end1], [start2, end2], ... ]

👉 Merge all overlapping intervals

🔍 Example
Input:
[[1,3],[2,6],[8,10],[15,18]]

Output:
[[1,6],[8,10],[15,18]]
🧠 What does "merge" mean?

Look at:

[1,3] and [2,6]

They overlap because:

2 ≤ 3

So merge:

[1,6]
*/
public class MergeIntervals {
    public static List<List<Integer>> mergeIntervals(List<List<Integer>> intervals) {
        List<List<Integer>> merged = new ArrayList<>();
        if (intervals == null || intervals.isEmpty()) {
            return merged;
        }
        // Sort by start time
        intervals.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        List<Integer> curr = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            List<Integer> next = intervals.get(i);
            if (next.get(0) <= curr.get(1)) {
                curr.set(1, Math.max(curr.get(1), next.get(1)));
            } else {
                merged.add(curr);
                curr = next;
            }
        }
        merged.add(curr);

        return merged;
    }

    public static void main(String[] args) {
        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(new ArrayList<>(List.of(1, 3)));
        intervals.add(new ArrayList<>(List.of(2, 6)));
        intervals.add(new ArrayList<>(List.of(8, 10)));
        intervals.add(new ArrayList<>(List.of(15, 18)));
        System.out.println("Input: [[1,3],[2,6],[8,10],[15,18]]");
        List<List<Integer>> result = mergeIntervals(intervals);
        System.out.println("Output: " + result);

    }
}
