// We can see the value actually got modified in the array when we passed the array to the modifyArray method. It appears to us that java is a pass by reference language as we have actually changed the value but the reality is java is 100 percent pass by value language. When we pass an array to the method,we are passing the reference of the array as a value to the method. 

// Output of the program will be:
// Before modification:
// 1 2 3 4 5
// Inside method: 10
// After modification:
// 10 2 3 4 5

// Java is pass-by-value. When we pass an array, a copy of the reference is passed.
// Both the original and copied reference point to the same object in memory.
// Therefore, modifying the object affects the original array.

public class Q02_ArrayModification {
    public void modifyArray(int[] arr){
        arr[0]=10;
        System.out.println("Inside method: " + arr[0]);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Before modification:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        Q02_ArrayModification obj=new Q02_ArrayModification();
        obj.modifyArray(arr);
        System.out.println("After modification:");
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
