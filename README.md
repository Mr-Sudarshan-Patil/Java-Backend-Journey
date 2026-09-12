# 📘 My Java Backend Learning Journey

Hi! This repository is my daily learning log while I learn **Java** and backend development, under the mentorship of [Suresh Bishnoi](https://www.linkedin.com/in/bishnoisuresh/) Sir.

---

## 🗓️ Day 1 – Java Basics

I learned why Java is used so widely in the industry:

| Feature | What it means (in simple words) |
|---|---|
| ✅ Platform Independent | Java code runs on any OS (Windows, Mac, Linux) without changes, because of the JVM. |
| ✅ Object Oriented (OOPs) | We build programs using "objects" (like real-world things), which keeps code organized and reusable. |
| ✅ Automatic Garbage Collection | Java automatically removes unused objects from memory. We don't have to clean up manually. |
| ✅ Secure | Java doesn't allow direct memory access, which lowers the risk of harmful code. |
| ✅ JIT Compilation | The Just-In-Time compiler converts bytecode to machine code at run time, making programs faster. |
| ✅ Free to Use | Anyone can download and use Java without paying, which is why it's so widely adopted. |

I also wrote and successfully **compiled my first Java program**. Our instructor also told us to use **draw.io** to make architecture diagrams for every topic. This is helping me a lot — I understand concepts by *seeing* the flow, not just reading about it.

---

## 🗓️ Day 2 – How Java Works Internally

Today I learned the **full execution flow** of a Java program:

```
Java Source Code → Compiler → Bytecode → JVM → Output
```

![Java Execution Flow](assets/Day2.png)

I also practiced some basic rules:
- Every statement in Java ends with a **semicolon `;`**
- Java is **case-sensitive** (`Main` and `main` are different)

I solved some practice questions to make sure I understood these rules properly, and I made my own version of this diagram in draw.io.

I'm also uploading all my practice code to GitHub every day to stay consistent — something I already built as a habit during my JavaScript days, and now I'm carrying it into this Java/backend journey.

---

## 🗓️ Day 3 – Structure and Flow of a Java Program

Today I focused on understanding the **basic structure** of a Java program, especially the `main()` method.

### 🚪 The "Entry Point" Idea
Just like a house needs a door to enter, a Java program needs the **`main()`** method as the entry point — this is where the JVM starts running the code.

![Main Method Entry Point](assets/Day3.jpg)

### 🛠️ Basic Development Flow
```
Requirement Understanding → Design → Development → Build (Compile) → Execute / Run & Test
```

As a practice example, I created an **`Account`** class to represent customer details (like in an SBI Net Banking example) and printed that information using Java.

### 🔑 New Concepts I Learned Today
- `public`, `private`, and `default` (access modifiers — who can use the code)
- **Identifiers** (the names we give to classes, methods, variables)
- `static` keyword (belongs to the class, not to a single object)
- `void` (method that doesn't return any value)
- `main()` (the entry point method)
- `String[] args` (used to pass values into the program from outside)

I wrote a small program combining all these concepts together, instead of just reading the theory — this made it much easier to understand.

---

# [How Java Memory Works with Primitive and Non-Primitive Types](Java%20Memory%20%28Stack%20Or%20Heap%29/README.md)
# [Static vs Dynamic](static-vs-dynamic/static.md)
# [Understanding of JIT and Interpreter with full Architecture](Understanding%20Of%20JIT/README.md)
---
# [Day 4 Command-Line Arguments](Day%204/Day4-Java-Command-Line.md)

---
# Java Data Types

Today I learned about **Data Types**, their **range**, **bits**, **bytes**, **default values**, **local variables**, **class/static variables**, and **wrapper classes** in Java.

---

## 1. What is a Data Type?

A **data type** tells Java what type of value a variable can store.

Example:

```java
int age = 20;
```

- `int` → Data Type
- `age` → Variable
- `20` → Value

Simple definition:

> **Data type means the type of data that a variable can store.**

---

## 2. Java Primitive Data Types

Java has **8 primitive data types**:

```text
byte
short
int
long
float
double
char
boolean
```

### Data Type, Bits, Bytes and Range

| Data Type | Bits | Bytes | Range / Values | Default Value |
|---|---:|---:|---|---|
| `byte` | 8 | 1 | -128 to 127 | `0` |
| `short` | 16 | 2 | -32,768 to 32,767 | `0` |
| `int` | 32 | 4 | -2³¹ to 2³¹ - 1 | `0` |
| `long` | 64 | 8 | -2⁶³ to 2⁶³ - 1 | `0` |
| `float` | 32 | 4 | Decimal numbers | `0.0f` |
| `double` | 64 | 8 | Decimal numbers | `0.0d` |
| `char` | 16 | 2 | 0 to 65,535 | `\u0000` |
| `boolean` | Not fixed by Java | JVM-dependent | `true` / `false` | `false` |

### Easy way to remember

```text
byte    →  8 bits  → 1 byte
short   → 16 bits  → 2 bytes
int     → 32 bits  → 4 bytes
long    → 64 bits  → 8 bytes

float   → 32 bits  → 4 bytes
double  → 64 bits  → 8 bytes

char    → 16 bits  → 2 bytes
boolean → true / false
```

---

## 3. byte Range Example

The range of `byte` is:

```text
-128 to 127
```

This is valid:

```java
byte amount = 127;
System.out.println(amount);
```

Output:

```text
127
```

But this is not valid:

```java
byte amount = 128;
```

Because `128` is outside the `byte` range.

Java gives an error such as:

```text
incompatible types: possible lossy conversion from int to byte
```

---

## 4. Class/Static Variable

In simple language, we can call a variable declared outside a method a **global variable**.

But in proper Java terminology, it is better to call it a **class variable/field**.

If it has `static`, it is called a **static variable**.

Example:

```java
public class DataType
{
    static int number;

    public static void main(String args[])
    {
        System.out.println(number);
    }
}
```

Output:

```text
0
```

Why?

Because Java automatically gives a default value to a class/static variable.

For example:

```text
int     → 0
float   → 0.0f
double  → 0.0d
boolean → false
char    → \u0000
```

---

## 5. Local Variable

A local variable is declared inside a method, constructor, or block.

Example:

```java
public class DataType
{
    public static void main(String args[])
    {
        short number = 2000;

        System.out.println(number);
    }
}
```

Output:

```text
2000
```

### Important Point

Local variables **do not get default values**.

Example:

```java
public class DataType
{
    public static void main(String args[])
    {
        short number;

        System.out.println(number);
    }
}
```

This gives an error:

```text
variable number might not have been initialized
```

So:

```text
Class/Static Variable → gets default value
Local Variable        → must be initialized before use
```

---

## 6. Wrapper Classes

A **wrapper class** is a class that represents a primitive data type as an object.

### Primitive → Wrapper Class

```text
byte    → Byte
short   → Short
int     → Integer
long    → Long
float   → Float
double  → Double
char    → Character
boolean → Boolean
```

### Simple Example

```java
public class DataType
{
    public static void main(String args[])
    {
        // Primitive data type
        int num = 45;

        System.out.println(num);

        // Wrapper class
        Integer num30 = 45;

        System.out.println(num30);
    }
}
```

Output:

```text
45
45
```

Here:

```text
int     → primitive data type
Integer → wrapper class
```

---

## 7. Float and Integer Example

```java
public class DataType
{
    public static void main(String args[])
    {
        // Primitive
        float price = 667.0f;
        System.out.println(price);

        // Wrapper class
        Float num45 = 667.0f;
        System.out.println(num45);

        // Primitive
        int num = 45;
        System.out.println(num);

        // Wrapper class
        Integer num30 = 45;
        System.out.println(num30);
    }
}
```

Output:

```text
667.0
667.0
45
45
```

Remember:

```text
float   → primitive
Float   → wrapper class

int     → primitive
Integer → wrapper class
```

---

## 8. Autoboxing and Unboxing

Java can automatically convert between primitive values and wrapper objects.

### Autoboxing

Primitive → Wrapper object

```java
int num = 45;
Integer number = num;
```

This is called **autoboxing**.

### Unboxing

Wrapper object → Primitive

```java
Integer number = 45;
int num = number;
```

This is called **unboxing**.

---

# Today's Important Points

- **Data type** tells Java what type of value a variable can store.
- Java has **8 primitive data types**.
- `byte`, `short`, `int`, and `long` store whole numbers.
- `float` and `double` store decimal numbers.
- `char` stores a single character.
- `boolean` stores `true` or `false`.
- `byte` range is **-128 to 127**.
- Class/static variables get **default values automatically**.
- Local variables **do not get default values**.
- A local variable must be initialized before we use it.
- `Integer` is a wrapper class for `int`.
- `Float` is a wrapper class for `float`.
- Primitive → Wrapper is called **autoboxing**.
- Wrapper → Primitive is called **unboxing**.

---
⭐ *Consistency over perfection — one concept, one day at a time.*
