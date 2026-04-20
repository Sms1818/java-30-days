# ***Queue Interface in Java***

---

# 🔥 **What is Queue?**

---

## **Definition**

Queue is a data structure that follows the **FIFO (First-In-First-Out)** principle, where elements are inserted at the **rear** and removed from the **front**.

---

# 🧠 **Core Idea**

```text id="q1"
FIFO → First element inserted is the first to be removed
```

---

# 🔥 **Key Properties**

---

```text id="q2"
Order → FIFO  
Duplicates → Allowed  
Null → Not allowed in most implementations  
```

---

---

# 🔥 **Queue Interface Methods**

---

## 🔹 **Insertion**

| Method  | Behavior                 |
| ------- | ------------------------ |
| add()   | throws exception if full |
| offer() | returns false if full    |

---

## 🔹 **Removal**

| Method   | Behavior                  |
| -------- | ------------------------- |
| remove() | throws exception if empty |
| poll()   | returns null if empty     |

---

## 🔹 **Access**

| Method    | Behavior         |
| --------- | ---------------- |
| element() | throws exception |
| peek()    | returns null     |

---

---

# 🔥 **Important Insight**

---

```text id="q3"
offer/poll/peek → safer methods (no exception)
```

---

---

# 🔥 **Main Implementations**

---

* PriorityQueue
* ArrayDeque
* LinkedList
* BlockingQueue (Concurrent)

---

---

# 🔥 **1. PriorityQueue**

---

## 🔹 **Definition**

PriorityQueue orders elements based on **priority**, not FIFO.

---

## 🧠 **Internal Structure**

```text id="q4"
Binary Heap (Min Heap by default)
```

---

---

## 🔥 **How It Works**

---

```text id="q5"
Smallest element always at root
```

---

👉 Insert → heapify up
👉 Remove → heapify down

---

---

## 🔥 **Time Complexity**

---

| Operation | Complexity |
| --------- | ---------- |
| Insert    | O(log n)   |
| Remove    | O(log n)   |
| Peek      | O(1)       |

---

---

## ❗ **Important Points**

---

```text id="q6"
Not FIFO  
No null allowed  
Order depends on priority  
```

---

---

## 🔥 **Custom Ordering**

---

```java id="q7"
PriorityQueue<Integer> pq =
    new PriorityQueue<>((a, b) -> b - a); // max heap
```

---

---

## 🔥 **When to Use**

---

✔ Scheduling tasks
✔ Dijkstra / graphs
✔ Top-K problems

---

---

# 🔥 **2. ArrayDeque**

---

## 🔹 **Definition**

ArrayDeque is a **resizable array-based double-ended queue**.

---

## 🧠 **Internal Structure**

```text id="q8"
Circular Array
```

---

---

## 🔥 **How It Works**

---

```text id="q9"
Head and tail pointers move in circular manner
```

---

👉 Efficient insertion/removal at both ends

---

---

## 🔥 **Time Complexity**

---

| Operation  | Complexity |
| ---------- | ---------- |
| Add/Remove | O(1)       |

---

---

## ❗ **Important Points**

---

```text id="q10"
Faster than Stack and LinkedList  
No null allowed  
```

---

---

## 🔥 **When to Use**

---

✔ Stack replacement
✔ Queue + Deque operations
✔ High performance required

---

---

# 🔥 **3. LinkedList (as Queue)**

---

## 🔹 **Definition**

LinkedList can implement Queue using **FIFO operations**.

---

## 🧠 **Internal Structure**

```text id="q11"
Doubly Linked List
```

---

---

## 🔥 **Behavior**

---

```text id="q12"
Insert at tail  
Remove from head  
```

---

---

## 🔥 **Time Complexity**

---

| Operation | Complexity |
| --------- | ---------- |
| Add       | O(1)       |
| Remove    | O(1)       |

---

---

## ❗ **Important Insight**

---

```text id="q13"
Higher memory usage due to node pointers
```

---

---

## 🔥 **When to Use**

---

✔ Frequent insert/remove
✔ No need for contiguous memory

---

---

# 🔥 **4. BlockingQueue (Concurrent)**

---

## 🔹 **Definition**

BlockingQueue is a **thread-safe queue** that blocks operations when:

---

```text id="q14"
Queue full → producer waits  
Queue empty → consumer waits  
```

---

---

## 🔥 **Internal Concept**

---

```text id="q15"
Uses locks + wait/notify mechanism
```

---

---

## 🔥 **Types**

---

* ArrayBlockingQueue
* LinkedBlockingQueue

---

---

## 🔥 **Time Complexity**

---

| Operation | Complexity |
| --------- | ---------- |
| Insert    | O(1)       |
| Remove    | O(1)       |

---

---

## 🔥 **When to Use**

---

✔ Producer–Consumer problem
✔ Multithreading
✔ Task queues

---

---

# 🔥 **5. ConcurrentLinkedQueue**

---

## 🔹 **Definition**

A **non-blocking, thread-safe queue**.

---

## 🧠 **Internal Concept**

---

```text id="q16"
Lock-free (CAS - Compare And Swap)
```

---

---

## ❗ **Important Points**

---

```text id="q17"
No blocking  
High performance  
Eventually consistent  
```

---

---

## 🔥 **When to Use**

---

✔ High concurrency
✔ Non-blocking systems

---

---

# 🔥 **Comparison Table**

---

| Feature     | PriorityQueue | ArrayDeque | LinkedList  | BlockingQueue |
| ----------- | ------------- | ---------- | ----------- | ------------- |
| Order       | Priority      | FIFO       | FIFO        | FIFO          |
| Structure   | Heap          | Array      | Linked List | Array/List    |
| Thread-safe | No            | No         | No          | Yes           |
| Performance | log n         | O(1)       | O(1)        | O(1)          |

---

---

# 🔥 **Internal Behavior Summary**

---

```text id="q18"
PriorityQueue → Heap  
ArrayDeque → Circular Array  
LinkedList → Doubly Linked List  
BlockingQueue → Lock-based  
ConcurrentLinkedQueue → Lock-free  
```

---

---

# 🔥 **Edge Cases / Interview Points**

---

## 🔹 1. Why PriorityQueue not FIFO?

```text id="q19"
Because ordering is based on priority
```

---

---

## 🔹 2. Why ArrayDeque faster than Stack?

```text id="q20"
No synchronization overhead
```

---

---

## 🔹 3. Difference between BlockingQueue & ConcurrentLinkedQueue?

```text id="q21"
Blocking → waits  
Concurrent → non-blocking  
```

---

---

## 🔹 4. Why null not allowed?

```text id="q22"
To avoid ambiguity in poll()/peek()
```

---

---

# 🔥 **Code Example**

---

```java id="q23"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q.poll()); // 10
    }
}
```

---

---

# 🚀 **Final Summary**

---

* Queue = FIFO structure
* PriorityQueue = priority-based
* ArrayDeque = fastest general-purpose
* BlockingQueue = thread-safe
* ConcurrentLinkedQueue = lock-free

---

```text id="q24"
Choose based on:
Order + Performance + Concurrency
```

---

👉 Queue is critical for **system design + concurrency + algorithms**

---
