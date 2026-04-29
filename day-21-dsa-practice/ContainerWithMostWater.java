/* 

Given an array height[], where each element represents a vertical line height, find two lines that can hold the maximum water.

Example:

height = [1,8,6,2,5,4,8,3,7]

Output:

49

*/

public class ContainerWithMostWater {
    // Brute Force Approach: O(n^2) time complexity
    // Space Complexity: O(1)
    public static int maxAreaBruteForce(int[] height){
        int maxArea=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int width=j-i;
                int minHeight=Math.min(height[i],height[j]);
                int area=width*minHeight;
                maxArea=Math.max(maxArea, area);
            }
        }
        return maxArea;

    }

    // Optimized Approach: O(n) time complexity using two pointers
    // Space Complexity: O(1)
    public static int maxAreaOptimized(int[] height){
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int width=right-left;
            int minHeight=Math.min(height[left], height[right]);
            int area=width*minHeight;
            maxArea=Math.max(maxArea, area);

            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println("Input: height = [1,8,6,2,5,4,8,3,7]");
        int result=maxAreaBruteForce(height);
        System.out.println("Output: "+result);
        int resultOptimized=maxAreaOptimized(height);
        System.out.println("Output (Optimized): "+resultOptimized);

    }
}
