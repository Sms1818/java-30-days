
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* 
Problem

Given an array of strings, group all the strings that are anagrams of each other.

Two strings are anagrams if they contain the same characters with the same frequencies, but possibly in a different order.

Expected Output

Input:

["eat", "tea", "tan", "ate", "nat", "bat"]

Output:

[[eat, tea, ate], [tan, nat], [bat]]

Order of groups may vary.
*/

public class GroupAnagrams {
    // Approach: Sorting Each String and Using HashMap
    // Time Complexity: O(n * k log k) where n is number of strings and k is average length of string (for sorting)
    // Space Complexity: O(n * k) for storing each string in worst case , hashmap memory will have key n*k and value n*k in worst case. Combined O(n*k).
    public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs){
        if(strs==null || strs.length == 0) return new ArrayList<>();
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        result.addAll(map.values());
        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));

    }
}
