# ***Difference Between Abstract Class and Interface in Java***

---

# 🔥 **Definition**

Both **Abstract Classes** and **Interfaces** are used to achieve **abstraction**, but they differ in design and usage.

> Abstract class provides **partial abstraction**, while interface provides **full abstraction (design contract)** 

---

# 🧠 **Core Idea**

```text id="aci1"
Abstract Class → What + How (partial implementation)
Interface → What only (contract)
```

---

# 🔥 **Abstract Class**

---

## **Definition**

An abstract class is a class that:

* Cannot be instantiated
* Can contain **both abstract and concrete methods**

---

## **Example**

```java id="aci2"
abstract class Shape {

    abstract double area();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    int radius = 5;

    double area() {
        return 3.14 * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape shape = new Circle(); // upcasting

        shape.display();
        System.out.println("Area: " + shape.area());
    }
}
```

---

## **Output**

```text id="aci3"
This is a shape
Area: 78.5
```

---

## 🧠 **Explanation**

👉 Abstract class provides **base behavior + structure**
👉 Supports runtime polymorphism

---

# 🔥 **Interface**

---

## **Definition**

An interface defines a **contract** that a class must follow.

---

## **Example**

```java id="aci4"
interface Drawable {
    void draw();
}

class Rectangle implements Drawable {

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {

        Drawable d = new Rectangle();

        d.draw();
    }
}
```

---

## **Output**

```text id="aci5"
Drawing Rectangle
```

---

## 🧠 **Explanation**

👉 Interface defines behavior only
👉 Implementation is provided by class

---

# 🔥 **Key Differences**

---

| Feature          | Abstract Class      | Interface                         |
| ---------------- | ------------------- | --------------------------------- |
| Purpose          | Partial abstraction | Full abstraction (contract)       |
| Methods          | Abstract + Concrete | Abstract (default/static allowed) |
| Variables        | Instance + static   | public static final               |
| Constructors     | Allowed             | Not allowed                       |
| Inheritance      | Single (`extends`)  | Multiple (`implements`)           |
| Access Modifiers | Any                 | Methods public by default         |
| Implementation   | Can provide logic   | Only definition (mostly)          |

---

# 🔥 **Polymorphism Example (Comparison)**

---

## **Abstract Class**

```java id="aci6"
Shape s = new Circle();
s.area();
```

---

## **Interface**

```java id="aci7"
Drawable d = new Rectangle();
d.draw();
```

---

## 🧠 **Insight**

👉 Both support **runtime polymorphism**

---

# 🔥 **When to Use Abstract Class**

---

✔ Classes share **common code**
✔ Need **constructors and state**
✔ Need **default implementation**

---

## **Example Scenario**

```text id="aci8"
Vehicle → Car, Bike
(common logic like engine)
```

---

# 🔥 **When to Use Interface**

---

✔ Need **multiple inheritance**
✔ Define **contract only**
✔ No shared state required

---

## **Example Scenario**

```text id="aci9"
Flyable → Bird, Airplane
```

---

# 🔥 **Real Combined Example**

---

```java id="aci10"
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

# 🔥 **Advantages Comparison**

---

## **Abstract Class**

✔ Code reuse
✔ Shared implementation
✔ Better structure

---

## **Interface**

✔ Multiple inheritance
✔ Loose coupling
✔ Flexible design

---

# 🔥 **Common Mistakes**

---

❌ Using abstract class when interface is enough
❌ Ignoring multiple inheritance need
❌ Confusing implementation vs contract
❌ Not understanding design intent

---

# 🚀 **Quick Summary**

---

* Abstract Class → partial abstraction + shared logic
* Interface → full abstraction + contract
* Use based on requirement

---

```text id="aci11"
Abstract Class = Base class
Interface = Capability
```

---

👉 Abstract class = **"is-a" relationship with behavior**
👉 Interface = **"can-do" capability**

---
