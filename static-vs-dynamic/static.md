# Static vs Dynamic Typing

> Simple and beginner-friendly notes about how programming languages check data types.

---

## Table of Contents

- [1. What is Typing](#1-what-is-typing)
- [2. Static Typing](#2-static-typing)
- [3. Dynamic Typing](#3-dynamic-typing)
- [4. Static vs Dynamic Typing](#4-static-vs-dynamic-typing)
- [5. Examples of Languages](#5-examples-of-languages)
- [6. Advantages and Disadvantages](#6-advantages-and-disadvantages)
- [7. Easy Example](#7-easy-example)
- [8. Quick Summary](#8-quick-summary)

---

## 1. What is Typing?

**Typing** means how a programming language handles the **data type of a value**.

Examples of data types:

- `int` → integer number
- `float` → decimal number
- `char` → single character
- `boolean` → `true` or `false`
- `String` → text

The main difference is **when the language checks the type**.

```text
Static Typing  →  Type checking at Compile Time
Dynamic Typing →  Type checking at Runtime
```

---

# 2. Static Typing

A **statically typed language** performs **type checking at compile time**.

### Main Points

- Type checking is performed at **compile time**.
- Data types are usually **declared before using variables**.
- The compiler knows the expected type of a variable.
- Type-related errors can be found **before the program runs**.
- It provides more control over data types.
- It can make large programs easier to maintain.
- It may require more writing because types are specified explicitly.

### Example Language

**Java** is a statically typed language.

If a variable is declared as an integer, Java expects an integer value for that variable.

Trying to assign a String value to an integer variable causes a **compile-time type error**.

### Simple Flow

```text
Write Code
    ↓
Compiler checks types
    ↓
Type error?
   ↙   ↘
 Yes    No
 ↓       ↓
Error   Program can run
```

### Easy Definition

> **Static typing = Type checking happens before the program runs.**

---

# 3. Dynamic Typing

A **dynamically typed language** performs **type checking at runtime**.

### Main Points

- Type checking is performed at **runtime**.
- You do not usually need to declare the data type of a variable.
- A variable can hold different types of values at different times.
- The code can be shorter and more flexible.
- Some type errors may not be found until the program is actually run.
- This flexibility can make development faster.
- Runtime type errors can occur if an operation is used with an unexpected type.

### Example Languages

**Python** and **JavaScript** are commonly treated as dynamically typed languages.

A variable can be assigned a value without explicitly declaring its type.

For example, a variable can first hold a number and later hold text.

### Simple Flow

```text
Write Code
    ↓
Program starts running
    ↓
Runtime checks types
    ↓
Type error?
   ↙   ↘
 Yes    No
 ↓       ↓
Error   Program continues
```

### Easy Definition

> **Dynamic typing = Type checking happens while the program runs.**

---

# 4. Static vs Dynamic Typing

| Feature | Static Typing | Dynamic Typing |
|---|---|---|
| Type checking | Compile time | Runtime |
| Data type declaration | Usually required/explicit | Usually not required |
| Type errors | Can be caught before execution | May appear during execution |
| Flexibility | Less flexible | More flexible |
| Code writing | Usually more explicit | Usually shorter |
| Example | Java, C++ | Python, JavaScript |

---

# 5. Examples of Languages

## Static Typed Languages

Common examples:

- Java
- C
- C++
- C#
- Go
- Rust

These languages perform type checking before the program executes, although the exact typing rules differ between languages.

## Dynamic Typed Languages

Common examples:

- Python
- JavaScript
- Ruby
- PHP

These languages perform important type checks during program execution.

---

# 6. Advantages and Disadvantages

## Static Typing

### Advantages

- Type errors can be detected early.
- Errors are often found before the program runs.
- Types make code easier to understand.
- Helpful for large codebases.
- IDEs and compilers can provide better type-related feedback.

### Disadvantages

- More type information may need to be written.
- Code can feel less flexible.
- Small changes may require type-related updates.

---

## Dynamic Typing

### Advantages

- Less code for declaring types.
- Faster and easier to start writing.
- More flexible variables.
- Useful for rapid development and scripting.

### Disadvantages

- Some type errors appear only at runtime.
- Large codebases can become harder to reason about without good practices.
- Debugging type-related runtime errors can take more time.

---

# 7. Easy Example

Imagine a variable named `age`.

### Static Typing

```text
age → integer
```

The language knows that `age` is expected to contain an integer.

If you try to put text into it, the compiler can report a type error before execution.

```text
Compile Time
     ↓
Check type
     ↓
Wrong type → Error
```

### Dynamic Typing

```text
age → 20
```

The variable can later hold another type of value.

The language checks whether an operation is valid when the program runs.

```text
Runtime
   ↓
Check type
   ↓
Wrong operation → Runtime Error
```

---

# 8. Quick Summary

```text
STATIC TYPING
      ↓
Type checking at COMPILE TIME
      ↓
Types are usually declared
      ↓
Errors can be found before execution
      ↓
Example: Java
```

```text
DYNAMIC TYPING
      ↓
Type checking at RUNTIME
      ↓
No need to explicitly declare variable types
      ↓
Errors may appear while running
      ↓
Examples: Python, JavaScript
```

## ⭐ Easy Rule to Remember

> **Static → Check early → Compile time**
>
> **Dynamic → Check later → Runtime**

### One-Line Memory Trick

```text
Static  = Compile Time Checking
Dynamic = Runtime Checking
```

---

## Important Note

**Static vs dynamic typing is about when type checking happens.**

It should not be confused with whether a language is compiled or interpreted. Modern programming languages can use different combinations of compilation, interpretation, and runtime techniques.
