# ***Abstract Class in Java***

---

# 🔥 **Definition**

An abstract class in Java is a class that **cannot be instantiated** and is designed to be **extended by other classes**.

> It is used to achieve **partial abstraction**, where some methods have implementation and some are left for subclasses 

---

# 🧠 **Core Idea**

```text
Abstract Class = Partial Abstraction + Inheritance
```

---

# 🔥 **Why Abstract Class?**

---

✔ Share common code
✔ Enforce method implementation
✔ Provide base structure
✔ Enable code reuse

---

# 🔥 **Syntax**

---

```java
abstract class ClassName {

    abstract void methodName();   // Abstract method

    void concreteMethod() {       // Concrete method
        System.out.println("Method implementation");
    }
}
```

---

# 🔥 **Key Components**

---

✔ Abstract methods (no body)
✔ Concrete methods (with body)
✔ Constructors
✔ Instance variables
✔ Static and final methods

---

# 🔥 **Basic Example (Partial Abstraction)**

---

```java
abstract class Shape {

    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double area();

    void getColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {

    int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s = new Circle("Red", 5);

        s.getColor();
        System.out.println("Area: " + s.area());
    }
}
```

---

## **Output**

```text
Color: Red
Area: 78.5
```

---

# 🔥 **Important Rule**

---

```text
Abstract class cannot be instantiated
```

---

# 🔥 **Example: Only Abstract Method**

---

```java
abstract class Sunstar {
    abstract void printInfo();
}

class Employee extends Sunstar {

    void printInfo() {
        System.out.println("Employee Info");
    }
}

public class Main {
    public static void main(String[] args) {
        Sunstar s = new Employee();
        s.printInfo();
    }
}
```

---

# 🔥 **Constructors in Abstract Class**

---

```java
abstract class Subject {

    Subject() {
        System.out.println("Learning Subject");
    }

    abstract void syllabus();

    void learn() {
        System.out.println("Preparing Right Now!");
    }
}

class IT extends Subject {

    void syllabus() {
        System.out.println("C, Java, C++");
    }
}
```

---

## 🧠 **Key Insight**

👉 Constructor runs when subclass object is created

---

# 🔥 **Important Observations**

---

# 🔹 **1. Cannot Create Object**

---

```java
// Base b = new Base(); ❌ NOT ALLOWED
```

---

✔ But reference allowed:

```java
Base b = new Derived();
```

---

# 🔹 **2. Constructor Execution Order**

---

```text
Parent Constructor → Child Constructor
```

---

# 🔹 **3. Abstract Class Without Abstract Method**

---

```java
abstract class Base {
    void fun() {
        System.out.println("Function of Base class");
    }
}
```

---

👉 Still cannot instantiate

---

# 🔹 **4. Final Methods in Abstract Class**

---

```java
abstract class Base {
    final void fun() {
        System.out.println("Final method");
    }
}
```

---

👉 Cannot be overridden

---

# 🔹 **5. Static Methods**

---

```java
abstract class Helper {

    static void demo() {
        System.out.println("Static method");
    }
}
```

---

👉 Called without object

---

# 🔹 **6. Abstract Keyword Rule**

---

```text
If class has abstract method → must be abstract
```

---

# 🔹 **7. Partial Implementation in Child**

---

```java
abstract class Demo {
    abstract void m1();
    abstract void m2();
}

abstract class Child1 extends Demo {
    void m1() {}
}

class Child2 extends Child1 {
    void m2() {}
}
```

---

👉 If not fully implemented → class must remain abstract

---

# 🔹 **8. Abstract Inner Classes**

---

```java
abstract class A {

    abstract class B {
        abstract void show();
    }
}
```

---

---

# 🔥 **Abstract Class vs Interface (Quick Recall)**

---

| Feature      | Abstract Class      | Interface       |
| ------------ | ------------------- | --------------- |
| Methods      | Abstract + Concrete | Mostly abstract |
| Constructors | Yes                 | No              |
| Variables    | Instance            | Constants       |
| Inheritance  | Single              | Multiple        |

---

# 🔥 **Advantages**

---

✔ Code reuse
✔ Flexible design
✔ Partial abstraction
✔ Better structure

---

# 🔥 **Disadvantages**

---

❌ Cannot create object
❌ Single inheritance limitation
❌ Slight complexity

---

# 🔥 **Common Mistakes**

---

❌ Trying to instantiate abstract class
❌ Not implementing abstract methods
❌ Forgetting `abstract` keyword
❌ Confusing with interface

---

# 🚀 **Quick Summary**

---

* Abstract class = partial abstraction
* Cannot be instantiated
* Supports constructors and methods
* Used as base class

---

```text
Abstract Class = Base Blueprint with Partial Implementation
```

---

👉 Abstract classes are used when you want **shared logic + enforced structure**

---
