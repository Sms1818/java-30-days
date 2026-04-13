# ***super Keyword in Java***

---

# 🔥 **Definition**

The `super` keyword in Java is used to **refer to the immediate parent class object**.

> It allows a subclass to access parent class **variables, methods, and constructors** 

---

# 🧠 **Core Idea**

```text id="sup1"
super → refers to parent class
```

---

# 🔥 **Why super Keyword?**

---

✔ Access parent class members
✔ Resolve ambiguity (same variable/method names)
✔ Call parent constructor
✔ Maintain proper inheritance flow

---

# 🔥 **Where super is Used**

---

## **1. Access Parent Variables**

## **2. Call Parent Methods**

## **3. Call Parent Constructors**

---

# 🔥 **1. super with Variables**

---

## **Problem**

When parent and child have same variable name

---

## **Example**

```java id="sup2"
class Vehicle {
    int maxSpeed = 120;
}

class Car extends Vehicle {
    int maxSpeed = 180;

    void display() {
        System.out.println("Child speed: " + maxSpeed);
        System.out.println("Parent speed: " + super.maxSpeed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
```

---

## **Output**

```text id="sup3"
Child speed: 180
Parent speed: 120
```

---

## 🧠 **Explanation**

👉 `maxSpeed` exists in both classes
👉 `super.maxSpeed` accesses parent version

---

# 🔥 **2. super with Methods**

---

## **Problem**

When method is overridden in child class

---

## **Example**

```java id="sup4"
class Person {
    void message() {
        System.out.println("This is person class");
    }
}

class Student extends Person {

    void message() {
        System.out.println("This is student class");
    }

    void display() {
        message();         // child method
        super.message();   // parent method
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
```

---

## **Output**

```text id="sup5"
This is student class
This is person class
```

---

## 🧠 **Explanation**

👉 `message()` → calls child version
👉 `super.message()` → calls parent version

---

# 🔥 **3. super with Constructors**

---

## **Definition**

Used to call parent class constructor

---

## **Example**

```java id="sup6"
class Person {
    Person() {
        System.out.println("Person constructor");
    }
}

class Student extends Person {
    Student() {
        super(); // calls parent constructor
        System.out.println("Student constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        new Student();
    }
}
```

---

## **Output**

```text id="sup7"
Person constructor
Student constructor
```

---

## 🧠 **Explanation**

👉 Parent constructor runs first
👉 Then child constructor

---

# 🔥 **Parameterized Constructor with super**

---

## **Example**

```java id="sup8"
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
}
```

---

## 🧠 **Insight**

👉 Used to pass values to parent constructor

---

# 🔥 **Modifying Parent Method Result**

---

## **Example**

```java id="sup9"
class Parent {
    boolean isTrue() {
        return true;
    }
}

class Child extends Parent {
    boolean isTrue() {
        boolean result = super.isTrue();
        return !result;
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.isTrue());
    }
}
```

---

## **Output**

```text id="sup10"
false
```

---

## 🧠 **Explanation**

👉 Calls parent method
👉 Modifies result in child

---

# 🔥 **Important Rules**

---

✔ `super()` must be first statement in constructor
✔ If not written, Java adds it automatically
✔ Parent constructor always executes first
✔ Cannot use `super` in static context

---

# 🔥 **Constructor Chaining**

---

```text id="sup11"
Object → Parent → Child
```

👉 Chain ends at `Object` class

---

# 🔥 **When super is Automatically Called**

---

👉 If you don’t write:

```java
super();
```

👉 Java inserts it automatically

---

# 🔥 **Compilation Error Case**

---

❌ If parent has no default constructor:

```java
class A {
    A(int x){}
}

class B extends A {
    B(){
        // ERROR if super(x) not called
    }
}
```

---

# 🔥 **Advantages of super**

---

✔ Access parent functionality
✔ Avoid code duplication
✔ Improve clarity
✔ Supports overriding

---

# 🔥 **Common Mistakes**

---

❌ Using super after statement
❌ Forgetting constructor chaining
❌ Confusing super with this
❌ Using super in static context

---

# 🔥 **super vs this**

---

| Feature          | super         | this           |
| ---------------- | ------------- | -------------- |
| Refers to        | Parent class  | Current class  |
| Used for         | Parent access | Current object |
| Constructor call | super()       | this()         |

---

# 🚀 **Quick Summary**

---

* super → parent reference
* Used for variables, methods, constructors
* Resolves ambiguity
* Enables constructor chaining

---

👉 super = **access and control parent behavior**

---
