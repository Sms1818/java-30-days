# ***Polymorphism in Java***

---

# 🔥 **Definition**

Polymorphism means **"many forms"**, where a single entity (method or object) can behave differently based on specific class typex.

> It allows the same method name to perform different actions depending on the situation 

---

# 🧠 **Core Idea**

```text
One Interface → Multiple Implementations
```

---

# 🔥 **Types of Polymorphism in Java**

---

## **1. Compile-Time Polymorphism (Static Polymorphism)**

## **2. Runtime Polymorphism (Dynamic Polymorphism)**

---

# 🔥 **1. Compile-Time Polymorphism**

---

## **Definition**

Method call is resolved at **compile-time**

---

## **Achieved By**

👉 Method Overloading

---

## **Example**

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2.5, 3.5));
    }
}
```

---

## **Output**

```
5
9
6.0
```

---

## 🧠 **Explanation**

👉 Compiler decides which method to call
👉 Based on method signature

---

# 🔥 **2. Runtime Polymorphism (Dynamic Method Dispatch)**

---

## **Definition**

Method call is resolved at **runtime based on object type**

---

## **Achieved By**

👉 Method Overriding

---

## **Example**

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal ref;

        ref = new Dog();
        ref.sound();

        ref = new Cat();
        ref.sound();
    }
}
```

---

## **Output**

```
Dog barks
Cat meows
```

---

## 🧠 **Key Insight**

```text
Reference type → Animal
Object type → Dog / Cat
```

👉 Method depends on **object type**

---

# 🔥 **Upcasting**

---

## **Definition**

```java
Animal ref = new Dog();
```

👉 Parent reference → Child object

---

## 🧠 **Purpose**

👉 Enables runtime polymorphism

---

# 🔥 **Method Hiding**

---

## **Definition**

When a subclass defines a **static method with same signature as parent**, it is called **method hiding**, not overriding.

---

## ❗ Important Difference

```text
Overriding → Instance methods → Runtime
Hiding → Static methods → Compile-time
```

---

## **Example**

```java
class Parent {

    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {

    static void show() {
        System.out.println("Child static method");
    }
}

public class Main {
    public static void main(String[] args) {

        Parent obj = new Child();
        obj.show();
    }
}
```

---

## **Output**

```
Parent static method
```

---

## 🧠 **Explanation**

👉 Static methods depend on **reference type**, not object
👉 No runtime polymorphism

---

# 🔥 **Variables vs Methods**

---

## **Example**

```java
class A {
    int x = 10;
}

class B extends A {
    int x = 20;
}

public class Main {
    public static void main(String[] args) {

        A obj = new B();
        System.out.println(obj.x);
    }
}
```

---

## **Output**

```
10
```

---

## 🧠 **Insight**

👉 Variables are NOT overridden
👉 They are accessed using **reference type**

---

# 🔥 **Static vs Dynamic Binding**

---

| Type            | Binding Time | Based On  |
| --------------- | ------------ | --------- |
| Static Binding  | Compile-time | Reference |
| Dynamic Binding | Runtime      | Object    |

---

# 🔥 **Real-Life Example**

---

```text
Person → Father / Employee / Husband
```

👉 Same person, different roles

---

# 🔥 **Advantages of Polymorphism**

---

✔ Code reusability
✔ Flexibility
✔ Extensibility
✔ Cleaner design

---

# 🔥 **Disadvantages**

---

❌ Can increase complexity
❌ Slight performance overhead

---

# 🔥 **Common Mistakes**

---

❌ Confusing overriding with overloading
❌ Thinking variables are polymorphic
❌ Ignoring method hiding
❌ Misunderstanding reference vs object

---

# 🚀 **Quick Summary**

---

* Polymorphism = many forms
* Compile-time → Overloading
* Runtime → Overriding
* Static methods → Hiding
* Variables → Not polymorphic

---

👉 Polymorphism = **same method, different behavior**

---
