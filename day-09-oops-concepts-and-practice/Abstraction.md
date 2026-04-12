# ***Abstraction in Java***

---

# 🔥 **Definition**

Abstraction is the process of **hiding implementation details and showing only essential functionality**.

> It focuses on **what an object does, not how it does it** 

---

# 🧠 **Core Idea**

```text
Hide internal details → Show only behavior
```

---

# 🔥 **Why Abstraction?**

---

✔ Reduce complexity
✔ Improve maintainability
✔ Enhance security
✔ Allow flexible design

---

# 🔥 **Real-Life Example**

---

```text
TV Remote:
You press button → TV works
You don’t know internal circuits
```

---

# 🔥 **How to Achieve Abstraction**

---

## **1. Abstract Class (Partial Abstraction)**

## **2. Interface (Full Abstraction)**

---

# 🔥 **1. Abstract Class**

---

## **Definition**

An abstract class:

* Cannot be instantiated
* Can have **abstract + concrete methods**

---

## **Example**

```java
abstract class Shape {

    String color;

    // constructor
    Shape(String color) {
        this.color = color;
    }

    // abstract method
    abstract double area();

    // concrete method
    String getColor() {
        return color;
    }
}

class Circle extends Shape {

    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle("Red", 2.5);
        System.out.println(s.area());
        System.out.println(s.getColor());
    }
}
```

---

## 🧠 **Key Points**

👉 Abstract class can have:

* Constructors
* Concrete methods
* Abstract methods

---

# 🔥 **2. Interface**

---

## **Definition**

An interface is a **blueprint** that defines methods a class must implement.

---

## **Example**

```java
interface Shape {
    double calculateArea();
}

class Circle implements Shape {

    double r;

    Circle(double r) {
        this.r = r;
    }

    public double calculateArea() {
        return Math.PI * r * r;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        System.out.println(s.calculateArea());
    }
}
```

---

## 🧠 **Key Points**

👉 Interface:

* Cannot have constructors
* Methods are abstract by default
* Supports multiple inheritance

---

# 🔥 **Abstract Class vs Interface**

---

| Feature      | Abstract Class              | Interface       |
| ------------ | --------------------------- | --------------- |
| Methods      | Abstract + Concrete         | Mostly abstract |
| Constructors | Yes                         | No              |
| Variables    | Can have instance variables | Only constants  |
| Inheritance  | Single                      | Multiple        |
| Keyword      | extends                     | implements      |

---

# 🔥 **When to Use Abstract Class vs Interface**

---

## ✅ **Use Abstract Class When:**

---

✔ Classes share **common code (implementation)**
✔ You want to define **base behavior + default logic**
✔ You need **constructors or state (variables)**

---

### **Example Scenario**

```text
Vehicle → Car, Bike
(Common engine logic)
```

---

## ✅ **Use Interface When:**

---

✔ You want **only behavior definition**
✔ You need **multiple inheritance**
✔ You want to define a **contract**

---

### **Example Scenario**

```text
Flyable → Bird, Airplane
```

---

# 🔥 **Real Combined Example**

---

```java
abstract class Animal {
    abstract void sound();
}

interface Flyable {
    void fly();
}

class Bird extends Animal implements Flyable {

    void sound() {
        System.out.println("Bird chirps");
    }

    public void fly() {
        System.out.println("Bird flies");
    }
}
```

---

# 🔥 **Important Rules**

---

✔ Abstract class cannot be instantiated
✔ Abstract methods must be implemented
✔ Interface methods must be implemented
✔ Use `extends` for class
✔ Use `implements` for interface

---

# 🔥 **Advantages of Abstraction**

---

✔ Hides complexity
✔ Improves design
✔ Increases flexibility
✔ Enhances security

---

# 🔥 **Disadvantages**

---

❌ Can increase complexity
❌ Harder to debug
❌ Overuse can reduce readability

---

# 🔥 **Common Mistakes**

---

❌ Not implementing abstract methods
❌ Confusing abstract class with interface
❌ Overusing abstraction
❌ Wrong method signatures

---

# 🚀 **Quick Summary**

---

* Abstraction = hide implementation
* Abstract class → partial abstraction
* Interface → full abstraction
* Use based on requirement

---

👉 Abstraction = **design-level thinking in OOP**

---
