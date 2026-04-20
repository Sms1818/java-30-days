# ***Map Interface in Java***

---

# 🔥 **What is Map?**

---

## **Definition**

Map is a data structure that stores elements in the form of **key-value pairs**, where:

```text id="m1"
Key → Unique  
Value → Can be duplicate  
```

---

# 🧠 **Core Idea**

```text id="m2"
Map = Key → Value mapping (like dictionary)
```

---

# 🔥 **Important Characteristics**

---

✔ Keys are unique
✔ Values can repeat
✔ Not part of Collection interface
✔ No index-based access

---

---

# 🔥 **How Map Works (Conceptual)**

---

```text id="m3"
Key → Hash → Index → Bucket → Value
```

---

👉 Map uses **hashing or tree structures** internally

---

---

# 🔥 **Common Implementations**

---

* HashMap
* LinkedHashMap
* TreeMap
* Hashtable (legacy)
* ConcurrentHashMap

---

---

# 🔥 **1. HashMap**

---

## 🔹 **Definition**

HashMap stores key-value pairs using **hashing for fast access**.

---

## 🧠 **Internal Overview**

```text id="m4"
Array + Hash Function + Buckets
```

---

## 🔥 **How put() Works (Overview)**

---

```text id="m5"
1. hashCode(key)  
2. Calculate index  
3. Go to bucket  
4. Insert or update  
```

---

## 🔥 **Collision Handling**

---

```text id="m6"
Same index → multiple entries
```

---

👉 Handling:

```text id="m7"
LinkedList → Tree (after threshold)
```

---

---

## 🔥 **Resizing**

---

```text id="m8"
Load factor = 0.75  
If exceeded → capacity doubles  
```

---

---

## 🔥 **Time Complexity**

---

| Operation | Complexity |
| --------- | ---------- |
| Put       | O(1)       |
| Get       | O(1)       |

---

👉 Worst case → O(n)

---

---

## ❗ **Important Points**

---

```text id="m9"
Allows 1 null key  
Allows multiple null values  
No ordering guarantee  
```

---

---

## 🔥 **When to Use HashMap**

---

✔ Fast access required
✔ No ordering needed

---

---

# 🔥 **2. LinkedHashMap**

---

## 🔹 **Definition**

LinkedHashMap maintains **insertion order** of elements.

---

## 🧠 **Internal Structure**

```text id="m10"
HashMap + Doubly Linked List
```

---

---

## 🔥 **Behavior**

---

```text id="m11"
Maintains order using linked list
```

---

---

## ❗ **Important Insight**

---

```text id="m12"
Slightly slower than HashMap
```

---

---

## 🔥 **When to Use**

---

✔ Order matters
✔ Still want fast access

---

---

# 🔥 **3. TreeMap**

---

## 🔹 **Definition**

TreeMap stores data in **sorted order based on keys**.

---

## 🧠 **Internal Structure**

```text id="m13"
Red-Black Tree
```

---

---

## 🔥 **Behavior**

---

```text id="m14"
Automatically sorts keys
```

---

---

## 🔥 **Time Complexity**

---

| Operation | Complexity |
| --------- | ---------- |
| Put       | O(log n)   |
| Get       | O(log n)   |

---

---

## ❗ **Important Points**

---

```text id="m15"
No null key allowed  
Uses Comparable / Comparator  
```

---

---

## 🔥 **When to Use TreeMap**

---

✔ Sorted data required
✔ Range operations

---

---

# 🔥 **4. Hashtable (Legacy)**

---

## 🔹 **Definition**

Hashtable is a **synchronized version of HashMap**.

---

## ❗ **Issues**

---

```text id="m16"
Slower due to full synchronization  
No null key/value allowed  
```

---

👉 Rarely used

---

---

# 🔥 **5. ConcurrentHashMap**

---

## 🔹 **Definition**

Thread-safe map designed for **high-performance concurrent access**.

---

## 🧠 **Internal Idea**

```text id="m17"
Fine-grained locking (not full lock)
```

---

---

## 🔥 **Behavior**

---

✔ Multiple threads can access safely
✔ Better performance than Hashtable

---

---

## 🔥 **When to Use**

---

✔ Multithreading
✔ High-performance systems

---

---

# 🔥 **Comparison Table (VERY IMPORTANT)**

---

| Feature     | HashMap | LinkedHashMap | TreeMap | ConcurrentHashMap |
| ----------- | ------- | ------------- | ------- | ----------------- |
| Order       | No      | Insertion     | Sorted  | No                |
| Null Key    | Yes     | Yes           | No      | No                |
| Thread-safe | No      | No            | No      | Yes               |
| Performance | Fast    | Medium        | Slow    | Fast              |

---

---

# 🔥 **Key Internal Concepts Summary**

---

```text id="m18"
HashMap → Hashing  
LinkedHashMap → Hash + Linked List  
TreeMap → Tree (Sorted)  
ConcurrentHashMap → Thread-safe hashing  
```

---

---

# 🔥 **Important Interview Questions**

---

## 🔹 1. Difference between HashMap and TreeMap?

```text id="m19"
HashMap → fast  
TreeMap → sorted  
```

---

---

## 🔹 2. Why HashMap is O(1)?

```text id="m20"
Direct bucket access using hash
```

---

---

## 🔹 3. Why collisions occur?

```text id="m21"
Different keys → same index
```

---

---

## 🔹 4. Why TreeMap is slower?

```text id="m22"
Tree operations (log n)
```

---

---

# 🔥 **Code Example**

---

```java id="m23"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(1, "C"); // update

        System.out.println(map.get(1)); // C
    }
}
```

---

---

# 🚀 **Final Summary**

---

* Map = key-value pairs
* HashMap = fastest
* LinkedHashMap = ordered
* TreeMap = sorted
* ConcurrentHashMap = thread-safe

---

```text id="m24"
Choose based on:
Order + Sorting + Concurrency + Performance
```

---

👉 Map is about **efficient data retrieval using keys**

---
