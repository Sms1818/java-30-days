
import java.util.HashMap;
import java.util.Map;

/*
Problem

Given:

int[] arr = {1, 2, 3};
int k = 3;

Count the number of subarrays whose sum equals k.

Expected Output
2

Subarrays:

[1, 2]
[3]
*/
public class CountSubarraysWithSumK {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        int k=3;
        // Brute Force
        // TC: n^2, SC:1
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.println("Brute Force: "+count);

        // Optimal Approach: My intuition is to use a prefix sum and a hash map to store the frequency of prefix sums.
        // TC: n, SC: 1
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        int prefixSum = 0;
        int countOptimal = 0;
        prefixSumFreq.put(0, 1);
        for(int num:arr){
            prefixSum+=num;
            if(prefixSumFreq.containsKey(prefixSum-k)){
                countOptimal+=prefixSumFreq.get(prefixSum-k);
            }
            prefixSumFreq.put(prefixSum, prefixSumFreq.getOrDefault(prefixSum, 0)+1);
        }
        System.out.println("Optimal Approach: "+countOptimal);
        
    }
}