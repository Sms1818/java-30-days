# ***HashMap Internal Working in Java ***

---

# 🔥 **What is HashMap?**

---

## **Definition**

HashMap is a **hash-based data structure** that stores data in **key-value pairs** and provides **constant-time (O(1)) average access**.

---

# 🧠 **Core Idea**

```text
HashMap = Array (Buckets) + Hash Function + Collision Handling
```

---

# 🔥 **Internal Structure**

---

```text
Node<K,V>[] table  → Array of buckets

Each bucket:
→ LinkedList (Java 7)
→ LinkedList / Red-Black Tree (Java 8+)
```

---

## 🔹 **Node Structure**

```text
class Node<K,V> {
    int hash;
    K key;
    V value;
    Node next;
}
```

---

---

# 🔥 **How put(key, value) Works (Step-by-Step)**

---

```text
1. Compute hashCode(key)
2. Apply hash() function (bit manipulation)
3. Calculate index = (n - 1) & hash
4. Go to bucket
```

---

## 🔹 Case 1: Bucket is Empty

```text
→ Insert new node
```

---

## 🔹 Case 2: Bucket Not Empty (Collision)

```text
→ Traverse bucket
   → If key exists (equals()) → update value
   → Else → add new node
```

---

---

# 🔥 **Hash Function (IMPORTANT)**

---

## **Why Not Direct hashCode()?**

```text
To reduce collisions and spread keys uniformly
```

---

## **Actual Logic**

```java
hash = key.hashCode();
hash ^= (hash >>> 16);
```

---

👉 This improves distribution across buckets

---

---

# 🔥 **Index Calculation**

---

```text
index = (n - 1) & hash
```

---

## ❗ Why NOT % operator?

```text
Bitwise AND is faster than modulo
```

---

---

# 🔥 **Collision Handling**

---

## 🔹 **What is Collision?**

```text
Different keys → same bucket index
```

---

## 🔹 **Handling Mechanism**

---

### Java 7:

```text
LinkedList only
```

---

### Java 8+:

```text
If bucket size > 8 → convert to Red-Black Tree
If size < 6 → back to LinkedList
```

---

## 🔹 **Why Tree?**

```text
LinkedList → O(n)
Tree → O(log n)
```

---

---

# 🔥 **Load Factor**

---

## **Definition**

```text
Load Factor = size / capacity
```

---

## 🔹 Default:

```text
0.75
```

---

## 🔹 Meaning:

```text
Resize when 75% full
```

---

---

# 🔥 **Resizing (Rehashing)**

---

## 🔹 When Happens?

```text
size > capacity × load factor
```

---

## 🔹 Steps:

```text
1. Capacity doubles
2. New array created
3. All entries rehashed
4. Placed into new buckets
```

---

## ❗ **Important Insight**

```text
Rehashing = O(n) operation
```

---

---

# 🔥 **Treeification Conditions (ADVANCED)**

---

```text
Bucket size > 8  
AND table size ≥ 64
```

---

👉 Otherwise → resize instead

---

---

# 🔥 **get(key) Working**

---

```text
1. Compute hash
2. Find index
3. Go to bucket
4. Traverse:
   → Match hash
   → Match equals()
5. Return value
```

---

---

# 🔥 **Time Complexity**

---

| Operation | Average | Worst |
| --------- | ------- | ----- |
| Put       | O(1)    | O(n)  |
| Get       | O(1)    | O(n)  |

---

👉 Worst case avoided by treeification

---

---

# 🔥 **Important Behaviors**

---

## 🔹 **Null Handling**

```text
1 null key allowed  
Multiple null values allowed  
```

---

---

## 🔹 **Key Comparison**

---

```text
1. hashCode() → bucket  
2. equals() → exact match
```

---

👉 Both must be correctly overridden

---

---

# 🔥 **Important Constants (Interview Level)**

---

```text
DEFAULT_INITIAL_CAPACITY = 16  
DEFAULT_LOAD_FACTOR = 0.75  
TREEIFY_THRESHOLD = 8  
UNTREEIFY_THRESHOLD = 6  
MIN_TREEIFY_CAPACITY = 64  
```

---

---

# 🔥 **Java 7 vs Java 8 Difference**

---

| Feature     | Java 7        | Java 8            |
| ----------- | ------------- | ----------------- |
| Collision   | LinkedList    | LinkedList + Tree |
| Performance | O(n) worst    | O(log n)          |
| Resize bug  | Possible loop | Fixed             |

---

---

# 🔥 **Resize Bug (Java 7 – Advanced)**

---

```text
During resize → LinkedList could form cycle  
→ Infinite loop in multi-threading
```

---

👉 Fixed in Java 8

---

---

# 🔥 **Concurrency Behavior**

---

## ❗ HashMap is NOT thread-safe

---

### Problems:

```text
Race conditions  
Data corruption  
Infinite loop (Java 7)
```

---

### Solution:

```text
Use ConcurrentHashMap
```

---

---

# 🔥 **Why HashMap is Fast**

---

```text
Direct bucket access using hash
```

---

👉 No traversal like list/tree (in average case)

---

---

# 🔥 **Common Interview Questions**

---

## 🔹 1. Why equals() needed if hashCode exists?

```text
hashCode → bucket  
equals → exact key match
```

---

---

## 🔹 2. Why load factor 0.75?

```text
Balance:
Memory vs Performance
```

---

---

## 🔹 3. Why tree after 8 elements?

```text
To avoid O(n) → improve to O(log n)
```

---

---

## 🔹 4. Why capacity is power of 2?

```text
To use bitwise AND for fast indexing
```

---

---

## 🔹 5. What happens if hashCode is poor?

```text
More collisions → performance degrades
```

---

---

# 🔥 **Code Example**

---

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(1, "C"); // update existing key

        System.out.println(map.get(1)); // C
    }
}
```

---

---

# 🚀 **Final Summary**

---

* HashMap uses hashing for fast access
* Buckets handle collisions
* Tree improves worst-case performance
* Resizing ensures efficiency

---

```text
Performance = Hash Function + Distribution + Load Factor
```

---

👉 HashMap is a **core data structure for interviews**

---
