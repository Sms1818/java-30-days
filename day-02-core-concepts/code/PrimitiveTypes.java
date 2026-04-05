class Demo {
    int num;
    boolean flag;
}
public class PrimitiveTypes {
    public static void main(String[] args) {
        // 1. Integer Overflow
        int max=Integer.MAX_VALUE;
        System.out.println("Max Integer: " + max);
        int overflowedMax = max + 1;
        System.out.println("Overflowed Max Integer: " + overflowedMax); // Output: -2147483648
        // Explanation: When we add 1 to the maximum integer value, it wraps around to the minimum integer value due to overflow.

        // 2. Type Promotion
        byte a = 10;
        byte b = 20;
        // byte c = a + b; // This will cause a compilation error because the result of a + b is promoted to int
        int c = a + b; // This works because the result is promoted to int
        System.out.println("Sum of a and b: " + c); // Output: 30
        //Explanation: In Java, when performing arithmetic operations on byte, char and short types, they are promoted to int before the operation is performed. This is why we cannot directly assign the result back to a byte variable without casting.

        // 3. Char behaves like an integer
        char ch='A';
        System.out.println("Character value: " + ch); // Output: A
        System.out.println("ASCII value: " + (int)ch); // Output: 65
        System.out.println("Next character: " + (char)(ch + 1)); // Output: B
        // Explanation: The char type in Java is essentially an unsigned 16-bit integer that represents a Unicode character. When we perform arithmetic operations on a char, it behaves like an integer, allowing us to manipulate its ASCII or Unicode values directly.

        // 4. Floating precision issue
        float f = 0.1f;
        double d = 0.1;
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Float + Float: " + (f + f)); // Output: 0.2
        System.out.println("Double + Double: " + (d + d)); // Output: 0.2
        // Explanation: Due to the way floating-point numbers are represented in binary, some decimal values cannot be represented exactly. This can lead to precision issues when performing arithmetic operations with floating-point numbers, resulting in unexpected results.

        // 6. Boolean cannot be converted
        boolean flag = true;
        // int num = flag; // ❌ compile error
        System.out.println("Boolean value: " + flag);
        // Explanation: In Java, the boolean type is not convertible to any other primitive type. This means that you cannot directly assign a boolean value to an integer or any other type without explicit conversion, which is not allowed in Java. This design choice helps prevent logical errors in code where a boolean value might be mistakenly treated as a numeric value.

        // 7. Default values (only for class variables)
        Demo demo = new Demo();
        System.out.println("Default int: " + demo.num);
        System.out.println("Default boolean: " + demo.flag);
        // Explanation: In Java, class variables (also known as instance variables) are automatically initialized to default values if they are not explicitly assigned. For numeric types like int, the default value is 0, and for boolean, it is false. However, local variables (variables declared inside methods) do not have default values and must be initialized before use.

        // 8. Long requires suffix L
        long big = 10000000000L;
        System.out.println("Long value: " + big);
        // Explanation: In Java, when you write a numeric literal that exceeds the range of int (which is 2,147,483,647), you need to suffix it with 'L' or 'l' to indicate that it is a long literal. If you don't use the suffix, the compiler will treat it as an int and will throw a compilation error if the value exceeds the int range.

        // 9. Float requires suffix f
        float pi = 3.14f;
        System.out.println("Float value: " + pi);
        // Explanation: Similar to long literals, when you write a floating-point literal that you want to be treated as a float, you need to suffix it with 'f' or 'F'. If you don't use the suffix, the compiler will treat it as a double by default, which can lead to a compilation error if you try to assign it to a float variable without casting.

        // 10. Explicit Casting
        int num = 130;
        byte small = (byte) num;
        System.out.println("Casting int to byte: " + small); // overflow
        // Explanation: When you explicitly cast a larger primitive type to a smaller one, you may encounter overflow if the value exceeds the range of the smaller type. In this example, casting the integer 130 to a byte results in an overflow, and the value wraps around to -126, which is not the expected result. This is because the byte type can only hold values from -128 to 127.


        

    }
}
