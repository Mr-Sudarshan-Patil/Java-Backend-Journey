# 📘 My Java Backend Learning Journey

Hi! This repository is my daily learning log while I learn **Java** and backend development, under the mentorship of [Suresh Bishnoi](https://www.linkedin.com/in/bishnoisuresh/) Sir.

---
# [All Test Questions](Exams/README.md)
---
## 🗓️ Java Basics

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

## 🗓️  How Java Works Internally

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

## 🗓️  Structure and Flow of a Java Program

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
# [Command-Line Arguments](Day%204/Day4-Java-Command-Line.md)

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

# Java Variables 

## What is a variable?

Variable is a container to hold some information.

Example: create a variable and give it a value.

```
int balance = 200;
```

Here `balance` is name of container, `int` is type, `200` is value stored in it.

---

## Three types of variable

There are three type of variable in Java:

1. Instance variable
2. Static variable
3. Local variable

Small diagram to remember:

```
        VARIABLE
           |
   --------------------
   |         |        |
Instance   Static   Local
(object)   (class)  (method/block)
```

---

## 1. Instance Variable

- Belongs to object, not to class.
- Every object create his own copy of it.
- Think of it as schema (design) of every object created by that class. Each object fill that schema with its own value.

Example:

```java
class Account
{
    // Instance variable
    String name = "Sudarshan Patil";
    int accountBalance = 2500;
}
```

Diagram:

```
class Account (schema: name, accountBalance)

  acc1 --> name="Ram"    balance=1000
  acc2 --> name="Sita"   balance=2500
  acc3 --> name="Sudarshan" balance=2500
```

Each object (acc1, acc2, acc3...) has its own copy. Changing one object's value does not affect other object.

**Why we need instance variable:**
Suppose bank has 1000 users. Every user has common identity like name, age, accountBalance. If we don't use class/object concept and try to make 1000 x 3 separate variables manually, it will take too much effort and space. Instead we write the variable once inside class (as instance variable), and every object created from that class automatically gets its own copy. We write once, use many times, each with its own value.

To access instance variable, we must first create an object:

```java
Account acc = new Account();
System.out.println(acc.name);
System.out.println(acc.accountBalance);
```

---

## 2. Static Variable

- Belongs to class, not to object.
- Shared by entire class, but used within the boundary of that class.
- Same value is accessed by everyone, no separate copy for each object.

Example:

```java
class Account
{
    static int interest = 3;
    static int productAmount = 200;
}
```

Diagram:

```
class Account
   static interest = 3%   <-- only ONE copy exists

acc1 --> uses interest (3%)
acc2 --> uses interest (3%)
acc3 --> uses interest (3%)
```

**Why we need static variable:**
Bank gives same rate of interest to every account, like 3%. We don't want every object to have its own separate copy of interest, because it is common for all. So we define it once as static, and every object/class use the same value.

Access static variable directly with class name (no need to create object):

```java
System.out.println(Account.interest);
```

Also static method can be called without object:

```java
Account.doSomething(); // no need "new Account()" 
```

But non-static (instance) method needs an object:

```java
Account acc = new Account();
acc.doNothing(); // need object to call
```

---

## 3. Local Variable

- Declared inside a method or block.
- Only accessible inside that method/block. Cannot be used outside it.

Example:

```java
public static void main(String args[])
{
    int amount = 100; // local variable, only for main method
    System.out.println(amount);
}
```

If we try to use this local variable in another method, it will give error, because scope of local variable ends with that method/block.

```java
static void localCheck(){
    // System.out.println(amount); // ERROR - cannot find symbol
    // "amount" was declared inside main(), not visible here
}
```

Diagram:

```
main()  { int amount = 100;  }   <-- amount lives only here
                 |
                 X   (not visible outside)
                 |
localCheck() { }   <-- cannot see "amount"
```

**Important point:** Java forces us to initialize local variable before use. If we don't give value to local variable and try to use it, compiler will give error. This is different from instance/static variable, which get default value automatically (like 0, null, false) even if we don't assign anything.

---

## Quick comparison table

| Type     | Belongs to | Copy per object? | Default value if not set | Access without object? |
|----------|-----------|-------------------|---------------------------|--------------------------|
| Instance | Object    | Yes, each object gets own copy | Yes (auto) | No, need object |
| Static   | Class     | No, one copy shared by all | Yes (auto) | Yes, ClassName.variable |
| Local    | Method/Block | N/A, exists only during method call | No, must initialize manually | N/A, only inside method |

---

## One more example - calling static method from main

```java
public static void main(String args[])
{
    doSomething();          // works because main() itself is static,
                             // and belongs to same class, so no object needed

    Account.doSomething();  // this is more clear way - ClassName.methodName()
                             // since method is static, we call using class name

    acc.doNothing();        // doNothing() is NOT static
                             // so we must create object first: Account acc = new Account();
}
```

Simple rule to remember:

```
static method/variable   -->  call using ClassName
instance method/variable -->  call using object (new ClassName())
```
---
# Java Methods

Simple notes from the Java session, with the unrelated classroom conversation removed.

## 1. What is a Method?

A **method** is a block of code used to perform a specific task.

```java
void printMessage() {
    System.out.println("Hello");
}
```

### Why use methods?

- Organize code
- Reuse code
- Keep `main()` simple
- Perform a specific task

> Write the logic inside methods instead of putting everything inside `main()`.

---

## 2. Basic Method Structure

```java
returnType methodName(parameters) {

    // logic

    return value;
}
```

Example:

```java
boolean doTransaction(int amount,
                      String senderAccount,
                      String receiverAccount) {

    // business logic

    return true;
}
```

### Parts of a Method

```text
boolean              → return type
doTransaction        → method name
int amount           → parameter
String senderAccount → parameter
String receiverAccount → parameter
{ }                  → method body
return true          → return value
```

---

## 3. Parameters

**Parameters** are inputs received by a method.

```java
int add(int a, int b) {
    return a + b;
}
```

Here:

```text
a and b → parameters
```

When calling the method:

```java
add(10, 20);
```

`10` and `20` are the values passed to the method.

---

## 4. Return Type

The return type tells what type of value the method returns.

### `int`

```java
int add(int a, int b) {
    return a + b;
}
```

### `boolean`

```java
boolean isValid(int age) {
    return age >= 18;
}
```

### `void`

If the method does not return a value:

```java
void printMessage() {
    System.out.println("Hello");
}
```

---

## 5. Calling a Method

### Static Method

A `static` method belongs to the class.

Call it using the class name:

```java
ClassName.methodName();
```

Example:

```java
MathOperations.add(10, 20);
```

### Non-Static Method

A non-static method belongs to an object.

Create an object first:

```java
MathOperations obj = new MathOperations();

obj.add(10, 20);
```

Remember:

```text
static     → class
non-static → object
```

---

## 6. Method Reusability

A major benefit of methods is **code reuse**.

Instead of writing the same logic 100 times:

```text
Write method once
      ↓
Call it many times
```

Example:

```java
int add(int a, int b) {
    return a + b;
}
```

Call it multiple times:

```java
add(10, 20);
add(30, 40);
add(50, 60);
```

The same method is reused with different inputs.

---

## 7. Method Execution Flow

Java starts execution from `main()`.

```text
main()
  ↓
calls method
  ↓
control goes to method
  ↓
method executes
  ↓
return value
  ↓
control comes back to caller
```

Example:

```java
public static void main(String[] args) {

    boolean result = doTransaction(100, "A101", "B202");

    System.out.println(result);
}
```

---

## 8. Example: Fund Transfer

A fund-transfer method may require:

```text
Amount
Sender Account
Receiver Account
```

Example:

```java
boolean doTransaction(int amount,
                      String senderAccount,
                      String receiverAccount) {

    // debit sender
    // credit receiver

    return true;
}
```

Basic idea:

```text
Sender balance = 100
Receiver balance = 200
Transfer      = 10

Sender   → 90
Receiver → 210
```

Total money remains:

```text
90 + 210 = 300
```

---

## 9. Method Types

### Inbuilt Methods

Methods already provided by Java/classes.

Examples:

```java
System.out.println();
Integer.parseInt();
```

### User-Defined Methods

Methods created by the developer.

```java
int add(int a, int b) {
    return a + b;
}
```

---

## 10. Naming Convention

Use **camelCase** for method and variable names.

Correct:

```java
doTransaction();
calculateAmount();
addNumbers();
```

Avoid:

```java
DoTransaction();
calculate_amount();
ADDNUMBERS();
```

Use meaningful names that describe what the method does.

---

## 11. Single Responsibility Principle

A class should have **one main responsibility**.

Example:

```text
FundTransfer
    ↓
Fund transfer functionality
```

Do not mix unrelated functionality into the same class:

```text
Fund transfer
+ Add beneficiary
+ Send SMS
+ Open fixed deposit
+ Notifications
```

Keep related functionality together.

### Simple Rule

```text
One class → One main responsibility
```

---

# Quick Revision

```text
Method
→ Block of code that performs a task

Parameter
→ Input received by method

Return type
→ Type of value returned

void
→ No return value

static
→ Called using class

non-static
→ Called using object

Method reuse
→ Write once, call many times

main()
→ Starting point of program

User-defined method
→ Created by developer

Inbuilt method
→ Already provided by Java

camelCase
→ Method and variable naming convention

Single Responsibility
→ One class should have one main responsibility
```

## Practice

Create methods for:

1. Add two numbers
2. Subtract two numbers
3. Calculate discount
4. Check whether a number is even
5. Calculate fund transfer
6. Return `true` / `false` based on a condition

---

# Java Constructors & Inheritance

Simple notes from today's Java session.  
Only the important technical concepts are included.

---

## 1. Constructor

A **constructor** is used to initialize an object.

### Rules

- Constructor name must be the same as the class name.
- It has **no return type**.
- It runs when an object is created.

```java
class User {

    String name;
    String country;

    User(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
```

---

## 2. Default Constructor

A constructor without parameters:

```java
User() {
}
```

If no constructor is written at all, Java can provide a default constructor automatically.

If you create your own parameterized constructor, Java does **not** automatically provide the no-argument constructor.

---

## 3. Parameterized Constructor

A constructor that receives values:

```java
User(String name, String country) {
    this.name = name;
    this.country = country;
}
```

Object creation:

```java
User u = new User("Sudarshan", "India");
```

---

## 4. `this`

`this` refers to the **current object**.

```java
this.name = name;
```

Here:

```text
this.name → instance variable
name      → constructor parameter
```

---

## 5. `this()`

`this()` calls another constructor of the **same class**.

```java
class User {

    String name;
    int age;

    User() {
        this("Sudarshan", 27);
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### Flow

```text
User()
  ↓
this("Sudarshan", 27)
  ↓
User(String, int)
```

### Rule

`this()` must be the **first statement** inside the constructor.

---

## 6. Inheritance

Inheritance allows a child class to inherit from a parent class.

```java
class Product {
}

class ElectronicProduct extends Product {
}
```

```text
Product
   ↑
ElectronicProduct
```

`extends` creates the parent-child relationship.

---

## 7. `super()`

`super()` calls the constructor of the **parent class**.

```java
class Product {

    Product(String name, int price, String productId) {
        // initialize common fields
    }
}

class ElectronicProduct extends Product {

    ElectronicProduct(String name, int price, String productId) {
        super(name, price, productId);
    }
}
```

### Remember

```text
this()  → same class constructor
super() → parent class constructor
```

`super()` is used for **constructor chaining** and reusing parent initialization.

---

## 8. Common + Specific Fields

A parent class should contain fields common to all products.

```text
Product
├── name
├── price
└── productId
```

A child class can contain fields specific to its type.

```text
ElectronicProduct
└── warranty
```

Example:

```java
class Product {

    String name;
    int price;
    String productId;

    Product(String name, int price, String productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }
}

class ElectronicProduct extends Product {

    String warranty;

    ElectronicProduct(String name, int price,
                      String productId, String warranty) {

        super(name, price, productId);
        this.warranty = warranty;
    }
}
```

### Benefit

`super()` avoids repeating the parent initialization code.

---

## 9. Constructor Chaining

**Constructor chaining** means one constructor calls another constructor.

```text
this()  → constructor in same class
super() → constructor in parent class
```

Important:

```text
this() / super()
      ↓
must be first statement
```

---

## 10. Constructor Cannot Update an Existing Object

A constructor is used when creating an object.

```java
Product p = new Product("Phone", 50000, "P001");
```

You do not call the constructor again on the same object to update it.

For updating an existing object, use a method/setter.

---

## 11. Calling a Parent Method

A child class inherits accessible methods from the parent.

```java
class Test {

    void printTest() {
        System.out.println("Hello");
    }
}

class Driver extends Test {
}
```

You can call:

```java
Driver d = new Driver();
d.printTest();
```

If you specifically want to call the **parent version** of a method:

```java
class Driver extends Test {

    void callParentMethod() {
        super.printTest();
    }
}
```

### Remember

```text
super()          → parent constructor
super.method()   → parent method
```

---

## 12. `Driver extends Test` Example

```java
class Test {

    String name;
    int age;

    Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Test() {
        this("Sudarshan", 27);
    }

    void printTest() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Driver extends Test {

    void callPrint() {
        super.printTest();
    }

    public static void main(String[] args) {
        Driver d = new Driver();
        d.callPrint();
    }
}
```

### Flow

```text
new Driver()
     ↓
parent constructor
     ↓
Test()
     ↓
this("Sudarshan", 27)
     ↓
Test(String, int)
     ↓
name and age initialized
     ↓
super.printTest()
     ↓
parent method executes
```

---

## 13. Java Comments / Documentation

Comments help other developers understand code without reading every line.

### Single-line comment

```java
// This creates a user object
```

### Multi-line comment

```java
/*
   This class represents a user.
*/
```

### JavaDoc

```java
/**
 * Represents a user in the application.
 */
class User {
}
```

JavaDoc is useful for documenting classes and methods.

---

# Quick Revision

```text
Constructor
→ Initialize object

this
→ Current object

this()
→ Same class constructor

extends
→ Inheritance

super()
→ Parent constructor

super.method()
→ Parent method

Constructor chaining
→ One constructor calls another

Parent class
→ Common fields / behavior

Child class
→ Specific fields / behavior
```

## Most Important

```text
this()  = SAME CLASS
super() = PARENT CLASS
```

---
# Java Constructors

This repository contains Java practice and notes on **Constructors, Constructor Chaining, `this()`, and `super()`**.

## Topics Covered

- What is a Constructor?
- Constructor creation and initialization
- `this()` constructor call
- `super()` constructor call
- Constructor Chaining
- `this` vs `super`
- Parent and Child classes
- Common and specific properties
- Practical use of `this()`
- Practical use of `super()`
- Constructor access modifiers
- Constructor vs object update

---

## 1. What is a Constructor?

A constructor is used to **create an object and initialize its state**.

### Rules

- Constructor name must be the same as the class name.
- Constructor does not have a return type.
- Constructor executes when an object is created.

```java
class Test {

    String name;
    int age;

    Test(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Creating an object:

```java
Test t = new Test("Sudarshan", 27);
```

---

## 2. `this()`

`this()` is used to call another constructor of the **same class**.

```java
class Test {

    String name;
    int age;

    Test() {
        this("Sudarshan", 27);
    }

    Test(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### Flow

```text
Test()
   ↓
this("Sudarshan", 27)
   ↓
Test(String, int)
```

---

## 3. `super()`

`super()` is used to call the constructor of the **parent class**.

```java
class Product {

    Product(String name, int price) {
        // parent constructor
    }
}

class ElectronicProduct extends Product {

    ElectronicProduct(String name, int price) {
        super(name, price);
    }
}
```

---

## 4. Constructor Chaining

Constructor chaining means:

> **One constructor calls another constructor.**

It can happen using:

```text
this()  → Same class constructor
super() → Parent class constructor
```

### Important Rule

`this()` or `super()` must be the **first statement** inside a constructor.

If neither is written, Java implicitly calls:

```java
super();
```

---

## 5. `this` vs `super`

| `this` | `super` |
|---|---|
| Current/Same class | Parent class |
| `this()` → same class constructor | `super()` → parent constructor |
| `this.name` → current object's variable | `super.name` → parent variable |

### Easy Memory

```text
this  → SAME
super → PARENT
```

---

## 6. Practical Use of `this()`

`this()` can be used to provide **default values** through another constructor.

```java
class User {

    String name;
    String country;

    User() {
        this("Guest", "India");
    }

    User(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
```

Now:

```java
User user = new User();
```

The default values are initialized through constructor chaining.

---

## 7. Practical Use of `super()`

`super()` is useful when the parent class contains **common fields** and the child class contains **specific fields**.

### Parent Class

```java
class Product {

    String name;
    int price;
    String productId;

    Product(String name, int price, String productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }
}
```

### Child Class

```java
class ElectronicProduct extends Product {

    String warranty;

    ElectronicProduct(String name, int price,
                      String productId, String warranty) {

        super(name, price, productId);

        this.warranty = warranty;
    }
}
```

### Structure

```text
Product
├── name
├── price
└── productId
        ↓
ElectronicProduct
└── warranty
```

`super()` initializes the **common parent fields**, while the child constructor initializes its **specific field**.

### Main Benefit

> Avoids duplicate initialization code.

---

## 8. Common vs Specific Properties

Different product types can have different properties.

### Electronic Product

```text
name
price
productId
warranty
```

### Clothing Product

```text
name
price
productId
size
color
```

The common properties can be kept in the parent `Product` class, while specific properties can be kept in child classes.

---

## 9. Constructor is Not Used for Updating

A constructor is used when **creating an object**.

```java
Product p = new Product("Phone", 50000);
```

To update an existing object, use a method/setter instead of trying to call the constructor again.

---

## 10. Constructor Access Modifiers

Constructors follow the same access rules as other class members.

| Modifier | Access |
|---|---|
| `public` | Anywhere |
| `default` | Same package |
| `private` | Same class |
| `protected` | Same package + subclasses |

Example:

```java
public Product() {
}
```

A `public` constructor can be accessed from outside the package.

A default constructor is accessible within the same package.

---

## 11. Quick Revision

```text
Constructor
    ↓
Create + Initialize Object

this()
    ↓
Same Class Constructor

super()
    ↓
Parent Class Constructor

Constructor Chaining
    ↓
One Constructor → Another Constructor

this  = SAME
super = PARENT
```

---

## 12. Interview Question

### What is the difference between `this()` and `super()`?

**Answer:**

`this()` is used to call another constructor of the same class, whereas `super()` is used to call the constructor of the parent class.

---

## Practice

Try creating similar examples using:

- `Netflix User`
- `E-commerce Product`
- `Electronic Product`
- `Clothing Product`
- Another application/domain of your choice

The goal is to understand **why** `this()` and `super()` are used, not just memorize the syntax.

---

## Repository Structure

```text
java-constructors/
│
├── README.md
│
└── src/
    └── com/
        └── constructor/
            ├── Test.java
            ├── Driver.java
            ├── Product.java
            └── ElectronicProduct.java
```

---

## Key Takeaway

```text
this()  → Call constructor in SAME class
super() → Call constructor in PARENT class
```

**Constructor Chaining = Calling one constructor from another constructor.**

---

# Debugging in Eclipse (Java)


**Topics covered today**
1. Constructors (and the default constructor)
2. `this` keyword
3. Instance variable vs static variable
4. `Object` class (parent of all classes)
5. Debugging in Eclipse: breakpoints, F5, F6, F7, F8
6. Problems students faced and how they were fixed

---

## Part 1: Code We Wrote in Class

### 1.1 `Invoice` class (constructor, `this`, instance and static variables)

An invoice is the bill you get by email when you place an order on Amazon. It has: amount, item name, billing address, customer ID, customer name.

```java
public class Invoice {

    // Instance variables: each object gets its OWN copy
    int amount;
    String itemName;
    String billingAddress;
    String customerId;
    String customerName;

    // Static variable: ONE copy, shared by ALL objects
    static int GST = 18;

    // Constructor: used to create the object and set its values
    public Invoice(int _amount, String _itemName, String _billingAddress,
                   String _customerId, String _customerName) {
        this.amount = _amount;
        this.itemName = _itemName;
        this.billingAddress = _billingAddress;
        this.customerId = _customerId;
        this.customerName = _customerName;
    }
}
```

### 1.2 `Driver` class (creates the objects)

The `Driver` class has the `main` method. It creates objects of `Invoice`.

```java
public class Driver {
    public static void main(String[] args) {

        // First customer
        Invoice inv1 = new Invoice(180000, "iPhone 18",
                "BTM 2nd Stage, Bangalore", "C101", "Customer One");

        // Second customer
        Invoice inv2 = new Invoice(5000, "Item 2",
                "Some Address", "C102", "Adair");

        System.out.println("First invoice");
        System.out.println(inv1.amount);
        System.out.println(inv1.customerName);
        System.out.println(Invoice.GST);

        System.out.println("Second invoice");
        System.out.println(inv2.amount);
        System.out.println(inv2.customerName);
        System.out.println(Invoice.GST);

        // Static can be changed (it changes for ALL objects)
        Invoice.GST = 28;
        System.out.println(Invoice.GST);
    }
}
```

### 1.3 `NotificationService` class (used to practice F5, F6, F7, F8)

```java
public class NotificationService {

    public void sendNotification(String type) {
        System.out.println("Start");
        // business logic here
        System.out.println("End");

        if (type.equals("SMS")) {
            sendSMS();
        } else if (type.equals("EMAIL")) {
            sendEmail();
        } else {
            sendWhatsApp();
        }
    }

    private void sendSMS()      { System.out.println("Sending SMS"); }
    private void sendEmail()    { System.out.println("Sending Email"); }
    private void sendWhatsApp() { System.out.println("Sending WhatsApp"); }
}
```

### 1.4 `Driver` for NotificationService

```java
public class Driver {
    public static void main(String[] args) {
        NotificationService obj = new NotificationService();

        obj.sendNotification("SMS");     // first customer
        obj.sendNotification("EMAIL");   // second customer
        obj.sendNotification("OTHER");   // third customer (WhatsApp)
    }
}
```

Only `sendNotification` is `public`, so the Driver calls only that one. The other three are `private`.

---

## Part 2: Constructors

- A **constructor** is used to create an object of a class and set its values.
- If you do **not** write any constructor, the **compiler adds a default constructor** for you.
- If you write **any constructor with parameters**, the default one is **NOT** added.
- **How to prove it (trainer's tip):** do not memorise theory, just try it in code.
  - Call `new Invoice()`. If it works, the default constructor exists.
  - Add a constructor with parameters, then try `new Invoice()` again. It gives an error, so the default is gone.

### What happens when Java runs `new Invoice(180000, "iPhone 18", ...)`
1. Java gets memory on the **heap** for the new object.
2. It **finds the matching constructor** (same number and type of values).
3. The values go into the **local variables** (the parameters).
4. The local values are copied into the **instance variables**.
5. The object is created and the reference (`inv1`) points to it.

---

## Part 3: The `this` Keyword

- `this` means **the current object**.
- `this.amount = _amount;` means: *this object's amount = the value I received.*
- Java works even without `this.` when the names are different, but writing `this.` makes the code **easier to read**. The trainer says to keep it.
- **If the parameter and the instance variable have the same name** and you remove `this.`:
  - Java gives a **warning** ("assignment has no effect").
  - The object is created, but the **field is NOT set**, because Java uses the local variable (it gives preference to local).
- Always use **proper naming** so local variables and instance variables are not confused.

---

## Part 4: Instance Variable vs Static Variable

| | Instance variable | Static variable |
|---|---|---|
| Level | Object level | Class level |
| Copies | **Separate copy for each object** | **One copy** for all objects |
| In our code | `amount`, `itemName`, `customerName` ... | `GST` |
| Real life | Your name, address, amount on your invoice | GST 18% is the same for every customer |

**Seen in the debugger:** `inv1.amount` = 180000 and `inv2.amount` = 5000. Each object has its own values. But `GST` is the same 18 for both, even if you create 1000 invoices.

**Can static be changed?**
- Yes. `Invoice.GST = 28;` changes it for **all** customers from then on.
- If it is declared `final`, you **cannot** change it.

**Why not set GST per customer inside the constructor?**
- If the first customer sets GST to 150, it becomes 150 for everybody. If someone changes it to 250, it becomes 250 for everybody. That is wrong. GST is common to all, so keep it static.

**Order of events:**
1. The class is **loaded** into memory first.
2. **Static** variables are initialised.
3. Then **objects** are created.

---

## Part 5: The `Object` Class

- If your class has **no parent**, **`Object`** is the parent by default.
- If your class has a parent, then `Object` is the **indirect** parent (parent of the parent).
- `Object` is the **name of a class** (capital O). It is **not** "an object of Invoice".
- It is the **root of all Java classes**.
- Java writes this for you even if you don't. `Invoice` is a child of `Object`.
- The keyword **`extends`** is used to build a **relationship between two classes**.
- Trainer's point: a child cannot exist without a parent in real life, and the same is true for Java classes.

---

## Part 6: Debugging in Eclipse

### Why debug?
- Strong fundamentals help you **get** the job.
- Knowing how to **debug** helps you **survive and get promoted**.
- Debug the code you write **every day**.

### What is a breakpoint?
A **breakpoint** is a stop sign on a line of code. The program pauses there so you can look at the variables.

- Double-click on the left bar of a line to add or remove a breakpoint.
- **Window > Show View > Breakpoints** shows all breakpoints in your workspace.
- A breakpoint with a **cross line** is **disabled**. Click it to enable it again.
- You can also remove all breakpoints from this window.
- **Do NOT put a breakpoint on the class line.** That debugs the class loading mechanism, which we don't know yet. Put breakpoints **inside methods** and **constructors**.

### How to start debugging
Right-click the class with `main` > **Debug As** > **Java Application**.

### The 4 keys

| Key | Name | Simple English |
|-----|------|----------------|
| **F6** | Step Over | Go to the **next line** |
| **F5** | Step Into | Go **inside** the method or constructor |
| **F7** | Step Return | **Come back** to the place where the method was called |
| **F8** | Resume | **Jump to the next breakpoint** (if there is no more, the program exits) |

These are **Eclipse** shortcuts. In IntelliJ or other editors the keys may be different, but the 4 ideas are the same: step over, step into, step return, jump to next breakpoint.

### When to use which
- **F6**: you want to move one line at a time.
- **F8**: you have a breakpoint at line 10 and the next one at line 90. Without F8 you would press F6 about 80 times.
- **F5**: you want to look inside a method and it has no breakpoint inside.
- **F7**: you went inside a 100 or 200 line method with F5, and after 3 or 4 lines you see it is fine. Press F7 to go back to where it was called.

### What we saw while debugging `Invoice`
- Put one breakpoint in the constructor and one in `main`.
- **F8** takes you to the constructor breakpoint.
- The **local variables** hold the values you passed (amount 180000, iPhone 18, address, customer ID).
- Press **F6** to see them being copied into the **instance variables**.
- Pressing F8 on that line would run it and exit without showing you. Use **F6** to see inside.
- Pressing **F5** on `new Invoice(...)` goes into constructor internals too (like String handling), so a breakpoint in the constructor is easier.
- With two invoice objects you can see **separate values** for each (180000 and 5000).

### What we saw while debugging `NotificationService`
- **F6** to move to the next line.
- **F5** to go inside a method (`sendNotification`).
- Do not press F5 on `System.out.println(...)`. It is Java's own code and has no problem.
- Hover over a variable to see its value (for example, which customer got SMS).
- **F8** to jump to the next breakpoint.
- **F7** to come back to `main` and continue from there.

### Real-life example the trainer gave
- A customer says, "I'm unable to place an order" or "I'm not getting WhatsApp messages".
- Reading the code alone does not tell you the cause. You need to see the **data**.
- You reproduce the problem, put a breakpoint, and look at the variables and the flow.
- Examples: the order is from a country Amazon does not allow, or the user turned off WhatsApp in their profile page.
- **Breakpoints do not change the order of execution.** They only let you see the internal state and flow of the program.

---

## Part 7: Problems Students Faced in Class

| Problem | Cause | Fix |
|---------|-------|-----|
| **F7 (or other F-key) not working** | Some keyboards share the F-keys with other functions | Try **Fn + F6** and so on, or fix the keyboard setting |
| **Debug does not stop anywhere** | Breakpoint is in a method that **nobody calls** | Call the method from `main` first, then debug |
| **Student called private methods directly from `main`** | Everything was written in one class with its own `main` | Make **two classes**: `NotificationService` (logic) and `Driver` (has `main`). From the Driver call only the **public** `sendNotification` using `obj.sendNotification(...)` |
| **Breakpoint not hit** | Breakpoint disabled or removed | Check **Window > Show View > Breakpoints** |
| **Confused between Run and Debug** | Used Run | Use **Debug As > Java Application** (re-debug, not just re-run) |

**Tip from the trainer:** After you find the problem in one class, **remove the breakpoints** there and put new ones in the **next class** you want to check. You may also keep adding breakpoints while you search.

---

## Quick Cheat Sheet

```
F5 = Step Into   (go inside)
F6 = Step Over   (next line)
F7 = Step Return (come back out)
F8 = Resume      (next breakpoint)

Breakpoint        = double-click on the left bar of a line
Start debugging   = Right-click > Debug As > Java Application
All breakpoints   = Window > Show View > Breakpoints
```

## Practice Given in Class
1. Write the `NotificationService` and `Driver` classes and practice F5, F6, F7, F8.
2. Compare static vs instance variables (about 5 to 7 minutes).
3. Try the default constructor test.
4. Debug something every day.

---
# Control Flow: if, else, else if

## What is control flow?
Your program **decides what to do based on a condition**, just like in life.
*If fare is less than 5000, book flight. Else, go by train.*

- **Condition** = the question (true or false)
- **Logic** = the code that runs when the condition is true

---

## 1. `if`
Code runs **only if** the condition is true.

```java
public class Booking {

    // Max 6 passengers allowed per PNR (IRCTC rule)
    public String book(String from, String to, int numberOfPassengers) {
        String pnr = null;

        if (numberOfPassengers > 6) {
            System.err.println("Only 6 passengers are allowed per PNR");
        }
        return pnr;
    }
}
```

- 7 passengers: condition is **true**, so the message prints.
- 5 passengers: condition is **false**, so the `if` block is skipped.

---

## 2. `if` and `else`
Do **this** or do **that**. Only one of them runs.

```java
if (numberOfPassengers > 6) {
    System.err.println("Only 6 passengers are allowed per PNR");
} else {
    System.out.println("PNR: 12345, Status: Confirmed");
}
```

- 15 passengers: `if` runs, `else` is skipped.
- 5 passengers: `if` is skipped, `else` runs.

---

## 3. `else if` (many conditions)
Use it when you have **more than two choices**. Java checks from top to bottom and runs **only the first one that is true**.

```java
public class TripPlanner {

    public String suggestPlan(String source, String destination, int budget) {
        String suggestion = null;

        if (budget <= 1000) {
            suggestion = "Stay at home";
        } else if (budget > 1000 && budget <= 3000) {
            suggestion = "Visit a place inside the city, like Lalbagh";
        } else if (budget > 3000 && budget <= 5000) {
            suggestion = "Take a taxi to a nearby place";
        } else {
            suggestion = "Visit Goa";   // everything above 5000
        }
        return suggestion;
    }
}
```

```java
public class Driver {
    public static void main(String[] args) {
        TripPlanner planner = new TripPlanner();
        String response = planner.suggestPlan("Bangalore", "Goa", 400);
        System.out.println(response);
    }
}
```

| Budget | Result |
|--------|--------|
| 400 | Stay at home |
| 2100 | Visit a place inside the city |
| 3200 | Taxi to a nearby place |
| 20000 | Visit Goa |

**Remember:** only **one** condition runs per execution. Once one is true, the rest are skipped. The last `else` runs when **nothing else matches**.

---

## Debugging tip from today
Select a condition, press **Ctrl + Shift + I** (Inspect) in debug mode. It shows **true or false**.

Keys used again: **F5** go inside, **F6** next line.

---

## Small points the trainer mentioned
- **Non-static method** = works on an object's data (example: fund transfer).
- **Static method** = just takes inputs and gives an output (example: interest calculation).
- Write **comments** in your code.
- Return a **number** (`int` or `double`) for calculations, not a `String` message.
- Follow **naming rules**: method names start with a **small letter** (`calculateDiscount`).

---

## Task: Make My Trip Discount

| Fare | Discount |
|------|----------|
| 5000 or below | No discount |
| 5001 to 10000 | 10% of the fare |
| Above 10000 | 15% of the fare |
| Any fare | **Maximum discount is 1250** |

**What the trainer wants:**
- Proper class and method names (not everything in one class)
- Clear, readable code with comments
- The method should **return** the discount (not just print it)
- Handle **wrong inputs**, like a negative fare (-1 should not give a discount)

**Extra practice:** make a GST slab example (like Amazon or Flipkart) using `if`, `else if`, `else`.
---

# Arrays and Loops 

Topics, in order: **Array → for loop → while loop → do while → break / continue / return** (plus the Scanner basics needed for `while` practice).

---

# PART 1: ARRAY

## What is an array?
A **container (bucket)** that stores **many values of the same type** under one name.

- Same type only: `int`, `String`, `User`, `Invoice`, and so on.
- Example: a fruit basket. You carry **one basket**, not 100 apples one by one.
- **Why use it?** Everything is grouped as **one unit**, so it is **easy to use and easy to pass around**.
  Real example: a bank finds 1000 customers who did not maintain the minimum balance and keeps them in one array.

## Key facts (very common interview questions)
| Fact | Meaning |
|------|---------|
| **Fixed size** | The size is decided when you create the array. It **cannot grow or shrink** later |
| **Continuous memory** | All elements sit next to each other in memory |
| **Index based** | Every position has an index number |
| **Index starts at 0** | Size 5 means indexes **0, 1, 2, 3, 4** |
| **Default values** | `int` array is filled with **0**. `String` or object array is filled with **null** |
| **`length`** | Gives the size. It is an **attribute**, so **no brackets**: `arr.length` |
| **Read time** | **O(1)**. Java jumps straight to the index and does not scan one by one |

## Create and use an array
```java
public class ArrayDemo {
    public static void main(String[] args) {

        // Create an array that holds 5 integers
        int[] productIds = new int[5];

        // Add values using the index
        productIds[0] = 100;
        productIds[1] = 77;
        productIds[2] = 23;
        productIds[3] = 98;
        productIds[4] = 12;

        // Read values
        System.out.println(productIds[0]);   // 100
        System.out.println(productIds[2]);   // 23
    }
}
```

**Another way (give values directly):**
```java
String[] cities = {"Bangalore", "Chennai", "Mumbai"};
```

**String array example:**
```java
String[] cities = new String[3];
cities[0] = "Bangalore";
cities[1] = "Chennai";
cities[2] = "Mumbai";
```

> `int[]` is a **1D array**. A 2D array has two sets of brackets.

## Array of objects
You can store **your own class objects** in an array.

```java
public class User {
    String name;
    String mobile;

    public User(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
}
```

```java
public class Driver {
    public static void main(String[] args) {
        User user1 = new User("Kodewala", "9999999999");
        User user2 = new User("Amish", "8888888888");

        User[] users = new User[2];   // array of User
        users[0] = user1;
        users[1] = user2;
    }
}
```

**Practice from class:** make another class (Account, Invoice, anything from e-commerce) and store a few objects in an array.

**Tip from the trainer:** debug every line. After about a month it feels easy. In the debugger, a **yellow line** shows what changed.

---

# PART 2: LOOPS

## Why loops?
To **repeat the same logic again and again** without writing it again and again.
Example: checking "is number greater than 21" for 1000 numbers. You write the logic **once** and the loop repeats it.

| Loop | Use when |
|------|----------|
| **for** | You **know** how many times it will run |
| **while** | You **do not know** how many times it will run |
| **do while** | Like `while`, but it must run **at least once** |

---

## 2.1 `for` loop

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);     // prints 0 to 9
}
```

| Part | Name | Meaning |
|------|------|---------|
| `int i = 0` | **Initialization** | Where to start. Runs **only once** |
| `i < 10` | **Condition** | Boundary. Checked **every time** |
| `i++` | **Update** | Change `i` after every round |

### Order of execution (interview favourite)
```
Initialization (once)
   ↓
Condition check → false? → exit loop
   ↓ true
Body (your logic)
   ↓
Update
   ↓
back to Condition check
```
`i` ends at 10, the condition becomes false, and the loop exits. That is why the output stops at 9.

### When to use `for`?
**When you know the input size before starting** (the maximum rounds are fixed).
Examples: an array of 7 cities, 10,000 orders in a list.

### Loop through an array (find cities starting with "S")
```java
String[] cities = {"Bangalore", "Chennai", "Surat", "Mumbai",
                   "Srinagar", "Shimla", "Delhi"};

for (int index = 0; index < cities.length; index++) {
    if (cities[index].startsWith("S")) {
        System.out.println(cities[index]);
    }
}
```
Output: `Surat`, `Srinagar`, `Shimla`

- `cities.length` gives the size (7). **No brackets.**
- `startsWith("S")` returns `true` or `false`.
- `equals()` is used to compare two Strings.

### Practice task: SBI Bank customers
Find the customers whose **balance is less than 2000**.
1. Make a `Customer` class with name, balance and mobile number, plus a constructor.
2. In `Driver`, create about 10 customers and store them in an **array**.
3. Use a **for loop** and an **if** to print the customers with balance below 2000.

Rules from the trainer: follow Java naming rules, keep **separate classes** (do not put everything in Driver), and fix basic problems before learning advanced topics.

---

## 2.2 Scanner basics (needed for `while` practice)

`Scanner` reads input from the keyboard **while the program runs**.

```java
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // connect to the console

        System.out.println("Enter product name");
        String name = sc.nextLine();           // reads a String

        System.out.println("Enter price");
        int price = sc.nextInt();              // reads an int

        System.out.println(name + " " + price);
        sc.close();                            // close the connection
    }
}
```

- `Scanner` is in the `java.util` package, so you **must import** it. Only `java.lang` is imported automatically.
- `System.in` = the keyboard and console.
- Methods: `nextLine()` (String), `nextInt()`, `nextFloat()`, `nextBoolean()`, and so on. Each data type has its own.
- **Always `close()` what you open.** If it stays open, the object stays active in memory and the garbage collector cannot remove it. In big systems (like Amazon with thousands of orders per minute) this causes problems.
- When the program waits for input, the console shows a **red (running) symbol**.

**`hasNextInt()` checks the input before reading:**
```java
if (sc.hasNextInt()) {
    int price = sc.nextInt();
} else {
    System.out.println("Please enter the price in correct format");
}
```
Without this check, wrong input (like text instead of a number) gives an **InputMismatchException**.

**Common mistake: `nextLine()` after `nextInt()`**
`nextInt()` leaves the **new line character** behind. The next `nextLine()` reads that empty line and you think the input is skipped.
Fix: add an **extra `sc.nextLine()`** after `nextInt()` to consume it.

**Scanner vs command line arguments**
| | Command line args | Scanner |
|---|---|---|
| Input given | All **at once**, before the run | **One by one**, during the run |
| Wrong input | You must **run the program again** | It can ask again (interactive) |

---

## 2.3 `while` loop

```java
int number = 0;
int max = 10;

while (number < max) {
    System.out.println(number);
    number++;
}
```
Runs **as long as the condition is true**. The condition is checked **before** each round.

### When to use `while`?
When you **do not know how many times** it will run.
Examples: a game where the user keeps guessing, reading a file while someone else is still writing to it.

### Lucky number game (the class example)
```java
Scanner sc = new Scanner(System.in);
int luckyNumber = 30;      // between 0 and 100
int userNumber = 0;

while (luckyNumber != userNumber) {
    System.out.println("Please enter the number");
    userNumber = sc.nextInt();

    if (userNumber == luckyNumber) {
        System.out.println("You win!");
    } else {
        System.out.println("Please try again");
    }
}
sc.close();
```
The program does **not know** how many rounds it will take. A lucky user wins in 1 round, an unlucky one takes many. So `while` is the right choice.

### for vs while (interview answer)
> **for**: the number of rounds is **fixed and known** before the loop starts.
> **while**: the number of rounds is **not fixed** and depends on the data or the user.

(You can write one using the other, but you should pick the right one for the situation.)

---

## 2.4 `do while` loop

```java
int input = 5;

do {
    System.out.println("Executed once");
} while (input > 10);
```
Even though `5 > 10` is **false**, the body ran **once**.

| | while | do while |
|---|---|---|
| Condition checked | **Before** the body | **After** the body |
| If condition is false at the start | Body runs **0 times** | Body runs **at least 1 time** |
| Example use | Normal repeat | Show a screen first, then check (like an ATM menu) |

---

## 2.5 `break`, `continue`, `return`

### `break`: stop the whole loop
Use it when your work is **already done**, so you don't waste time going to the end.

```java
String[] cities = {"Delhi", "Mumbai", "Bangalore", "Chennai", "Pune"};
boolean found = false;

for (int i = 0; i < cities.length; i++) {
    if (cities[i].equals("Bangalore")) {
        found = true;
        break;               // first match found, stop here
    }
}
System.out.println("Bangalore present: " + found);
```
Why? With 1 lakh cities, if "Bangalore" is at position 300, there is no need to check the other 99,700.
Example: you are sent to buy a newspaper and the first shop has it. You don't visit all 10 shops.

### `continue`: skip only this round
Jump to the **next** round and skip the rest of the loop body.

```java
int[] numbers = {10, -25, 5, -3, 4};
int product = 1;

for (int i = 0; i < numbers.length; i++) {
    int current = numbers[i];

    if (current < 0) {
        continue;            // ignore negative numbers
    }
    product = product * current;   // only positive numbers get here
}
System.out.println(product);       // 10 * 5 * 4 = 200
```

### `return`: leave the whole method
Exits the **method** itself (and sends back a value if the method has a return type).

| Keyword | What it does |
|---------|--------------|
| `break` | Exit the **loop** |
| `continue` | Skip the **current round**, go to the next round |
| `return` | Exit the **method** |

---

# QUICK INTERVIEW Q&A

**1. What is an array?**
A fixed-size container that holds elements of the **same type** in continuous memory, accessed by index.

**2. Why does the index start at 0?**
The first element is at the start of the memory block, so its position (offset) is 0.

**3. Can an array grow after it is created?**
No. The size is fixed at creation. To change it you need to change the code (or use collections later).

**4. What are the default values in a new array?**
`0` for `int`, `null` for `String` and objects.

**5. How do you get the size of an array?**
`arr.length` (an attribute, no brackets).

**6. Time complexity of reading an element by index?**
**O(1)**. It goes directly to that position.

**7. Order of execution of a `for` loop?**
Initialization (once), then condition, body, update. Then condition, body, update again, and so on until the condition is false.

**8. `for` vs `while`?**
`for` when the number of rounds is known. `while` when it is not known.

**9. `while` vs `do while`?**
`while` checks the condition first (may run 0 times). `do while` runs the body first (runs at least once).

**10. `break` vs `continue` vs `return`?**
`break` exits the loop. `continue` skips to the next round. `return` exits the method.

**11. Why close a Scanner?**
It opens a connection to the console. Always close what you open, or the object stays active and the garbage collector cannot clear it.

**12. Why does `nextLine()` seem skipped after `nextInt()`?**
`nextInt()` leaves the new line character. Use an extra `nextLine()` to consume it.

**13. How to avoid wasted work in a search loop?**
Use `break` once you find the first match.

---

# CHEAT SHEET

```java
// Array
int[] a = new int[5];          a[0] = 100;        a.length

// for
for (int i = 0; i < a.length; i++) { }

// while
while (condition) { }

// do while
do { } while (condition);

// Scanner
Scanner sc = new Scanner(System.in);
sc.nextInt();  sc.nextLine();  sc.hasNextInt();  sc.close();

// Loop control
break;      // exit loop
continue;   // skip this round
return;     // exit method
```

---

# PRACTICE LIST (from class)
1. Create an `int` array of 5 and print by index. Create a `String` array of cities.
2. Store 3 to 5 objects of your own class (Account, Invoice, User) in an array.
3. Print 0 to 9 using `for`. Debug it to see the order.
4. Print cities starting with "S" from an array.
5. SBI customers: print those with balance below 2000.
6. Lucky number game using `while` and `Scanner`.
7. Search "Bangalore" in a city list using `break`.
8. Multiply only the positive numbers using `continue`.
9. Read input (name, price, address) with `Scanner` and validate it with `hasNextInt()`.

---

# Java Notes: Git / GitHub and the `switch` Statement

Topics, in order:
- **Part 1:** Git and GitHub (version control, push, pull, branch, merge, conflict, pull request)
- **Part 2:** `switch` statement (with command line arguments and a discount task)
- **Part 3:** Single Responsibility Principle

---

# PART 1: GIT AND GITHUB

## What is version control?
A tool that **tracks every change** made to your code, so you can see the history, go back to an older version and work in a team safely.

Examples: **Git** (today's standard), SVN, Bitbucket, Perforce.

## What is a "version"?
Apps have version numbers, like **V2.1**, **V2.2**, **V3.0**.

| Part | Name | When it changes |
|------|------|----------------|
| `2.1 → 2.2` | **Minor version** | A small new feature (example: Instagram adds tagging) |
| `2.x → 3.0` | **Major version** | A big change |

**Why it matters:** if a user reports a problem, support asks *"which version are you using?"*. 90% of users may still be on the old version, so the fix must match the version.

## Why not keep code only on your computer?
- The laptop can crash, get lost or the files can get deleted.
- The company would lose months of work (maybe 500 Java files).
- So everyone **uploads their work every day to a central place**: the **remote repository**.

## Key words

| Word | Simple meaning |
|------|---------------|
| **Local** | Your own computer |
| **Remote** | The central place in the cloud (GitHub) |
| **Repository (repo)** | The project folder that holds source code, files and branches. Every project has one |
| **Clone** | Download the **whole repository** to your computer |
| **Push** | Send code **local → remote** |
| **Pull** | Get code **remote → local** |
| **Commit** | Save your changes with a message. Every commit gets a unique **commit ID** |
| **Branch** | An **independent path** to work on, without disturbing the stable code |
| **Merge** | **Combine** the changes of two branches |
| **Merge conflict** | Both sides changed the same file, so Git cannot decide, and you must fix it manually |
| **Pull Request (PR)** / **Merge Request (MR)** | A request to move your branch's code into another branch (like `main`). Others review and approve it |

## Git vs GitHub
- **Git** = the **version control tool**.
- **GitHub** = a **cloud platform** where repositories live. You can see commits, history, create pull requests and merge there.

## Branch (with example)
- **`main` branch** = the most **stable** code.
- Instagram example: Team 1 builds the **Reels** feature, Team 2 builds the **Ads** feature.
  Each team makes its **own branch** from `main`. They work separately, so there is **no clash**.
- When the work is stable, each team **merges** back into `main`.
- Like a tree: the branches come out of the root.

> **Developers do not write code directly on `main`.** They work on their own branch and move the code to `main` through a **pull request**, after review and approval by seniors.

## The Git commands from class

| Command | What it does |
|---------|--------------|
| `git clone <url>` | Get the full repository on your machine |
| `git init` | Start Git in a local folder (then connect it to a remote repository) |
| `git status` | Shows the difference between local and remote (what is changed, new, up to date) |
| `git pull` | Bring the latest remote code to local |
| `git add <file>` | Choose the files to save. Use **`git add .`** for all files |
| `git commit -m "message"` | Save the changes **locally** with a message (`-m` = message) |
| `git push` | Send the committed code from local to remote |

### The daily flow (best practice)
```
git status   →   git pull   →   git add .   →   git commit -m "message"   →   git push
```

**Why `git pull` first?**
Other developers may have pushed code while you were away. You must have **all the remote code** before you push yours.

### What you see
- After `git commit`, `git status` says your branch is **ahead of remote by 1 commit**. It is not on GitHub yet.
- After `git push`, refresh GitHub and your commit shows up with your **message**.
- In the commit history, every change has a **commit ID**. Click it to see exactly what lines were added or removed.

## Push rejected (what happens)
If someone changed the remote and you push without pulling:
```
! [rejected] ... failed to push some refs
Updates were rejected because the remote contains work that you do not have locally.
```
**Fix:** run `git pull` first, then push again.
Read the message. Git tells you what to do.

## Merge conflict
When you pull and **the same file was changed in both places**:
```
Auto-merging account.txt
CONFLICT (content): Merge conflict in account.txt
Automatic merge failed
```
**How to fix it:**
1. Open the file. You will see **both versions** marked inside it.
2. **Keep the changes you want** (usually both) and **remove the conflict markers**.
3. Then `git add`, `git commit`, `git push`.

### Easy example (Google Drive)
One shared file. P1, P2 and P3 all download it and edit.
- P1 uploads first. Fine.
- P3 uploads next. P1's changes would be **overwritten**.
- **Right way:** P3 **first gets** P1's changes, adds his own on top, then uploads. P2 does the same.
That is exactly what a merge conflict is, and how you resolve it: **get the latest, add yours on top, then upload.**

## Pull request vs push
- **Push** = your code goes to **your branch** on remote.
- **Pull request** = ask to move your branch code **into another branch** (like `main`). 2 or 3 people review and approve, then it is merged.
- "My PR is approved / rejected" means exactly this.

## Version history and cherry-pick
- Every change is recorded: who changed it, when and how many lines.
- If a change was a mistake, you can go back to an older **stable version**.
- You can also pick one specific commit with **cherry-pick**.

## Setup steps
1. Create a new repository on GitHub.
2. From your local folder, connect it to that repository (`git init`).
3. Now your local knows its **target**.
4. A local folder is connected to one repository. You can have 20 folders connected to 20 repositories.

---

# PART 2: `switch` STATEMENT

## Why `switch`?
When you have **many conditions** (`if`, `else if`, `else if`, ...), `switch` is a **cleaner way** to write them.

## Syntax
```java
switch (value) {
    case 1:
        // do this
        break;
    case 2:
        // do that
        break;
    default:
        // when no case matches
}
```

## Example: Find the day from a number
```java
public class DayFinder {

    public String identifyDay(int number) {
        String day;

        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Unknown day. Please provide a number between 1 and 7";
        }
        return day;
    }
}
```

```java
public class Driver {
    public static void main(String[] args) {
        DayFinder finder = new DayFinder();

        // Input comes from command line argument (always a String)
        int d = Integer.parseInt(args[0]);   // convert String to int

        System.out.println(finder.identifyDay(d));
    }
}
```

| Input | Output |
|-------|--------|
| `1` | Monday |
| `3` | Wednesday |
| `11` | Unknown day (goes to `default`) |

## Passing the command line argument in Eclipse
**Right-click the class > Run As > Run Configurations > Arguments tab > Program arguments** > type the value > Apply > Run.

- `args` is a **String array**. The first value is at `args[0]`.
- `"3"` is a **String**, so you cannot do maths on it. Use **`Integer.parseInt(args[0])`** to convert it to `int`.
- The names in the method (`number`) can be anything. The value you pass (3) is simply copied into it.

## Rules and common questions

### Is `break` compulsory?
**Yes, in practice.** Without it you get a **wrong result**.

**Why? Fall-through:**
Without `break`, Java runs the matching case **and keeps going into the next cases** until it finds a `break`.
Example: if `case 1` has no `break`, passing `1` runs `case 1`, then `case 2`, and so on until the next `break`. You expect "Monday" but may get "Friday".

### Does `default` have to be last?
**No.** It can be written anywhere, even in between.
The common misunderstanding is that `default` is always at the end. If you put it in the middle without a `break`, the same fall-through problem happens, so **keep `break` in the right places**.

### What can you switch on?
- Numbers (`int`) and also **Strings** ("you can supply string also").
- For Strings, convert to **upper case or lower case** first so the input is uniform (`Gold`, `gold`, `GOLD`).

### When to use `switch`?
- With 1 to 3 conditions, `if / else if` is fine.
- With **many conditions** (20 or 30 types, like different customer types), `switch` gives **better control** and the code does not become very long.

---

## Task: E-commerce Discount (based on customer type)

| Customer type | Discount |
|---------------|----------|
| Gold | 20% |
| Silver | 10% |
| Regular | 5% |

**Rules:**
- **Minimum purchase is 1000.** Below 1000, **no discount**.
- **Maximum discount is 2500.**
- Use **`switch`** for the customer type.

**What to follow:**
- Take all input from **command line arguments** (customer type and purchase value). **Do not hard-code.**
- Follow **Java naming conventions**. Use a meaningful method name like `calculateDiscount` (not `...API`).
- Use **separate classes** (for example `Customer`, `DiscountCalculator`, `Driver`). Do not put everything in the `main` method.
- Follow the **Single Responsibility Principle** (see below).
- Convert the customer type to one case (upper or lower) before the `switch`.
- Read the error message if something fails. Example: passing `"Gold"` into `Integer.parseInt` throws an exception because it is not a number.

---

# PART 3: SINGLE RESPONSIBILITY PRINCIPLE (SRP)

Part of the **SOLID** principles.

> **One class should be responsible for one functionality (feature).**

- **Functionality ≠ function.** One class does **not** mean one method.
- Example: a **fund transfer** class may have 5 or 6 methods (check balance, debit, credit ...). All of them belong to **one feature: fund transfer**. That is correct.
- Do **not** mix many features in one class, and do not put everything in the `main` method.

---

# QUICK INTERVIEW Q&A

**1. What is Git? What is GitHub?**
Git is a version control tool. GitHub is a cloud platform that hosts Git repositories.

**2. Why do we need version control?**
To track every change, keep a safe central copy, work as a team and go back to an older version.

**3. Push vs pull?**
Push = local to remote. Pull = remote to local.

**4. What is a repository?**
The project folder that holds the code, files and branches.

**5. What is a commit? What is a commit ID?**
A saved set of changes with a message. The commit ID is its unique identifier, used to track what changed.

**6. What is a branch? Why do we need one?**
An independent path. Teams work on features separately without breaking the stable `main` code.

**7. What is a merge conflict and how do you fix it?**
Both sides changed the same file. Get the latest code, keep the correct changes, remove the conflict markers, then add, commit and push.

**8. Why was my push rejected?**
The remote has changes you do not have. Run `git pull` first.

**9. Pull request vs merge request?**
Both mean asking to merge your branch into another one, with review and approval before it is merged.

**10. Can developers write directly on `main`?**
No. They use their own branch and a pull request.

**11. Daily Git flow?**
`status → pull → add → commit → push`.

**12. Is `break` mandatory in `switch`?**
Yes, otherwise you get **fall-through** and a wrong result.

**13. Does `default` have to be at the end?**
No, it can be anywhere.

**14. When do you use `switch` instead of `if else`?**
When there are many conditions and `if / else if` would become long.

**15. How do you convert a command line argument to a number?**
`Integer.parseInt(args[0])`.

**16. What is the Single Responsibility Principle?**
One class, one functionality. A class can have many methods, but they all serve that one feature.

---

# CHEAT SHEET

```
git clone <url>          get the repository
git status               check differences
git pull                 remote → local
git add .                choose all changes
git commit -m "msg"      save locally
git push                 local → remote

switch (x) {
    case 1: ...; break;
    case 2: ...; break;
    default: ...;
}

int n = Integer.parseInt(args[0]);   // String → int
```

---

# PRACTICE LIST (from class)
1. Create a GitHub repository and connect your local project to it.
2. Do the daily flow: `status → pull → add → commit → push`.
3. Change a file, check the commit history and the commit ID on GitHub.
4. Try a merge conflict (change the same file in two places) and fix it manually.
5. Write the day-finder with `switch`, and debug it.
6. Remove a `break` and see the fall-through result.
7. Build the **Gold / Silver / Regular discount** with separate classes and command line input.
8. Make a `switch` that takes a String and handles upper or lower case.

---
# Java String Notes (5 Days): with Heap, SCP and Stack Diagrams

**What is covered**
1. What is a String, and why it is special
2. Two ways to create a String (literal vs `new`) and the **String Constant Pool (SCP)**
3. `==` vs `equals()` (and `toString()`)
4. Immutability
5. `+` and `concat()`: compile time vs run time
6. `intern()`
7. `final` keyword (class, method, variable)
8. `StringBuilder` vs `StringBuffer`
9. Constructor first line, static block and instance block

---

# 0. HOW TO READ THE DIAGRAMS

```
STACK  = small notes of your method: variable names (s1, s2 ...)
         Each variable holds an ADDRESS (a reference).
HEAP   = where objects live.
SCP    = a special area INSIDE the heap only for String literals.
         It never keeps two objects with the same content.
```

- The addresses (1001, 2001 ...) are **made-up numbers** to help you understand.
  - `1xxx` = object in the **SCP**
  - `2xxx` = String object in the **normal heap**
  - `3xxx` = object of your own class (User and so on)
- A variable name like `s1` is **not** the address. The variable **holds** the address.
- `==` compares **addresses**. Same address means `true`, different address means `false`.

### Draw your own diagram in 3 steps
1. Anything in **double quotes** `"..."` goes to the **SCP** (first check: is the same content already there? If yes, reuse it).
2. `new String(...)` **always** creates a **new object in the heap**.
3. Any "change" to a String (`concat`, `+` with variables) creates a **new object in the heap**. The old one is not touched.

---

# 1. WHAT IS A STRING?

- A **sequence of characters**. Example: `M O H I T` is a String of 5 characters.
- In Java, `String` is a **class**. So every String is an **object** of the String class.
- **Do not say** "String is a data type". Say: *"String is an immutable class (a final class)."*
- Why are Strings so special? In a normal application, around **90% of the objects are Strings** (names, city, address, order id ...). That is why Java gave them special memory care (the SCP).

**Why is PIN code a String and not a number?**
You never do maths on it (`pincode = pincode + 1` makes no sense). We use a number type only when we **add or subtract**, like amount or price. Same for account number and order id: use String.

---

# 2. TWO WAYS TO CREATE A STRING

```java
String s1 = "Hello";               // 1) using a LITERAL
String s2 = new String("Hello");   // 2) using the new keyword
```

- **Both are String objects.** There is no "normal" and "abnormal" string. Never say "literal is not an object".
- The only difference is **where** the object is created and **whether the content is checked first**.

| | Literal `"Hello"` | `new String("Hello")` |
|---|---|---|
| Where | **SCP** | **Heap** |
| Checks if same content exists? | **Yes**, reuses the old one | **No**, always a new object |
| Memory | Saves memory | Uses more memory |
| Use when | You care about the **content** (most cases) | You care about the **identity** (a separate object each time) |

**Use case for `new`:** Netflix guest users. Every guest has the username "guest", but you want to **count how many objects (guests) exist**. Here identity matters, so use `new`.

**Why does the SCP exist?**
10,000 orders from BTM, Bangalore all have PIN code `560076`. Creating 10,000 objects with the same value is a waste. So Java keeps **one** object and lets everybody point to it. Memory is saved. (Java checks the pool using a fast hashing method.)

**Where is the SCP?**
- Older Java (before 7): outside the heap, in PermGen (later called Metaspace).
- **Newer Java (7 and above): inside the heap**, as a dedicated area.
- Whether the garbage collector can remove unused SCP strings **depends on the Java version** (older: no, newer: yes if nobody refers to it). In an interview say: *"It depends on the version."*

---

# 3. PROGRAMS WITH DIAGRAMS

## Program 1: Literal vs `new`

```java
String s1 = "Hello";
String s2 = new String("Hello");
System.out.println(s1 == s2);   // false
```

**Step by step**
1. `"Hello"` is not in the SCP, so it is created (1001). `s1` holds 1001.
2. Inside `new String("Hello")`, the literal `"Hello"` is already in the SCP (reused).
3. `new` creates **one more object in the heap** (2001). `s2` holds 2001.

```
+-----------+    +--------------------------------+
| STACK     |    | HEAP                           |
|-----------|    |--------------------------------|
| s1 = 1001 |    | +----------------------------+ |
| s2 = 2001 |    | | SCP (String Constant Pool) | |
+-----------+    | |----------------------------| |
                 | | 1001 : "Hello"             | |
                 | +----------------------------+ |
                 |                                |
                 | +------------------+           |
                 | | Normal heap area |           |
                 | |------------------|           |
                 | | 2001 : "Hello"   |           |
                 | +------------------+           |
                 +--------------------------------+
```
**Objects created: 2** (1 in SCP + 1 in heap). `s1 == s2` is `false` because the addresses are different (1001 vs 2001).

---

## Program 2: Same literal twice

```java
String firstName = "Kodewala";
String lastName  = "Kodewala";
System.out.println(firstName == lastName);   // true
```

```
+------------------+    +--------------------------------+
| STACK            |    | HEAP                           |
|------------------|    |--------------------------------|
| firstName = 1001 |    | +----------------------------+ |
| lastName  = 1001 |    | | SCP (String Constant Pool) | |
+------------------+    | |----------------------------| |
                        | | 1001 : "Kodewala"          | |
                        | +----------------------------+ |
                        +--------------------------------+
```
**Objects created: 1.** The second line finds the same content in the SCP and just uses it. Even if you write this 1000 times, there is still **only one** object.

---

## Program 3: Different content and different case

```java
String a = "Kodewala";
String b = "Kodewala Academy";
String c = "kodewala";             // small k
```

```
+----------+    +--------------------------------+
| STACK    |    | HEAP                           |
|----------|    |--------------------------------|
| a = 1001 |    | +----------------------------+ |
| b = 1002 |    | | SCP (String Constant Pool) | |
| c = 1003 |    | |----------------------------| |
+----------+    | | 1001 : "Kodewala"          | |
                | | 1002 : "Kodewala Academy"  | |
                | | 1003 : "kodewala"          | |
                | +----------------------------+ |
                +--------------------------------+
```
**Objects created: 3.** Java is **case sensitive**, so `"Kodewala"` and `"kodewala"` are different content. Any two of these with `==` give `false`.

---

## Program 4: `==` vs `equals()`

```java
String s1 = "Kodewala";
String s2 = new String("Kodewala");
String s3 = new String("Kodewala");

System.out.println(s1 == s2);        // false
System.out.println(s2 == s3);        // false
System.out.println(s1.equals(s2));   // true
System.out.println(s2.equals(s3));   // true
```

```
+-----------+    +--------------------------------+
| STACK     |    | HEAP                           |
|-----------|    |--------------------------------|
| s1 = 1001 |    | +----------------------------+ |
| s2 = 2001 |    | | SCP (String Constant Pool) | |
| s3 = 2002 |    | |----------------------------| |
+-----------+    | | 1001 : "Kodewala"          | |
                 | +----------------------------+ |
                 |                                |
                 | +-------------------+          |
                 | | Normal heap area  |          |
                 | |-------------------|          |
                 | | 2001 : "Kodewala" |          |
                 | | 2002 : "Kodewala" |          |
                 | +-------------------+          |
                 +--------------------------------+
```
**Objects created: 3** (1 in SCP + 2 in heap). `new` never checks for the same content, so `s2` and `s3` are two separate objects.

| Operator / method | What it checks |
|---|---|
| `==` | The **address** (are both variables pointing to the same object?) |
| `equals()` in **String** | The **content** (String class overrides it) |
| `equals()` in **Object** (default) | The **address**, same as `==` |

> Do **not** say "equals always compares content". By default (`Object` class) it compares **addresses**. The `String` class **overrides** it to compare content.
> Proof: in Eclipse press **Ctrl** and click `equals`. For a String it opens `String.java`. For your own class it opens `Object.java`.

---

## Program 5: `==`, `equals()` and `toString()` on your own class

```java
class User {
    String name;
    User(String name) { this.name = name; }
}

User u1 = new User("Kodewala");
User u2 = new User("Kodewala");

System.out.println(u1 == u2);                  // false
System.out.println(u1.equals(u2));             // false  (Object.equals compares address)
System.out.println(u1.name.equals(u2.name));   // true   (String.equals compares content)
System.out.println(u1.name == u2.name);        // true   (both point to the same SCP string)
System.out.println(u1);                        // User@1b6d3586  (ClassName@hashcode)
```

```
+-----------+    +----------------------------------+
| STACK     |    | HEAP                             |
|-----------|    |----------------------------------|
| u1 = 3001 |    | +----------------------------+   |
| u2 = 3002 |    | | SCP (String Constant Pool) |   |
+-----------+    | |----------------------------|   |
                 | | 1001 : "Kodewala"          |   |
                 | +----------------------------+   |
                 |                                  |
                 | +------------------------------+ |
                 | | Normal heap area             | |
                 | |------------------------------| |
                 | | 3001 : User { name -> 1001 } | |
                 | | 3002 : User { name -> 1001 } | |
                 | +------------------------------+ |
                 +----------------------------------+
```
- `u1` and `u2` are **two User objects** (different addresses), but both `name` fields point to the **same** SCP string.
- Printing an object gives `ClassName@hashcode` because `toString()` in the `Object` class does that. The `String` class overrides `toString()` to give the content.

**Override them in your class when you want meaningful output:**

```java
class User {
    String name;
    User(String name) { this.name = name; }

    @Override
    public String toString() {
        return "User{name=" + name + "}";       // println(u1) now prints User{name=Kodewala}
    }

    @Override
    public boolean equals(Object obj) {          // same job String class did
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        return this.name.equals(other.name);
    }
}
```
(After overriding, `u1.equals(u2)` becomes `true`. Overriding is covered in detail later. `hashCode()` should also be overridden together with `equals()`.)

---

# 4. IMMUTABILITY

> **Immutable = once created, it cannot be changed.**
> If you try to change it, you get a **new object**. The old object stays exactly as it was.

If you want "Kodewala" to become "Kodewala Academy", Java cannot edit the old object. It makes a new one.

**Why did Java make String immutable?**
1. **Memory saving**: many variables share one SCP object. If one variable could change it, everyone would see the change.
2. **Security**: things like database URL, username and password must not be modifiable by someone else.
3. **Thread safety**: an object that cannot change is automatically safe when many threads use it.

## Program 6: `concat()` creates a new object

```java
String s = "Kodewala";
s.concat(" Academy");               // result is thrown away
System.out.println(s);              // Kodewala   (NOT changed)

String s2 = s.concat(" Academy");   // catch the new object
System.out.println(s2);             // Kodewala Academy
```

**After `s.concat(" Academy");`** (nobody holds the result):

```
+----------+    +--------------------------------------------------------+
| STACK    |    | HEAP                                                   |
|----------|    |--------------------------------------------------------|
| s = 1001 |    | +----------------------------+                         |
+----------+    | | SCP (String Constant Pool) |                         |
                | |----------------------------|                         |
                | | 1001 : "Kodewala"          |                         |
                | | 1002 : " Academy"          |                         |
                | +----------------------------+                         |
                |                                                        |
                | +----------------------------------------------------+ |
                | | Normal heap area                                   | |
                | |----------------------------------------------------| |
                | | 2001 : "Kodewala Academy"   <-- nobody points here | |
                | +----------------------------------------------------+ |
                +--------------------------------------------------------+
```
**After `String s2 = s.concat(" Academy");`**:

```
+-----------+    +--------------------------------------------------------+
| STACK     |    | HEAP                                                   |
|-----------|    |--------------------------------------------------------|
| s  = 1001 |    | +----------------------------+                         |
| s2 = 2002 |    | | SCP (String Constant Pool) |                         |
+-----------+    | |----------------------------|                         |
                 | | 1001 : "Kodewala"          |                         |
                 | | 1002 : " Academy"          |                         |
                 | +----------------------------+                         |
                 |                                                        |
                 | +----------------------------------------------------+ |
                 | | Normal heap area                                   | |
                 | |----------------------------------------------------| |
                 | | 2001 : "Kodewala Academy"   <-- nobody points here | |
                 | | 2002 : "Kodewala Academy"                          | |
                 | +----------------------------------------------------+ |
                 +--------------------------------------------------------+
```
- `s` still points to `"Kodewala"`. It never changed.
- The literal `" Academy"` is in the SCP (it is in double quotes).
- The **result of `concat`** is always a new object in the **heap**.
- Every `concat` call makes another new object. Objects nobody points to are garbage.

> **Careful in loops.** Changing a String 10,000 times in a loop creates 10,000 objects. Use `StringBuilder` there (see Part 7).

## Program 7: `new String` plus `concat` (interview question)

```java
String s3 = new String("Hello");
s3.concat(" World");
System.out.println(s3);             // Hello
```

```
+-----------+    +---------------------------------------------------+
| STACK     |    | HEAP                                              |
|-----------|    |---------------------------------------------------|
| s3 = 2001 |    | +----------------------------+                    |
+-----------+    | | SCP (String Constant Pool) |                    |
                 | |----------------------------|                    |
                 | | 1001 : "Hello"             |                    |
                 | | 1002 : " World"            |                    |
                 | +----------------------------+                    |
                 |                                                   |
                 | +-----------------------------------------------+ |
                 | | Normal heap area                              | |
                 | |-----------------------------------------------| |
                 | | 2001 : "Hello"                                | |
                 | | 2002 : "Hello World"   <-- nobody points here | |
                 | +-----------------------------------------------+ |
                 +---------------------------------------------------+
```
**Objects created: 4**
1. `"Hello"` in SCP
2. `new String(...)` copy in heap (`s3` points here)
3. `" World"` in SCP
4. `"Hello World"` in heap (result of concat, not caught by any variable)

Output is `Hello` because `s3` still points to the old object.

---

# 5. COMPILE TIME vs RUN TIME (`+` operator)

The `+` operator joins Strings. Where the result goes depends on **what you are joining**.

## Program 8: `+` with only literals (compile time)

```java
String s = "Kodewala" + " " + "Academy";
```

The **compiler** already knows all the values, so it joins them **before the program runs** and gives the JVM just `"Kodewala Academy"`.

```
+----------+    +--------------------------------+
| STACK    |    | HEAP                           |
|----------|    |--------------------------------|
| s = 1001 |    | +----------------------------+ |
+----------+    | | SCP (String Constant Pool) | |
                | |----------------------------| |
                | | 1001 : "Kodewala Academy"  | |
                | +----------------------------+ |
                +--------------------------------+
```
**Objects created: 1** (in the SCP). Not 3 and not 4. This is called **compile time optimization** and it is a very common interview question.

## Program 9: `+` with variables (run time)

```java
String s1 = "Kodewala";
String s2 = " Academy";
String s3 = s1 + s2;
```

The compiler cannot be sure what `s1` and `s2` hold at run time (they could change), so it does **not** join them early. The join happens when the program runs, and the result is a **new object in the heap** (internally Java uses a `StringBuilder`).

```
+-----------+    +--------------------------------+
| STACK     |    | HEAP                           |
|-----------|    |--------------------------------|
| s1 = 1001 |    | +----------------------------+ |
| s2 = 1002 |    | | SCP (String Constant Pool) | |
| s3 = 2001 |    | |----------------------------| |
+-----------+    | | 1001 : "Kodewala"          | |
                 | | 1002 : " Academy"          | |
                 | +----------------------------+ |
                 |                                |
                 | +---------------------------+  |
                 | | Normal heap area          |  |
                 | |---------------------------|  |
                 | | 2001 : "Kodewala Academy" |  |
                 | +---------------------------+  |
                 +--------------------------------+
```
**Objects created: 3** (2 in SCP + 1 in heap).

## Program 10: Prove that the result is NOT in the SCP

```java
String s1 = "Kodewala";
String s2 = " Academy";
String s3 = s1 + s2;                 // heap
String s4 = "Kodewala Academy";      // literal, goes to SCP
System.out.println(s3 == s4);        // false
System.out.println(s3.equals(s4));   // true
```

```
+-----------+    +--------------------------------+
| STACK     |    | HEAP                           |
|-----------|    |--------------------------------|
| s1 = 1001 |    | +----------------------------+ |
| s2 = 1002 |    | | SCP (String Constant Pool) | |
| s3 = 2001 |    | |----------------------------| |
| s4 = 1003 |    | | 1001 : "Kodewala"          | |
+-----------+    | | 1002 : " Academy"          | |
                 | | 1003 : "Kodewala Academy"  | |
                 | +----------------------------+ |
                 |                                |
                 | +---------------------------+  |
                 | | Normal heap area          |  |
                 | |---------------------------|  |
                 | | 2001 : "Kodewala Academy" |  |
                 | +---------------------------+  |
                 +--------------------------------+
```
If the result of `s1 + s2` had gone to the SCP, `s4` would have found it and `s3 == s4` would be `true`. It is `false`, so the result was created **only in the heap**. Same content, but different addresses.

### Rules table: where does it go? How many objects?

| Code | Where | Objects |
|------|-------|---------|
| `"text"` | SCP (only if not already there) | 0 or 1 |
| `new String("text")` | Heap (always new) **plus** the literal in SCP if not already there | 1 or 2 |
| `"a" + "b"` (only literals) | SCP, joined by the compiler | 1 |
| `s1 + s2` (variables) | Heap (result) | 1 new (heap) |
| `s.concat("x")` | Heap (result), and `"x"` literal in SCP | 1 new (heap) + literal |
| Any "change" to a String | New object, old one untouched | 1 new |

---

# 6. `intern()`: bring a heap String into the SCP

`intern()` says: *"Give me the SCP version of this String."*
- If the same content is **already in the SCP**, it **returns that SCP reference**.
- If not, it **copies the String into the SCP** and returns that reference.

**Why use it?** Strings made with `+` (variables) or `concat` live only in the heap. If you want to reuse the SCP copy and save memory, call `intern()`.

## Program 11: `intern()` in action

```java
String s1 = "Kodewala";
String s2 = " Academy";
String s3 = s1 + s2;                 // heap object (2001)
String s4 = "Kodewala Academy";      // SCP object (1003)
String s5 = s3.intern();             // returns the SCP reference
System.out.println(s3 == s4);        // false
System.out.println(s5 == s4);        // true
```

```
+-----------+    +--------------------------------+
| STACK     |    | HEAP                           |
|-----------|    |--------------------------------|
| s1 = 1001 |    | +----------------------------+ |
| s2 = 1002 |    | | SCP (String Constant Pool) | |
| s3 = 2001 |    | |----------------------------| |
| s4 = 1003 |    | | 1001 : "Kodewala"          | |
| s5 = 1003 |    | | 1002 : " Academy"          | |
+-----------+    | | 1003 : "Kodewala Academy"  | |
                 | +----------------------------+ |
                 |                                |
                 | +---------------------------+  |
                 | | Normal heap area          |  |
                 | |---------------------------|  |
                 | | 2001 : "Kodewala Academy" |  |
                 | +---------------------------+  |
                 +--------------------------------+
```
- `s3` still points to the heap object (2001). **`intern()` does not move `s3`.**
- `s5` points to the SCP object (1003), the same as `s4`.

## Program 12: You must CATCH the result of `intern()`

```java
String s3 = new String("Zebra");     // SCP "Zebra" (1001) + heap copy (2001)
s3.intern();                         // result ignored, s3 does not change
String s4 = "Zebra";
System.out.println(s3 == s4);        // false

s3 = s3.intern();                    // now we catch it
System.out.println(s3 == s4);        // true
```

**After `s3 = s3.intern();`**

```
+-----------+    +-------------------------------------------------+
| STACK     |    | HEAP                                            |
|-----------|    |-------------------------------------------------|
| s3 = 1001 |    | +----------------------------+                  |
| s4 = 1001 |    | | SCP (String Constant Pool) |                  |
+-----------+    | |----------------------------|                  |
                 | | 1001 : "Zebra"             |                  |
                 | +----------------------------+                  |
                 |                                                 |
                 | +---------------------------------------------+ |
                 | | Normal heap area                            | |
                 | |---------------------------------------------| |
                 | | 2001 : "Zebra"   <-- nobody points here now | |
                 | +---------------------------------------------+ |
                 +-------------------------------------------------+
```
**Class doubt:** a student used the word `"Java"` and got an unexpected `true`.
Reason: words like `"Java"` may **already be in the SCP**, because Java's own classes (and thousands of other classes) use them. So the SCP may already contain the word before your program starts. **When you practice, use unusual words** (like "Zebra" or your own name), so the result is not confusing.

---

# 7. `final` KEYWORD

`final` means "after this, nothing can change".

| Put `final` on | Meaning |
|---|---|
| **Class** | Cannot be **extended** (cannot become a parent) |
| **Method** | Cannot be **overridden** in a child class |
| **Variable** | Value cannot be **changed** (it becomes a **constant**) |

**Why is `String` a final class?**
String works closely with memory (SCP and immutability). If someone could extend String and change its behaviour, the SCP and immutability might break. So Java made it `final`.

## Program 13: `final` class, method and variable

```java
final class AccountManagement { }              // nobody can extend this
class Child extends AccountManagement { }      // ERROR: cannot inherit from final class

class Account {
    final void doSomething() { }               // cannot be overridden
    void doSomethingElse()   { }               // can be overridden
}

class UpiService {
    final int UPI_LIMIT = 100000;              // constant
    void test() {
        UPI_LIMIT = 200000;                    // ERROR: cannot assign a value to final variable
    }
}
```

```
+-----------------------------------------------------+
| STACK                                               |
|-----------------------------------------------------|
| UPI_LIMIT = 100000   (final: locked, cannot change) |
+-----------------------------------------------------+
```
- A `final` variable is a **constant**. Example: maximum UPI limit of 1 lakh per day.
- `final` is **against overriding**, not against **overloading**. You can still have two methods with the same name but different number, type or order of parameters.

### Naming convention (very important)

| What | Style | Example |
|------|-------|---------|
| Class | First letter of every word capital (PascalCase) | `AccountManagement` |
| Method and variable | First word small, next words capital (camelCase) | `calculateDiscount` |
| **Constant** (`final` variable) | **ALL CAPITAL** | `UPI_LIMIT` |

If you see everything in capital letters, you know it is a constant.

---

# 8. `StringBuilder` and `StringBuffer`

When you need to **change a String again and again**, do not use `String`. Use `StringBuilder` (or `StringBuffer`). They are **mutable** (the same object can be changed).

## Program 14: `append()` changes the same object

```java
StringBuilder sb = new StringBuilder("Kodewala");
sb.append(" Academy");
System.out.println(sb);        // Kodewala Academy
```

```
+-----------+    +-----------------------------------------------------------------------+
| STACK     |    | HEAP                                                                  |
|-----------|    |-----------------------------------------------------------------------|
| sb = 2001 |    | +----------------------------+                                        |
+-----------+    | | SCP (String Constant Pool) |                                        |
                 | |----------------------------|                                        |
                 | | 1001 : "Kodewala"          |                                        |
                 | | 1002 : " Academy"          |                                        |
                 | +----------------------------+                                        |
                 |                                                                       |
                 | +-------------------------------------------------------------------+ |
                 | | Normal heap area                                                  | |
                 | |-------------------------------------------------------------------| |
                 | | 2001 : StringBuilder "Kodewala Academy"   (same object, modified) | |
                 | +-------------------------------------------------------------------+ |
                 +-----------------------------------------------------------------------+
```
- `"Kodewala"` and `" Academy"` are literals, so they sit in the SCP (as input).
- There is **one** `StringBuilder` object in the heap. `append` **changes this very object**. No new object.
- Compare: `String.concat` gave a **new** object. `StringBuilder.append` modifies the **existing** object.

## Program 15: String vs StringBuilder in a loop

**With String (3 rounds):**

```java
String s = "A";
for (int i = 0; i < 3; i++) {
    s = s.concat("B");
}
```

```
+----------+    +---------------------------------+
| STACK    |    | HEAP                            |
|----------|    |---------------------------------|
| s = 2003 |    | +----------------------------+  |
+----------+    | | SCP (String Constant Pool) |  |
                | |----------------------------|  |
                | | 1001 : "A"                 |  |
                | | 1002 : "B"                 |  |
                | +----------------------------+  |
                |                                 |
                | +-----------------------------+ |
                | | Normal heap area            | |
                | |-----------------------------| |
                | | 2001 : "AB"     <-- garbage | |
                | | 2002 : "ABB"    <-- garbage | |
                | | 2003 : "ABBB"               | |
                | +-----------------------------+ |
                +---------------------------------+
```
3 rounds made **3 new objects** (2 become garbage). With a loop of 10,000 rounds, you get 10,000 objects. With one lakh customers, the system can crash.

**With StringBuilder (3 rounds):**

```java
StringBuilder sb = new StringBuilder("A");
for (int i = 0; i < 3; i++) {
    sb.append("B");
}
```

```
+-----------+    +-----------------------------------------------------+
| STACK     |    | HEAP                                                |
|-----------|    |-----------------------------------------------------|
| sb = 2001 |    | +----------------------------+                      |
+-----------+    | | SCP (String Constant Pool) |                      |
                 | |----------------------------|                      |
                 | | 1001 : "A"                 |                      |
                 | | 1002 : "B"                 |                      |
                 | +----------------------------+                      |
                 |                                                     |
                 | +-------------------------------------------------+ |
                 | | Normal heap area                                | |
                 | |-------------------------------------------------| |
                 | | 2001 : StringBuilder "ABBB"   (only ONE object) | |
                 | +-------------------------------------------------+ |
                 +-----------------------------------------------------+
```
The same single object is modified every time. **No extra objects.**

## Program 16: Real use, a dynamic SQL query generator

The query changes based on the user input, so we build it with `StringBuilder`.

```java
public class QueryGenerator {

    public StringBuilder generateQuery(int salary, String employeeId) {
        StringBuilder query = new StringBuilder("SELECT * FROM employee");

        if (salary > 0) {
            query.append(" WHERE salary = ").append(salary);
        } else if (employeeId != null) {
            query.append(" WHERE emp_id = '").append(employeeId).append("'");
        }
        // if nothing is given, we return all the data
        query.append(";");
        return query;
    }
}
```

```java
public class Driver {
    public static void main(String[] args) {
        QueryGenerator generator = new QueryGenerator();
        StringBuilder result = generator.generateQuery(12000, null);
        System.out.println(result);   // SELECT * FROM employee WHERE salary = 12000;
    }
}
```

Memory after the method returns (the method's own `query` variable is gone from the stack, but the object lives on because `result` points to it):

```
+------------------+    +-------------------------------------------------------------------------+
| STACK            |    | HEAP                                                                    |
|------------------|    |-------------------------------------------------------------------------|
| generator = 3001 |    | +---------------------------------+                                     |
| result    = 2001 |    | | SCP (String Constant Pool)      |                                     |
+------------------+    | |---------------------------------|                                     |
                        | | 1001 : "SELECT * FROM employee" |                                     |
                        | | 1002 : " WHERE salary = "       |                                     |
                        | | 1003 : ";"                      |                                     |
                        | +---------------------------------+                                     |
                        |                                                                         |
                        | +---------------------------------------------------------------------+ |
                        | | Normal heap area                                                    | |
                        | |---------------------------------------------------------------------| |
                        | | 3001 : QueryGenerator                                               | |
                        | | 2001 : StringBuilder "SELECT * FROM employee WHERE salary = 12000;" | |
                        | +---------------------------------------------------------------------+ |
                        +-------------------------------------------------------------------------+
```
Millions of users can hit this code. With `String` it would create many objects **per user**. With `StringBuilder` it is **one object per user**. Whenever you build something dynamically, use `StringBuilder` or `StringBuffer`.

## Program 17: `StringBuffer`, the same in memory

```java
StringBuffer sbf = new StringBuffer("Kodewala");
sbf.append(" Academy");
```

```
+------------+    +----------------------------------------------------------------------+
| STACK      |    | HEAP                                                                 |
|------------|    |----------------------------------------------------------------------|
| sbf = 2001 |    | +----------------------------+                                       |
+------------+    | | SCP (String Constant Pool) |                                       |
                  | |----------------------------|                                       |
                  | | 1001 : "Kodewala"          |                                       |
                  | | 1002 : " Academy"          |                                       |
                  | +----------------------------+                                       |
                  |                                                                      |
                  | +------------------------------------------------------------------+ |
                  | | Normal heap area                                                 | |
                  | |------------------------------------------------------------------| |
                  | | 2001 : StringBuffer "Kodewala Academy"   (same object, modified) | |
                  | +------------------------------------------------------------------+ |
                  +----------------------------------------------------------------------+
```
The memory picture is **identical** to `StringBuilder`. The only difference is speed and thread safety:

| | `StringBuilder` | `StringBuffer` |
|---|---|---|
| Can you change it? | Yes (mutable) | Yes (mutable) |
| Methods | Not synchronized | **Synchronized** |
| Thread safe? | **No** | **Yes** |
| Speed | **Fast** | Slower |
| Use when | Normal use (single thread) | Many threads use the same object |

- **Synchronized** = only **one thread at a time** can run the method. That makes it safe but slower.
- Functionally both do the same job.
- `String` is **thread safe automatically**, because it is immutable (nobody can modify it).

---

# 9. CONSTRUCTOR, STATIC BLOCK AND INSTANCE BLOCK (Day 5)

## First line of every constructor
The **first line** of a constructor is **either `super()` or `this()`**. If you don't write it, Java adds **`super()`** (no arguments) for you.

So when you create any object, the call goes **up to the `Object` class first**, then comes back down.

## Program 18: What happens on `new User()`

```java
class User {
    User() {
        // super();   <-- added by Java automatically
        System.out.println("Constructor");
    }
}
User u = new User();
```

```
new User()
   |
   v
User constructor starts
   |
   +--> super()  --> Object constructor runs first
   |
   v
(instance initialization block runs here)
   |
   v
rest of the User constructor body
   |
   v
object ready, reference stored in u
```

```
+----------+    +------------------------------------------------------+
| STACK    |    | HEAP                                                 |
|----------|    |------------------------------------------------------|
| u = 3001 |    | +--------------------------------------------------+ |
+----------+    | | Normal heap area                                 | |
                | |--------------------------------------------------| |
                | | 3001 : User object   (its parent part is Object) | |
                | +--------------------------------------------------+ |
                +------------------------------------------------------+
```
## Prerequisite = common activity
A **prerequisite** is a common activity that must happen before using something. Examples: opening a database connection, loading all products when the application starts, showing the Hotstar logo.

Java has two blocks for this:

| Block | Syntax | When it runs | How many times |
|-------|--------|--------------|----------------|
| **Static initialization block (SIB)** | `static { ... }` | Just after the **class is loaded**, before any object | **Once** per class |
| **Instance initialization block (IIB)** | `{ ... }` | For **every object creation**, after `super()` and before the rest of the constructor | **Every time** `new` is called |

## Program 19: Static block vs instance block

```java
public class User {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    public User() {
        System.out.println("Constructor");
    }
}
```

```java
public class Driver {
    public static void main(String[] args) {
        System.out.println("main started");
        User u1 = new User();
        User u2 = new User();
        System.out.println("main ended");
    }
}
```

**Output**
```
main started
Static block        <-- class loaded on the FIRST new, runs only once
Instance block      <-- object 1
Constructor
Instance block      <-- object 2
Constructor
main ended
```

- The `User` class is **not loaded** until it is needed, so `main started` prints first.
- On the first `new User()`, the class is loaded, the static block runs (**once**), then the instance block, then the constructor.
- For the second object: **no static block**, only instance block and constructor.

Memory after both objects:

```
+-----------+                                    +--------------------------+
| STACK     |                                    | HEAP                     |
|-----------|                                    |--------------------------|
| u1 = 3001 |                                    | +----------------------+ |
| u2 = 3002 |                                    | | Normal heap area     | |
+-----------+                                    | |----------------------| |
                                                 | | 3001 : User object 1 | |
+-------------------------------------------+    | | 3002 : User object 2 | |
| STATIC AREA (class level)                 |    | +----------------------+ |
|-------------------------------------------|    +--------------------------+
| User class loaded (static block ran ONCE) |
+-------------------------------------------+
```
**Rules**
- If you have **many static blocks**, they run **top to bottom**. Same for instance blocks.
- Block position (above or below the constructor) does not matter. Static always goes first, then instance block, then constructor body.
- **Sequence with a parent class** (frequent interview question):
  1. Parent static block
  2. Child static block
  3. Parent instance block, then parent constructor
  4. Child instance block, then child constructor

## Program 20: Live user counter (real use of the instance block)

Requirement: show **how many users are currently active**, like Hotstar showing live viewers. Every login creates a `User` object, so **counting objects = counting users**.

```java
public class User {

    static int liveUserCount = 0;      // ONE copy, shared by all objects

    String userId;
    String username;
    String type;

    {   // runs for EVERY object, whichever constructor is used
        liveUserCount++;
        System.out.println("Total live users: " + liveUserCount);
    }

    // free (guest) user
    public User(String username, String type) {
        this.username = username;
        this.type = type;
    }

    // registered user
    public User(String userId, String username, String type) {
        this.userId = userId;
        this.username = username;
        this.type = type;
    }
}
```

```java
public class Driver {
    public static void main(String[] args) {
        User u1 = new User("guest", "FREE");
        User u2 = new User("U101", "Kodewala", "PAID");
        User u3 = new User("U102", "Amit", "PAID");
    }
}
```

**Output**
```
Total live users: 1
Total live users: 2
Total live users: 3
```

```
+-----------+                                +--------------------------------------------------------------------+
| STACK     |                                | HEAP                                                               |
|-----------|                                |--------------------------------------------------------------------|
| u1 = 3001 |                                | +----------------------------+                                     |
| u2 = 3002 |                                | | SCP (String Constant Pool) |                                     |
| u3 = 3003 |                                | |----------------------------|                                     |
+-----------+                                | | 1001 : "guest"             |                                     |
                                             | | 1002 : "FREE"              |                                     |
+---------------------------------------+    | | 1003 : "U101"              |                                     |
| STATIC AREA (class level)             |    | | 1004 : "Kodewala"          |                                     |
|---------------------------------------|    | | 1005 : "PAID"              |                                     |
| liveUserCount = 3   (one shared copy) |    | | 1006 : "U102"              |                                     |
+---------------------------------------+    | | 1007 : "Amit"              |                                     |
                                             | +----------------------------+                                     |
                                             |                                                                    |
                                             | +----------------------------------------------------------------+ |
                                             | | Normal heap area                                               | |
                                             | |----------------------------------------------------------------| |
                                             | | 3001 : User { username -> 1001, type -> 1002 }                 | |
                                             | | 3002 : User { userId -> 1003, username -> 1004, type -> 1005 } | |
                                             | | 3003 : User { userId -> 1006, username -> 1007, type -> 1005 } | |
                                             | +----------------------------------------------------------------+ |
                                             +--------------------------------------------------------------------+
```
**Why put `liveUserCount++` in the instance block and not in each constructor?**
- You could write it in every constructor, and it would work **today**.
- Tomorrow another developer (maybe after 3 years) adds a **new constructor** and does not know about the counting. Production shows the **wrong count**.
- With the instance block, **every constructor gets it automatically**. The common code is written **once**.
- A constructor should only **set up the object's state** (fill the variables). **Business logic** goes in methods or initialization blocks.
- The instance block only solves **generic** requirements. Something specific to one constructor (like free vs paid) is written in that constructor.

*(Side fact from class: the object `u1` created inside a loop is local to the loop, so you do not get a "duplicate variable" error even if you create 10,000 objects in it.)*

---

# 10. INTERVIEW QUESTIONS AND ANSWERS

**1. What is a String in Java?**
A sequence of characters, represented by an object of the `String` class. It is an **immutable, final class**, not a primitive data type.

**2. In how many ways can you create a String? What is the difference?**
Two: **literal** (`"Hello"`, goes to SCP, reuses existing) and **`new String("Hello")`** (always a new object in the heap). Both are objects.

**3. What is the String Constant Pool?**
A special area (inside the heap in Java 7 and above) that stores String literals and never keeps duplicates. It saves memory.

**4. Why does Java have an SCP?**
Around 90% of objects in an application are Strings, and many have the same value (city, PIN code). One shared object saves a lot of memory.

**5. What does immutable mean? Why is String immutable?**
Once created, it cannot be changed. Any change gives a new object. Reasons: memory saving (SCP sharing), security, and thread safety.

**6. How many objects are created by `String s = new String("Hello");`?**
Two: one in the SCP (the literal) and one in the heap. (Just one if `"Hello"` is already in the SCP.)

**7. How many objects are created by `String s = "Kodewala" + " " + "Academy";`?**
One. The compiler joins the literals before running (compile time optimization).

**8. What is the difference between `==` and `equals()`?**
`==` compares addresses. `equals()` in `Object` also compares addresses by default. `String` overrides `equals()` to compare content.

**9. Why does `System.out.println(obj)` print `ClassName@hashcode`?**
`toString()` of the `Object` class does that. `String` overrides it. Override `toString()` in your class for readable output.

**10. What does `intern()` do?**
Returns the SCP reference of the String. If it is not in the SCP, it first copies it there. You must catch the returned reference.

**11. Where does the result of `s1 + s2` (variables) go?**
To the heap (a new object). Only compile-time constants (literals joined together) are combined at compile time.

**12. Why is `String` a final class?**
So nobody can extend it and change its behaviour, which would break the SCP and immutability.

**13. What does `final` do on a class, method and variable?**
Class: cannot be extended. Method: cannot be overridden. Variable: cannot be reassigned (constant).

**14. Naming convention for constants?**
All capital letters, like `UPI_LIMIT`.

**15. String vs StringBuilder vs StringBuffer?**
`String` is immutable. `StringBuilder` and `StringBuffer` are mutable. `StringBuffer` is thread safe (synchronized) and slower. `StringBuilder` is not thread safe and faster.

**16. Why not use String in a loop to build text?**
Every change creates a new object, so thousands of objects (memory and speed problems). Use `StringBuilder`.

**17. Is String thread safe?**
Yes, because it is immutable.

**18. What is the first line of every constructor?**
`super()` or `this()`. If you do not write it, Java adds `super()`.

**19. Static block vs instance block?**
Static block: once, when the class is loaded. Instance block: for every object, before the constructor body (after `super()`).

**20. Sequence of execution with a parent and child class?**
Parent static, child static, parent instance block, parent constructor, child instance block, child constructor.

---

# 11. QUICK CHEAT SHEET

```
"text"                  -> SCP (reuse if same content exists)
new String("text")      -> heap (always new) + literal in SCP
"a" + "b"               -> 1 object in SCP (compile time)
s1 + s2                 -> new object in heap (run time)
s.concat("x")           -> new object in heap
s.intern()              -> SCP reference (catch the result!)

==        -> compares ADDRESS
equals()  -> String: CONTENT | your class: ADDRESS (unless you override)

String         immutable
StringBuilder  mutable, fast, not thread safe
StringBuffer   mutable, slower, thread safe

final class    -> cannot extend
final method   -> cannot override
final variable -> constant, name in CAPITALS

Order:  static block (once)  ->  super()  ->  instance block  ->  constructor body
```

---

# 12. PRACTICE LIST

1. Write Programs 1 to 5 and print `==` and `equals()` results. **Draw the diagram first**, then run and compare.
2. Try different words (not "Java") to avoid surprises from words already in the SCP.
3. Press **Ctrl + click** on `equals` for a String and for your own class, and see which file opens.
4. Override `toString()` and `equals()` in your own class (Invoice, Account, User).
5. Write the compile time vs run time examples (Programs 8 to 11). Predict `true` or `false` before running.
6. Debug Program 15 and watch the objects in the variables view.
7. Write the SQL query generator with `StringBuilder` for 2 or 3 conditions.
8. Make a `final` class, a `final` method and a `final` variable and read the compile errors.
9. Put `System.out.println` in the static block, instance block and constructor, then create 3 objects and check the output order.
10. Build the live user counter and add a new constructor to see that the count still works.

---

*Notes made from the 5 class recordings. The transcripts were auto-generated and unclear in places, so a few examples (names, values, addresses) are simple placeholders, and a few standard Java facts were added to keep the programs correct.*
---
⭐ *Consistency over perfection — one concept, one day at a time.*
