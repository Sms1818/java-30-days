# ***Association, Aggregation and Composition in Java***

---

# 🔥 **Definition**

In Object-Oriented Programming, relationships between classes define how objects interact with each other.

> Java models these relationships using **Association, Aggregation, and Composition** 

---

# 🧠 **Core Idea**

```text
Association → Uses-A (general relationship)
Aggregation → Has-A (weak ownership)
Composition → Part-Of (strong ownership)
```

---

# 🔥 **1. Association**

---

## **Definition**

Association is a relationship where **two independent classes interact with each other**.

---

## 🧠 **Key Characteristics**

✔ No ownership
✔ Independent lifecycle
✔ Loose coupling

---

## **Example**

```java
class Heart {
    void beat() {
        System.out.println("Heart beating");
    }
}

class Doctor {
    void check(Heart heart) {
        heart.beat(); // just using
    }
}
```

---

## 🧠 **Explanation**

👉 `Doctor` only **uses** `Heart`
👉 No storage, no ownership

✔ **Conclusion: Association**

---

# 🔥 **2. Aggregation**

---

## **Definition**

Aggregation is a **special type of association** where one class **has another class as a member**, but both can exist independently.

---

## 🧠 **Key Characteristics**

✔ Weak ownership
✔ Independent lifecycle
✔ Moderate coupling

---

## **Example**

```java
class Heart {
    Heart() {
        System.out.println("Heart created");
    }
}

class Person {
    private Heart heart;

    Person(Heart heart) {
        this.heart = heart; // passed from outside
    }
}

public class Main {
    public static void main(String[] args) {
        Heart h = new Heart();
        Person p = new Person(h);
    }
}
```

---

## 🧠 **Explanation**

👉 `Heart` is created outside
👉 `Person` just holds reference

✔ **Conclusion: Aggregation**

---

# 🔥 **3. Composition**

---

## **Definition**

Composition is a **strong form of aggregation** where the contained object **cannot exist independently**.

---

## 🧠 **Key Characteristics**

✔ Strong ownership
✔ Dependent lifecycle
✔ Tight coupling

---

## **Example**

```java
class Heart {
    Heart() {
        System.out.println("Heart created");
    }
}

class Person {
    private Heart heart;

    Person() {
        heart = new Heart(); // created inside
    }
}
```

---

## 🧠 **Explanation**

👉 `Heart` is created inside `Person`
👉 Cannot exist independently

✔ **Conclusion: Composition**

---

# 🔥 **Detailed Understanding**

---

## 🧠 **Single Scenario: Person & Heart**

---

### 🔴 **Composition (Strong Relationship)**

```java
class Heart {
    Heart() {
        System.out.println("Heart created");
    }
}

class Person {
    private Heart heart;

    Person() {
        heart = new Heart();
    }
}
```

👉 Created inside
👉 Strong dependency

---

### 🟡 **Aggregation (Weak Relationship)**

```java
class Heart {
    Heart() {
        System.out.println("Heart created");
    }
}

class Person {
    private Heart heart;

    Person(Heart heart) {
        this.heart = heart;
    }
}
```

👉 Created outside
👉 Independent

---

### 🔵 **Association (Usage Only)**

```java
class Heart {
    void beat() {
        System.out.println("Heart beating");
    }
}

class Doctor {
    void check(Heart heart) {
        heart.beat();
    }
}
```

👉 Only used
👉 No ownership

---

# 🔥 **Key Differentiation Table**

---

| Case        | Creation     | Storage | Dependency | Type |
| ----------- | ------------ | ------- | ---------- | ---- |
| Composition | Inside class | Yes     | Strong     | 🔴   |
| Aggregation | Outside      | Yes     | Weak       | 🟡   |
| Association | Outside      | No      | None       | 🔵   |

---

# 🧠 **Memory Trick**

---

```text
Creates → Composition
Receives → Aggregation
Uses → Association
```

---

# 🔥 **Lifecycle Understanding**

---

👉 Always ask:

```text
Who creates the object?
Who owns it?
Can it exist independently?
```

---

# 🔥 **Real-World Examples**

---

| Concept     | Example               |
| ----------- | --------------------- |
| Association | Doctor ↔ Patient      |
| Aggregation | Department → Students |
| Composition | House → Rooms         |

---

# 🔥 **Differences Summary**

---

| Feature      | Association | Aggregation | Composition |
| ------------ | ----------- | ----------- | ----------- |
| Relationship | Uses-A      | Has-A       | Part-Of     |
| Ownership    | None        | Weak        | Strong      |
| Lifecycle    | Independent | Independent | Dependent   |
| Coupling     | Loose       | Moderate    | Tight       |

---

# 🔥 **When to Use What**

---

## ✅ Use Association When:

✔ Objects just interact
✔ No ownership needed

---

## ✅ Use Aggregation When:

✔ One object contains another
✔ But both can exist independently

---

## ✅ Use Composition When:

✔ Strong ownership exists
✔ Lifecycle dependency required

---

# 🔥 **Common Mistakes**

---

❌ Treating aggregation and composition as same
❌ Ignoring lifecycle
❌ Thinking syntax defines relationship

---

# 🚀 **Quick Summary**

---

* Association → uses-a
* Aggregation → weak has-a
* Composition → strong part-of

---

```text
Association → Aggregation → Composition
(Weak → Strong relationship)
```

---

👉 Relationship is defined by **object creation + lifecycle + ownership**, not just code structure.

---
