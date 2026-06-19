Programming language:
  - A language by which we give certain set of instructions to our machine in order to perform some tasks.
  - Types:
    1. Machine level or low level programming language --> easily readable and understandable by machine 
        e.g Binary language

    2. Assembly level or mid level programming language --> provides some predefined words to do some specific tasks
        pre- defined words are known as Mnemonics e.g. ADD, SUB, MUL, DIV etc. It uses assembler to translate these words into machine readable format. e.g 8086 Architecture instruction set.

    3. High level programming language --> Easily readable, executable and understandable by a programmer 
        for machines to unerstand we use compiler and interpreter.

----------------------------------------------------------------------------------------------------------------

Java:
  -high level object oriented programming language used to build web apps, mobile applications, enterprise software systems and test the applications.

  -Java is platform independent language which means code written in java can run on any system that supports JVM (Java Virtual Machine)

  -Java is known for its simple syntax because it doesnt have the concept of pointers as pointers are a bit complex so without it java is simple

  -easier, portable 
  - more secure and robust with strong memory management
  -follows the principle of WORA (Write Once, Run Anywhere)

  -Uses both compiler and interpreter.
  -James Gosling is the father of Java.

----------------------------------------------------------------------------------------------------------------

  // instructions are always written inside the class
  e.g
  public class HelloWorld{                       //Defines a class named HelloWorld and an opening bracket for class
    public static void main(String [] args)      //this is main method, the entry point for any java program
    {                                            // an openning bracket for method
      System.out.println("Hello World!");        //print statement
    }
  }

  -to run java program in cmd or console run 2 commands
  1. javac filename.java
  2. java filename

  -javac compiles the code into byte code and creates .class filename
  - JVM reads .class file and interprets the bytecode
  - A class in java can be executed only if main method is created as {--public static void main(String [] args)--} 
  - A class file created in java without main method can only be compiled but can't be executed because java program execution starts from main method as it is not present the program will not be executed.

--------------------------------------------------------------------------------------------------------------

History of Java:
  - developed by James Gosling and his team at Sun Microsystems in 1991.
  - Java was first called Greentalk then renamed Oak and later named Java inspired by coffee beans
  - Java was released publically in 1995.
  - JDK 1.0 --> Jan 1996
  - JDK 1.1 --> Feb 1997
    '
  - JDK 1.8 (8) --> Mar 2024 (used in industry) 
    '
  - Java SE 26 (LTS) --> Mar 2026 latest version of Java

  1991- 2010 --> Sun Microsystems
  in 2006 --> became open source
  2010- present --> Oracle 

---------------------------------------------------------------------------------------------------------------

Features of Java:
  1. Platform independent
  2. Simple
  3. Object oriented
  4. Portable
  5. High performance
  6. Secure 
  7. Robust 
  8. Multithreaded etc

---------------------------------------------------------------------------------------------------------------

JDK:
  - Java Development Kit is a package which consists of java development tools like javac compiler and JRE for extension
  - Development tools + JRE

JRE:
  - Java Runtime Environment consists of JVM and built in class files which is required for execution of program
  - JVM + System Libraries

JVM:
  - Java Virtual Machine helps to convert bytecode into current system understandable language with the help of interpreter 
  - JIT Compiler: Just In Time compiler is an integral part of JVM, it helps improve the performance of java programs by compiling byte codes into nature machine code at runtime, enhances performance  

---------------------------------------------------------------------------------------------------------------

Data/ Literals:
  -Infomation used in programming languagies called data.
  -Types:
    1. Primitive data --> single value
    2. Non- primitive data --> multi value
  
  1. Primitive data:
      it has 3 types:
       a. Number data --> consistes of +ve, -ve, whole, decimal numbers
       b. Character data --> anything enclosed within a single quote (' ') and length is 1
       c. Boolean data --> used to write logical values. 2 boolean literals.

    Number data: 
      -We can print the number data directly inside the printing statement or we can store directly inside the variable.
      - is of two types: 
        1. Integer
          |--> byte
          |--> short 
          |--> int 
          |--> long 

        2. Floating point number
          |--> float 
          |--> double
    
    Character data:
      - anything enclosed within a single quote (' ') and length is 1. Java supports 65000+ characters.
      - Every character has one uniques value known as ASCII(American Standard Code for Information Interchange) value.

      Char     ASCII value
      A         65
      B         66
      C         67
      :
      Z         90
      :
      a         97
      b         98
      :
      z         122

    Boolean Data:
      - Used to write logical values. 2 boolean literals
      a. true          b. false
      - both are keywords
      - true represents logical high (1)
      - false represents logical low (0)

  2. Non Primitive Data:
      Multi value data is known as non primitive data
      It has different types:
        1. String data
        2. NULL 
        3. Object reference etc 

--------------------------------------------------------------------------------------------------------------

Variable:
  - It is a container used to store data.
  - Based on which type of data is stored in variable, we have 2 types of variables:
    1. Primitive --> used to store primitive data
    2. Non Primitive --> used to store non primitive data

--------------------------------------------------------------------------------------------------------------

Printing Statement:
  - Used to print the data
  - These are of 3 types:
    1. print
    2. println 
    3. printf 

  1. print:
    - System.out.print(data)
    - Used only to print data
    - We can't use print statement withpout passing any data, if used then we will get compile time error

  2. println:
    - System.out.println(data)
    - used to print data as well as create new line
    - we can use it without passing any data, it is just used to print new lines

--------------------------------------------------------------------------------------------------------------

Tokens:
  - Smallest unit of programming language used to compose the statement 
  - tokens are of 6 types:
    1. Keywords 
    2. Identifiers 
    3. Seperators 
    4. Comments
    5. Data/ Literals 
    6. Operators 

  Comments: It is used to specify the java code 
    - 2 types:
        1. Line oriented --> single line comment '//'
        2. Block oriented --> multi line comment '/* .... */'

  Keywords: Pre defined words which java compiler can understand 
    - every keyword is associated with a sppecific task 
    - a programmer can't change the meaning of a keyword 

    Note: We have 53 keywords in java w.r.t. JDK 1.8
    Rule: Keywords are always written in lower case 

  Identifiers: The name given to components of java by the programmer is called as identifiers. 
    - List of components:
      - class
      - method
      - variables 
      - interface etc 
    
    - Rules of identifiers:
      1. Allowed characters are A-Z, a-z, 0-9, _, $
      2. First letter shouldn't be a digit
      3. Keyword can't be used as identifier
      4. Character space is not allowed in between the identifier 
      5. Only two special characters are allowed i.e. _ , $
      6. Only start with A-Z, a-z, _, $

-----------------------------------------------
Create a variable
- concept - data types - used to create a variable

Syntax:
    datatypes varname;

Datatype
    - used to create a variable of specific type
    - Types
        - primitive
        - non-primitive
    
    Primitive Datatype:
        - used to create a variable of primitive type
        - it is of 8 types
            - byte
            - short
            - int 
            - long
            - float
            - double
            - char
            - boolean
        - these all are keywords

Data 
- primitive data - 8 keyword
    - number 
        - interger - byte (1 byte), short (2 byte), int (4 byte), long (8 bytes)
        - floating point - 2 keywords - float (4 bytes), double (8 bytes)
    - character - char (2byte)
        - default val - \u0000 - unicode / empty character (2 bytes)
    - boolean - boolean keyword 
        - default val - false (1 bit)

    Range:
        byte - -128 to 127
        short - -32768 to 32767
        int - -2147483648 to 2147483647
        long - 20 digits
        float - .123456 ... upto 6 digits after .
        double - more than 
        char - 0 to 65000

Steps to work with the variable
3 Steps:
    1. Define/Declare a variable -> create
    2. Store the value -> fill/store
    3. Access the variable -> use

-----
reinintialize 
reaccess

1. Define/Declare the variable
    - syntax
        datatype variable_name:
        ex:
            byte age;
            boolean isEligible;
            char section;
            double percentage;

2. Initialize the variable:
    - syntax:
        variableName = value;
        age = 56;
        isEligible = true;
        section = 'A';
        percentage = 49.4%;

    ----------------------
    String Type Variable 
    - Scanner
    - ArrayList
    - Vector
    - HashaMap

    Class   
        - Design/Blueprint of objects

    Object 
        - memory where all properties are stored 

3. Access the Variable
print(variableName);

Assignment 
    - Create 5 class (student, employee, customer, product, user)
    - Declare their 5 variables for each then initialize and access them.

----------------------------------------
Type Casting
    - process of converting one type of data into another type of data.
    - It is of two type:
        1. Primitive
        2. Non-primitive

    Primitive:
        - The process of converting one type of primitive data into another type of primitive data is known as primitive typecasting.

        - Two types
            - small to large (Widening) / Implicite primitive typecasting
            - large to small (Narrowing) / Explicite primitive typecasting

        - In this typecasting, boolean is not going to take part
        - byte < short < int < long < float < double
        - ...... char
        - Note: Float is larger than long because of memory mechanism

        - Widening 
            - The process of converting smaller range data into larger range data of primitive type is known as widening.
            - In widening, process there is no data loss. 
            - Since, there is no data loss compiler can do implicitly 
            Note: It is also possible to do explicitly but not required.

            - byte to short
            - byte to int 
            - byte to long
            - byte to float
            - byte to double
            - short to int 
            - short to long
            - short to float
            - short to double
            - int to long
            - int to float
            - int to double
            - long to float
            - long to double
            - float to double
            - char to int
            - char to long
            - char to float
            - char to double

        - Narrowing
            - The process of converting larger range of primitive data into smaller range of primitive data is known as narrowing.
            - In narrowing process there is a possiblility of data loss. 
            - Since there is a possibility of data loss, compiler does not do narrowing implicitly.
            - It can be done explicitly by the programmer with the help of typecast operator.

            - TypeCast Operator
                - It is a unary operator (Only one operand)
                - Type cast operator is used to explicitly convert one datatype into another datatype.

            - double to float
            - double to long
            - double to int
            - double to short
            - double to byte
            
            - float to long
            - float to int
            - float to short
            - float to byte

            - long to int
            - long to short
            - long to byte

            - int to short
            - int to byte

            - double to char
            - float to char
            - long to char
            - int to char

            - short to char
            - char to short
            - byte to char
            - char to byte

----------------------------------------------------------------
Activity
1. Write a java program to store and print your name, age, dateOfBirth and contact number
2. Write a java program to convert a character into a number.
3. Write a java program to store int value into the byte, short, long, float, double, char type variable.
4. Write a java program to convert the double value(56.09) into int type and print it.
5. Write a java program to store char type data('A') inside the short and int type variable and print it.
6. Write a java program to store boolean type data(true) inside the int type variable and print it.
----------------------------------------------------------------

Scope of a Variable
    - The visibility of a variable is known as the scope of a variable 
    - Based on the scope of a variable we can categorize variables into three types.
        1. Local variable
        2. Static variable
        3. Non-static variable

    - local
        - The variable declared inside a method block or any other block except the class block is known as a local variable
        - Characteristics of local variable
            - We can't use local variables without initialization, if we try to use a local variables without initialization then we will get compile-time-error.
            - Local variables will not be initialized with default values.
            - The scope of the local variable is nested inside the block wherever it is declared, hence it can't be used outside the block.
    - static
    - non-static

- default value are for static and non-static.
- local value gives error while accessing without initialization.

-----------------------------------------------------------------
Operators - symbols by which we perform specific tasks
    - Operators are predefined symbols which is used to perform some specific task on the given data.
    - Operand: the data given as a input to the operator is known as operand.
    - Based on the number of operand given to the operator, operators are classified into 3 types:
        - Unary
        - Binary
        - Ternary

    1. Unary:
        - only one operand
        - a++, --a, !s, ... etc
        - ex :new(), typecast operator, logical not (!), increment/decrement
        
    2. Binary 
        - The operator which can accept two operands is known as binary operator.
        - +, -, /, ==, >, <, <=, =>, etc...
        - ex: assignment operator, logical (||, &&), relational, arithmetic

    - Ternary
        - The operator which can accept 3 operands is known as ternary operator.
        - op1 ? op2 : op3;
        - ex: conditional operator
    
    Classification of operator based on task
        1. Arithmetic 
            - Addition (+)
            - Subtraction (-)
            - Multiplication (*)
            - Division (/)
            - Division/Modulus (%)
        2. Assignment
        3. Relational/Comparison
        4. Logical
        5. Conditional
        6. Increment/Decrement

-------------------------------------------
Activity - ActivityToPrint
    - WAP to print the sum of 2 integer number.
    - WAP to print the sum of 2 floating point number.
    - WAP to print the sum of 1 integer number and 2 floating point number
    - WAP to print the sum of 2 integer number which is stored in byte type container.
    - WAP to print the sum of 2 integer number which is stored in short type container.

Activity - ActivityOfProblem
    - In one school 4 students are there who are 7 years of old named as Ram, Shyam, Raghu, Hari. Ram is having 4 pens, hari is having 7 pens, Raghu is having 9 pens and Shyam is having 11 pens. They don't know how to calculate total pens do they have. Write a program to help them to find the how many pens do they have?

Activity - ActivityOfProblem
    - WAP to print the 10/5.
    - WAP to print the 10%5.
    - WAP to print the 15/2.
    - WAP to print the 15%2.

Activity - ActivityOfDigits
    - WAP to find out the last digit of the 56.
    - WAP to print the last digit of the 3456789.
    - WAP to print the last digit of the 998765.
    - WAP to print the last digit of the 23451.
    - WAP to print the 1st digit of 23.
    - WAP to print the 1st digit of 98.
    - WAP to print the 1st digit of 26.
    - WAP to print the 1st digit of 42.

Activity - ActivityOfOperators
    1. WAP to print the 53.5/2 and 53.5%2.
    2. WAP to print the 54.0/2 and 54.0%2.
    3. WAP to print the 97/2.0 and 97%2.0.
    4. WAP to print the 32.0/2 and 32.0%2.0.
    5. WAP to print the 38.0/2.5 and 38.0%2.5.
    6. 5371 % 10
    7. 5371 / 10
    8. 537 % 10
    9. 537 / 10
    10. 53 % 10
    11. 53 / 10
    12. 5 % 10
    13. 5 / 10
    14. 5 / 0
    15. 5 % 0

----------
Activity 1
    1. Sum of 2 numbers 
    2. Product of 2 numbers 
    3. Sum of all the even number from 1 to 20
    4. Product of all the odd number from 20 to 30 
    5. Sum of prime number from 1 to 20 
    6. Sum of factors of 6
    7. Product of factors of 6
    8. Print factorial of 10 
    9. Print factorial of 8
    10. Sum of factors or divisor of 9
    11. Product of divisor of 12

Activity 2
    1. Print all the digits of a number 
    2. Print Sum of all the digits of a number
    3. Print product of all the digits of a number
    4. Print the sum of all the even digits of a number
    5. Print the sum of all the odd digits of a number
    6. Print the sum of prime digits of a number
    7. Find Square of a number (sqr of 4, sqr of 7, sqr of 9)
    8. Find the cube of a number(Cube of 5, Cube of 2, Cube of 15)
    9. Find the 4th power of 5
    10. Find the 6th power of 3
    11. Find the 2nd power of 6
    12. Find the 3rd power of 8
    13. Area of rectangle where length is 4 cm and width is 5.6 cm
    14. Perimeter of Rectangle where length is 4.1 cm with width is 3.2 cm
    15. Area and Perimeter of a square where side is 6 cm

Activity 3
    1. Print the factorial of 8
    2. Print factorials of 7
    3. Print factorials of 4
    4. Find the Simple Interest where Principal amount is 8 lakhs, time 60 months, rate of interest is 12%.
    5. What is the average of following number: 40, 30, 56, 78
    6. Find the mark and overall percentage of Ashish, where 
        mark in Science is 78
        mark in Social Science is 89
        mark in Math is 99
        mark in English is 88
        mark in Hindi is 67. Full mark of every individual Subject is 100







     



