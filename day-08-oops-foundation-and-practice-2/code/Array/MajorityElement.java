/*
Problem
int[] arr = {2, 2, 1, 1, 1, 2, 2};

Find element occurring more than n/2 times
*/

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        // Brute Force: Count the occurrences of each element and check if it is greater than n/2
        // TC: n^2, SC:1
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>arr.length/2){
                System.out.println("Majority element is: "+arr[i]);
                break;
            }
        }

        // Better Approach: Frequency array
        // TC: 2n~n, SC: n
        int[] freq=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>arr.length/2){
                System.out.println("Majority element is: "+i);
                break;
            }
        }



        // Optimal Approach: Boyer-Moore Voting Algorithm
        // TC: n, SC:1
        int candidate=-1;
        int count=0;
        for(int num: arr){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int num: arr){
            if(num==candidate){
                count++;
            }
        }
        if(count>arr.length/2){

        System.out.println("Majority element is: "+candidate);
        }
        
    }
}