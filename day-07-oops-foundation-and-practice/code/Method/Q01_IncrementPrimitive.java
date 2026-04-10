// This program demonstrates that when a primitive type, in this case int is passed to the method, its copy is getting passed, not the real value. That is the reason when we pass 10 to the increment method, we are passing a copy of 10 and not the actual value. 

// Output of the program will be:
// Before increment: 10
// Inside increment method: 11
// After increment: 10
// After increment using return value: 11

// After we pass the value of x to the incrementValue method, we are getting the incremented value back and assigning it to x, which is why we see the change in the value of x after calling incrementValue method.

class Calculator {
    public void increment(int num) {
        num++;
        System.out.println("Inside increment method: " + num);
    }

    public int incrementValue(int num){
        return num+1;
    }
}

class Q01_IncrementPrimitive {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int x = 10;
        System.out.println("Before increment: " + x);
        calc.increment(x);
        System.out.println("After increment: " + x);

        // To actually increment the value of x, we can use the return value of the incrementValue method
        x= calc.incrementValue(x);
        System.out.println("After increment using return value: " + x);
    }
}