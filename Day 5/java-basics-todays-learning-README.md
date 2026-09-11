# Java Basics — Today's Learning

## 1. Class

```java
class AccountInfo {
}
```

- `class` is a keyword used to create a class.
- `AccountInfo` is the class name.
- A class can contain variables, methods, constructors, etc.

---

## 2. `public static void main()`

The standard Java application entry point is:

```java
public static void main(String[] args)
```

### `public`

> JVM can access the `main()` method from outside the class, so we use `public`.

### `static`

> JVM can call the `main()` method without creating an object of the class.

### `void`

> `main()` does not return any value.

### `main()`

> `main()` is the standard entry point where execution of a Java application starts.

### `String[] args`

> Used to receive command-line arguments.

---

## 3. JAR

**JAR = Java ARchive**

A JAR file is used to bundle many Java files/resources into a single file.

It is similar to a ZIP file.

Example:

```text
myapp.jar
├── AccountInfo.class
├── Student.class
├── config.properties
└── META-INF/
```

### Extract a JAR

```cmd
jar -xvf rt.jar
```

Meaning:

```text
-x → extract
-v → verbose (show files)
-f → specify the JAR file
```

---

## 4. JRE

**JRE = Java Runtime Environment**

JRE provides the environment needed to **run Java programs**.

It also includes/provides access to Java's **predefined runtime libraries/classes** that we commonly use.

For example:

```java
String name = "Rahul";

System.out.println(name);

int number = Integer.parseInt("100");
```

Here:

- `String` → predefined Java class
- `System` → predefined Java class
- `System.out.println()` → predefined method
- `Integer` → predefined Java class
- `Integer.parseInt()` → predefined method

We don't need to create these classes and methods from scratch because Java provides them through its standard libraries.

### Simple idea

> JRE gives us the runtime environment and predefined Java libraries/classes, so we can directly use things like `String`, `System`, `Integer`, `println()`, and `parseInt()`.

If Java did not provide a particular functionality, we would have to implement that functionality ourselves.

---

## 5. JVM

**JVM = Java Virtual Machine**

> JVM executes Java bytecode.

The JVM is responsible for things such as:

- Loading classes
- Managing runtime memory
- Executing bytecode
- Garbage collection
- Runtime checks

---

## 6. JDK

**JDK = Java Development Kit**

> JDK is used to develop Java programs.

It provides development tools such as:

- `javac` → compiles Java source code
- `java` → runs a Java application
- `jar` → creates/manages JAR files
- `javadoc` → generates Java documentation

Simple idea:

```text
JDK → Develop Java programs
JRE → Run Java programs
JVM → Execute Java bytecode
```

---

## 7. Compiler

The Java compiler converts Java source code into bytecode.

```text
.java
  ↓
javac
  ↓
.class
```

Example:

```cmd
javac AccountInfo.java
```

This creates:

```text
AccountInfo.class
```

---

## 8. Decompiler

A decompiler attempts to convert Java bytecode back into Java-like source code.

```text
.class
   ↓
Decompiler
   ↓
Java-like source code
```

Important:

> A decompiler normally cannot recover the exact original source code. Some information such as comments and formatting is lost during compilation.

---

# 9. Complete Java Flow

```text
AccountInfo.java
       ↓
    Compiler
     javac
       ↓
AccountInfo.class
       ↓
      JVM
       ↓
  main() starts
       ↓
Program executes
```

---

# 10. Easy Memory Trick

```text
JDK → Develop
JRE → Run / Runtime
JVM → Execute

Compiler   → Source code → Bytecode
Decompiler → Bytecode → Java-like source

JAR → Bundle many files into one archive

public → JVM can access main() from outside the class
static → No object needed to call main()
void → No return value
main() → Standard application entry point
```
