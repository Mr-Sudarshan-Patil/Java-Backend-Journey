# Kodewala Academy – Java Backend Tests: Complete Question Bank (Tests 1–4)

## Contents
- Test 1 (39 questions)
- Test 2 (40 questions)
- Test 3 (45 questions)
- Test 4 (31 questions)

---

## Test 1 – Java Backend Test # 1



### Q1. Which of the following is a valid variable name?

- **A.** 1name
- **B.** class
- **C.** studentName
- **D.** student-name

**✅ Correct answer:** C. studentName

**💡 Explanation:** Variable names cannot start with numbers, contain hyphens, or use reserved keywords.

---

### Q2. Which command compiles a Java program?

- **A.** java Test
- **B.** compile Test.java
- **C.** javac Test
- **D.** javac Test.java

**✅ Correct answer:** D. javac Test.java

**💡 Explanation:** javac converts source code into bytecode.

---

### Q3. Which symbol is used to terminate a statement in Java?

- **A.** :
- **B.** ,
- **C.** ;
- **D.** .

**✅ Correct answer:** C. ;

**💡 Explanation:** Most Java statements end with a semicolon.

---

### Q4. Which component executes Java bytecode?

- **A.** JDK
- **B.** JVM
- **C.** JRE
- **D.** Compiler

**✅ Correct answer:** B. JVM

**💡 Explanation:** JVM loads and executes .class files.

---

### Q5. Which variable belongs to an object?

- **A.** Static Variable
- **B.** Local Variable
- **C.** Final Variable
- **D.** Instance Variable

**✅ Correct answer:** D. Instance Variable

**💡 Explanation:** Every object gets its own copy of instance variables.

---

### Q6. Which variable is shared among all objects?

- **A.** Static Variable
- **B.** Local Variable
- **C.** Final Variable
- **D.** Instance Variable

**✅ Correct answer:** A. Static Variable

**💡 Explanation:** Static variables belong to the class, not objects.

---

### Q7. What is the output?

```java
System.out.println(10 + 20 + "Java");
```

- **A.** Java1020
- **B.** 1020Java
- **C.** 30Java
- **D.** Error

**✅ Correct answer:** C. 30Java

**💡 Explanation:** Integer addition happens before string concatenation.

---

### Q8. Which statement is correct?

- **A.** JVM contains JRE
- **B.** JRE contains JVM
- **C.** JDK contains only JVM
- **D.** JRE contains JDK

**✅ Correct answer:** B. JRE contains JVM

**💡 Explanation:** JRE = JVM + runtime libraries.

---

### Q9. What is the output?

```java
System.out.println(10 + "20" + 30);
```

- **A.** 102030
- **B.** 60
- **C.** Error
- **D.** 3030

**✅ Correct answer:** A. 102030

**💡 Explanation:** Once a String appears, concatenation starts.

---

### Q10. What is the output?

```java
byte b = 10;
byte c = 20;
byte d = b + c;
```

- **A.** 0
- **B.** 30
- **C.** Compilation Error
- **D.** Runtime Error

**✅ Correct answer:** C. Compilation Error

**💡 Explanation:** b + c becomes int, not byte

---

### Q11. What is the output?

```java
String[] arr = {"Java", "Python"};
System.out.println(arr.length);
```

- **A.** 1
- **B.** 2
- **C.** Error
- **D.** 0

**✅ Correct answer:** B. 2

**💡 Explanation:** Array contains two elements.

---

### Q12. Is the main() method mandatory in every Java class?

- **A.** Yes, every class must have a main method
- **B.** No, only the class that needs to be executed directly requires it
- **C.** No class can have a main method
- **D.** Every object must have a main method

**✅ Correct answer:** B. No, only the class that needs to be executed directly requires it

**💡 Explanation:** A Java class can exist without a main() method. However, if you want to run the class directly using the JVM (java ClassName), it must contain a valid main() method.

---

### Q13. Which is the correct signature of the main() method?

- **A.** public static void main(String args)
- **B.** public void static main(String[] args)
- **C.** public static void main(String[] args)
- **D.** static public main(String[] args)

**✅ Correct answer:** C. public static void main(String[] args)

**💡 Explanation:** The JVM looks for exactly public static void main(String[] args)

---

### Q14. Which of the following is a valid Java class name?

- **A.** 123Student
- **B.** student-details
- **C.** StudentDetails
- **D.** class

**✅ Correct answer:** C. StudentDetails

**💡 Explanation:** Class names follow identifier rules: they cannot start with a digit, contain hyphens, or be a reserved keyword. `StudentDetails` also follows the PascalCase convention.

---

### Q15. What happens if a class does not contain a main() method and you try to run it?

- **A.** Compiles and runs successfully
- **B.** Runtime Error: Main method not found
- **C.** JVM creates a main method automatically
- **D.** Compilation Error

**✅ Correct answer:** B. Runtime Error: Main method not found

**💡 Explanation:** The class will compile successfully, but when executed, the JVM throws: Error: Main method not found in class ...

---

### Q16. What is the primary purpose of JIT (Just-In-Time) Compiler?

- **A.** To compile .java files into .class files
- **B.** To create JVM
- **C.** To load classes into memory
- **D.** To convert bytecode into machine code during execution for better performance

**✅ Correct answer:** D. To convert bytecode into machine code during execution for better performance

**💡 Explanation:** JIT is a part of the JVM. It converts frequently executed bytecode into native machine code, making Java programs run faster.

> ⚠️ This question appears twice (Q16 and Q17) in the test with identical content.

---

### Q17. What is the primary purpose of JIT (Just-In-Time) Compiler?

- **A.** To compile .java files into .class files
- **B.** To create JVM
- **C.** To load classes into memory
- **D.** To convert bytecode into machine code during execution for better performance

**✅ Correct answer:** D. To convert bytecode into machine code during execution for better performance

**💡 Explanation:** JIT is a part of the JVM. It converts frequently executed bytecode into native machine code, making Java programs run faster.

> ⚠️ This question appears twice (Q16 and Q17) in the test with identical content.

---

### Q18. Why should hardcoding values be avoided in Java applications?

- **A.** It improves performance
- **B.** It reduces memory usage
- **C.** It makes maintenance and configuration difficult
- **D.** It is required by the JVM

**✅ Correct answer:** C. It makes maintenance and configuration difficult

**💡 Explanation:** Hardcoded values (database URLs, passwords, file paths, etc.) make applications difficult to maintain. Such values should be stored in configuration files, environment variables, or properties files.

---

### Q19. Why is Java called a Platform Independent language?

- **A.** Java programs do not require a compiler
- **B.** Java source code runs directly on the operating system
- **C.** Java bytecode can run on any platform that has a JVM
- **D.** Java works only on Windows and Linux

**✅ Correct answer:** C. Java bytecode can run on any platform that has a JVM

**💡 Explanation:** When Java code is compiled, it is converted into bytecode (.class file). This bytecode is not specific to any operating system. Any machine with a JVM (Java Virtual Machine) can execute it. This is the reason behind Java's famous principle: "Write Once, Run Anywhere (WORA)".

---

### Q20. Where are objects stored in Java memory?

- **A.** Stack Memory
- **B.** Heap Memory
- **C.** Method Area
- **D.** CPU Cache

**✅ Correct answer:** B. Heap Memory

**💡 Explanation:** Objects created using the new keyword are stored in the Heap Memory. The reference variable may be stored elsewhere, but the actual object resides in the heap.

---

### Q21. Where are local variables stored?

- **A.** Heap Memory
- **B.** MetaSpace
- **C.** PermGen
- **D.** Stack Memory

**✅ Correct answer:** D. Stack Memory

**💡 Explanation:** Local variables declared inside methods are stored in the Stack Memory and are automatically removed when the method execution completes.

---

### Q22. What is a common use case of a static variable in Java?

- **A.** Storing object-specific data
- **B.** Storing data shared by all objects of a class
- **C.** Creating objects
- **D.** Storing local variables

**✅ Correct answer:** B. Storing data shared by all objects of a class

**💡 Explanation:** Static variables belong to the class, not to individual objects. Only one copy exists and is shared by all objects.

---

### Q23. What is the scope of a local variable in Java?

- **A.** Entire class
- **B.** Entire package
- **C.** Only within the method/block where it is declared
- **D.** Entire application

**✅ Correct answer:** C. Only within the method/block where it is declared

**💡 Explanation:** A local variable can be accessed only inside the method, constructor, or block in which it is declared. It cannot be accessed outside that scope.

---

### Q24. Which statement about the main() method is TRUE?

- **A.** It must always be the first method in the class.
- **B.** It can be non-static.
- **C.** A class can compile without a main method.
- **D.** Every class must contain a main method.

**✅ Correct answer:** C. A class can compile without a main method.

**💡 Explanation:** A class without main() compiles successfully. The JVM requires main() only when you try to run that class directly.

---

### Q25. What is the relationship between a .java file, classes, and .class files?

```java
Consider the following code saved in Test.java:


class A 
{

}
class B 
{

}
public class Test 
{
    public static void main(String[] args)
    {

    }
}
After compilation (javac Test.java), how many .class files will be generated?
```

- **A.** Compilation Error
- **B.** 1
- **C.** 2
- **D.** 3

**✅ Correct answer:** D. 3

**💡 Explanation:** Java creates one .class file for each class.

---

### Q26. Which statement is TRUE?

- **A.** One .java file can contain only one class.
- **B.** One .java file can contain multiple classes.
- **C.** One class generates multiple .class files always.
- **D.** A .class file contains Java source code.

**✅ Correct answer:** B. One .java file can contain multiple classes.

**💡 Explanation:** A Java source file can contain multiple classes, but at most one public class. The file name must match the public class name.

---

### Q27. File Name is Demo.java

What will happen?

```java

public class Test 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello");
    }
}
```

- **A.** Runs successfully
- **B.** Generates Demo.class
- **C.** Compilation Error
- **D.** Runtime Error

**✅ Correct answer:** C. Compilation Error

**💡 Explanation:** When a class is declared public, the file name must exactly match the public class name.

---

### Q28. What will happen when the following program is executed without any command-line arguments?

```java
public class Test 
{
    public static void main(String[] args) 
    {
        System.out.println(args[0]);
    }
}
```

- **A.** null
- **B.** blank output
- **C.** ArrayIndexOutOfBoundsException
- **D.** Compilation failure

**✅ Correct answer:** C. ArrayIndexOutOfBoundsException

**💡 Explanation:** Since no arguments are passed, args.length is 0. Accessing args[0] causes an ArrayIndexOutOfBoundsException (AIOBE) at runtime.

---

### Q29. What is the output?

```java
public class Test 
{
    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("No Arguments");
        }
    }
}

Executed as: java Test
```

- **A.** null
- **B.** No Arguments
- **C.** ArrayIndexOutOfBoundsException
- **D.** Compilation failure

**✅ Correct answer:** B. No Arguments

**💡 Explanation:** The code safely checks args.length before accessing the array, preventing ArrayIndexOutOfBoundsException. This is the recommended way to handle command-line arguments.

---

### Q30. What is the output?

```java
public class Test {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}

executed as :        java Test Java Spring Boot
```

- **A.** 2
- **B.** 3
- **C.** 4
- **D.** Compilation failure

**✅ Correct answer:** B. 3

**💡 Explanation:** The array contains 3 elements

---

### Q31. A Java Employee class is responsible for:

```java
class Employee {
    void calculateSalary() {
        // salary calculation
    }
    void generateSalarySlip() {
        // generate PDF
    }
    void sendEmail() {
        // send salary slip by email
    }
}

Which SOLID principle is violated in this design?
```

- **A.** Open/Closed Principle
- **B.** Single Responsibility Principle
- **C.** Liskov Substitution Principle
- **D.** Dependency Inversion Principle

**✅ Correct answer:** B. Single Responsibility Principle

**💡 Explanation:** The class mixes salary calculation, PDF generation and emailing. Each class should have only one reason to change, so this violates the Single Responsibility Principle.

---

### Q32. What does the “S” in SOLID stand for?

- **A.** Service Segregation Principle
- **B.** Single Responsibility Principle
- **C.** System Responsibility Principle
- **D.** Software Responsibility Principle

**✅ Correct answer:** B. Single Responsibility Principle

**💡 Explanation:** SOLID = Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion.

---

### Q33. A developer writes the following code:

```java
class PaymentService {
    void processPayment() {
        String paymentUrl = "https://payment.example.com/api";
        // payment logic
    }
}
The payment URL is hardcoded inside the Java class.
What is the main disadvantage of hardcoding values like this?
```

- **A.** It makes the application faster
- **B.** It makes the code easier to maintain and change
- **C.** Changes require modifying and redeploying the source code
- **D.** It automatically improves security

**✅ Correct answer:** C. Changes require modifying and redeploying the source code

**💡 Explanation:** A hardcoded value is baked into the source, so any change (e.g. a different URL per environment) needs a code change and redeployment. Externalise it in properties files or environment variables.

---

### Q34. Consider the following code:

```java
class Test {
    static void display() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        display();
    }
}

When display() is called, where is the method call information stored during execution?
```

- **A.** Heap
- **B.** Stack
- **C.** String Pool
- **D.** CPU Cache

**✅ Correct answer:** B. Stack

**💡 Explanation:** Each method call creates a stack frame on the Stack (holding parameters, local variables and return address), which is removed when the method returns.

---

### Q35. 

```java
int a = 10;
int b = 20;
System.out.println(a > 5 && b < 15);

```

output ?

- **A.** true
- **B.** false
- **C.** Runtime error
- **D.** Compilation error

**✅ Correct answer:** B. false

**💡 Explanation:** `a > 5` is true but `b < 15` is false (20 < 15), so `true && false` = false.

---

### Q36. int a = 10;

```java
if (a > 5 || ++a > 10) {
    System.out.println(a);
}
```

- **A.** 10
- **B.** 11
- **C.** Runtime error
- **D.** Compilation error

**✅ Correct answer:** A. 10

**💡 Explanation:** `a > 5` is already true, so `||` short-circuits and `++a` is never evaluated. `a` stays 10.

---

### Q37. A software company starts a new project. Before writing any code, the team meets with the client to understand business requirements, features, and user expectations.

```java
Which phase of the Software Development Life Cycle (SDLC) is this?
```

- **A.** Design
- **B.** Testing
- **C.** Implementation(Development)
- **D.** Requirement Analysis

**✅ Correct answer:** D. Requirement Analysis

**💡 Explanation:** Gathering business requirements and client expectations before coding is the Requirement Analysis phase of the SDLC.

---

### Q38. What is a JAR file in Java?

- **A.** Java Application Runtime file
- **B.** Java Archive file used to package Java classes and resources
- **C.** Java Assembly Reference file
- **D.** Java Application Registry file

**✅ Correct answer:** B. Java Archive file used to package Java classes and resources

**💡 Explanation:** A JAR (Java Archive) bundles compiled classes and resources into a single distributable file.

---

### Q39. Which command is used to create a JAR file?

- **A.** jar cvf app.jar *.class
- **B.** jar xvf app.jar
- **C.** javac app.jar
- **D.** java create app.jar

**✅ Correct answer:** A. jar cvf app.jar *.class

**💡 Explanation:** `jar cvf app.jar *.class`: c = create, v = verbose, f = output file name.

---

## Test 2 – Java Backend Test # 2

40 questions

### Q1. Which keyword allows JVM to call the main method?

- **A.** static
- **B.** void
- **C.** public
- **D.** main

**✅ Correct answer:** C. public

**💡 Explanation:** `main` must be `public` so the JVM, which is outside the class, can access it.

---

### Q2. Why is the main method declared static?

- **A.** To improve memory
- **B.** To avoid object creation
- **C.** To make code faster
- **D.** To return values

**✅ Correct answer:** B. To avoid object creation

**💡 Explanation:** The JVM calls `main` before any object exists, so it must be static and callable via the class name.

---

### Q3. In Java, file name and public class name:

- **A.** Can be different
- **B.** Must be same
- **C.** Need not match
- **D.** Depend on OS

**✅ Correct answer:** B. Must be same

**💡 Explanation:** A file containing a public class must be named exactly after that class (`Test.java`).

---

### Q4. Which of the following is a valid Java identifier?

- **A.** 123name
- **B.** employee-id
- **C.** total_sum
- **D.** first name

**✅ Correct answer:** C. total_sum

**💡 Explanation:** Identifiers cannot start with a digit, contain hyphens or spaces. Underscores are allowed.

---

### Q5. Java identifiers are:

- **A.** Case-insensitive
- **B.** Numeric only
- **C.** Uppercase only
- **D.** Case-sensitive

**✅ Correct answer:** D. Case-sensitive

**💡 Explanation:** `name` and `Name` are different identifiers.

---

### Q6. What is the default value of a boolean variable?

- **A.** true
- **B.** false
- **C.** 0
- **D.** null

**✅ Correct answer:** B. false

**💡 Explanation:** Instance/static boolean fields default to `false`.

---

### Q7. Which variable is declared inside a method?

- **A.** Instance Variable
- **B.** Static Variable
- **C.** Local Variable
- **D.** Member Variable

**✅ Correct answer:** C. Local Variable

**💡 Explanation:** Variables declared inside a method/block are local variables.

---

### Q8. Which variable belongs to an object?

- **A.** Instance Variable
- **B.** Static Variable
- **C.** Local Variable
- **D.** Final Variable

**✅ Correct answer:** A. Instance Variable

**💡 Explanation:** Each object has its own copy of instance variables.

---

### Q9. There is only one copy of a ______ variable for the entire class.

- **A.** Member Variable
- **B.** Static Variable
- **C.** Local Variable
- **D.** Final Variable

**✅ Correct answer:** B. Static Variable

**💡 Explanation:** Static variables belong to the class and are shared by all objects.

---

### Q10. Which operator is used for assignment?

- **A.** ==
- **B.** =
- **C.** !=
- **D.** >=

**✅ Correct answer:** B. =

**💡 Explanation:** `=` assigns a value; `==` compares.

---

### Q11. Which operator returns true only when both conditions are true?

- **A.** ||
- **B.** !
- **C.** ==
- **D.** &&

**✅ Correct answer:** D. &&

**💡 Explanation:** Logical AND (`&&`) is true only if both operands are true.

---

### Q12. Which of the following is a benefit of methods?

- **A.** Code duplication
- **B.** Reduced readability
- **C.** Reusability
- **D.** Increased complexity

**✅ Correct answer:** C. Reusability

**💡 Explanation:** Methods let you write logic once and reuse it, improving readability.

---

### Q13. What is the output?

```java
boolean a = true;
boolean b = false;
System.out.println(a || b);
```

- **A.** true
- **B.** false
- **C.** 1
- **D.** Compilation Error

**✅ Correct answer:** A. true

**💡 Explanation:** `true || false` is `true`.

---

### Q14. Which of the following is a non-primitive data type?

- **A.** char
- **B.** long
- **C.** double
- **D.** String

**✅ Correct answer:** D. String

**💡 Explanation:** `String` is a class (reference type). The others are primitives.

---

### Q15. Which access modifier allows access only within the same class?

- **A.** protected
- **B.** private
- **C.** default
- **D.** prblic

**✅ Correct answer:** B. private

**💡 Explanation:** `private` members are visible only inside their own class.

---

### Q16. What is the purpose of command-line arguments?

- **A.** Compile code
- **B.** Pass dynamic input at runtime
- **C.** Store bytecode
- **D.** Create objects

**✅ Correct answer:** B. Pass dynamic input at runtime

**💡 Explanation:** They let you pass values to `main(String[] args)` when launching the program.

---

### Q17. What will happen if the public class name and file name are different?

- **A.** Runtime Error
- **B.** Program executes normally
- **C.** Compile Time Error
- **D.** JVM Exception

**✅ Correct answer:** C. Compile Time Error

**💡 Explanation:** `javac` rejects a public class whose name does not match the file name.

---

### Q18. What is the output?

```java
int x = 10;
System.out.println(x > 5 && x < 20);
```

- **A.** false
- **B.** true
- **C.** 30
- **D.** Compilation Error

**✅ Correct answer:** B. true

**💡 Explanation:** 10 > 5 and 10 < 20 are both true.

---

### Q19. Which memory optimization issue can occur if instance variables are used where static variables should be used?

- **A.** Stack Overflow
- **B.** Deadlock
- **C.** Data Corruption
- **D.** Increased Memory Consumption

**✅ Correct answer:** D. Increased Memory Consumption

**💡 Explanation:** Every object gets its own copy of an instance variable, wasting memory for data that could be shared.

---

### Q20. Which statement about local variables is TRUE?

- **A.** Can have access modifiers
- **B.** Receive default values
- **C.** Must be initialized before use
- **D.** Exist throughout program execution

**✅ Correct answer:** C. Must be initialized before use

**💡 Explanation:** Local variables get no default value; the compiler requires initialization before use.

---

### Q21. What is printed?

```java
public static void main(String[] args)
{
    System.out.println(args.length);
}

// run as: java Test A B C
```

- **A.** 2
- **B.** 3
- **C.** 4
- **D.** Compilation Error

**✅ Correct answer:** B. 3

**💡 Explanation:** Three arguments (A, B, C) are passed, so `args.length` is 3.

---

### Q22. Which of the following can be accessed without creating an object?

- **A.** Instance Variable
- **B.** Instance Method
- **C.** Static Variable
- **D.** Constructor

**✅ Correct answer:** C. Static Variable

**💡 Explanation:** Static members are accessed through the class name.

---

### Q23. Which statement regarding protected members is correct?

- **A.** Accessible only inside class
- **B.** Accessible only inside package
- **C.** Accessible everywhere
- **D.** Accessible in same package and subclasses

**✅ Correct answer:** D. Accessible in same package and subclasses

**💡 Explanation:** `protected` = package access plus access from subclasses (even in other packages).

---

### Q24. What is the output?

```java
boolean a = false;
boolean b = true;
System.out.println(!(a || b));
```

- **A.** 1
- **B.** true
- **C.** false
- **D.** true and false

**✅ Correct answer:** C. false

**💡 Explanation:** `a || b` is true, and `!true` is false.

---

### Q25. Which of the following is NOT a valid method name according to conventions?

- **A.** calculateSalary()
- **B.** printMessage()
- **C.** sendEmail()
- **D.** EmployeeData()

**✅ Correct answer:** D. EmployeeData()

**💡 Explanation:** Methods use camelCase starting lowercase. A leading capital is the convention for class names.

---

### Q26. Which scenario is best suited for a static variable?

- **A.** Employee Name
- **B.** Account Balance
- **C.** Shopping Cart Items
- **D.** Company Name Shared by All Employees

**✅ Correct answer:** D. Company Name Shared by All Employees

**💡 Explanation:** Static fits data common to all objects; the others are per-object.

---

### Q27. What is the primary purpose of Access Modifiers in Java?

- **A.** To improve program execution speed
- **B.** To control the visibility and accessibility of classes, methods, and variables
- **C.** To reduce memory consumption
- **D.** To convert source code into bytecode

**✅ Correct answer:** B. To control the visibility and accessibility of classes, methods, and variables

**💡 Explanation:** Access modifiers (public, protected, default, private) enforce encapsulation.

---

### Q28. A banking application has a variable balance. The company policy states that balance should not be modified directly by any class outside BankAccount. Which access modifier should be used for the balance variable?

- **A.** public
- **B.** private
- **C.** protected
- **D.** default

**✅ Correct answer:** B. private

**💡 Explanation:** `private` restricts access to the declaring class; expose it via getters/setters.

---

### Q29. An e-commerce application has these requirements: every product has its own price; all products share the same GST_RATE = 18%. Which design is most appropriate?

- **A.** price → static, GST_RATE → instance
- **B.** price → instance, GST_RATE → static
- **C.** Both should be instance variables
- **D.** Both should be static variables

**✅ Correct answer:** B. price → instance, GST_RATE → static

**💡 Explanation:** Price is per object (instance); GST rate is common to all (static).

---

### Q30. An application stores employee IDs. The expected number of employees may grow to several million in the future. Which data type is the safer choice?

- **A.** byte
- **B.** boolean
- **C.** short
- **D.** int

**✅ Correct answer:** D. int

**💡 Explanation:** `byte` (±127) and `short` (±32,767) overflow; `int` handles about 2.1 billion.

---

### Q31. A file-processing application needs the file path to be supplied at runtime because it changes between environments (Dev, QA, Prod). What is the best approach?

- **A.** Hardcode the file path
- **B.** Store it in a local variable
- **C.** Take it as a command-line argument
- **D.** Store it in a method

**✅ Correct answer:** C. Take it as a command-line argument

**💡 Explanation:** Command-line arguments let you supply environment-specific values without changing code.

---

### Q32. A banking application performs this validation: `if(balance > 0 && accountActive)`. If balance > 0 is false, what happens?

- **A.** Both conditions are evaluated
- **B.** Only second condition is evaluated
- **C.** Compile-time error occurs
- **D.** Second condition is skipped

**✅ Correct answer:** D. Second condition is skipped

**💡 Explanation:** `&&` short-circuits: if the left side is false, the right side is not evaluated.

---

### Q33. Which Eclipse shortcut is used to execute the current line of code and move to the next line during debugging?

- **A.** F5
- **B.** F6
- **C.** F7
- **D.** F8

**✅ Correct answer:** B. F6

**💡 Explanation:** F6 = Step Over.

---

### Q34. During debugging in Eclipse, you are stopped at a method call and want to enter inside that method to debug its code. Which shortcut should you use?

- **A.** F5
- **B.** F6
- **C.** F7
- **D.** F8

**✅ Correct answer:** A. F5

**💡 Explanation:** F5 = Step Into.

---

### Q35. During debugging in Eclipse, you want to continue program execution until the next breakpoint is encountered. Which shortcut should you use?

- **A.** F5
- **B.** F6
- **C.** F7
- **D.** F8

**✅ Correct answer:** D. F8

**💡 Explanation:** F8 = Resume.

---

### Q36. While debugging in Eclipse, you have stepped into a method and now want to return to the calling method. Which shortcut should you use?

- **A.** F5
- **B.** F6
- **C.** F7
- **D.** F8

**✅ Correct answer:** C. F7

**💡 Explanation:** F7 = Step Return (finish the current method and return to the caller).

---

### Q37. What will be the output?

```java
class Student {
    int id;
    String name;
}
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.id);
        System.out.println(s.name);
    }
}
```

- **A.** 0 / null
- **B.** null / 0
- **C.** Compilation Error
- **D.** Garbage Value / Garbage Value

**✅ Correct answer:** C. Compilation Error

**💡 Explanation:** The quiz key marks Compilation Error as correct. By real Java behaviour the output would be option A (`0` then `null`).

> ⚠️ Options A, B and D are two-line outputs (first line printed / second line printed). **The quiz key looks wrong here.** This code compiles and prints `0` then `null` (int fields default to 0, references to null), which was the option the student picked and was scored incorrect. Keep this in mind when revising.

---

### Q38. What will happen?

```java
class Employee {
    Employee(int id) {
        System.out.println(id);
    }
    public static void main(String[] args) {
        Employee e = new Employee();
    }
}
```

- **A.** Default constructor will be automatically created
- **B.** Object will be created with id = 0
- **C.** Compilation error
- **D.** Runtime exception

**✅ Correct answer:** C. Compilation error

**💡 Explanation:** Once any constructor is declared, the compiler no longer supplies the default one, so `new Employee()` has no matching constructor.

---

### Q39. Which is the superclass of all classes in Java?

- **A.** Class
- **B.** Object
- **C.** Main
- **D.** System

**✅ Correct answer:** B. Object

**💡 Explanation:** `java.lang.Object` is the root of the class hierarchy.

---

### Q40. What will happen?

```java
// File 1
package com.a;
public class Test {
    int x = 10;
    protected int y = 20;
    public int z = 30;
}

// File 2
package com.b;
import com.a.Test;
public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
        System.out.println(t.y);
        System.out.println(t.z);
    }
}
```

- **A.** Prints 10 20 30
- **B.** Runtime Exception
- **C.** Compilation
- **D.** Prints 30 only

**✅ Correct answer:** C. Compilation

**💡 Explanation:** In a different package, default `x` is inaccessible and `protected y` is not accessible via a plain object (Main is not a subclass), so compilation fails. Only `z` (public) is accessible.

---

## Test 3 – Java Backend Test # 3

45 questions

### Q1. Which statement is true about JDK?

- **A.** Contains only JVM
- **B.** Contains only JRE
- **C.** Contains only compiler
- **D.** Contains JRE, JVM, and development tools

**✅ Correct answer:** D. Contains JRE, JVM, and development tools

**💡 Explanation:** JDK = JRE (which includes JVM) + development tools such as `javac`.

---

### Q2. Why is Java called platform independent?

- **A.** Java code is interpreted directly by OS
- **B.** Bytecode can run on any JVM
- **C.** Java programs require no OS
- **D.** JVM is platform independent

**✅ Correct answer:** B. Bytecode can run on any JVM

**💡 Explanation:** Source compiles to bytecode, which runs on any platform having a JVM (WORA).

---

### Q3. What is the output?

```java
int i = 1;
while(i <= 3){
    System.out.print(i++);
}
```

- **A.** 0123
- **B.** 123
- **C.** 1234
- **D.** Infinite loop

**✅ Correct answer:** B. 123

**💡 Explanation:** Prints 1, 2, 3 (post-increment), then i becomes 4 and the loop ends.

---

### Q4. Which loop executes at least once?

- **A.** for
- **B.** while
- **C.** do-while
- **D.** enhanced for loop

**✅ Correct answer:** C. do-while

**💡 Explanation:** `do-while` checks its condition after the body.

---

### Q5. Which operator short-circuits evaluation?

- **A.** &
- **B.** Both || and &&
- **C.** ||
- **D.** &&

**✅ Correct answer:** B. Both || and &&

**💡 Explanation:** `&&` and `||` skip the right operand when the result is already known; `&` doesn't.

---

### Q6. What is stored in args[0]?

```java
// java Test Hello
```

- **A.** Test
- **B.** java
- **C.** Hello
- **D.** args

**✅ Correct answer:** C. Hello

**💡 Explanation:** `args` holds only the arguments after the class name, so `args[0]` is `Hello`.

---

### Q7. Which member belongs to the class rather than an object?

- **A.** Instance Variable
- **B.** Static Variable
- **C.** Local
- **D.** None of the above

**✅ Correct answer:** B. Static Variable

**💡 Explanation:** Static members belong to the class.

---

### Q8. Which method signature is valid?

- **A.** void test(int a)
- **B.** int test()
- **C.** public static void main(String[] args)
- **D.** All of the above

**✅ Correct answer:** D. All of the above

**💡 Explanation:** All three are syntactically valid method declarations.

---

### Q9. Can two methods have the same name?

- **A.** Never
- **B.** Only in different classes
- **C.** Yes, through method overloading
- **D.** No

**✅ Correct answer:** C. Yes, through method overloading

**💡 Explanation:** Methods with the same name but different parameter lists are overloaded.

---

### Q10. Which access modifier gives the widest accessibility?

- **A.** protected
- **B.** private
- **C.** public
- **D.** default

**✅ Correct answer:** C. public

**💡 Explanation:** `public` is accessible from everywhere.

---

### Q11. Which access modifier restricts access within the same class only?

- **A.** protected
- **B.** private
- **C.** public
- **D.** default

**✅ Correct answer:** B. private

**💡 Explanation:** `private` is limited to the declaring class.

---

### Q12. What is the output?

```java
for(int i=1;i<=5;i++){
    if(i==3)
    {
        continue;
    }
    System.out.print(i);
}
```

- **A.** 12345
- **B.** 1245
- **C.** 345
- **D.** 12

**✅ Correct answer:** B. 1245

**💡 Explanation:** `continue` skips the print when i == 3, giving 1245.

---

### Q13. What is the output?

```java
for(int i=1;i<=5;i++){
    if(i==3)
    {
        break;
    }
    System.out.print(i);
}
```

- **A.** 12345
- **B.** 1245
- **C.** 345
- **D.** 12

**✅ Correct answer:** D. 12

**💡 Explanation:** `break` exits the loop at i == 3, so only 1 and 2 are printed.

---

### Q14. Which statement immediately exits a method?

- **A.** break
- **B.** continue
- **C.** exit
- **D.** return

**✅ Correct answer:** D. return

**💡 Explanation:** `return` ends method execution and returns to the caller.

---

### Q15. Which package is automatically imported?

- **A.** java.util
- **B.** java.io
- **C.** java.lang
- **D.** java.sql

**✅ Correct answer:** C. java.lang

**💡 Explanation:** `java.lang` (String, System, Object...) is imported implicitly.

---

### Q16. Which statement about packages is correct?

- **A.** Package names must start with capital letters
- **B.** Packages help avoid naming conflicts
- **C.** Package names can contain spaces
- **D.** Packages are optional folders

**✅ Correct answer:** B. Packages help avoid naming conflicts

**💡 Explanation:** Packages namespace classes, avoiding name clashes and organising code.

---

### Q17. What is the size of the array?

```java
int[] arr = new int[5];
```

- **A.** 4
- **B.** 5
- **C.** 6
- **D.** Depends on JVM

**✅ Correct answer:** B. 5

**💡 Explanation:** `new int[5]` allocates 5 elements (indexes 0-4).

---

### Q18. What is the default value of an int array element?

- **A.** null
- **B.** 1
- **C.** 0
- **D.** Undefined

**✅ Correct answer:** C. 0

**💡 Explanation:** Numeric arrays are zero-initialised.

---

### Q19. What happens?

```java
int[] arr = new int[3];
System.out.println(arr[3]);
```

- **A.** 0
- **B.** null
- **C.** ArrayIndexOutOfBoundsException
- **D.** Compilation Error

**✅ Correct answer:** C. ArrayIndexOutOfBoundsException

**💡 Explanation:** Valid indexes are 0-2. Index 3 throws an exception at runtime.

---

### Q20. Which is NOT a JVM memory area?

- **A.** Heap
- **B.** stack
- **C.** metaspace
- **D.** Database Area

**✅ Correct answer:** D. Database Area

**💡 Explanation:** JVM areas include Heap, Stack, Metaspace/Method Area, PC registers, native stack. There is no 'Database Area'.

---

### Q21. What is the output?

```java
public class Test{
    static int count;
    public static void main(String[] args){
        System.out.println(count);
    }
}
```

- **A.** null
- **B.** 0
- **C.** 1
- **D.** Compilation Error

**✅ Correct answer:** B. 0

**💡 Explanation:** Static int fields default to 0.

---

### Q22. Coupon Validation: what is the output?

```java
boolean isPremium = false;
boolean couponValid = true;
if(isPremium || couponValid)
{
    System.out.println("Discount Applied");
}
```

- **A.** No Output
- **B.** Discount Applied
- **C.** Compilation Error
- **D.** Runtime Error

**✅ Correct answer:** B. Discount Applied

**💡 Explanation:** `false || true` is true, so the message prints.

---

### Q23. Which class can access stock directly?

```java
public class Inventory{
    private int stock = 10;
}
```

- **A.** Any class
- **B.** Same package
- **C.** Subclass
- **D.** Inventory class only

**✅ Correct answer:** D. Inventory class only

**💡 Explanation:** `private` limits access to the declaring class.

---

### Q24. What is the output?

```java
int[] ids = {101,102,103};
System.out.println(ids[3]);
```

- **A.** 103
- **B.** null
- **C.** ArrayIndexOutOfBoundsException
- **D.** 0

**✅ Correct answer:** C. ArrayIndexOutOfBoundsException

**💡 Explanation:** The array has 3 elements (indexes 0-2), so `ids[3]` throws an exception.

---

### Q25. A customer can get a discount if they are a premium member OR they have a valid coupon. Why is validCoupon not evaluated?

```java
boolean premiumMember = true;
boolean validCoupon = false;
if(premiumMember || validCoupon)
{
    System.out.println("Discount Applied");
}
```

- **A.** JVM Optimization
- **B.** Compiler Error
- **C.** Short-Circuit Evaluation of ||
- **D.** Both variables are boolean

**✅ Correct answer:** C. Short-Circuit Evaluation of ||

**💡 Explanation:** `premiumMember` is already true, so `||` short-circuits.

---

### Q26. Which key should be used if you want to see the execution of `return a + b;` when the debugger is stopped at `int result = add(10, 20);`?

```java
public static void main(String[] args)
{
    int result = add(10, 20);
    System.out.println(result);
}
public static int add(int a, int b)
{
    return a + b;
}
```

- **A.** F8
- **B.** F7
- **C.** F6
- **D.** F5

**✅ Correct answer:** D. F5

**💡 Explanation:** F5 (Step Into) enters the `add()` method.

---

### Q27. You are debugging `int result = add(10,20);`. You don't want to enter the add() method. Which key should you use?

- **A.** F8
- **B.** F7
- **C.** F6
- **D.** F5

**✅ Correct answer:** C. F6

**💡 Explanation:** F6 (Step Over) executes the call without entering the method.

---

### Q28. What does F8 do?

- **A.** Enter method
- **B.** Execute current line only
- **C.** Run till next breakpoint or program completion
- **D.** Exit JVM

**✅ Correct answer:** C. Run till next breakpoint or program completion

**💡 Explanation:** F8 = Resume.

---

### Q29. Which variable is stored in Stack Memory during execution?

```java
class Product {
    static int gst = 18;
    int price = 1000;
    public void calculate() {
        int discount = 100;
    }
}
```

- **A.** gst
- **B.** price
- **C.** discount
- **D.** Product object

**✅ Correct answer:** C. discount

**💡 Explanation:** `discount` is a local variable (stack). `gst` is static (method area/metaspace) and `price` lives in the object on the heap.

---

### Q30. An inventory system stores 10,000 product IDs in an array. Which characteristic of arrays allows quick retrieval of any element using its index?

- **A.** Elements are sorted automatically.
- **B.** Elements are stored in contiguous memory locations.
- **C.** Arrays use HashMap internally.
- **D.** Arrays store data in Method Area.

**✅ Correct answer:** B. Elements are stored in contiguous memory locations.

**💡 Explanation:** Contiguous storage gives O(1) access: address = base + index × size.

---

### Q31. If arrays require contiguous memory, what happens when we need a larger array?

- **A.** JVM automatically increases the same memory block.
- **B.** A new larger array is created and data is copied.
- **C.** Existing array size changes.
- **D.** Array moves to Stack.

**✅ Correct answer:** B. A new larger array is created and data is copied.

**💡 Explanation:** Array size is fixed, so you allocate a bigger array and copy elements over.

---

### Q32. When should a for loop be preferred over a while loop?

- **A.** When the number of iterations is unknown
- **B.** Only for arrays
- **C.** Only for strings
- **D.** When the number of iterations is known in advance

**✅ Correct answer:** D. When the number of iterations is known in advance

**💡 Explanation:** `for` bundles init, condition and update, which suits a known iteration count.

---

### Q33. Which loop is generally preferred for reading user input until the user enters a specific value?

- **A.** for loop
- **B.** while loop
- **C.** do-while
- **D.** none

**✅ Correct answer:** B. while loop

**💡 Explanation:** The iteration count is unknown, so a condition-driven `while` loop fits.

---

### Q34. What happens?

```java
for( ; ; )
{
    System.out.println("Java");
}
```

- **A.** Prints once
- **B.** Compilation Error
- **C.** Infinite Loop
- **D.** Runtime Exception

**✅ Correct answer:** C. Infinite Loop

**💡 Explanation:** With no condition, `for(;;)` runs forever.

---

### Q35. Which statement is TRUE?

- **A.** for loop cannot become an infinite loop.
- **B.** while loop cannot become an infinite loop.
- **C.** Both for and while can become infinite loops.
- **D.** Neither can become an infinite loop.

**✅ Correct answer:** C. Both for and while can become infinite loops.

**💡 Explanation:** Any loop whose condition never becomes false (or is omitted) runs forever.

---

### Q36. An ATM application keeps asking for a PIN until the correct PIN is entered. Which loop is more suitable?

- **A.** for
- **B.** while
- **C.** do-while
- **D.** switch

**✅ Correct answer:** B. while

**💡 Explanation:** The number of attempts is unknown, so a condition-based loop fits.

---

### Q37. An inventory system needs to scan exactly 500 products. Which loop should be preferred?

- **A.** while loop because it is faster
- **B.** for loop because the number of iterations is known
- **C.** switch case
- **D.** do-while

**✅ Correct answer:** B. for loop because the number of iterations is known

**💡 Explanation:** A known iteration count suits `for`; speed is not the reason.

---

### Q38. An inventory system needs to scan exactly 500 products. Which loop should be preferred? (duplicate)

- **A.** while loop because it is faster
- **B.** for loop because the number of iterations is known
- **C.** switch case
- **D.** do-while

**✅ Correct answer:** B. for loop because the number of iterations is known

**💡 Explanation:** Same as Q37: use `for` when the iteration count is known.

> ⚠️ This question appears twice (Q37 and Q38) in the test; the stem is identical.

---

### Q39. What is the output?

```java
class A {
    A() { System.out.println("A"); }
    A(int x) { this(); System.out.println("A-int"); }
}
class B extends A {
    B() { this(10); System.out.println("B"); }
    B(int x) { super(x); System.out.println("B-int"); }
}
public class Test {
    public static void main(String[] args) { new B(); }
}
```

- **A.** A → A-int → B-int → B
- **B.** A-int → A → B → B-int
- **C.** A → B-int → A-int → B
- **D.** Compilation error

**✅ Correct answer:** A. A → A-int → B-int → B

**💡 Explanation:** `B()` → `this(10)` → `B(int)` → `super(x)` → `A(int)` → `this()` → `A()` prints A; then A-int, B-int, B.

---

### Q40. What is the output?

```java
int total = 0;
for (int i = 1; i <= 5; i++)
{
    if (i % 2 == 0)
    {
        continue;
    }
    total += i;
    if (total > 4)
    {
        break;
    }
}
System.out.println(total);
```

- **A.** 1
- **B.** 4
- **C.** 5
- **D.** 9

**✅ Correct answer:** D. 9

**💡 Explanation:** i=1 → total 1; i=2 skipped; i=3 → total 4 (not > 4); i=4 skipped; i=5 → total 9 > 4 → break. Prints 9.

---

### Q41. Output?

```java
class Parent {
    Parent() { System.out.println("Parent"); }
}
class Child extends Parent {
    Child() { this(10); System.out.println("Child"); }
    Child(int x) { System.out.println("Child-int"); }
}
public class Test {
    public static void main(String[] args) { new Child(); }
}
```

- **A.** Child → Child-int → Parent
- **B.** Parent → Child-int → Child
- **C.** Child-int → Parent → Child
- **D.** Compilation error

**✅ Correct answer:** B. Parent → Child-int → Child

**💡 Explanation:** `Child()` delegates to `Child(int)`, which implicitly calls `super()`. Order: Parent, Child-int, Child.

---

### Q42. Which statement about this() and super() is correct?

- **A.** Both can be used together in the same constructor
- **B.** this() must always be the last statement
- **C.** this() or super() must be the first statement of a constructor
- **D.** super() can be called from any method

**✅ Correct answer:** C. this() or super() must be the first statement of a constructor

**💡 Explanation:** A constructor call must be the first statement, and only one of the two can be used.

---

### Q43. What happens?

```java
class A {
    A() { this(10); }
    A(int x) { this(); }
}
```

- **A.** Executes successfully
- **B.** Runtime exception
- **C.** Compile-time error due to recursive constructor invocation
- **D.** StackOverflowError at runtime

**✅ Correct answer:** C. Compile-time error due to recursive constructor invocation

**💡 Explanation:** Constructors calling each other in a cycle are detected by the compiler (recursive constructor invocation).

---

### Q44. What happens?

```java
class A {
    A(int x) { System.out.println("A"); }
}
class B extends A {
    B() { System.out.println("B"); }
}
```

- **A.** A → B
- **B.** B only
- **C.** Compilation error
- **D.** Runtime exception

**✅ Correct answer:** C. Compilation error

**💡 Explanation:** `B()` implicitly calls `super()`, but `A` has no no-arg constructor (only `A(int)`), so compilation fails.

---

### Q45. What will be printed, and what will be the final values of orderId and status?

```java
class Order {
    int orderId;
    String status;
    Order() { this(0); System.out.println("Default Order"); }
    Order(int orderId) { this(orderId, "NEW"); System.out.println("Order with ID"); }
    Order(int orderId, String status) {
        this.orderId = orderId;
        this.status = status;
        System.out.println("Order Created");
    }
}
public class Test {
    public static void main(String[] args) { Order order = new Order(); }
}
```

- **A.** Order Created / Order with ID / Default Order / orderId = 0 / status = "NEW"
- **B.** Default Order / Order with ID / Order Created / orderId = 0 / status = "NEW"
- **C.** Order Created / Default Order / Order with ID / orderId = 0 / status = null
- **D.** Compilation error because constructors cannot call another constructor

**✅ Correct answer:** A. Order Created / Order with ID / Default Order / orderId = 0 / status = "NEW"

**💡 Explanation:** `new Order()` → `this(0)` → `this(0,"NEW")`. The innermost runs first (Order Created), then Order with ID, then Default Order. Final values: orderId = 0, status = "NEW".

---

## Test 4 – Java Backend Test # 4

31 questions

### Q1. What is the output?

```java
String s1 = new String("Java");
String s2 = new String("Java");
System.out.println(s1 == s2);
```

- **A.** true
- **B.** false
- **C.** 0
- **D.** 1

**✅ Correct answer:** B. false

**💡 Explanation:** `new` always creates a distinct heap object, and `==` compares references.

---

### Q2. What is the output?

```java
String s1 = "Java";
String s2 = new String("java");
System.out.println(s1.equals(s2));
```

- **A.** true
- **B.** Compilation Error
- **C.** false
- **D.** 1

**✅ Correct answer:** C. false

**💡 Explanation:** `equals()` is case-sensitive: "Java" ≠ "java".

---

### Q3. What is the output?

```java
String s = "Hello";
s.concat(" World");
System.out.println(s);
```

- **A.** Hello World
- **B.** Compilation Error
- **C.** Runtime Error
- **D.** Hello

**✅ Correct answer:** D. Hello

**💡 Explanation:** Strings are immutable. `concat` returns a new String that was discarded, so `s` is unchanged.

---

### Q4. Which method compares String contents?

- **A.** ==
- **B.** equals()
- **C.** hashCode()
- **D.** compare()

**✅ Correct answer:** B. equals()

**💡 Explanation:** `equals()` compares content; `==` compares references.

---

### Q5. Which statement is TRUE?

- **A.** String is mutable
- **B.** StringBuilder is immutable
- **C.** String is immutable
- **D.** StringBuffer is immutable

**✅ Correct answer:** C. String is immutable

**💡 Explanation:** String objects cannot change after creation; StringBuilder/StringBuffer are mutable.

---

### Q6. Which method is inherited by every Java class?

- **A.** None
- **B.** Both - equals() and hashCode()
- **C.** hashCode()
- **D.** equals()

**✅ Correct answer:** B. Both - equals() and hashCode()

**💡 Explanation:** Every class inherits from `Object`, which provides both `equals()` and `hashCode()`.

---

### Q7. What happens if equals() is not overridden?

- **A.** Compares content
- **B.** Uses == internally
- **C.** Compilation Error
- **D.** Runtime Exception

**✅ Correct answer:** B. Uses == internally

**💡 Explanation:** `Object.equals()` compares references, behaving like `==`.

---

### Q8. Which class is final?

- **A.** Object
- **B.** Thread
- **C.** String
- **D.** Exception

**✅ Correct answer:** C. String

**💡 Explanation:** `String` is declared `final`, so it cannot be extended.

---

### Q9. When is a constructor called?

- **A.** Method call
- **B.** Object creation
- **C.** Compilation
- **D.** Garbage collection

**✅ Correct answer:** B. Object creation

**💡 Explanation:** A constructor runs when an object is created with `new`.

---

### Q10. If no constructor is written:

- **A.** Compilation Error
- **B.** JVM creates
- **C.** Compiler provides default constructor
- **D.** None

**✅ Correct answer:** C. Compiler provides default constructor

**💡 Explanation:** The compiler adds a no-arg default constructor.

---

### Q11. The first statement inside a constructor can be:

- **A.** super()
- **B.** this()
- **C.** either super() or this()
- **D.** anything

**✅ Correct answer:** C. either super() or this()

**💡 Explanation:** The first statement may be `this(...)` or `super(...)`; otherwise the compiler inserts `super()`.

---

### Q12. Which keyword invokes the parent constructor?

- **A.** parent()
- **B.** this()
- **C.** super()
- **D.** extends()

**✅ Correct answer:** C. super()

**💡 Explanation:** `super()` calls the superclass constructor.

---

### Q13. Object class is:

- **A.** Parent of all classes
- **B.** Interface
- **C.** Final class
- **D.** Abstract class

**✅ Correct answer:** A. Parent of all classes

**💡 Explanation:** `java.lang.Object` is the root class of every Java class.

---

### Q14. Instance variable is created:

- **A.** Once
- **B.** During class loading
- **C.** With every object
- **D.** During compilation

**✅ Correct answer:** C. With every object

**💡 Explanation:** Each object gets its own copy when it is created.

---

### Q15. A Java application receives thousands of requests simultaneously. Each request builds a large string by appending multiple values. The same string object is shared by multiple threads.

- **A.** String
- **B.** StringBuilder
- **C.** StringBuffer
- **D.** Thread

**✅ Correct answer:** C. StringBuffer

**💡 Explanation:** A shared mutable string needs thread safety. `StringBuffer`'s methods are synchronized; `StringBuilder` is not.

---

### Q16. Why is StringBuilder preferred over StringBuffer in this program?

```java
public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        System.out.println(sb.length());
    }
}
```

- **A.** StringBuilder uses less memory
- **B.** StringBuilder is immutable.
- **C.** StringBuffer cannot append integers.
- **D.** The program is single-threaded, so synchronization overhead is unnecessary.

**✅ Correct answer:** D. The program is single-threaded, so synchronization overhead is unnecessary.

**💡 Explanation:** Only one thread is used, so StringBuffer's synchronization is pure overhead. StringBuilder is faster here (and it's mutable, not immutable).

---

### Q17. A developer accidentally loses the source code (.java files), but the compiled .class files are still available. Which statement is correct?

- **A.** It is impossible to recover the Java code.
- **B.** A Java decompiler can generate readable Java source code from the .class files, although comments and original formatting are usually lost.
- **C.** The JVM can automatically recreate the original source code with comments.
- **D.** The .class file contains only machine code, so decompilation is impossible.

**✅ Correct answer:** B. A Java decompiler can generate readable Java source code from the .class files, although comments and original formatting are usually lost.

**💡 Explanation:** Bytecode retains enough structure to be decompiled, but comments and formatting are lost.

---

### Q18. What happens? (Employee does NOT override equals().)

```java
Employee e1 = new Employee(101);
Employee e2 = new Employee(101);
System.out.println(e1.equals(e2));
```

- **A.** true
- **B.** false
- **C.** Compilation Error
- **D.** Runtime Exception

**✅ Correct answer:** B. false

**💡 Explanation:** The default `equals()` compares references; two separate objects are not equal.

---

### Q19. A banking application updates a shared transaction log using multiple threads simultaneously. Which class should be used?

- **A.** String
- **B.** StringBuilder
- **C.** StringBuffer
- **D.** char[]

**✅ Correct answer:** C. StringBuffer

**💡 Explanation:** StringBuffer is synchronized and thread-safe.

---

### Q20. What will be printed?

```java
String id1 = new String("P101");
String id2 = new String("P101");
if(id1 == id2){
    System.out.println("Cache Hit");
}else{
    System.out.println("Cache Miss");
}
```

- **A.** Cache Hit
- **B.** Cache Miss
- **C.** Compilation Error
- **D.** Depends on JVM

**✅ Correct answer:** B. Cache Miss

**💡 Explanation:** Two `new String` objects are different references, so `==` is false. Use `equals()`.

---

### Q21. How many String objects are created at runtime?

```java
String s = "Java" + "Backend";
```

- **A.** 0
- **B.** 1
- **C.** 2
- **D.** 3

**✅ Correct answer:** B. 1

**💡 Explanation:** Concatenating two literals is a compile-time constant ("JavaBackend"), so only one pooled String exists.

---

### Q22. Why is the constructor made private?

```java
public class Utility {
    private Utility()
    {
    }
}
```

- **A.** To improve performance.
- **B.** To prevent object creation because the class contains only utility/static methods.
- **C.** To support inheritance.
- **D.** To reduce memory usage.

**✅ Correct answer:** B. To prevent object creation because the class contains only utility/static methods.

**💡 Explanation:** A private constructor stops instantiation (as with utility classes and singletons).

---

### Q23. Output?

```java
String s1 = "Java";
String s2 = new String("Java");
String s3 = s2.intern();
System.out.println(s1 == s2);
System.out.println(s1 == s3);
System.out.println(s2 == s3);
```

- **A.** true, true, true
- **B.** false, true, false
- **C.** false, false, true
- **D.** true, false, false

**✅ Correct answer:** B. false, true, false

**💡 Explanation:** `s2` is a heap object (≠ s1). `intern()` returns the pooled instance, same as `s1`, so s1 == s3 is true and s2 == s3 is false.

---

### Q24. Order class has only `Order(String orderId)` and no equals()/hashCode(). Two orders `new Order("ORD101")` print "New Order" with `o1.equals(o2)`, but the business wants same orderId to be equal. What is the best solution?

```java
public class Order {
    private String orderId;
    public Order(String orderId) { this.orderId = orderId; }
}
```

- **A.** Compare o1 == o2
- **B.** Override only hashCode().
- **C.** Override both equals() and hashCode() based on orderId.
- **D.** Make orderId static.

**✅ Correct answer:** C. Override both equals() and hashCode() based on orderId.

**💡 Explanation:** Override `equals()` for logical equality and `hashCode()` consistently, which is required for hash-based collections.

---

### Q25. What is the output?

```java
String s1 = "Ja" + "va";
String s2 = "Java";
System.out.println(s1 == s2);
```

- **A.** true
- **B.** false
- **C.** Compilation error
- **D.** Runtime Error

**✅ Correct answer:** A. true

**💡 Explanation:** The compiler folds the constant expression to "Java", so both refer to the same pooled String.

---

### Q26. What is the output?

```java
String a = "Java";
String b = "Ja";
String c = b + "va";
System.out.println(a == c);
System.out.println(a == c.intern());
```

- **A.** true, true
- **B.** false, true
- **C.** false, false
- **D.** true, false

**✅ Correct answer:** B. false, true

**💡 Explanation:** `b` is not final, so `b + "va"` is built at runtime on the heap (a ≠ c). `c.intern()` returns the pooled "Java" (a == intern is true).

---

### Q27. What is the output?

```java
String s1 = new String("Spring");
String s2 = s1.intern();
System.out.println(s1 == s2);
System.out.println(s2 == "Spring");
```

- **A.** true, true
- **B.** false, false
- **C.** false, true
- **D.** true, false

**✅ Correct answer:** C. false, true

**💡 Explanation:** `s1` is a heap copy; `s2` is the pooled instance, so s1 == s2 is false. The literal "Spring" is the same pooled instance, so s2 == "Spring" is true.

---

### Q28. What is the output?

```java
final String x = "Ja";
String s1 = x + "va";
String s2 = "Java";
System.out.println(s1 == s2);
```

- **A.** true
- **B.** false
- **C.** Compilation error
- **D.** Depends on garbage collection

**✅ Correct answer:** A. true

**💡 Explanation:** `x` is a final constant variable, so `x + "va"` is a compile-time constant interned as "Java". Result: true.

---

### Q29. Which approach is generally best for repeated string concatenation inside a loop?

- **A.** Use result.intern() on every iteration.
- **B.** Use new String(result) on every iteration.
- **C.** Use final String result.
- **D.** Use StringBuilder and append each value.

**✅ Correct answer:** D. Use StringBuilder and append each value.

**💡 Explanation:** Strings are immutable, so `+` in a loop creates many temporary objects. StringBuilder appends in place.

---

### Q30. What is the output?

```java
String s = new String("Ja") + new String("va");
s.intern();
String s1 = "Java";
System.out.println(s == s1);
```

- **A.** true
- **B.** false
- **C.** Compilation error
- **D.** Runtime exception

**✅ Correct answer:** A. true

**💡 Explanation:** "Java" isn't in the pool yet when `s.intern()` runs, so `intern()` puts `s` itself into the pool. The later literal `"Java"` resolves to that same object, so `s == s1` is true (Java 7+).

---

### Q31. What is the output?

```java
public class Test {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        s2.intern();
        System.out.println(s1 == s2);
    }
}
```

- **A.** true
- **B.** false
- **C.** Compilation error
- **D.** Runtime exception

**✅ Correct answer:** B. false

**💡 Explanation:** `s2.intern()` returns the pooled String but the result is discarded, so `s2` still points to the heap object. s1 == s2 is false.

---

