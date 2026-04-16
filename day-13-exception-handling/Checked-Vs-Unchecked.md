# ***Checked vs Unchecked Exceptions in Java***

---

# 🔥 **Definition**

In Java, exceptions are broadly classified into:

```text
1. Checked Exceptions
2. Unchecked Exceptions
```

> These classifications are based on **when they are checked (compile-time or runtime)** 

---

# 🧠 **Core Idea**

```text
Checked → Compile-time
Unchecked → Runtime
```

---

# 🔥 **1. Checked Exceptions**

---

## **Definition**

Checked Exceptions are exceptions that are **checked at compile-time**.

👉 The compiler forces you to handle them using:

* try-catch
* or throws

---

## 🧠 **Key Characteristics**

✔ Checked at compile time
✔ Mandatory to handle
✔ Caused by external factors
✔ Subclass of `Exception`

---

## **Examples**

```text
IOException
SQLException
FileNotFoundException
InterruptedException
```

---

## **Example Code**

```java
import java.io.*;

class Test {
    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader("file.txt");
    }
}
```

---

## 🧠 **Explanation**

👉 File may not exist
👉 Compiler forces handling

---

# 🔥 **2. Unchecked Exceptions**

---

## **Definition**

Unchecked Exceptions are exceptions that are **checked at runtime**.

👉 They are NOT mandatory to handle

---

## 🧠 **Key Characteristics**

✔ Occur at runtime
✔ Not mandatory to handle
✔ Caused by programming errors
✔ Subclass of `RuntimeException`

---

## **Examples**

```text
NullPointerException
ArithmeticException
ArrayIndexOutOfBoundsException
IllegalArgumentException
```

---

## **Example Code**

```java
class Test {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int result = a / b; // Runtime error
    }
}
```

---

## 🧠 **Explanation**

👉 Compiler allows it
👉 JVM throws error at runtime

---

# 🔥 **Key Differences**

---

| Feature    | Checked      | Unchecked          |
| ---------- | ------------ | ------------------ |
| Time       | Compile-time | Runtime            |
| Handling   | Mandatory    | Optional           |
| Cause      | External     | Programming errors |
| Base Class | Exception    | RuntimeException   |

---

# 🔥 **Important Insight**

---

```text
Checked → Safety enforced by compiler
Unchecked → Responsibility of programmer
```

---

# 🔥 **Best Practices**

---

✔ Always handle checked exceptions
✔ Fix root cause of unchecked exceptions
✔ Avoid ignoring exceptions

---

# 🚀 **Quick Summary**

---

* Checked → compile-time
* Unchecked → runtime
* Handling depends on type

---

```text
Checked = Must handle
Unchecked = Should handle
```

---
