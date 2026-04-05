# ***Data Types In Java***

---

## **Defination**

Java is a statically typed programming langauge, which means the data type of every variable is known at compile time. The compiler enforces type safety and prevents invalid assignments.

* Example:

```java
int x="GFG"; // Compile time error
```

---

## **What is Data Type?**

A data type defines :

* The type of data a variable can hold
* The memory required to store data

---

## **Types of Data Type In Java**

1. Primitive Data Type -> Store actual values
2. Non-Primitive Data Type -> Store memory references

---

## **Primitive Data Type**

* Stores the actual value directly into the memory. Java provides 8 primitive data-types.

### **List of Primitive Data Types**

| Type    | Description                | Size          | Example |
| ------- | -------------------------- | ------------- | ------- |
| boolean | true or false              | JVM dependent | true    |
| byte    | 8-bit integer              | 1 byte        | 10      |
| short   | 16-bit integer             | 2 bytes       | 2000    |
| int     | 32-bit integer             | 4 bytes       | 1000    |
| long    | 64-bit integer             | 8 bytes       | 100L    |
| float   | decimal (single precision) | 4 bytes       | 3.14f   |
| double  | decimal (double precision) | 8 bytes       | 3.14    |
| char    | single character           | 2 bytes       | 'A'     |

---

## **Non-Primitive Data Type**

Non-primitive data types store references (addresses) to objects, not actual values.

### **Examples**

* String
* Class
* Object
* Interface
* Array

---

## **Key Characteristics**

* Created by user or Java libraries
* can store multiple values
* Stored in heap memory
* More complex than primitive types

---

## **Example**

```java
String name = "Java";
int[] numbers = {1, 2, 3};
```

---

## **Primitive vs Non-Prmitive**

| Feature | Primitive    | Non-Primitive |
| ------- | ------------ | ------------- |
| Stores  | Actual value | Reference     |
| Memory  | Stack        | Heap          |
| Size    | Fixed        | Dynamic       |
| Example | int, char    | String, Array |
