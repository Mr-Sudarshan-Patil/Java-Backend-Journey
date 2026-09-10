# 📘 Day 4 — Java Command-Line Arguments

Today I learned about **Command-Line Arguments in Java**.

Command-line arguments allow us to pass values to a Java program when running it from the terminal.

---

## 📌 1. What are Command-Line Arguments?

Command-line arguments are values that we provide to a Java program **while running the program**.

### Example

```bash
java Demo Rahul 20
```

Here:

```text
Rahul
20
```

are command-line arguments.

Java receives these arguments through:

```java
public static void main(String[] args)
```

---

# 📌 2. `String[] args`

The `args` parameter is an **array of Strings**.

```java
public static void main(String[] args)
```

Every value entered from the command line initially comes into the program as a **String**.

For example:

```bash
java Demo Rahul 20 5.8 true
```

Java receives:

```text
args[0] → "Rahul"
args[1] → "20"
args[2] → "5.8"
args[3] → "true"
```

Even `20`, `5.8`, and `true` are initially Strings.

---

# 📌 3. Accessing Arguments

Arguments are accessed using an index.

Remember:

> Array indexing starts from `0`.

Example:

```bash
java Demo Rahul 20 BCA
```

| Index | Value |
|---|---|
| `args[0]` | Rahul |
| `args[1]` | 20 |
| `args[2]` | BCA |

### Program

```java
class Demo {
    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
```

### Output

```text
Rahul
20
BCA
```

---

# 📌 4. `args.length`

`args.length` tells us **how many command-line arguments were provided**.

Example:

```bash
java Demo Rahul 20 BCA
```

There are 3 arguments.

Therefore:

```java
System.out.println(args.length);
```

Output:

```text
3
```

### Important

In Java, the program name is **not included** in `args`.

So:

```bash
java Demo Rahul 20
```

means:

```text
args.length = 2

args[0] = Rahul
args[1] = 20
```

---

# 📌 5. Simple Example

### Program: `Student`

```java
class Student {
    public static void main(String[] args) {

        System.out.println("Name: " + args[0]);
        System.out.println("Age: " + args[1]);
        System.out.println("Course: " + args[2]);
    }
}
```

Run:

```bash
java Student Rahul 20 BCA
```

Output:

```text
Name: Rahul
Age: 20
Course: BCA
```

---

# 📌 6. Why Does Everything Come as String?

The declaration is:

```java
String[] args
```

This means:

> `args` is an array that stores Strings.

Therefore:

```bash
java Demo Rahul 20 5.5 true
```

becomes:

```text
"Rahul" → String
"20"    → String
"5.5"   → String
"true"  → String
```

Java does **not automatically know** that `"20"` should be an integer.

---

# 📌 7. Converting String to `int`

Use:

```java
Integer.parseInt()
```

### Example

```java
class Demo {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);

        System.out.println("Age: " + age);
    }
}
```

Run:

```bash
java Demo 20
```

Output:

```text
Age: 20
```

---

# 📌 8. Converting String to `float`

Use:

```java
Float.parseFloat()
```

### Example

```java
class Demo {
    public static void main(String[] args) {

        float price = Float.parseFloat(args[0]);

        System.out.println("Price: " + price);
    }
}
```

Run:

```bash
java Demo 99.5
```

Output:

```text
Price: 99.5
```

---

# 📌 9. Converting String to `double`

Use:

```java
Double.parseDouble()
```

### Example

```java
class Demo {
    public static void main(String[] args) {

        double price = Double.parseDouble(args[0]);

        System.out.println("Price: " + price);
    }
}
```

Run:

```bash
java Demo 999.99
```

Output:

```text
Price: 999.99
```

---

# 📌 10. Converting String to `boolean`

Use:

```java
Boolean.parseBoolean()
```

### Example

```java
class Demo {
    public static void main(String[] args) {

        boolean status = Boolean.parseBoolean(args[0]);

        System.out.println("Status: " + status);
    }
}
```

Run:

```bash
java Demo true
```

Output:

```text
Status: true
```

---

# 📌 11. Common Conversions

| Required Type | Method |
|---|---|
| `int` | `Integer.parseInt()` |
| `float` | `Float.parseFloat()` |
| `double` | `Double.parseDouble()` |
| `long` | `Long.parseLong()` |
| `boolean` | `Boolean.parseBoolean()` |

### Remember

```text
Command-line argument
        ↓
     String
        ↓
    Conversion
        ↓
Required data type
```

---

# 📌 12. Real-World Example — Employee

### Program: `EmployeeDetails`

```java
class EmployeeDetails {
    public static void main(String[] args) {

        String name = args[0];
        int id = Integer.parseInt(args[1]);
        float salary = Float.parseFloat(args[2]);
        String department = args[3];

        System.out.println("===== Employee Details =====");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
```

Run:

```bash
java EmployeeDetails Rahul 101 35000.50 IT
```

Output:

```text
===== Employee Details =====
Name: Rahul
ID: 101
Salary: 35000.5
Department: IT
```

---

# 📌 13. Real-World Example — Product

### Program: `ProductDetails`

```java
class ProductDetails {
    public static void main(String[] args) {

        String name = args[0];
        int id = Integer.parseInt(args[1]);
        float price = Float.parseFloat(args[2]);
        boolean available = Boolean.parseBoolean(args[3]);

        System.out.println("===== Product Details =====");
        System.out.println("Product: " + name);
        System.out.println("ID: " + id);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}
```

Run:

```bash
java ProductDetails Laptop 101 55000.50 true
```

---

# 📌 14. Command-Line Arguments + `if/else`

We can also use converted values with conditions.

### Example: Pass or Fail

```java
class Result {
    public static void main(String[] args) {

        String name = args[0];
        int marks = Integer.parseInt(args[1]);

        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
```

Run:

```bash
java Result Rahul 75
```

Output:

```text
Student: Rahul
Marks: 75
Result: Pass
```

---

# 📌 15. Command-Line Arguments + Calculation

### Example: Shopping Bill

```java
class ShoppingBill {
    public static void main(String[] args) {

        String product = args[0];
        float price = Float.parseFloat(args[1]);
        int quantity = Integer.parseInt(args[2]);

        float total = price * quantity;

        System.out.println("Product: " + product);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);
    }
}
```

Run:

```bash
java ShoppingBill Shoes 1500 3
```

Output:

```text
Product: Shoes
Price: 1500.0
Quantity: 3
Total: 4500.0
```

---

# 🧠 Important Things I Learned

### 1. Main method

```java
public static void main(String[] args)
```

### 2. First argument

```java
args[0]
```

### 3. Second argument

```java
args[1]
```

### 4. Number of arguments

```java
args.length
```

### 5. Arguments are Strings

```java
String[] args
```

### 6. Convert String to integer

```java
Integer.parseInt(args[0])
```

### 7. Convert String to float

```java
Float.parseFloat(args[0])
```

### 8. Convert String to double

```java
Double.parseDouble(args[0])
```

### 9. Convert String to boolean

```java
Boolean.parseBoolean(args[0])
```

---

# ⚠️ Common Mistakes

### Mistake 1 — Forgetting that indexing starts at 0

Wrong:

```java
args[1]
```

for the first argument.

Correct:

```java
args[0]
```

---

### Mistake 2 — Treating numbers as numbers automatically

This:

```java
args[0]
```

is a String.

If you need an integer:

```java
Integer.parseInt(args[0])
```

---

### Mistake 3 — Not providing enough arguments

If your program uses:

```java
args[0]
args[1]
args[2]
```

you need to provide at least 3 arguments.

For example:

```bash
java Demo Rahul 20 BCA
```

---

# 📝 Day 4 Practice

Try these without looking at the solution:

### Beginner

1. `StudentDetails`
   - Name
   - Age
   - Course

2. `EmployeeDetails`
   - Name
   - ID
   - Salary
   - Department

3. `ProductDetails`
   - Product name
   - ID
   - Price
   - Available

### Intermediate

4. `ShoppingBill`
   - Product
   - Price
   - Quantity
   - Calculate total

5. `StudentMarks`
   - Name
   - 3 subject marks
   - Calculate total and average

6. `EmployeeBonus`
   - Name
   - Salary
   - Performance (`true/false`)
   - Give a bonus when performance is true

7. `Result`
   - Name
   - Marks
   - Print Pass/Fail

---

# 🎯 Quick Revision

```text
java Demo Rahul 20 5.5 true
          ↓     ↓   ↓    ↓
        args[0] args[1] args[2] args[3]

args[0] → "Rahul"
args[1] → "20"
args[2] → "5.5"
args[3] → "true"

args.length → 4
```

### The most important concept:

```text
Command Line
     ↓
String[]
     ↓
args[index]
     ↓
parse if needed
     ↓
int / float / double / boolean
```

---

## 🚀 Day 4 Summary

Today I learned:

- What command-line arguments are
- `String[] args`
- `args[index]`
- `args.length`
- Why arguments come as Strings
- String → `int`
- String → `float`
- String → `double`
- String → `boolean`
- Using command-line arguments with `if/else`
- Using command-line arguments in simple calculations
- Building simple real-world programs using command-line arguments