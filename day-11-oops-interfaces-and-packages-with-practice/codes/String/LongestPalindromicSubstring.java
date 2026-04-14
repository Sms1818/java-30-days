/*
Problem

Given a string s, find the longest substring which is a palindrome.

👉 A substring must be contiguous (unlike subsequence).

✅ Expected Output

Input: "babad"
Output: "bab" (or "aba" — both are valid)

Input: "cbbd"
Output: "bb"

Input: "a"
Output: "a"

Input: "ac"
Output: "a" (or "c")
*/

public class LongestPalindromicSubstring {
    public static  boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Brute Force Approach
    // TC: n^2 (for generating substrings) * n (for palindrome check) = O(n^3)
    // SC: O(n) as substring creation takes O(n) space
    public static String longestPalindromeBruteForce(String s){
        if(s==null || s.length() == 0) return "";
        String longest = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String substring=s.substring(i,j+1);
                if(isPalindrome(substring) && substring.length() > longest.length()){
                    longest = substring;
                }

            }
        }
        return longest;

    }

    public static String expand(String s, int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }

    // Optimal Approach: Expand Around Center
    // TC: total centers = 2n-1 (each character + gap between characters)
    //     For each center, we expand at most O(n) in worst case (when the string is all same characters)
    //     Overall: centers * expansion = O(n) * O(n) = O(n^2)
    // SC: O(1) 
    public static String longestPalindromeOptimal(String s){
        if(s==null || s.length() == 0) return "";
        String longest = "";
        for(int i=0;i<s.length();i++){
            String oddPalindrome = expand(s, i, i); // Odd length palindrome
            String evenPalindrome = expand(s, i, i+1); // Even length palindrome
            String currentLongest = oddPalindrome.length() > evenPalindrome.length() ? oddPalindrome : evenPalindrome;
            if(currentLongest.length() > longest.length()){
                longest = currentLongest;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        
        System.out.println(longestPalindromeBruteForce("babad")); // Output: "bab" or "aba"
        System.out.println(longestPalindromeBruteForce("cbbd"));  // Output: "bb"
        System.out.println(longestPalindromeBruteForce("a"));     // Output: "a"
        System.out.println(longestPalindromeBruteForce("ac"));    // Output: "a" or "c"

        System.out.println(longestPalindromeOptimal("babad")); // Output: "bab" or "aba"
        System.out.println(longestPalindromeOptimal("cbbd"));  // Output: "bb
        System.out.println(longestPalindromeOptimal("a"));     // Output: "a"
        System.out.println(longestPalindromeOptimal("ac"));    // Output: "a" or

    }
}
