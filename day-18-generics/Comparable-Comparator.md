# ***Comparable vs Comparator in Java***

---

# 🔥 **Why Do We Need Comparable & Comparator?**

---

## 🧠 Problem

Java can sort primitive types easily:

```java
int[] arr = {5, 2, 8};
Arrays.sort(arr);
```

---

But for custom objects:

```java
class Student {
    int age;
    String name;
}
```

👉 Java doesn’t know **how to compare objects**

---

## ✅ Solution

```text id="c1"
Comparable → Natural sorting  
Comparator → Custom sorting  
```

---

---

# 🔥 **1. Comparable Interface**

---

## **Definition**

Comparable is used to define **natural ordering of objects** inside the class itself.

---

## 🧠 Method

```java
int compareTo(T obj)
```

---

## 🔹 **Rules**

```text id="c2"
return 0 → equal  
return negative → this < obj  
return positive → this > obj  
```

---

---

## 🔥 **Example: Sort Students by Age**

---

```java id="c3"
import java.util.*;

class Student implements Comparable<Student> {

    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(25, "Alex"));
        list.add(new Student(20, "Brian"));
        list.add(new Student(22, "Chris"));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.age + " " + s.name);
        }
    }
}
```

---

## 🧠 Output (Sorted by Age)

```text id="c4"
20 Brian  
22 Chris  
25 Alex  
```

---

---

# 🔥 **Key Characteristics of Comparable**

---

✔ Defined inside class
✔ Only one sorting logic possible
✔ Used for **default sorting**

---

---

# 🔥 **2. Comparator Interface**

---

## **Definition**

Comparator is used to define **custom sorting logic outside the class**.

---

## 🧠 Method

```java
int compare(T o1, T o2)
```

---

---

## 🔥 **Example: Sort by Name**

---

```java id="c5"
import java.util.*;

class Student {

    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(25, "Alex"));
        list.add(new Student(20, "Brian"));
        list.add(new Student(22, "Chris"));

        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        for (Student s : list) {
            System.out.println(s.name);
        }
    }
}
```

---

## 🧠 Output (Sorted by Name)

```text id="c6"
Alex  
Brian  
Chris  
```

---

---

# 🔥 **Modern Approach (Lambda – Important)**

---

```java id="c7"
Collections.sort(list, (s1, s2) -> s1.age - s2.age);
```

---

👉 Cleaner and preferred in interviews

---

---

# 🔥 **Multiple Sorting Using Comparator**

---

## 🔹 Sort by Age

```java
Comparator<Student> byAge = (a, b) -> a.age - b.age;
```

---

## 🔹 Sort by Name

```java
Comparator<Student> byName = (a, b) -> a.name.compareTo(b.name);
```

---

👉 You can switch sorting anytime

---

---

# 🔥 **Comparable vs Comparator (VERY IMPORTANT)**

---

| Feature     | Comparable   | Comparator    |
| ----------- | ------------ | ------------- |
| Package     | java.lang    | java.util     |
| Method      | compareTo()  | compare()     |
| Location    | Inside class | Outside class |
| Sorting     | Single       | Multiple      |
| Flexibility | Less         | More          |

---

---

# 🔥 **Internal Usage in Collections**

---

## 🔹 TreeSet / TreeMap

```text id="c8"
Use Comparable by default  
Use Comparator if provided  
```

---

---

# 🔥 **Advanced Example**

---

## 🔹 Sort by Age, then Name

```java id="c9"
Collections.sort(list, (a, b) -> {
    if (a.age != b.age) {
        return a.age - b.age;
    }
    return a.name.compareTo(b.name);
});
```

---

---

# 🔥 **Common Mistakes**

---

❌ Returning boolean instead of int
❌ Not handling equality
❌ Using subtraction → may overflow

---

---

# 🔥 **Best Practice (Important)**

---

```java id="c10"
Comparator<Student> comp =
    Comparator.comparingInt(s -> s.age)
              .thenComparing(s -> s.name);
```

---

👉 Clean and readable

---

---

# 🔥 **Interview Questions**

---

## 🔹 1. Difference between Comparable & Comparator?

```text id="c11"
Comparable → natural order  
Comparator → custom order  
```

---

---

## 🔹 2. Can we have multiple sorting logics?

```text id="c12"
Yes → using Comparator
```

---

---

## 🔹 3. What happens if compareTo returns 0?

```text id="c13"
Elements treated as equal
```

---

---

## 🔹 4. Which is used in TreeSet?

```text id="c14"
Comparable by default  
Comparator if provided  
```

---

---

# 🚀 **Final Summary**

---

* Comparable → inside class
* Comparator → outside class
* Comparator is more flexible
* Used heavily in sorting & collections

---

```text id="c15"
Comparable = default sorting  
Comparator = customizable sorting
```

---

👉 Essential for **collections, sorting, and interviews**

---
