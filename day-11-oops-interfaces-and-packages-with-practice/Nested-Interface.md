# ***Nested Interfaces in Java***

---

# 🔥 **Definition**

A Nested Interface is an interface that is **declared inside another class or interface**.

> It helps in organizing related interfaces and controlling access to them 

---

# 🧠 **Core Idea**

```text id="ni1"
Interface inside Class or Interface
```

---

# 🔥 **Why Nested Interfaces?**

---

✔ Better code organization
✔ Controlled visibility
✔ Logical grouping
✔ Improved modular design

---

# 🔥 **Types of Nested Interfaces**

---

## **1. Interface Inside a Class**

## **2. Interface Inside an Interface**

---

# 🔥 **1. Nested Interface Inside a Class**

---

## **Definition**

An interface declared inside a class.

---

## 🧠 **Key Rules**

✔ Can be `public`, `protected`, `default`, or `private`
✔ Must be accessed using **OuterClass.InnerInterface**

---

## **Example**

```java id="ni2"
class Outer {

    interface Inner {
        void display();
    }
}

class Test implements Outer.Inner {

    public void display() {
        System.out.println("Hello from Nested Interface Inside a Class!");
    }

    public static void main(String[] args) {

        Outer.Inner obj = new Test();
        obj.display();
    }
}
```

---

## **Output**

```text id="ni3"
Hello from Nested Interface Inside a Class!
```

---

## 🧠 **Explanation**

👉 `Inner` is inside `Outer`
👉 Must use `Outer.Inner` to access
👉 Implementation happens in another class

---

# 🔥 **2. Nested Interface Inside an Interface**

---

## **Definition**

An interface declared inside another interface.

---

## 🧠 **Key Rules**

✔ Always **public and static (implicitly)**
✔ No need to explicitly declare modifiers
✔ Access using **OuterInterface.InnerInterface**

---

## **Example**

```java id="ni4"
interface OuterInterface {

    void show();

    interface InnerInterface {
        void msg();
    }
}

class Test implements OuterInterface.InnerInterface {

    public void msg() {
        System.out.println("Message from Nested Interface Inside an Interface!");
    }

    public static void main(String[] args) {

        OuterInterface.InnerInterface obj = new Test();
        obj.msg();
    }
}
```

---

## **Output**

```text id="ni5"
Message from Nested Interface Inside an Interface!
```

---

## 🧠 **Explanation**

👉 `InnerInterface` is implicitly public & static
👉 Can be implemented directly

---

# 🔥 **Access Rules Summary**

---

| Location            | Allowed Modifiers                   |
| ------------------- | ----------------------------------- |
| Inside Class        | public, protected, default, private |
| Inside Interface    | public, static (default)            |
| Top-level Interface | public, default                     |

---

# 🔥 **Important Concept**

---

```text id="ni6"
Nested interfaces are always static in nature
```

👉 They do NOT need an object of outer class

---

# 🔥 **Advanced Example (Access Modifier Case)**

---

```java id="ni7"
interface Parent {

    interface Test {
        void show();
    }
}

class Child implements Parent.Test {

    public void show() {
        System.out.println("show method of interface");
    }
}

public class Main {
    public static void main(String[] args) {

        Parent.Test obj = new Child();
        obj.show();
    }
}
```

---

## **Output**

```text id="ni8"
show method of interface
```

---

# 🔥 **Fully Qualified Name (Important)**

---

```text id="ni9"
OuterClass.InnerInterface
OuterInterface.InnerInterface
```

---

👉 Required to access nested interface

---

# 🔥 **Use Cases of Nested Interfaces**

---

## **1. Code Organization**

👉 Group related interfaces together

---

## **2. Controlled Access**

👉 Restrict visibility using access modifiers

---

## **3. Callback Mechanism**

👉 Pass object to another class for execution

---

## **4. Defining Contracts**

👉 Multiple implementations of same behavior

---

# 🔥 **Real-World Analogy**

---

```text id="ni10"
Company → Department → Rules
```

👉 Rules (interface) belong to department

---

# 🔥 **Advantages**

---

✔ Better structure
✔ Improved readability
✔ Encapsulation of behavior
✔ Flexible design

---

# 🔥 **Disadvantages**

---

❌ Slight complexity
❌ Harder to understand for beginners

---

# 🔥 **Common Mistakes**

---

❌ Forgetting outer reference (`Outer.Inner`)
❌ Confusing with inner classes
❌ Misunderstanding static nature

---

# 🚀 **Quick Summary**

---

* Nested interface = interface inside class/interface
* Access using outer name
* Inside interface → always public static
* Helps in modular design

---

```text id="ni11"
Nested Interface = Organized + Controlled Design
```

---

👉 Used for **logical grouping and better system design**

---
