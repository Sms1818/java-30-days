# ***this Keyword in Java***

---

# 🔥 **Definition**

The `this` keyword in Java is used to **refer to the current object** — the object whose method or constructor is being executed.

> It helps access instance variables, methods, and constructors of the current class 

---

# 🧠 **Core Idea**

```text id="this1"
this → current object reference
```

---

# 🔥 **Why this Keyword?**

---

✔ Differentiate between instance and local variables
✔ Access current object’s members
✔ Call another constructor
✔ Pass current object
✔ Enable method chaining

---

# 🔥 **Where this is Used**

---

## **1. Refer Instance Variables**

## **2. Call Constructor (this())**

## **3. Return Current Object**

## **4. Pass as Method Argument**

## **5. Call Current Class Method**

## **6. Pass as Constructor Argument**

---

# 🔥 **1. this with Instance Variables**

---

## **Problem**

When variable names are same

---

## **Example**

```java id="this2"
class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(this.name + " " + this.age);
    }
}
```

---

## 🧠 **Explanation**

👉 `this.name` → refers to instance variable
👉 `name` → refers to parameter

---

# 🔥 **2. this() to Call Constructor**

---

## **Definition**

Used to call another constructor in same class

---

## **Example**

```java id="this3"
class Test {

    Test() {
        this(10, 20);
        System.out.println("Default constructor");
    }

    Test(int a, int b) {
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {
        new Test();
    }
}
```

---

## **Output**

```text id="this4"
Parameterized constructor
Default constructor
```

---

## 🧠 **Important Rule**

```text id="this5"
this() must be first statement
```

---

# 🔥 **3. Returning Current Object**

---

## **Example**

```java id="this6"
class Test {

    int a = 10;

    Test get() {
        return this;
    }

    void display() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        new Test().get().display();
    }
}
```

---

## 🧠 **Use Case**

👉 Method chaining

---

# 🔥 **4. Passing this as Method Argument**

---

## **Example**

```java id="this7"
class Test {

    int a = 10;

    void display(Test obj) {
        System.out.println(obj.a);
    }

    void show() {
        display(this);
    }

    public static void main(String[] args) {
        new Test().show();
    }
}
```

---

## 🧠 **Explanation**

👉 `this` passes current object

---

# 🔥 **5. Calling Current Class Method**

---

## **Example**

```java id="this8"
class Test {

    void display() {
        this.show();
        System.out.println("Inside display");
    }

    void show() {
        System.out.println("Inside show");
    }

    public static void main(String[] args) {
        new Test().display();
    }
}
```

---

## **Output**

```text id="this9"
Inside show
Inside display
```

---

# 🔥 **6. Passing this in Constructor**

---

## **Example**

```java id="this10"
class A {

    B obj;

    A(B obj) {
        this.obj = obj;
        obj.display();
    }
}

class B {

    int x = 5;

    B() {
        new A(this);
    }

    void display() {
        System.out.println("Value: " + x);
    }

    public static void main(String[] args) {
        new B();
    }
}
```

---

## **Output**

```text id="this11"
Value: 5
```

---

# 🔥 **Important Rules**

---

✔ `this` refers to current object
✔ Cannot be used in static context
✔ `this()` must be first statement
✔ Used only inside instance methods/constructors

---

# 🔥 **this vs super (VERY IMPORTANT)**

---

| Feature          | this           | super          |
| ---------------- | -------------- | -------------- |
| Refers to        | Current class  | Parent class   |
| Usage            | Current object | Parent object  |
| Constructor call | this()         | super()        |
| Access           | Own members    | Parent members |

---

# 🔥 **Common Mistakes**

---

❌ Using this in static method
❌ Using this() after statement
❌ Confusing with super
❌ Overusing this unnecessarily

---

# 🔥 **Advantages**

---

✔ Improves code clarity
✔ Resolves naming conflicts
✔ Supports chaining
✔ Simplifies constructor calls

---

# 🔥 **Disadvantages**

---

❌ Overuse reduces readability
❌ Not usable in static context

---

# 🚀 **Quick Summary**

---

* this → current object reference
* Used for variables, methods, constructors
* Enables constructor chaining
* Helps avoid ambiguity

---

👉 this = **reference to current object**

---
