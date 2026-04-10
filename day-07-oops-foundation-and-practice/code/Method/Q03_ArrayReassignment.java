// Here in this program, when we are passing the arr to the method reassignArray, we are passing the reference of the array as a value to the method. Inside the method we are reassigning the reference to a new array, which is why we are not seeing any change in the original array after calling the method. So technically two arrays are created, initially we have arr pointing to the first array and when we reassign arr to a new array inside the method, we are creating a new array and arr is now pointing to the new array, but the original reference of arr in the main method is still pointing to the first array, which is why we are not seeing any change in the original array after calling the method.

// Output of the program will be:
// Before reassignment:
// 1 2 3 4 5
// Inside reassignArray method:
// 6 7 8 9 10
// After reassignment:
// 1 2 3 4 5

public class Q03_ArrayReassignment {
    public void reassignArray(int[] arr){
        arr=new int[]{6,7,8,9,10};
        System.out.println("Inside reassignArray method:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Before reassignment:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        Q03_ArrayReassignment obj=new Q03_ArrayReassignment();
        obj.reassignArray(arr);
        System.out.println("After reassignment:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
