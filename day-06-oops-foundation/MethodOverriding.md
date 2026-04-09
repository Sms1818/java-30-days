# ***Method Overriding in Java***

---

# 🔥 **Definition**

Method Overriding occurs when a subclass provides a **specific implementation of a method that is already defined in its parent class**.

> It is an example of **runtime polymorphism** 

---

# 🧠 **Core Idea**

👉 Same method name
👉 Same parameters
👉 Same return type
👉 Different implementation

---

# 🔥 **Basic Example**

---

```java id="ov1"
class Animal {

    void move(){
        System.out.println("Animal is moving");
    }
}

class Dog extends Animal {

    @Override
    void move(){
        System.out.println("Dog is running");
    }
}

class Main {
    public static void main(String[] args){
        Dog d = new Dog();
        d.move();
    }
}
```

---

## **Output**

```text id="ov2"
Dog is running
```

👉 Child method overrides parent method

---

# 🔥 **Runtime Polymorphism**

---

## **Example**

```java id="ov3"
class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args){
        Animal obj = new Dog();
        obj.sound();
    }
}
```

---

## **Output**

```text id="ov4"
Dog barks
```

👉 Method is decided at **runtime based on object type**

---

# 🔥 **Rules for Overriding**

---

✔ Method name must be same
✔ Parameters must be same
✔ Return type must be same or covariant
✔ Method must be inherited
✔ Cannot override static methods
✔ Cannot override private methods

---

# 🔥 **Using super Keyword**

---

## **Definition**

Used to call parent class method.

---

## **Example**

```java id="ov5"
class Parent {

    void show(){
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    @Override
    void show(){
        super.show();
        System.out.println("Child method");
    }
}
```

---

## **Output**

```text id="ov6"
Parent method
Child method
```

---

# 🔥 **Static Method Case**

---

## **Important**

Static methods are **not overridden**, they are **hidden**

---

## **Example**

```java id="ov7"
class Parent {
    static void show(){
        System.out.println("Parent static");
    }
}

class Child extends Parent {
    static void show(){
        System.out.println("Child static");
    }
}

class Main {
    public static void main(String[] args){
        Parent obj = new Child();
        obj.show();
    }
}
```

---

## **Output**

```text id="ov8"
Parent static
```

👉 Based on reference type, not object

---

# 🔥 **Private Method Case**

---

## **Important**

Private methods cannot be overridden.

---

## **Example**

```java id="ov9"
class Parent {
    private void show(){
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show(){
        System.out.println("Child");
    }
}
```

👉 This is NOT overriding, it's a new method

---

# 🔥 **Final Method Case**

---

## **Important**

Final methods cannot be overridden.

---

```java id="ov10"
class Parent {
    final void show(){}
}

class Child extends Parent {
    // ❌ Error
    void show(){}
}
```

---

# 🔥 **Covariant Return Type**

---

## **Definition**

Child method can return **subtype of parent return type**

---

## **Example**

```java id="ov11"
class Parent {
    Parent get(){
        return new Parent();
    }
}

class Child extends Parent {

    @Override
    Child get(){
        return new Child();
    }
}
```

---

# 🔥 **Exception Rule**

---

✔ Can throw same exception
✔ Can throw smaller exception
❌ Cannot throw broader checked exception

---

# 🔥 **Important Concepts**

---

## **1. Method Selection**

👉 Based on:

* Object type → overriding
* Reference type → static

---

## **2. Dynamic Method Dispatch**

👉 JVM decides method at runtime

---

# 🔥 **Why Overriding?**

---

✔ Modify parent behavior
✔ Achieve runtime polymorphism
✔ Code flexibility

---

# 🔥 **Common Mistakes**

---

❌ Confusing with overloading
❌ Trying to override static method
❌ Changing method signature
❌ Ignoring @Override annotation

---

# 🚀 **Quick Summary**

---

* Same method, different implementation
* Happens in inheritance
* Runtime decision
* Enables polymorphism

---

👉 Method Overriding = **same method, different behavior at runtime**

---
