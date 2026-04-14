/*
Problem

Given two strings s and t, check if s is a subsequence of t.

👉 A subsequence means:

Characters appear in the same order
But not necessarily contiguous
✅ Expected Output

Input:

s = "abc"
t = "ahbgdc"

Output:

true

Input:

s = "axc"
t = "ahbgdc"

Output:

false
*/
public class IsSubsequence {
    // Two Pointer Approach
    // TC = O(m) where m = length of t
    // SC = O(1)
    public static boolean isSubsequence(String s, String t){
        if(s == null || t == null) return false;
        if(s.length() > t.length()) return false;
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); // true
        System.out.println(isSubsequence("axc", "ahbgdc")); // false
    }
}
