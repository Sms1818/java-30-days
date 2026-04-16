# ***Exception Handling in Java***

---

# 🔥 **What is an Exception?**

---

## **Definition**

An Exception in Java is an **event that occurs during program execution that disrupts the normal flow of instructions**.

> It is an object that represents an error or unexpected condition occurring at runtime 

---

# 🧠 **Core Idea**

```text
Exception = Unexpected Event during execution
```

---

## 🧠 **Key Points**

✔ Occurs at runtime (mostly)
✔ Breaks normal flow
✔ Represented as an object
✔ Handled using exception handling

---

# 🔥 **Example of Exception**

---

```java
int a = 10;
int b = 0;

int result = a / b; // ArithmeticException
```

---

👉 Division by zero causes an exception
👉 Program terminates abnormally

---

# 🔥 **What is Exception Handling?**

---

## **Definition**

Exception Handling is a mechanism used to **handle exceptions and maintain normal program flow**.

> It prevents abnormal termination and ensures smooth execution

---

# 🧠 **Core Idea**

```text
Handling = Controlling program after exception
```

---

# 🔥 **Why Exception Handling?**

---

✔ Prevent program crash
✔ Maintain normal flow
✔ Handle unexpected situations
✔ Improve program reliability

---

# 🔥 **Basic Structure**

---

```java
try {
    // risky code
} catch (Exception e) {
    // handling code
} finally {
    // always executes
}
```

---

# 🔥 **Basic Example**

---

```java
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}
```

---

## **Output**

```text
Error: Division by zero
```

---

# 🔥 **Execution Flow**

---

```text
Try → Exception occurs → Catch → Finally → Continue
```

---

# 🔥 **Exception Hierarchy**

---

```text
Throwable
 ├── Exception
 │    ├── Checked Exception
 │    └── Unchecked Exception
 └── Error
```

---

# 🔥 **Types of Exceptions**

---

# 🔹 **1. Checked Exception**

---

✔ Checked at compile time
✔ Must be handled

---

## **Examples**

```text
IOException, SQLException
```

---

# 🔹 **2. Unchecked Exception**

---

✔ Occur at runtime
✔ Not mandatory to handle

---

## **Examples**

```text
NullPointerException
ArithmeticException
ArrayIndexOutOfBoundsException
```

---

# 🔹 **3. User-Defined Exception**

---

```java
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
```

---

# 🔥 **finally Block**

---

## **Definition**

Executes **always**, whether exception occurs or not

---

## **Example**

```java
try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Exception caught");
} finally {
    System.out.println("Always executes");
}
```

---

## 🧠 **Important**

```text
finally may NOT execute in:
- System.exit()
- JVM crash
```

---

# 🔥 **throw Keyword**

---

## **Definition**

Used to explicitly throw an exception

---

## **Example**

```java
class Test {

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        }
    }
}
```

---

# 🔥 **throws Keyword**

---

## **Definition**

Declares exceptions that a method may throw

---

## **Example**

```java
import java.io.*;

class Test {

    static void readFile() throws IOException {
        FileReader f = new FileReader("file.txt");
    }
}
```

---

## 🧠 **Difference**

```text
throw → used inside method
throws → used in method signature
```

---

# 🔥 **Multiple Catch Blocks**

---

```java
try {
    int[] arr = new int[2];
    arr[5] = 10;
} catch (ArithmeticException e) {
    System.out.println("Arithmetic Error");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index Error");
}
```

---

# 🔥 **Nested try-catch**

---

```java
try {
    try {
        int a = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Inner catch");
    }

    String s = null;
    s.length();

} catch (NullPointerException e) {
    System.out.println("Outer catch");
}
```

---

# 🔥 **Exception Handling Flow (JVM)**

---

```text
1. Exception occurs
2. JVM creates exception object
3. Searches for matching catch block
4. Executes handler if found
5. Else → default handler terminates program
```

---

# 🔥 **Call Stack Concept**

---

```text
Stack of method calls
JVM searches it backward to find handler
```

---

# 🔥 **Exception vs Error**

---

| Feature  | Exception   | Error            |
| -------- | ----------- | ---------------- |
| Nature   | Recoverable | Not recoverable  |
| Handling | Can handle  | Cannot handle    |
| Example  | IOException | OutOfMemoryError |

---

# 🔥 **Methods to Print Exception Info**

---

```java
e.printStackTrace();
e.toString();
e.getMessage();
```

---

# 🔥 **Best Practices**

---

✔ Catch specific exceptions
✔ Avoid catching generic Exception
✔ Use finally for cleanup
✔ Don’t ignore exceptions

---

# 🔥 **Common Mistakes**

---

❌ Empty catch block
❌ Catching Exception blindly
❌ Not handling checked exceptions
❌ Overusing try-catch

---

# 🚀 **Quick Summary**

---

* Exception = unexpected event
* Handling = managing flow
* try-catch-finally structure
* Checked vs Unchecked

---

```text
Exception Handling = Stability + Control + Safety
```

---

👉 Exception Handling = **graceful recovery from errors**

---
