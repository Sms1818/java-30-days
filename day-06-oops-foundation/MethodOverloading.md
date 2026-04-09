# ***Method Overloading in Java***

---

# 🔥 **Definition**

Method Overloading is a feature in Java that allows a class to have **multiple methods with the same name but different parameter lists**.

> It is an example of **compile-time polymorphism**.

---

# 🧠 **Core Idea**

👉 Same method name
👉 Different:

* Number of parameters
* Type of parameters
* Order of parameters

---

# 🔥 **Why Method Overloading?**

---

✔ Improves code readability
✔ Avoids multiple method names
✔ Provides flexibility

👉 Example:
Instead of:

```java
addTwoNumbers()
addThreeNumbers()
```

We use:

```java
add()
```

---

# 🔥 **Basic Example**

---

```java id="ol1"
class Test {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}
```

👉 Same method name, different parameters

---

# 🔥 **Ways to Achieve Overloading**

---

# **1. Changing Number of Parameters**

---

## **Explanation**

Methods differ based on number of inputs.

---

## **Example**

```java id="ol2"
class Product {

    int multiply(int a, int b){
        return a * b;
    }

    int multiply(int a, int b, int c){
        return a * b * c;
    }
}
```

---

# **2. Changing Data Types**

---

## **Explanation**

Methods differ based on type of parameters.

---

## **Example**

```java id="ol3"
class Product {

    int prod(int a, int b){
        return a * b;
    }

    double prod(double a, double b){
        return a * b;
    }
}
```

👉 Compiler selects based on argument type

---

# **3. Changing Order of Parameters**

---

## **Explanation**

Methods differ based on parameter sequence.

---

## **Example**

```java id="ol4"
class Student {

    void display(String name, int id){
        System.out.println(name + " " + id);
    }

    void display(int id, String name){
        System.out.println(id + " " + name);
    }
}
```

---

# 🔥 **Important Rule**

---

## ❗ Cannot Overload by Return Type Only

---

```java id="ol5"
int add(int a, int b){ return a + b; }

// ❌ ERROR
double add(int a, int b){ return a + b; }
```

👉 Same parameters → compiler cannot differentiate

---

# 🔥 **Method Signature**

---

👉 Overloading depends on:

* Method name
* Parameter list

👉 NOT on:

* Return type
* Access modifier

---

# 🔥 **Type Promotion in Overloading**

---

## **Definition**

If exact match is not found, Java performs **type promotion**.

---

## **Hierarchy**

```text id="ol6"
byte → short → int → long → float → double
```

---

## **Example**

```java id="ol7"
class Demo {

    void show(int x){
        System.out.println("int");
    }

    void show(double x){
        System.out.println("double");
    }

    public static void main(String[] args){
        Demo obj = new Demo();
        obj.show(10);   // int
        obj.show(10.5); // double
    }
}
```

---

# 🔥 **Tricky Case**

---

```java id="ol8"
class Demo {

    void show(int x){
        System.out.println("int");
    }

    void show(long x){
        System.out.println("long");
    }

    public static void main(String[] args){
        Demo obj = new Demo();
        obj.show(10); // int
    }
}
```

👉 Exact match preferred over promotion

---

# 🔥 **Another Tricky Case**

---

```java id="ol9"
class Demo {

    void show(byte x){
        System.out.println("byte");
    }

    void show(int x){
        System.out.println("int");
    }

    public static void main(String[] args){
        Demo obj = new Demo();
        obj.show('A');
    }
}
```

👉 Output:

```text
int
```

👉 Because `'A'` → char → promoted to int

---

# 🔥 **Hybrid Overloading**

---

👉 You can combine:

* Number
* Type
* Order

---

# 🔥 **Important Rules**

---

✔ Same method name required
✔ Parameters must differ
✔ Return type alone cannot differentiate
✔ Compiler decides method at compile-time

---

# 🔥 **Common Mistakes**

---

❌ Changing only return type
❌ Confusing with overriding
❌ Ignoring type promotion

---

# 🚀 **Quick Summary**

---

* Same name, different parameters
* Compile-time polymorphism
* Based on method signature
* Supports type promotion

---

👉 Method Overloading = **same behavior, different inputs**

---
