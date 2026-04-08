# ***Type Conversion in Java***

---

## **Definition**

Type conversion is the process of **converting one data type into another**.

👉 Java performs conversion:

* Automatically (implicit)
* Manually (explicit)

---

# 🔥 Primitive Data Types & Memory

---

| Data Type | Size          |
| --------- | ------------- |
| byte      | 8-bit         |
| short     | 16-bit        |
| int       | 32-bit        |
| long      | 64-bit        |
| float     | 32-bit        |
| double    | 64-bit        |
| char      | 16-bit        |
| boolean   | JVM dependent |

👉 Each type has **fixed memory size** 

---

# 🔥 Types of Conversion

---

# **1. Implicit Conversion (Widening)**

---

## **Definition**

Automatic conversion from **smaller → larger data type**

---

## **Hierarchy**

```text id="hier1"
byte → short → int → long → float → double
           ↘ char ↗
```

---

## **Example**

```java id="imp1"
int a = 10;
double b = a;
```

---

## **Output**

```text id="imp2"
b = 10.0
```

---

## **Key Points**

✔ Done automatically
✔ No data loss
✔ Only compatible types allowed

---

## ❗ Not Allowed

```java id="imp3"
boolean b = true;
int x = b; // ❌
```

👉 Boolean is NOT compatible with numeric types 

---

# **2. Explicit Conversion (Narrowing)**

---

## **Definition**

Manual conversion from **larger → smaller type**

---

## **Syntax**

```java id="exp1"
int b = (int) a;
```

---

## **Example**

```java id="exp2"
double d = 10.9;
int i = (int) d;
```

---

## **Output**

```text id="exp3"
i = 10
```

👉 Fractional part lost

---

## ⚠️ Data Loss

```java id="exp4"
int x = 257;
byte b = (byte) x;
```

```text id="exp5"
b = 1  // (257 % 256)
```

👉 Values wrap around (modulo behavior) 

---

# 🔥 Special Case: char Conversion

---

## ❗ Not Allowed (Implicit)

```java id="char1"
int num = 65;
char ch = num; // ❌
```

---

## ✅ Allowed (Explicit)

```java id="char2"
char ch = (char) num;
```

---

## **Output**

```text id="char3"
ch = 'A'
```

---

# 🔥 Type Promotion

---

## **Definition**

During expression evaluation, smaller types are promoted to **int or higher**

---

## **Rule 1**

```text id="rule1"
byte, short, char → int
```

---

## **Example**

```java id="tp1"
byte a = 10;
byte b = 20;

int result = a + b;
```

👉 Result is **int**, not byte

---

## ❗ Compile Error Case

```java id="tp2"
byte a = 10;
byte b = 20;

byte result = a + b; // ❌
```

---

## **Fix**

```java id="tp3"
byte result = (byte)(a + b);
```

---

# 🔥 Mixed Type Expression

---

## **Rule**

```text id="rule2"
Expression result = highest data type
```

---

## **Example**

```java id="tp4"
int i = 10;
double d = 5.5;

double result = i + d;
```

---

# 🔥 Promotion Order

```text id="order1"
double > float > long > int
```

---

# 🔥 Expression Casting 

---

## ❗ Problem

```java id="excast1"
byte b = 50;
b = b * 2; // ❌
```

---

## **Why?**

👉 `b * 2` → promoted to **int**

---

## ✅ Fix

```java id="excast2"
b = (byte)(b * 2);
```

---

# 🔥 Implicit vs Explicit Conversion

---

| Feature    | Implicit      | Explicit          |
| ---------- | ------------- | ----------------- |
| Conversion | Automatic     | Manual            |
| Direction  | Small → Large | Large → Small     |
| Data Loss  | ❌ No          | ⚠ Possible        |
| Syntax     | None          | Required `(type)` |

---

# 🔥 Important Rules

---

## **1. Widening is safe**

---

## **2. Narrowing may cause data loss**

---

## **3. Expression always promotes to higher type**

---

## **4. byte, short, char → int in expressions**

---

## **5. boolean is NOT convertible**

---

# 🔥 Common Mistakes

---

❌ Assigning int to byte without casting
❌ Ignoring type promotion in expressions
❌ Assuming char behaves like int
❌ Forgetting data loss

---

# 🔥 Complete Example

```java id="full2"
class Test {

    public static void main(String[] args){

        int a = 10;
        double b = a; // widening

        double c = 10.9;
        int d = (int)c; // narrowing

        byte x = 50;
        byte y = 20;

        int result = x + y; // promotion

        System.out.println(b);
        System.out.println(d);
        System.out.println(result);
    }
}
```

---

# 🚀 Quick Summary

---

* Widening → automatic
* Narrowing → manual
* Expressions → promoted
* Data loss possible in casting
* Always check type compatibility

---

👉 Type conversion = **compatibility + direction + data safety**

---
