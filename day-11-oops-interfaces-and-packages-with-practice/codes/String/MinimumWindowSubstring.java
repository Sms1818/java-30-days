/*
Problem

Given two strings s and t, find the smallest substring in s that contains all the characters of t including their frequencies.

If no such substring exists, return "".

Expected Output

Input:

s = "ADOBECODEBANC"
t = "ABC"

Output:

"BANC"

Input:

s = "a"
t = "a"

Output:

"a"

Input:

s = "a"
t = "aa"

Output:

""
*/

public class MinimumWindowSubstring {
    // Approach: Sliding Window with Frequency Count
    // Time Complexity: O(n+m) where n is the length of string s and m is the length of string t
    // Space Complexity: O(1) since we are using a fixed size frequency array for
    public static String minimumWindow(String s, String t){
        if(s == null || t == null || s.length() < t.length()) return "";
        int[] freq = new int[128]; 
        for(char ch : t.toCharArray()){
            freq[ch]++;
        }
        int left=0;
        int minLength = Integer.MAX_VALUE;
        int count = t.length();
        int start = 0;

        for(int right=0;right<s.length();right++){
            if(freq[s.charAt(right)]>0){
                count--;
            }
            freq[s.charAt(right)]--;
            while(count==0){
                if(right-left+1<minLength){
                    minLength = right-left+1;
                    start = left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    count++;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
    public static void main(String[] args) {
        System.out.println(minimumWindow("ADOBECODEBANC", "ABC")); // BANC
        System.out.println(minimumWindow("a", "a")); // a
    }
}
