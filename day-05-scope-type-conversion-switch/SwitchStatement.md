# ***Switch Statement in Java***

---

## **Definition**

The `switch` statement is a **multi-way decision control structure** used to execute one block of code among multiple options.

👉 It is an alternative to **long if-else-if ladders** 

---

# 🔥 Syntax

---

```java id="sw1"
switch(expression){
    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

---

# 🧠 Core Working

---

1. Expression is evaluated once
2. Compared with each `case`
3. Matching case executes
4. Execution continues until `break`

---

# 🔥 Supported Data Types

---

```text id="swtypes"
byte, short, int, char, String, enum
Wrapper classes (Integer, Character, etc.)
```

👉 ❌ Not supported: `float`, `double`
👉 ⚠ `long` not traditionally supported in classic switch 

---

# 🔥 Example (Basic)

---

```java id="sw2"
int day = 2;

switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}
```

---

# 🔥 Break Statement (Critical)

---

## **Definition**

Stops execution of switch block.

---

## ❗ Without Break (Fall Through)

```java id="sw3"
int x = 2;

switch(x){
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    case 3:
        System.out.println("Three");
}
```

---

## **Output**

```text id="sw4"
Two
Three
```

👉 Execution continues after match → **fall-through behavior** 

---

# 🔥 Multiple Cases (Grouped Cases)

---

```java id="sw5"
int day = 2;

switch(day){
    case 1:
    case 2:
    case 3:
        System.out.println("Weekday");
        break;

    case 6:
    case 7:
        System.out.println("Weekend");
        break;
}
```

---

# 🔥 Default Case

---

## **Definition**

Executes when no case matches.

---

## **Important**

✔ Optional
✔ Can be placed anywhere
✔ Executes only if no match

---

```java id="sw6"
switch(x){
    default:
        System.out.println("Default");
    case 1:
        System.out.println("One");
}
```

---

# 🔥 Constant Expression Rule 

---

## ❗ Rule

```text id="rulec"
Case values must be constants
```

---

## ❌ Invalid

```java id="sw7"
int x = 2;
int y = 1;

switch(x){
    case x + y: // ❌ error
}
```

---

## ✅ Valid

```java id="sw8"
switch(x){
    case 1 + 1: // ✅ constant
}
```

---

# 🔥 Nested Switch

---

```java id="sw9"
int year = 2;
String branch = "CSE";

switch(year){
    case 2:
        switch(branch){
            case "CSE":
                System.out.println("ML");
                break;
        }
}
```

---

# 🔥 Enum in Switch

---

```java id="sw10"
enum Day { MON, TUE }

Day d = Day.MON;

switch(d){
    case MON:
        System.out.println("Monday");
}
```

👉 Improves **type safety**

---

# 🔥 Wrapper Classes in Switch

---

```java id="sw11"
Integer age = 25;

switch(age){
    case 25:
        System.out.println("Age 25");
}
```

---

# 🔥 Modern Switch (Java 14+)

---

## **Arrow Syntax**

```java id="sw12"
int day = 2;

String result = switch(day){
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid";
};
```

---

## **Advantages**

✔ No break needed
✔ Cleaner syntax
✔ Less error-prone

---

# 🔥 Switch Expression with Block

---

```java id="sw13"
int day = 2;

String result = switch(day){
    case 1 -> {
        yield "Monday";
    }
    default -> "Invalid";
};
```

---

# 🔥 Important Rules

---

## **1. Expression evaluated once**

---

## **2. Case must be constant**

---

## **3. break prevents fall-through**

---

## **4. default is optional**

---

## **5. Order of cases does not matter**

---

# 🔥 Common Mistakes

---

❌ Missing break → unintended fall-through
❌ Using variable in case
❌ Using unsupported types (float, double)
❌ Forgetting default case

---

# 🔥 Complete Example

---

```java id="sw14"
class Test {

    public static void main(String[] args){

        int day = 5;
        String result;

        switch(day){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 5:
                result = "Friday";
                break;
            default:
                result = "Invalid";
        }

        System.out.println(result);
    }
}
```

---

# 🚀 Quick Summary

---

* Switch = multi-way branching
* Uses constant case values
* break avoids fall-through
* Supports int, char, String, enum
* Modern switch is cleaner

---

👉 Switch = **clean alternative to multiple if-else**

---
