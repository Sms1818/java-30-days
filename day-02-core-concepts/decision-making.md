# ***Decision Making In Java (Conditional Statements)***

---

## **Defination**

Decision-making in Java allows execution of different blocks of code based on conditions. It controls the flow of the program.

---

## **What is Decision Making?**

It is the process of executing specific code only when a given condition is satisfied.

---

## **Types of Decision-Making Statements**

1. if statement
2. if-else statement
3. nested-if
4. if-else-if ladder
5. switch-case
6. ternary operator

---

## **if Statement**

Executes code only if condition is true.

### **Syntax**

```java
if(condition){
    // code
}
```

---

## **if-else Statement**

Executes one block if true, another if false.

### **Syntax**

```java
if(condition){
    // true block
}else{
    // false block
}
```

---

## **Nested if**

An if inside another if.

### **Use Case**

When second condition depends on first.

---

## **if-else-if Ladder**

Used for multiple conditions.

### **Syntax**

```java
if(condition1){
}else if(condition2){
}else{
}
```

---

## **Switch Case**

Used for multiple fixed values.

### **Syntax**

```java
switch(expression){
    case value:
        break;
    default:
}
```

---

## **Ternary Operator**

Shortcut for if-else.

### **Syntax**

```java
condition ? value1 : value2;
```

---

## **Key Characteristics**

* Controls program flow
* Reduces unnecessary execution
* Improves readability
* switch is faster for multiple exact matches 

---

## **if-else vs switch (Interview Focus)**

| Feature     | if-else              | switch-case     |
| ----------- | -------------------- | --------------- |
| Use Case    | Conditions, ranges   | Exact values    |
| Readability | Good for few cases   | Better for many |
| Performance | Slower (many checks) | Faster          |
| Flexibility | High                 | Limited         |

## **Quick Summary**

* if → single condition
* if-else → two paths
* ladder → multiple conditions
* switch → exact matches
* ternary → shorthand

---
