# ***Loops in Java***

---

## **Defination**

Loops in java allow a set of instructions to execute repeatedly based on a condition.

---

## **What is a Loop?**

A loop is used to execute a block of code multiple times until a condition becomes false.

---

## **Types of Loops**

1. for loop
2. enhanced for loop (for each)
3. while loop
4. do-while loop

---

## **1. for loop**

Used when number of iterations is known.

### **Syntax**

```java
for(intialization; condition; increment/decrement){
    //code
}
```

---

## **2. for-each Loop**

Used to iterate over arrays or collections.

### **Syntax**

```java
for(dataType variable : array){
    // code
}
```

---

## **3. while Loop**

Executes code while condition is true.

### **Syntax**

```java
while(condition){
    // code
}
```

---

## **4. do-while Loop**

Executes code at least once before checking condition.

### **Syntax**

```java
do{
    // code
}while(condition);
```

---

## **Key Characteristics**

* for → fixed iterations
* while → condition-based
* do-while → executes at least once
* for-each → used for collections

---

## **When to use for loop and while loop**

* 1. For loop: Used when the number of iterations is known or count-based.
* 2. While loop: Used when iterations are not known and execution depends on a condition.

**Note**: Both loops work internally in the same way; the difference lies in their usage and readability.

---

## **When to use while loop and do-while loop**

* 1. While loop: Used when the condition needs to be checked before executing the loop body and the loop may not run at all if the condition is false.
* 2. Do-while loop: Used when the loop must execute at least once, even if the condition is false.

**Note**: Both loops are condition-based, but while is an entry-controlled loop and do-while is an exit-controlled loop.

---

## **Common Mistakes**

* Infinite loops (missing condition update)
* Off-by-one errors
* Modifying loop variable inside loop
* Empty loop body

---

## **Quick Summary**

* for → known iterations
* while → condition first
* do-while → execute then check
* for-each → iterate collections

---
