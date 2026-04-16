# ***Types of Exceptions in Java***

---

# 🔥 **Definition**

Java provides different types of exceptions to represent various error conditions.

> These include built-in exceptions and user-defined exceptions 

---

# 🧠 **Core Idea**

```text
Types = Built-in + User-defined
```

---

# 🔥 **1. Built-in Exceptions**

---

## **Definition**

Predefined exceptions available in Java libraries

---

## 🔹 **Common Built-in Exceptions**

---

### ✔ **ArithmeticException**

```java
int a = 10 / 0;
```

👉 Divide by zero

---

### ✔ **NullPointerException**

```java
String s = null;
s.length();
```

👉 Accessing null object

---

### ✔ **ArrayIndexOutOfBoundsException**

```java
int[] arr = new int[5];
arr[6] = 10;
```

👉 Invalid index

---

### ✔ **NumberFormatException**

```java
int num = Integer.parseInt("abc");
```

👉 Invalid number conversion

---

### ✔ **StringIndexOutOfBoundsException**

```java
String s = "Hello";
s.charAt(10);
```

👉 Invalid string index

---

### ✔ **IllegalArgumentException**

👉 Invalid method argument

---

### ✔ **IllegalStateException**

👉 Method called in wrong state

---

# 🔥 **2. Checked Exceptions (Built-in)**

---

✔ IOException
✔ FileNotFoundException
✔ ClassNotFoundException

---

👉 Must be handled

---

# 🔥 **3. Unchecked Exceptions (Built-in)**

---

✔ NullPointerException
✔ ArithmeticException
✔ RuntimeException

---

👉 Occur at runtime

---

# 🔥 **4. User-Defined Exceptions**

---

## **Definition**

Custom exceptions created by programmer

---

## **Steps**

✔ Extend Exception class
✔ Define constructor
✔ Throw using `throw`

---

## **Example**

```java
class MyException extends Exception {

    MyException(String msg) {
        super(msg);
    }
}

class Test {

    static void check(int balance) throws MyException {

        if (balance < 1000) {
            throw new MyException("Low balance");
        }
    }
}
```

---

# 🔥 **Real Understanding**

---

```text
Built-in → Provided by Java
User-defined → Created by developer
```

---

# 🔥 **Exception Categories Summary**

---

| Type         | Description  |
| ------------ | ------------ |
| Built-in     | Predefined   |
| Checked      | Compile-time |
| Unchecked    | Runtime      |
| User-defined | Custom       |

---

# 🚀 **Quick Summary**

---

* Built-in → predefined
* Checked → must handle
* Unchecked → runtime
* User-defined → custom

---

```text
Exception Types = Predefined + Custom
```

---
