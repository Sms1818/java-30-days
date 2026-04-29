public class ProductArrayItself {
    // Brute Force Approach: O(n^2) time complexity
    // Space Complexity: O(n) for the result array
    public static int[] productExceptSelfBruteForce(int[] nums){
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product*=nums[j];
                }
            }
            result[i]=product;
        }
        return result;

    }

    // Optimized Approach: O(n) time complexity
    // Space Complexity: O(1) if we don't count the output array, otherwise O(n) for the result array

    public static int[] productExceptSelfOptimized(int[] nums){
        int n=nums.length;
        int[] result=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        // Now result contains the prefix products. We will multiply it with the suffix products.
        int suffixProduct=1;
        for(int j=n-1;j>=0;j--){
            result[j]=result[j]*suffixProduct;
            suffixProduct*=nums[j];
        }
       
        return result;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println("Input: nums = [1,2,3,4]");
        int[] result=productExceptSelfBruteForce(nums);
        System.out.print("Output: [");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
            if(i!=result.length-1){
                System.out.print(", ");
            }
        }        System.out.println("]");

        int[] optimizedResult=productExceptSelfOptimized(nums);
        System.out.print("Output (Optimized): [");
        for(int i=0;i<optimizedResult.length;i++){
            System.out.print(optimizedResult[i]);
            if(i!=optimizedResult.length-1){
                System.out.print(", ");
            }
        }        System.out.println("]");
    }
}
