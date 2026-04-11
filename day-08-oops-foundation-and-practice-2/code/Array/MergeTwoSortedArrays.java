
import java.util.Arrays;

/*
Problem

Given:

int[] arr1 = {1, 3, 5};
int[] arr2 = {2, 4, 6};

👉 Merge them into a single sorted array

✅ Expected Output
1 2 3 4 5 6
*/

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        // Brute Force: Create another array of size arr1.length + arr2.length, copy elements from both arrays and sort it.
        // TC: (n1+n2)log(n1+n2), SC: n1+n2

        int[] combinedArray=new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, combinedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, combinedArray, arr1.length, arr2.length);
        Arrays.sort(combinedArray);
        for(int num:combinedArray){
            System.out.print(num+" ");
        }

        // Optimal : Use two pointers to merge the arrays.
        // TC: n1+n2, SC: n1+n2
        int[] mergedArray=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergedArray[k++]=arr1[i++];
            }else{
                mergedArray[k++]=arr2[j++];
            }
        }

        while(i<arr1.length){
                mergedArray[k++]=arr1[i++];
        }
        while(j<arr2.length){
            mergedArray[k++]=arr2[j++];
        }

        System.out.println("\nMerged Array using Two Pointers:");
        for(int num:mergedArray){
            System.out.print(num+" ");
        }


    }
}