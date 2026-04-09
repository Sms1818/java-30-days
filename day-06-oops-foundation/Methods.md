# ***Methods in Java***

---

# 🔥 **Definition**

A **method** is a block of code that performs a specific task and can be reused multiple times.

> A method defines the **behavior of a class or object** 

👉 In simple terms, a method allows you to **write logic once and use it multiple times**, instead of repeating the same code again and again.

---

# 🔥 **Why Methods?**

---

✔ Code reusability
✔ Modularity
✔ Better readability
✔ Easy maintenance

👉 Without methods, programs become large and difficult to manage. Methods help in breaking complex problems into **smaller logical units**, making debugging and understanding easier.

---

# 🔥 **Basic Syntax**

---

```java id="m1"
returnType methodName(parameters){
    // method body
}
```

---

## **Components**

| Component  | Meaning             |
| ---------- | ------------------- |
| returnType | What method returns |
| methodName | Name of method      |
| parameters | Input values        |
| body       | Logic               |

👉 Each method must clearly define:

* What it takes as input
* What it returns (if anything)
* What logic it performs

---

# 🔥 **Example (Basic Method)**

---

```java id="m2"
class Test {

    void greet(){
        System.out.println("Hello");
    }

    public static void main(String[] args){
        Test obj = new Test();
        obj.greet();
    }
}
```

👉 Here, `greet()` is a simple method that prints a message.
👉 Since it is not static, we need an object to call it.

---

# 🔥 **Types of Methods**

---

# **1. Predefined Methods**

---

## **Definition**

Methods already available in Java libraries.

👉 These methods are provided by Java to perform common tasks like math operations, string handling, etc., so that developers do not need to write everything from scratch.

---

## **Example**

```java id="m3"
double randomValue = Math.random();
System.out.println(randomValue);
```

👉 `Math.random()` is a built-in method that returns a random value.

---

# **2. User-Defined Methods**

---

## **Definition**

Methods created by programmer.

👉 These methods are written based on program requirements and help in organizing logic in a structured way.

---

## **Example**

```java id="m4"
class Test {

    int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        Test obj = new Test();
        System.out.println(obj.add(5, 3));
    }
}
```

👉 This method takes input, processes it, and returns a result.

---

# 🔥 **Types Based on Usage**

---

# **1. Instance Method**

---

## **Definition**

Method that belongs to object.

👉 These methods operate on **instance variables** and require an object to be called.

---

## **Example**

```java id="m5"
class Test {

    void show(){
        System.out.println("Instance Method");
    }

    public static void main(String[] args){
        Test obj = new Test();
        obj.show();
    }
}
```

👉 Without creating an object, instance methods cannot be accessed.

---

# **2. Static Method**

---

## **Definition**

Method that belongs to class.

👉 These methods do not depend on object state and can be called directly using the class name.

---

## **Example**

```java id="m6"
class Test {

    static void show(){
        System.out.println("Static Method");
    }

    public static void main(String[] args){
        Test.show();
    }
}
```

👉 Static methods are commonly used for utility operations.

---

# 🔥 **Method with Parameters**

---

## **Definition**

Method that takes input.

👉 Parameters allow methods to become flexible by accepting different values during execution.

---

## **Example**

```java id="m7"
class Test {

    void display(int x){
        System.out.println(x);
    }

    public static void main(String[] args){
        Test obj = new Test();
        obj.display(10);
    }
}
```

👉 Here, `x` is a parameter and `10` is the argument passed.

---

# 🔥 **Method with Return Type**

---

## **Definition**

Method that returns a value.

👉 These methods are used when the result of computation is required for further use.

---

## **Example**

```java id="m8"
class Test {

    int square(int x){
        return x * x;
    }

    public static void main(String[] args){
        Test obj = new Test();
        System.out.println(obj.square(5));
    }
}
```

👉 `return` sends the result back to the caller.

---

# 🔥 **Void Method**

---

## **Definition**

Method that does not return anything.

👉 These methods perform an action but do not produce a result.

---

## **Example**

```java id="m9"
void printMessage(){
    System.out.println("Hello");
}
```

---

# 🔥 **Method Signature**

---

## **Definition**

Method signature consists of:

* Method name
* Parameters

👉 It is used by the compiler to differentiate methods.

---

## **Example**

```java id="m10"
int add(int a, int b)
```

👉 Signature = `add(int, int)`

---

## ❗ Important

Return type is NOT part of signature

👉 This is important in method overloading.

---

# 🔥 **Method Overloading (Introduction)**

---

## **Definition**

Same method name with different parameters.

👉 This allows multiple methods to perform similar operations with different inputs.

---

## **Example**

```java id="m11"
int add(int a, int b){
    return a + b;
}

int add(int a, int b, int c){
    return a + b + c;
}
```

---

# 🔥 **Calling Methods**

---

# **1. Calling Instance Method**

```java id="m12"
Test obj = new Test();
obj.show();
```

👉 Object is required because method belongs to instance.

---

# **2. Calling Static Method**

```java id="m13"
Test.show();
```

👉 No object needed.

---

# 🔥 **Call Stack**

---

## **Definition**

Call stack manages method execution using **LIFO (Last In First Out)**.

👉 Each method call is pushed onto the stack and removed after execution.

---

## **Example**

```java id="m14"
class Test {

    static void A(){
        B();
        System.out.println("A");
    }

    static void B(){
        System.out.println("B");
    }

    public static void main(String[] args){
        A();
    }
}
```

---

## **Output**

```text id="m15"
B
A
```

---

## **Flow**

```text id="m16"
main → A → B → return → A → return → main
```

👉 This explains how Java manages method execution internally.

---

# 🔥 **Pass by Value**

---

## **Definition**

Java passes **copy of value**, not original variable.

👉 Any changes inside method do NOT affect original variable.

---

## **Example**

```java id="m17"
class Test {

    void change(int x){
        x = 100;
    }

    public static void main(String[] args){
        Test obj = new Test();

        int a = 10;
        obj.change(a);

        System.out.println(a); // 10
    }
}
```

👉 Original value remains unchanged.

---

# 🔥 **Important Rules**

---

✔ Method must be inside class
✔ Static method → called using class
✔ Instance method → called using object
✔ Java is pass-by-value
✔ Method signature excludes return type

---

# 🔥 **Common Mistakes**

---

❌ Forgetting return statement
❌ Calling instance method without object
❌ Confusing static vs instance
❌ Thinking Java is pass-by-reference

---

# 🚀 **Quick Summary**

---

* Method = reusable block of code
* Defines behavior
* Can be static or instance
* Supports parameters and return values
* Managed using call stack

---

👉 Methods = **core building block of Java programs**

---
