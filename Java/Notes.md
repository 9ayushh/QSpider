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
  - high level object oriented programming language used to build web apps, mobile applications, enterprise software systems and test the applications.

  - Java is platform independent language which means code written in java can run on any system that supports JVM (Java Virtual Machine)

  - Java is known for its simple syntax because it doesn't have the concept of pointers as pointers are a bit complex so without it java is simple

  - easier, portable 
  - more secure and robust with strong memory management
  - follows the principle of WORA (Write Once, Run Anywhere)

  - Uses both compiler and interpreter.
  - James Gosling is the father of Java.

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
  - Smallest unit of programming language 
  - used to compose the statement 
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
    - every keyword is associated with a specific task 
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
Variable:
  - It is a container used to store data.
  - Based on which type of data is stored in variable, we have 2 types of variables:
    1. Primitive --> used to store primitive data
    2. Non Primitive --> used to store non primitive data

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
            - The process of converting smaller range of primitive data into larger range data of primitive type is known as widening.
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

    Non-Primitive Typecasting
        - Converting one type of non-primitive data into another type of non-primitive data
        - There are two types
            1. Up casting
            2. Down casting

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
            - to assign the value
            - Simple (hard to understand by JVM)
                - =
                - r = r + 2;
            - Compound (Easy to read by JVM)
                - +=, -=, %=, /=, *=
                - improve the performance / code optimization
                - internally typecasting is applied

        3. Relational/Comparison
            - It is used to create a condition
            - It returns boolean value
            - ==, !=, >, <, >=, <=
            - Ex: 
                - A person is eligible to vote
                - Password is correct or not

        4. Logical
            - It is used to combine the condition.
            - OR (||)
            - AND (&&)
            - NOT (!)

        5. Conditional Operator 
            - It is a ternary operator
            - Syntax
                - operand 1 ? operand 2 : operand 3
                - condition ? statement 1 : statement 2
            - Operation:
                1. The return type of operand 1 must be Boolean.
                2. If the condition is true, Statement1 will get executed else Statement2 will get executed.
            The return type of conditional operator depends on the operand 2 and operand 3.

        6. Increment/Decrement Operator
            - It is used to update the value by 1.
            - This operator is used with variable
            - Increment Operator increase the value by 1 and Decrement Operator decrease the value by 1.
            - It is used for code optimization and interanally typecasting also applied
            - It can be pre increment(++a) or pre decrement(--a) Or post increment(a++) or post decrement(a--)

            1. Pre-increment  
            2. Post-increment
            3. Pre-decrement
            4. Post-decrement

            case 1 ... When it's outside the printing statement
                - outside the prining statement
                    - both pre and post will done first then print the statement

            case 2 ... When it's inside the printing statement
                - pre increment/decrement
                    - the increment/decrement is done first, then print the statement
                - post increment/decrement
                    - the increment/decrement is done after printing the statement


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

-------------------------------------------------------------------------------------------------
- We cannot save sum or any operation of byte or short into byte or short... we have to store in **int**.
- byte + byte => stored inside int
- short + short => stored inside int

--------------------------------------------------------------------------------------------------
ASSIGNMENT
----------
Q1 - number is positive or not
Q2 - number is negative or not
Q3 - number is zero or not
Q4 - number is Larger than 50 or not
Q5 - price is more than 125.75 or not
Q6 - number is inbetween 500 to 1000 or not excluding the given number
Q7 - number is a 2 digit number or not
Q8 - number is divisible by 5 or not
Q9 - number is divisible by 7 or not
Q10 - number is even or not
Q11 - number is odd or not
Q12 - number is divisible by 6 or not without directly dividing or modulus by 6
Q13 - number is even or not without using modulus operator
Q14 - given character is 'A'/'a' or not
Q15 - given character is 'Q'/'q' or not
Q16 - given character is uppercase character or not
Q17 - given character is lowercase character or not
Q18 - given character is alphabet or not
Q19 - given character is digit character or not
Q20 - given character is uppercase vowel or not
Q21 - given character is lowercase vowel or not
Q22 - given character is vowel or not
Q23 - given character is uppercase consonent or not
Q24 - given character is lowercase consonent or not
Q25 - Find the person is eligible to vote or not
Q26 - Find the largest among three number
Q27 - Find the smallest among three number
Q28 - Find the largest among three number without using AND operator
Q29 - Find the smallest among three number without using AND operator


-------------------------------------------------------------------------
Control Statement
-----------------
    - It is used to control the flow of the execution of the program
    - It is of two types
        - Looping Statement
        - Decision making statement
    
    1. Looping Statement
        - Looping statement helps the programmer to execute the set of instructions repeatedly
        - In java, we have different types of loop statements, they are:
            - while loop
            - do-while loop
            - for loop
            - for each / advanced for / enhanced for loop

        i. while loop (entry control loop)
            - Syntax to create while loop:
                while (condition) {
                    // Statement to be repeated;
                }
            - execution flow
                - Case1 : when the condition is true
                    - The loop continues
                    - Control execute the statement which belongs to the loop.
                    - After execution once the loop block ends, control goes back to the condition and the entire process will be repeated till the condition becomes false.

                - Case2 : when the condition is false
                    - The loop is stopped i.e. repetition is stopped. 
                    - The loop block will not get executed.
                    - The control comes outside the loop to the next statement.

        ii. do-while loop (exit control loop)
            - Syntax to create do-while loop:
                do {
                    // statement;
                } 
                while(condition);
            - execution flow
                - Case 1: When the conodition is true
                    - Control goes to the loop block directly, execute the instructions.
                    - Then control goes to the condition, if the condition is true the control goes back to the do block.
                
                - Case 2: When the condition is false
                    - Control goes to the loop block directlyl, execute the instructions.
                    - Then control goes to the condition, if the condition is false the loop is stops and control goes to the next statement.
            
        - Difference between do-while and while loop
            - while
                - first the condition is checked, if the condition is true then the loop block gets executed.
                - The minimum iteration can be zero.
                - also called as entry control loop.
                - directly we can't pass false to the while loop, it will give compile time error
                - ex:
                    int a = 5, b = 10, count = 0;
                    while (a > b) {
                        count++;
                        System.out.println("value of b is" + b);
                    }
                    System.out.println("Iteration" + count);
                    // output : Iteration 0

            - do-while
                - in do-while, first the loop block gets executed and then the condition is checked.
                - the minimum iteration is one.
                - also called as exit control loop.
                - we can pass false to do-while loop, we not get any compile time error
                - ex: 
                    int a = 5, b = 10, count = 0;
                    do {
                        count++;
                        System.out.println("value of b is "+b);
                    } 
                    while (a<b);
                    System.out.println("Iteration " + count);
                    // Output: value of b is 10
                    // iteration 1

        iii. for loop
            - Syntax to create for loop:
                for (initialization; condition; update) {
                    // statement
                }
            - execution flow
                - Step1: Control go to the initialization part.
                - Step2: Then it will go to the condition part.
                - Step3: If the condition is true then it will enter inside the loop block.
                - Step4: Once the execution of instruction inside the loop block is completed control will go to the update segment.
                - Step5: Then it will go back to the condition. Step 2, 3, 4 will continue unitl the condition become false.

            NOTE: 
                - All the three segments are optional(initialization, condtion, update)
                - If the condition is not provided, by default it is considered as true.

        Assignment
            1. 1 2 3 4 ...
            2. A B C D ...
            3. 1 3 5 7 ...
            4. 100 99 98 97 ...
            5. z y x w ...

        Assignment
            - A to Z
            - a to z
            - all even number from 10 to 100
            - all odd num from 1 to 1000
            - print all 2 digit number

            * do these in reverse

        iv. Nested loop
            - Writing a loop statement inside another loop statemnet is known as a nested loop statement
            - In a nested loop, the inner loop is executed completely for each and every iteration of the outer loop.
            
            program...
            1.
            101010
            101010
            101010
            101010
            
            2.
            111111
            000000
            111111
            000000

            3.
            ###########
            &&&&&&&&&&&
            ###########
            &&&&&&&&&&&
            ###########


    2. Decision Making Statement
        - The decision statement helps the programmer to skip the block of instructions from the execution if the condition is not satisfied.
        - It is of 4 types
            - If
            - If-else
            - If-else if
            - Switch

        i. if 
            - it is used to execute one block of code/instruction by having one condition.
            - Syntax to create if statement:
                if(condition) {
                    // statement
                }
            - execution flow
                - if the condition is satisfied then the instruction written inside the if block gets executed or normal flow of the execution continues (Instructions written inside the if block is skipped if condition is not satisfied).
            - ex: 
                - WAP to check is the number even.

        ii. if-else
            - it is used to execute single block of code from two different/opposite statements by checking the condition only single time.
            - Syntax to create if-else statement:
                if(condition) {
                    // statement 1
                }
                else{
                    // statement 2
                }
            - execution flow
                - if condition is true then statement inside the if block gets executed otherwise statement inside the else block gets executed.
            - ex: 
                - WAP to check is the number even or odd.

        iii. if-else-if
            - where we have multiple statements with multiple conditions to be checked
            - statement must be interconnected. 
            - Syntax to create if-else-if statement:
                if (condition){
                    // statement 1
                } else if (condition) {
                    // statement 2
                } else if (condition) {
                    // statement 3
                } 
                ...
                else {
                    // statement n
                }
            - In this syntax, else is optional.
            - execution workflow
                - If the condition is satisfied then the instruction written inside the if block gets executed if not satisfied, the condition is checked in the else if block from top to bottom order and if the condition is satisfied in any of the else if block then, only that else if block is gets executed if not satisfied else block gets exevuted remaining blocks are skipped.

            Questions
            - Print the month name based on month number.
            - Print the day name based on day number.
            - Print the number of days available in the month based on the month number.
            - Check given character is uppercase character or lowercase character or digit character or special character
            - Find out largest of two numbers
            - If the character is in uppercase, convert it into lowercase and if the character is in lowercase, convert it into uppercase
            - Check the digit is even or odd.
        
        iv. switch statement:
            - used to execute block of code from multiple cases based on value of an expression.
            - Syntax:
                switch(val / var / expression)
                {
                case value / constant expression:
                {
                    // statement
                }
                [break;]
                case value / constant expression:
                {
                    // statement
                [break;]
                }
                ...
                [default:
                {
                    // default statement
                }]
                }

            - Why we use Switch?
                - High performance
                - Grouping

            Ques 1: Write a java program to print the month name based on the month number
            Ques 2: Write a java program to print number of days availabe in the month based on the month number 
            Ques 3: Write a java program to check if the given character is vowel or consonent 

Method:
-------
    - It is a block of statement which is going to get execute if you are going to call it.

    - Characteristics / Rules to work with method 
        - Method should be defined inside the class
        - We can define more than one method inside the class 
        - We can't define a method inside a method
        - But we can call a method from another method 
    
    - Syntax of defining the method:
        [access modifier] [modifier] return_type methodName ( [formal argument])  //method declaration
        {                                          //method signature
            //instructions
        }  //method definition is whole structure

        In this above syntax access modifier, modifier and formal argument are optional 

    - Method call statement: It is used to call a method 
        Syntax:
            Method_Name ([actual argument]);
        - In this syntax actual argument is optional 
        - The syntax will be varied based on the method structure

    1. Method signature:
        - Method name
        - Method argument

    2. Method declaration:
        - Access modifier
        - modifier
        - return type
        - method signature

    3. Method definition:
        - method declaration
        - methodbody / implementation / block 

    - Types of Methods: There are many more types of methods 
        - Based on the task
            1. Getter method
            2. Setter method

        - Based on access modifies
            1. Public
            2. Protected
            3. Private
            4. Default

        - Based on structure
            1. Complete (class) -> with declaration and initialization
            2. Incomplete (abstract) -> withoud initialization only declaration

        - Based on modifies
            - There are many more...
            - But mainly used
                1. Static 
                2. Non-Static

        - Based on the number of arguments, methods are classsified into 2 types:
            1. No- argument method
                - A method which does not have formal argument is known as no - argument method
                - ex: 
                    public static void demo()
                    {
                        System.out.println("demo() no argument method");
                    }

            2. Parameterized method
                - The method which has formal argument is known as parameterized method. These are used to accept the data 
                - ex: public static void demo(int a)
                    {
                        System.out.println("demo(int a) parameterized method");
                    }

                - Rules to call parameterized method:
                    1. The number of actual argument should be same as the number of formal argument
                    2. The type of corresponding actual argument should be same as the type of formal argument, if not compiler tries to convert implicit conversion if it is not possible then we will get compile time error.
                    3. The sequesnce of actual argument should be same as the sequesnce of formal argument.
        
            - actual argument --> arguments send in call method
                - The values passed in the method call statement is known as Actual Argument.
            - formal argument --> arguments send int the method
                - A variable which is declared in a method Declaration is known as Formal Argument.

            - Why Parameterized method is used instead of Non-parameterized method
                - because it accepts the input and give the output based on the given input
                - whereas non-parameterized is used for getting the fixed output
            
    - Method call Statement flow:
        - Execution of calling method is paused
        - Control is transferred to the called method.
        - Execution of called method begins.
        - Once the execution of the called method is completed the control is transferred back to the calling method.
        - Execution of calling method resumes.
    
    - Calling Method:
        - The method which is trying to call another method is known as the calling method (caller).
    - Called Method:
        - The method which is being called by the caller is known as a called method.

Modifier & Access Modifier
--------------------------
    - Modifiers
        - It is used to change the characterstics of java components
        - ex:
            strictfp
            final
            static 
            abstract
            public
            private
            protected
            transient
            volatile 
            ... etc

    - Access Modifier (Access Specifier -> in C/C++)
        - It is used to change/modify the accessibility of java components

        - We have 4 types of Access Modifiers
            1. private
                - It is a class level Modifier, it is responsible for variables, methods and constructors.
                - If the member of a class is prefixed with a private modifier then it is accessible only within the class; accessing outside the class is not possible.
                - we can't make class private.

            2. default
                - The accessibility of default Modifiers is only within the package. It can't be accessed from outside the package.
                - If you don't declare any access Modifiers then it is considered as a default access modifier.

            3. protected
                - The access level of a protected modifier is within the package and outside the package through child class.
                - If you don't make the child class, it cannot be accessed from outside the package.

            4. public
                - The access level of the public modifier is everywhere.
                - It can be accessed from within the class, outside the class, within the package as well as outside the package.

        - Scope of Access Modifiers
            Access Modifiers | Within the class | Within the package | Outside the package | Outside the package by child class
            private          | Yes              | No                 | No                  | No
            default          | Yes              | Yes                | No                  | No
            protected        | Yes              | Yes                | No                  | Yes
            public           | Yes              | Yes                | Yes                 | Yes

        - The Scope of the access Modifiers based on the accessibility is:
            private < default < protected < public 

Modifier
--------
    - final
        - It is a keyword and a modifier
        - It can used with variable, class, method
        - If we are using the final with variable, variable can be reaccess but it can't be reinitialized.
        - ex1: without final
            class A {
                psvm() {
                    int x = 10;
                    sopln(x); // 10
                    sopln(x); // 10
                    int x = 20;
                    sopln(x); // 20
                }
            }
        - ex2: with final but without reinitialize
            class A {
                psvm() {
                    final int x = 10;
                    sopln(x); // 10
                    sopln(x); // 10
                }
            }
        - ex3: with final and with reinitialize
            class A {
                psvm() {
                    final int x = 10;
                    sopln(x); // 10

                    x = 20; // CTE - error
                }
            }

Initializer
-----------
    - used to initialize the variable
    - used to execute the 

    - Types
        1.. Single line initializer
            - ex:
                int r = 7;
                int x; x = 8; // not an initializer -> error

            - Types
                i. Static Initializer
                    - ex:
                        static int r = 8;

                ii. Non-Static Initializer
                    - ex:
                        int r = 8;

        2. Multi line initializer
            - ex:
                {
                    System.out.println("hello");
                }
                public static void main(String[] args){
                    System.out.println("hey");
                }
                {
                    System.out.println("Bye");
                }
                
            - Types
                i. Static Initializer
                    - ex:
                        static 
                        {
                            System.out.println("Hello");
                        }

                ii. Non-Static Initializer
                    - ex:
                        {
                            System.out.println("Hello");
                        }

        - Static initializer will be executed before main
        - Non-static initializer will be executed while object creation

-------------------------------------------------------------------------------

Story
-----
    Code compiled -> javac
    byte code -> JVM

    JVM does not have it's own memory
        -> ask JRE

    JRE also not have any memory 
        -> ask RAM

    Then JRE structured the data into format
        1. Method Area -> methods/multi-line initializers (loading(static/non-static))
        2. Static Pool Area -> static members (storing)
            -> individual block of memory inside static pool known as Class Static Area
        3. Stack Area -> execute
        4. Heap Area -> non-static members (storing)
            -> block of memory inside heap area known as Objects
                Objects
                    - entity of real life 
                    - state of the object -> represented by variables
                    - behaviour of object -> represented by methods

                    - Object stored in Object Address
                    - java doesn't give object's real address, instead it give you the reference => Object Reference
                        -> reference address format - classname@hexadecimal_value
                    - we get the object reference address by creating the object.
                Class
                    - design/blueprint 

        -> Give back to JVM

    JVM loads all the class in the Structure
        Loading -> only available
        Storing -> ready to use

--------------------------------------------------------------------

Objects
-------
    - entity of real life / instance of class
    - acc. to java, it is a block of memory which is present inside the Heap Area which stores non-static members(variable, memeber, initializer)
    - state of the object -> represented by variables
    - behaviour of object -> represented by methods

    - Object stored in Object Address
    - java doesn't give object's real address, instead it give you the reference => Object Reference
        -> reference format - classname@hexadecimal_value
    - we get the object reference address by creating the object.

Static/Non-static 
-----------------
    - static which value is same for all
    - also known as sharing member
        - adv - memory optimization
    - non-static which value is different for all
        - adv - security

Class/ Concrete class
---------------------
    - design/blueprint 
    - fully completed
    - allowed only concrete methods

Abstract class 
--------------
    - highlevel design
    - partially incomplete
    - use abstract keyword/modifier before class
    - syntax:
        abstract class A {
            public static void main(String[] args){
                // code
            }
        }
    - we cannot let anyone create object of abstract class.

Assignment - Create 5 Abstract classes and interface, then compile them and execute them

interface 
---------
    - fully incomplete
    - top-highlevel design
    - interface A {
        public static void main(String[] args){ // optional
            // code
        }

        // code
    }
    - allowed abstract methods

- abstract method
    - incomplete method
        - where there is method declaration but no initialization
        - ends with semicolon
        - declared with abstract keyword
    - abstract methods cannot be static or final or private
    - should be non-static
    - allowed inside abstract method and interface only not in concrete class.
    - cannot be called object of abstract methods
    - abstract method are only declared in abstract class not in concrete class or any other

- Object Creation
    - Syntax:
        new Constructor;
            OR
        new ClassName([Actual Argument] --> optional);
    - new -> keyword as well as operator
        - used to create object
    - Constructor 
        - helps new to create object
        - used to store non-static members inside the object

- Constructor
    - Special Type of non-static method
    - doesn't have return type
    - name should be same as ClassName

    - we don't directly call constructor
    - syntax:
        new constructor;

    - Assignment
        - Create abstract methods inside abstract classes
        - Create 5 constructor inside 5 classes
            - Student
            - Employee
            - User
            - Product
            - Customer
        - Create 3 objects
            - directly create
            - get the reference
            - store the reference

- Anonymous Object
    - which we don't have any reference to access it.
        new A(); // no reference stored
    - to print refrence of any anonmous objec:
        System.out.println(new A()); // return reference
    - to store the object 
        A variable = new A(); // storing the reference inside variable.


- Class loader
    - JVM calls to load the class 
    - It loads all the members of class and
    - it stores only static members

- execute
    - Stack area uses LIFO -> from bottom to up
    - to access the non-static members, we have to create the object in heap area
    - in stack area, all local variable is stored inside the stack blocks

- Constructor stores the non-static members inside object

- Object loader
    - stores all the non-static members by using Constructors

- Static members are stored automatically (by default stored)
- Non-static members are not stored automatically, we have to manually stored in memory

- Why we have to create objects
    - to access the non-static members
        - because non-static members are not stored inside the memory


Packages
----------
    - container like stuctures which contains class files and interfaces
    - package should be the first statement inside the file
    - only one package
    - create by the help of package keyword
    - Two types of packages
        1. User define 
        2. pre define 
            - Java library
                - it is having subpackages like 
                    - lang
                    - util
                    - io
                    - sql
                    - jwt

    - to access packages, there are two ways
        - fully qualified name
            - when we only need to use only 1 time
            main() {
                System.out.println("hey); 
                java.util.ArrayList h; // fully qualified name
            }

        - import statement
            - when we want to use multiple time
                import java.util.ArrayList;
                import java.io.fileInputStream;
                import java.lang.String;

    - advantage
        - maintainablity
        - security
        - naming confusion
        - code reusability

            
Accessing Static Members
------------------------
    - There are three ways of accessing static members
        1. Directly by memberName
        2. Other ways
            i. ClassName.memberName;
            ii. objectReference.memberName
    
    - All the static members can accessed in all 3 ways from static method and non static method.

    - NOTE:
        - If its in same class we should call directly
        - We should avoid to call static member by using object reference.
        - When to use classname to call static member in the same class ?
            - If static variable and local variable are having same name then to differentiate static variable from local variable, we will use ClassName with static variable.


Accessing Non-Static Members
------------------------
    - There are three ways of accessing static members
        1. Directly --> only when main method is non-static
        2. Other ways
            i. objectReference.memberName
            ii. this.memberName or super.memberName;
            
    - Accessing non-static member from non-static method
        - we can use all 3 ways  
        - NOTE:
            - If its in same class and from non-static we should call directly.
            - We should avoid to call non-static member from non-static by using object reference.
            - When to use this to call non-static member in the same class ?
                - If non-static variable and local variable are having same name then to differentiate non-static variable from local variable, we will use this keyword with non-static variable.

    - Accessing non-static member from static method
        - we are having only 1 ways that is object reference


Difference b/w static & non-static
----------------------------------
    - common prop | unique prop  (at least 10)

    - static
        - static is a keyword and modifier
        - in static, we assign the value which is common for all.
        - static members are defined by using static keyword.
        - stores in class static area inside the static pool area.
        - Static members are stored automatically (by default stored).
        - class loader is used to stores the static members.
        - we do not have to create object in order to store static members.
        - there are three ways to access static members:
            i. Directly by memberName
            ii. ClassName.memberName
            iii. objectReference.memberName
        - we can use all three ways when accessing static members from both non-static and static method.
        - if it is in same class we should call directly
        - we should avoid to call static member by using object reference.
        - if static variable and local variable are having same name then to differentiate static variable from local variable, we will use ClassName with static variable.
        - advantage - memory optimization


    - non-static
        - non-static is not a keyword, it just a concept in modifier
        - in non-static, we assign the value which is different for all.
        - if we don't use static keyword, it is consider non-static.
        - stores in object inside the heap area.
        - Non-static members are not stored automatically, we have to manually stored in memory.
        - constructor is used to store the non-static members.
        - we have to create object to access non-static members.
        - there are three ways to access non-static members:
            i. Directly by memberName
            ii. objectReference.memberName
            iii. this.memberName OR super.memberName
        - we can use all 3 ways when accessing non-static members from non-static method. But we can only use 1 way (objectReference.memberName) when accessing non-static members from static methods.
        - if it is in same class and from non-static we should call directly.
        - We should avoid to call non-static member from non-static method by using object reference.
        - if non-static variable and local variable are having same name then to differentiate non-static variable from local variable, we will use this keyword with non-static variable.
        - advantage - security


Return type
-----------
    - It is used to specify the type of value return by the method
    - It is of three types
        1. void
        2. Primitive Return Type
            - to specify return type we use primitive datatype 
            - there are 8 primitive datatypes
        3. Non-Primitive Return Type
            - to specify return type we use is non-primitive datatype
            - String, ClassName, ArrayList, etc.

    - To return the values, we are using return statement

    - A method after execution will return a data back to the caller with the help of return statement

    - Return Statement
        - It is used to return the value.
        - syntax :
            [return [value/variable/expression];] => optional
        - in this syntax, value, variable and expression are optional and return statement is also optional

        - return keyword
            - return is a keyword.
            - It is a control transfer statement.
            - When the return statement is executed, the execution of the method is terminated and control is transfer to the calling method.

        - Steps to use return statement
            1. Provide a return type for a method (it should not be void).
            2. Use the return statement in the value to be returned.
            Rule for Return Statement:
                - The type specified as return type should be same as the type of value passed in a return statement. 
                - return statement should be last statement & it can many but only one should be executable.

    - null  
        - default value for non-primitive data type.
    
    - to access the value of local variable, then we can just return the variable.

Void with return statement
----------------------------
    - Void
        - void is a data type that is used as a return type when the method returns nothing.
        - It is a keyword in Java

        - The time of method doesn't promise to return any value, we are making method the return type void
        - The time of method of having void return type, it can take return statement in the method but that is not compulsory.
        - If we are taking return statement, we should not pass any value to the return statement (neither 0 nor 0.0 or null, etc.).

Primitive return type and return statement
------------------------------------------
    - if method promises to return primitive values, we should make our method return type as primitive return type, by the help of primitive datatype 
    - (such as byte, short, char, int, long, boolean, float, double)

    - in this case, return statement is compulsory.
    - passing the value to return statement is compulsory.
    - we can pass different value to return statement with respect to return type, if implicit typecasting is possible. Or else, we get CTE.

Non Primitive return type and return statement
----------------------------------------------
    - if method promises to return non-primitive data, we should make our method return type as non-primitive return type, by the help of non-primitive datatype 
    - (such as ClassName, ArrayList, HashMap, String, etc...)

    - in this case, return statement is compulsory.
    - passing the value to return statement is compulsory.
    - we can pass different value to return statement with respect to return type, if implicit typecasting is possible. Or else, we get CTE.


Calling the method with respect to return type and return statement
-------------------------------------------------------------------
    - There are three ways to call a method
        1. directly
        2. inside printing statement
        3. inside variable

    - If method is having void type return type, we can call only directly
    - void -> can only access directly
    - If we are trying to call it inside the printing statement or variable, we get CTE

    - If method is having primitive return type or non-primitive return type, we can call them in all three ways.
    - primitive/non-primitive -> can access by all three ways
    - We can call them directly, if we don't want return value.
    - We can call them inside the printing statement, if we want to use the return value only once.
    - We can call them inside the variable, if we want to use the return value muliple times or again and again.

Array
-----
    - sequence of multiple values of same datatype
    - ways to create
        - Syntax 1
            datatype [] variable = {val1, val2, ...};

        - Syntax 2
            - Declaration
            datatype [] var;
            OR
            datatype[] var;
            OR
            datatype[]var;
            OR
            datatype []var;
            OR
            datatype var[];
            OR
            datatype var [];

            - with initialization
            datatype[] variable = new datatype[size];


    - WAJP to create a method which will print the integer array elements

    - main is string type
        - because we can pass multiple different type data inside the string

- Main method
    - The execution of a java program always starts from the main method defined as follows.
    public static void main(String[] args){ }

    - Purpose of the Main Method:
        - Start the execution
        - Control the flow of the execution
        - End of execution
    - NOTE: 
        - A method can be executed only when it is called, we can call a method any number of times, therefore it is said to be code reusability.
        - The main method is always called by JVM.

    - Why main is public static void main(String[] args)
        - main is public because jvm can call it anywhere
        - main is static because jvm can call it without creating an object
        - return type is void because main does not promise to return any value after execution.
        - "main" is identifier to identify the main method from other methods of the class.
        - (String[] args) it is a formal argument which makes main method parameterised.
            - It is String type because we can pass different different type of data in main method.
            - It is array type because, we can pass more than 1 data to the main method.
            - args, it is a local variable, which is string array type, which will store those array element reference we will pass to the main method.


# Notes
JAVA RUNTIME MEMORY
-------------------
    - To execute the java program a portion of memory in RAM is allocated for JRE.
    - In that portion of memory allocated, we have different range of memory, hence they are classified as follows:
        1. Method area
        2. Static Pool Area
        3. Stack area
        4. Heap area

    1. METHOD AREA

        - All the methods and multi line initialiers blocks will be loaded in a method area with reference (Instruction of the methods).

    2. Static Pool Area
        - It is having many more class static area for each class.

        - Class Static Area
            - For every class there is a dedicated block of memory is created in the Static Pool Area (static pool) which is known as class static area.
            - The static members of the class will be allocated inside the memory created for the class.

    3. STACK AREA
        - The stack area is used for the execution of instructions.
        - For every method that is under execution a block of memory is created in this stack area which is known as a frame.
        - Once the execution of a method is completed the frame is removed.

    4. HEAP AREA
        - In a heap area, a block of memory is created for the instance of a class (Object).
        - Every block of memory is created with the help of reference.
        - All the non-static members or instance member will be stored inside the object block which is present inside the Heap Area.
            

STATIC
------
    - What is static?
        - Static is keyword and modifier.
        - Any member of a class is prefixed with a static modifier then it is known as a static member of a class.
        - Static members are also known as class members.

        NOTE:
        - Static members can be prefixed only for a class members (member declared in a class).

    - STATIC MEMBERS
        - Static method
        - Static variable
        - Static initializers

STATIC VARIABLE
---------------
    - Variable declared in a class block and prefixed with static modifier is known as static variable.

    - Characteristics
        - It is a member of the class.
        - It will be assigned a default value.
        - Memory will be allocated inside the class static area.
        - It is global in nature, it can be used within the class as well as in different classes.
        - We can use a static variable with the help of the class name as well as with the help of object reference.
        - We can access the static variable from different classes directly with the help of the class name.

    NOTE:
        - If static variable and local variable are in the same name then we can differentiate static variable with the help of class name.

STATIC METHOD
-------------
    - A method prefixed with a static modifier is known as the static method.

    - Characteristics
        - Static method block is loaded in the method area and reference of the static method is stored inside the class static area (static pool).
        - We can use the static method with or without creating an object of the class.
        - We can use the static method with the help of the class name.
        - A static method of the class can be used in any class with the help of a class name.

STATIC INITIALIZERS
-------------------
    - We have two types of static initializers. Those are:
        1. Single line static initializer
        2. Multi-line static initializer

    1. SINGLE LINE STATIC INITIALIZER

        - Syntax to create single line static initializers:
            static data type variable = value / expression;

        - Example:
            static int a = 10;

    2. MULTI-LINE STATIC INITIALIZER
        - Syntax to create multi line static initializers:
            static
            {
                // Statements;
            }

        - Example:
            static
            {
                System.out.println("Welcome to ATM");
            }

    - CHARACTERISTICS
        - Static initializers get executed implicitly during the loading process of the class.
        - A class can have more than one static initializer they execute top to bottom order.

    - PURPOSE OF STATIC INITIALIZER
        - Static initializers are used to execute the startup instructions during the class loading process.
        - As the static blocks get executed before the actual execution of the main method.

STATIC CONTEXT
--------------
    - The block which belongs to the static method and multi-line static initializer is known as static context.
    - Inside a static context, we can use the static members of the same class directly by using its name.
    - Inside a static context, we can't use the non-static members of the same or different class directly by using its name or by using its class name.
    - this keyword is not allowed inside the static context.


CLASS
-----
    - What is class?
        - According to real-world situations before constructing an object blueprint of the object must be designed, it provides the specification of the real world object.
        - Similarly in object-oriented programming before creating an object the blueprint of the object must be designed which provides the specification of the object, this is done with the help of class.

    - DEFINITION OF CLASS
        - It is a user-defined non-primitive data type, it represents the blueprint of the real-world object.
        - The class provides the specification of real-world objects.

    NOTE:
        - We can create any number of objects for a class.
        - Multiple objects created using the same class are called Similar Objects or Identical Objects.


OBJECT
------
    - What is object?
        - Any substance which has existed in the real world is known as an object.
        - Every object will have attributes and behaviors.

    - Object in Java
        - According to object-oriented programming, the object is a block of memory created in the heap area during the runtime, it represents a real-world object.
        - A real-world object consists of attributes and behavior.
        - Attributes are represented with the help of non-static variables.
        - Behaviors are represented with the help of non-static methods.
        - It is also known as Instance of the class. Means example of one design.
        - The other name of Object is instance.

    - STEPS TO CREATE AN OBJECT
        STEP 1:
            - Create a class or use an existing class if already created.
        STEP 2:
            - Instantiation.

        - INSTANTIATION
            - The process of creating an object is known as Instantiation.
            - Syntax to create an object:
                new ClassName([Actual Argument]);
                Here,
                ClassName([Actual Argument]) is Constructor.

NEW KEYWORD
-----------
    - new is a keyword.
    - It is a unary operator.
    - It is used to create a block of memory inside the Heap Area during runtime.
    - Once the object is created, it returns the reference of the object.

    - EXAMPLE

        Step 1: Designing a class
            class Employee
            {
                String ename;
                int eid;
            }

        Step 2: Instantiation
            new Employee();

ANONYMOUS OBJECT
----------------
    - The object which is created and whose reference is not stored is known as an Anonymous Object.
    - Generally, while creating an object to access its properties, we store its reference using a specific reference variable with the help of a non-primitive data type.

NON-PRIMITIVE DATA TYPE
-----------------------
    - Every class name in Java is a non-primitive data type.
    - Non-primitive data types are used to create a non-primitive variable to store the reference of an object.

    - EXAMPLE
        class Employee
        {
            String ename;
            int eid;
        }

        class Driver
        {
            public static void main(String[] args)
            {
                Employee e = new Employee();
                System.out.println(e);      // Employee@4dvec1
            }
        }

NON-STATIC
----------
    - Any member declared in a class and not prefixed with a static modifier is known as a Non-Static member of a class.
    - Non-static members belong to an instance of a class. Hence, they are also known as Instance Members or Object Members.
    - Memory for the non-static members is allocated inside the Heap Area (instance of a class).
    - Non-static members will be allocated in every instance of a class.

NON-STATIC MEMBERS
------------------
    - Non-static variable / Instance variable
    - Non-static method / Instance method
    - Non-static initializer / Instance initializer
    - Constructors

NON-STATIC VARIABLE
-------------------
    - A variable declared inside a class block and outside any method or multiline initializer block and not prefixed with a static modifier is known as a Non-Static Variable.

    - Characteristics
        - We can't use a non-static variable without creating an object inside the static context directly, but we can use it inside a non-static context.
        - We can only use the non-static variable with the help of an object reference.
        - Non-static variables are assigned default values during the object loading process.
        - Multiple copies of non-static variables are created (one copy for every object).

NON-STATIC METHOD
-----------------
    - A method declared in a class block and not prefixed with a static modifier is known as a Non-Static Method.

    - Characteristics
        - A method block will be loaded inside the Method Area and a reference of the method will be stored inside the instance (object) of a class.
        - We can't call a non-static method inside the static context without creating an object, but we can use it inside a non-static context.
        - We can't access a non-static method with the help of the class name.
        - A non-static method can be accessed directly inside a non-static context by its name, but it can't be accessed directly inside a static context by its name.
        - The same rule is applicable to non-static variables.

NON-STATIC CONTEXT
------------------
    - The block which belongs to the non-static method and multi-line non-static initializer is known as Non-Static Context.
    - Inside a non-static context, we can use both static and non-static members of the same class directly by using their names.

NON-STATIC INITIALIZERS
-----------------------
    - Non-static initializers execute during the loading process of an object.
    - Non-static initializers execute once for every instance (object) created.

PURPOSE OF NON-STATIC INITIALIZERS
----------------------------------
    - Non-static initializers are used to execute the startup instructions for an object.

    - TYPES OF NON-STATIC INITIALIZERS
        1. Single-line Non-Static Initializer
        2. Multi-line Non-Static Initializer

    1. SINGLE-LINE NON-STATIC INITIALIZER
        - Syntax:
            datatype variable = value / reference;

    2. MULTI-LINE NON-STATIC INITIALIZER

        - Syntax:
            {
                // statements;
            }

        - NOTE:
            - All non-static initializers execute from top to bottom for every object creation.

THIS KEYWORD
------------
    - `this` is a keyword.
    - It is a non-static variable that holds the reference of the current executing object.

    - USES OF THIS
        - Used to access the members of the current object.
        - Used to give the reference of the current object.
        - Used to differentiate a local variable from a non-static variable when both have the same name.
        - Used to call another constructor of the same class using the `this()` call statement.

TRACE THE GIVEN PROGRAM
-----------------------
    class Demo
    {
        {
            System.out.println("Multi line non-static initializer");
        }

        static int a = 20;

        static
        {
            System.out.println("Value of a is " + a);
        }

        int b;
        String str = "Hello";

        public static void main(String[] args)
        {
            Demo d = new Demo();
            d.test();
        }

        void test()
        {
            System.out.println("Instance Method");
        }
    }

CONSTRUCTOR
-----------
    - A Constructor is a special type of non-static method whose name is the same as the class name.
    - A constructor does not have any return type.

    - Syntax
        [access_modifier] ClassName([Formal_Arguments])
        {
            // initialization
        }

    - PURPOSE OF CONSTRUCTOR
        - During the execution of a constructor:
            - Non-static members of the class are loaded into the object.
            - If there are non-static initializers in the class, they execute from top to bottom.
            - After that, the programmer-written instructions inside the constructor are executed.

        NOTE:
            - If the programmer does not create a constructor, the compiler automatically provides a **Default Constructor**.

CLASSIFICATION OF CONSTRUCTORS
------------------------------
    - Constructors are classified into two types based on the formal arguments:
        1. No-Argument Constructor
        2. Parameterized Constructor

    1. NO-ARGUMENT CONSTRUCTOR
        - A constructor that does not have any formal arguments is called a No-Argument Constructor.
    
        - Syntax to create a No-Argument Constructor
            [access_modifier] ClassName()
            {
                // code;
            }

        - Note
            - If the programmer fails to create a constructor, then the compiler implicitly adds a no-argument constructor, which is known as the **Default Constructor**.

    2. PARAMETERIZED CONSTRUCTOR
        - A constructor that has one or more formal arguments is called a Parameterized Constructor.

LOADING PROCESS OF AN OBJECT
----------------------------
    - The `new` keyword creates a block of memory in the heap area with a reference.
    - The constructor is called.

    - During the execution of the constructor:
        1. All the non-static members of the class are loaded into the object.
        2. If there are non-static initializers, they are executed from top to bottom.
        3. Programmer-written instructions inside the constructor are executed.

    - The execution of the constructor is completed.
    - The object is created successfully.
    - The reference of the object is returned by the `new` keyword.
    - These steps are repeated for every object creation.

PARAMETERIZED CONSTRUCTOR
-------------------------
    - A constructor that has one or more formal arguments is known as a Parameterized Constructor.

    - Syntax to create a Parameterized Constructor
        [access_modifier] ClassName([Formal_Argument])
        {
            // statement;
        }

    - PURPOSE OF THE PARAMETERIZED CONSTRUCTOR
        - Parameterized constructors are used to initialize the non-static variables by accepting the data from the constructor in the object creation statement.

---------------------------------------------------------------------

# ...


Method Overloading
------------------
    - If one class having more than 1 method of same name, but change in formal argument is known as Method Overloading.
    - Change in formal argument means
        - no. of formal argument should be different
        - type of formal argument should be different
        - sequence of formal argument should be different
    - ex:
        class A {
            public static void m1(){ }
            public static void m1(int a){ }
            public static void m1(double a){ }
            public static void m1(int a, double a){ }
            public static void m1(double a, int a){ }
        }

    - We can overload both static and non-static methods
    - Multiple method doing same work.
    - The time of overloading, we should not focus on 
        - return type of method
        - variable name of the formal argument of the method
        - access modifier and modifier of the method // not imp

    - Real time java example of overloading is
        - printing statement of PrintStream class
            - print
            - println


    - System.out.println();
    - println & print are the overloaded methods
        - present in java.io package
        - define in PrintStream class
        - they are non-static methods because
            - print & println is called by using out which is object reference variable
        - System is a class inside java.lang package
        - out is a static variable which is present inside the System class
            - public final static PrintStream out = null;
            - out is present inside java.lang package

Constructor Overloading
-----------------------
    - If one class having more than 1 constructor, but having different formal argument is known as Constructor Overloading.

    - jvm by default add a constructor, if programmer fails to create a constructor

    - provide flexibility to users

    Student(){
    }
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
    Student(String name){
        this.(); => calls no argument constructor
        this.name = name;
    }

    - new
    - Constructor Calling statement (use only in constructor block, should be the first statement)
        - this call statement 
            - can be n-1 this call statement otherwise give error (give recursion which is not allowed in constructor)
            - calling one class constructor from another class constructor
            - to use same class constructor
            this.([Actual Argument])
        - super call statement 
            - to use parent class constructor
            super.([Actual Argument])


# OOPs
- introduced by **Alen Key**
- s for system/structure
- program contains 6 concepts or (2 concepts and 4 principles)
    - Concepts
        - Object
        - Class
    - Principles (we can also call them concepts)
        - Encapsulation
        - Inheritance
        - Polymorphism
        - Abstraction

- is java purly object oriented programming language?
    - No, it doesn't contain all object oriented concepts.

- purely object oriented programming language
    - Small talk -> purely oops language (by Alen Key)

Encapsulation
-------------
- Based on the work, methods are of two types
    1. getter method
        - use to fetch the data
        - we expect return from getter
        - return type is the type of return value
    2. setter method
        - use to set/modify the data
        - return type is void

- Encapsulation
    - binding state and behavior of an object together.
    - restricting the direct access of data members of an object
    - providing the indirect access via the methods of same class

- Data hiding
    - resticting the direct access of data members by providing the indirect secure access by the method of the object.

    - Steps to achive data hiding
        - making the data members private
        - making the setter and getter
            
    - Advantage
        - security
        - make data member only readable or writeable or both or neither.

ENCAPSULATION
-------------
- The process of binding the state (attributes/fields) and behavior of an object together is known as encapsulation.
- We can achieve encapsulation in Java with the help of a class. A class contains both the state and behavior of an object.

    - ADVANTAGE OF ENCAPSULATION
        - By using encapsulation, we can achieve data hiding.

    - DATA HIDING
        - It is the process of restricting the direct access of data members of an object and providing indirect secured access to data members through methods of the same object. This is known as data hiding.
        - Data hiding helps to verify and validate the data before storing and modifying it.

    - STEPS TO ACHIEVE DATA HIDING
        - Step 1:
            - Prefix the data members of a class with the `private` access modifier.
        - Step 2:
            - Design public Getter and Setter methods.

    - PRIVATE MODIFIER
        - `private` is an access modifier.
        - `private` is a class-level modifier.
        - If the members of a class are prefixed with the `private` modifier, then those members can only be accessed within the same class.

    - NOTE:
        - Data hiding can be achieved with the help of the `private` modifier.

    - GETTER METHOD
        - The getter method is used to fetch (read) the data.
        - The return type of the getter method is the type of the hidden value.

    - SETTER METHOD
        - The setter method is used to update or modify the data.
        - The return type of the setter method is always `void`.

    - NOTE:
        - Validation and verification can be performed in the getter/setter methods before storing the data and before reading private data members.

        - If you want to make your hidden data member **only readable**, create only the **Getter** method.
        - If you want to make your hidden data member **only modifiable**, create only the **Setter** method.
        - If you want to make your hidden data member **both readable and modifiable**, create both **Getter** and **Setter** methods.
        - If you want to make your hidden data member **neither readable nor modifiable**, do not create either a Getter or Setter method.

    - ADVANTAGES
        - Provides security to the data members.
        - We can verify and validate the data before modifying it.
        - We can make the data member of a class:
            - Only readable
            - Only modifiable
            - Both readable and modifiable
            - Neither readable nor modifiable


- real life example of encapsulation
    - any registration page which provides validation and verification

- real life java language
    - Thread
        - it has priority


Garbage Collection
------------------

- Definition
    - The process of removing the dereferenced object from the memory and making the memory free for the new object is known as Garbage Collection.


- Garbage Collector
    - It is done by the Garbage Collector, which is represented by a method called:
        gc()

    - This method is present inside the System class and, by nature, it is static.

    - To call it, we use:
        System.gc();
        - But it is automatically invoked by the JVM.

    - It is a daemon thread.


- Finalize Method
    - Before the Garbage Collector removes the object from the memory, it calls the finalize() method to perform the clean-up process.


- Clean-up Process
    - The clean-up process means checking whether:
        - The object is actually dereferenced or not.
        - Any pending work of the object is left or not before collecting the object.
    - ex:
        User u1 = new User();
        System.out.println(u1.x); // 0
        User u2 = u1;
        u1 = null;

    - NOTE:
        - The object will not be removed immediately by the Garbage Collector (GC).


    - Questions
        1. Where is the finalize() method present?
            - It is present inside the Object class.

        2. How many ways can we make an object dereferenced?
            - There are 3 ways by which we can make an object dereferenced:
                1. By creating an anonymous object.
                2. By making the reference variable of an object null.
                3. By assigning a new reference to an existing object reference variable.


## WAYS TO MAKE AN OBJECT DEREFERENCED

1) By Creating an Anonymous Object
    - Example:
        class User {
            int x;
            public User() {
            }
            public static void main(String[] args) {
                System.out.println(new User().x);   // 0
                new User().m1();
            }
            void m1() {
                System.out.println("Hi");
            }
        }

    - Explanation:
        - The object is created without storing its reference in any variable.
        - After the statement executes, the object becomes dereferenced and is eligible for Garbage Collection.


2) By Making the Reference Variable Null
    - Example:
        User u1 = new User();
        System.out.println(u1.x);      // 0
        System.out.println(u1.m1());
        u1 = null;
        System.out.println(u1.x);      // Error -> NullPointerException

    - Explanation:
        - When the reference variable is assigned null, it no longer points to the object. 
        - The object becomes dereferenced and is eligible for Garbage Collection.


3) By Assigning a New Reference
    - Example:
        User a = new User();
        User b = new User();
        a = b;
    - Explanation:
        After executing:
            a = b;

        - The object originally referenced by 'a' loses its reference (provided
        no other reference points to it). 
        - That object becomes dereferenced and is eligible for Garbage Collection.


    - NOTE:
        - Because of this feature, Java supports:
            - Robust:
                - Dynamic Memory Allocation
                - Automatic Memory Management

- NOTE
    - Garbage collection will not collect by default all the dereferenced object.
    - It can be collect those dereferenced object which are created by new keyword.

    - ex:
        String obj; // this will not collected by the garbage collector.

        String s = "Hy";
        s = "Bye";

===========================================================================================

Relationship
------------

- Definition
    - Connection or association between two objects is known as Relationship.

                      Employee
                    /    |    \
                   /     |     \
                HR    Manager   Car

    - (An employee can be associated with multiple objects such as HR, Manager, Car, etc.)


- Types of Relationship
    - There are two types of relationships:
        1. HAS-A Relationship (dependency type)
        2. IS-A Relationship (parent-child type)

    1) HAS-A RELATIONSHIP
        - If one object depends on another object, this type of relationship is known as HAS-A Relationship.
        - It is based on level of object dependency.
        - HAS-A Relationship is of two types:
            1. Composition  -> Complete Dependency
            2. Aggregation  -> Partial Dependency

        1. Composition
            - Complete dependency.
            - If the parent object is destroyed, the child object is also
            destroyed.
            - ex:
                House  ----contains----> Rooms


        2. Aggregation
            - Partial dependency.
            - The child object can exist independently even if the parent object is destroyed.
            - ex:
                College ----has----> Students


    2) IS-A RELATIONSHIP
        - The Parent-Child relationship is known as IS-A Relationship.
        - It represents Inheritance.

        - ex:
                 Animal
                   │
            ┌──────┴──────┐
            │             │
            Dog          Cat

            Dog IS-A Animal
            Cat IS-A Animal

## Inheritance
--------------
- The property of one class inherited by child class
- there are two words
    - extends
        - C to C
        - I to I
    - implements
        - I to C

- There are 5 types of Inheritance
    1. Single level
    2. Multi Level
    3. Hierarchical
    4. Multiple (not in java by class)
        - only possible when all the parent classes are incomplete
        - can be achive by interface not by class
    5. Hybrid

- Not inherited
    - private
    - constructor
    - static members


## Non Primitive TypeCasting
----------------------------
- There should be a IS-A Relationship 
- There are two types of Non-primitive typecasting
    1. upcasting
    2. downcasting

1. UpCasting
    - Converting child into parent
    - A a = new B();

2. DownCasting
    - B b = (B) a;


--------------------------------
## RELATIONSHIP IN JAVA (OOP)

- What is Relationship?
    - The connection (association) between two objects is known as a relationship.

    - Types of Relationship
        1. Has-a Relationship
        2. Is-a Relationship


    1. HAS-A RELATIONSHIP
        - If one object is dependent on another object, it is known as Has-A Relationship.

        - Types
            1. Aggregation
            2. Composition

        1. AGGREGATION
            - The dependency between two objects such that one object can exist without the other is known as Aggregation.

            - Examples
                • Cab – Ola
                • Train – Online Ticket Booking
                • Bus – Passenger

        2. COMPOSITION
            - The dependency between two objects such that one object cannot exist without another object is known as Composition.

            - Examples
                • Car – Engine
                • Human – Oxygen

    2. IS-A RELATIONSHIP
        - The relationship between two objects which is similar to the parent and child relationship is known as the Is-A relationship.

        - Properties
            - In an Is-A relationship, the child object acquires all properties of the parent object.

            - The child object will have its own extra properties.

            - In an Is-A relationship, we can achieve:
                - Generalization
                - Specialization

        - NOTE 1
            • Parents are called Generalized.
            • Children are called Specialized.

        - NOTE 2
            Private members, constructors and static members are not inherited to the child class.

        - EXAMPLE (IS-A)
            - With the help of the child class reference type, we can use the members of the parent class as well as the child.
            - With the help of the parent class reference, we can use only the members of the parent class but not the child class.
            - Parent Class
                - The parent class is also known as a Superclass or Base class.

            - Child Class
                - The child class is also known as a Subclass or Derived class.

            - NOTE:
                - Is-a relationship is achieved with the help of inheritance.


- ## INHERITANCE
    - The process of one class acquiring all the properties and behavior from another class is called Inheritance.

    - In Java, inheritance can be achieved using:
        1. extends keyword
        2. implements keyword

    - extends keyword
        The 'extends' keyword is used to achieve inheritance between two classes.

    - TYPES OF INHERITANCE
        1. Single Level Inheritance
        2. Multilevel Inheritance
        3. Hierarchical Inheritance
        4. Multiple Inheritance
        5. Hybrid Inheritance

    1. SINGLE LEVEL INHERITANCE
        - One parent class having one child class is known as Single Level Inheritance.

        - Diagram
            A
            │
            │
            ▼
            B

        A = Parent Class
        B = Child Class


    2. MULTILEVEL INHERITANCE
        - One superclass having one subclass, and that subclass having another subclass is known as Multilevel Inheritance.
            OR
        - One parent class having more than one level of child classes through inheritance is known as Multilevel Inheritance.

        - Diagram
            A
            │
            ▼
            B
            │
            ▼
            C

        A = Superclass
        B = Child of A / Parent of C
        C = Child of B

    3. HIERARCHICAL INHERITANCE
        - One parent class having more than one child at the same level or stage is known as Hierarchical Inheritance.

        - Diagram
               A
             /   \
            ▼     ▼
            B     C

            A = Parent Class
            B = Child Class
            C = Child Class

    4. HYBRID INHERITANCE
        - The combination of more than one type of inheritance is known as Hybrid Inheritance.

        - Diagram (Conceptual)
            A         B
             \       /
              \     /
                 C
               /   \
              ▼     ▼
              D     E


    5. MULTIPLE INHERITANCE
        - One child class having more than one parent class is known as Multiple Inheritance.

        - Diagram
            A      B
             \    /
              \  /
                ▼
                C

        - NOTE:
            - In Java, multiple inheritance through classes is NOT supported.


        - NOTE ON MULTIPLE INHERITANCE
            - Multiple inheritance has a problem known as the Diamond Problem.
            - Because of the Diamond Problem, we cannot achieve multiple inheritance using classes.
            - In Java, multiple inheritance can be achieved using Interfaces.

        - DIAMOND PROBLEM (BECAUSE OF CONSTRUCTOR)
            - Assume there are two classes A and B.

            - Both classes have a default (no user-defined) constructor.
            - Class C inherits both A and B.
            - While creating an object of class C, the child constructor automatically calls the parent constructor using no-argument super().

        - Problem
            - An ambiguity arises because it is unclear which superclass constructor should be called first.
            - This ambiguity is known as the Diamond Problem.


    - DIAMOND PROBLEM (BECAUSE OF METHOD)
        - Assume there are two classes A and B.
        - Both classes contain a method with the same signature.
        - Class C inherits both A and B.

        - Problem
            - When we call the inherited method using the subclass reference, Java cannot determine which superclass method should be executed.

        - This ambiguity is called the Diamond Problem.

    - WHAT IS DIAMOND RING PROBLEM?

            A              B
         void m1()     void m1()
              \          /
               \        /
                \      /
                   C

        - Problem
            - Both parent classes define the same method (m1()).
            - When class C tries to use m1(), the compiler cannot decide whether to execute A's m1() or B's m1().

            - This ambiguity is known as the Diamond Problem.


THIS KEYWORD
--------------
    - If we want to differentiate between a local variable and a non-static (instance) variable, we use the 'this' keyword.

    - NOTE
        - The 'this' keyword holds the reference of the current executing object.

- this()
    - this() is used to call one constructor from another constructor of the same class.

    - Rule
        - We must use the this() call statement as the FIRST statement inside the constructor. 

    - Example
        class Demo {
            Demo() {
                this(100);      // First statement
                System.out.println("Default Constructor");
            }
            Demo(int x) {
                System.out.println("Parameterized Constructor");
            }
        }

    - Output
        Parameterized Constructor
        Default Constructor

- SUPER KEYWORD
---------------
    - The super keyword is used to access the properties and methods of the superclass from the subclass.

- super()
    - super() is used to call the superclass constructor from the subclass constructor.

    - Rule
        - The super() call statement must always be the FIRST statement inside a constructor.

    - Example
        class Parent {
            Parent() {
                System.out.println("Parent Constructor");
            }
        }

        class Child extends Parent {
            Child() {
                super();
                System.out.println("Child Constructor");
            }
        }

NON-PRIMITIVE TYPE CASTING (DERIVED TYPE CASTING)
-------------------------------------------------
- The process of converting one reference type into another reference type is known as Non-Primitive (Derived) Type Casting.

    - Rules to Achieve Non-Primitive Type Casting
        - We can convert one reference type into another reference type only if the following conditions are satisfied:

            - There must be an IS-A relationship
                    (Parent ↔ Child).

            - OR the Classes/Interfaces must have a common parent.

        - EXAMPLE - 1
            Fruit              Vegetable
              │                    │
              ▼                    ▼
            Apple               Brinjal

            - Allowed Conversions
                Fruit      ↔ Apple
                Vegetable  ↔ Brinjal

            - Not Allowed
                Fruit      ✗ Vegetable
                Apple      ✗ Brinjal
                Vegetable  ✗ Fruit
                Brinjal    ✗ Apple

        - EXAMPLE - 2

                Fruit
               /     \
              ▼       ▼
           Apple    Mango


        - Allowed Conversions
            Fruit ↔ Apple
            Fruit ↔ Mango

        - Not Allowed
            Apple ✗ Mango
            Mango ✗ Apple


    - TYPES OF NON-PRIMITIVE TYPE CASTING

        - Non-Primitive (Derived) Type Casting is classified into two types:
            1. Upcasting
            2. Downcasting

        1. UPCASTING
            - The process of storing a child class object into a parent class reference is known as Upcasting.

            - Example
                class Animal {}
                class Dog extends Animal {}
                Animal a = new Dog();      // Upcasting


        - NOTES ON UPCASTING
            - Upcasting is performed implicitly by the compiler.
            - It is also known as Auto Upcasting.
            - Upcasting can also be done explicitly using a typecast operator.
            - Once a reference is upcasted, child-specific members cannot be accessed using the parent reference.

            - WHY DO WE NEED UPCASTING?
                - It is used to achieve Generalization.
                - It helps to create a generalized container so that references of different child objects can be stored using one parent reference.

            - GENERALIZATION EXAMPLE

                            Cab
                         /   |   \
                        ▼    ▼    ▼
                    Mini  Macro Prime

                - Example
                    Cab c;
                    c = new Mini();
                    c = new Macro();
                    c = new Prime();

                    - Explanation
                        - Here, 'Cab' is the parent class reference that can store objects of any of its child classes (Mini, Macro, or Prime).

                        This is possible because of Upcasting and is an example of Generalization.

            - DISADVANTAGE OF UPCASTING
                - There is one major disadvantage of Upcasting:
                - Once the reference is upcasted, child-specific members cannot be accessed using the parent reference.
                - Note
                    - To overcome this problem, we use Downcasting.


        - DOWNCASTING
            - The process of converting a Parent (Superclass) reference into a Child (Subclass) reference is known as Downcasting.
            - Example
                Animal a = new Dog();      // Upcasting
                Dog d = (Dog) a;           // Downcasting

            - Notes
                - Downcasting is NOT performed implicitly by the compiler.
                - It must be done explicitly by the programmer using a typecast operator.

            - WHY DO WE NEED DOWNCASTING?
                - When a reference is upcasted, subclass members cannot be accessed.
                - To access the members of a subclass, we need to downcast the reference.
                - Diagram

                      Fruit
                        ▲
                        │
                    Upcasting

                      Apple
                        │
                        ▼
                    Downcasting


INSTANCE OF OPERATOR
--------------------
- Instance
    - The instanceof operator is a binary operator used to test whether an object belongs to a particular class or interface.

    - Properties
        - It is a binary operator.
        - It is used to test whether an object is of the given type.
        - The return type of this operator is boolean.
        - If the specified object is of the given type, 1it returns true; otherwise, it returns false.

    - Syntax
        (object_reference instanceof ClassName)

    - Example
        Animal a = new Dog();
        System.out.println(a instanceof Animal);   // true
        System.out.println(a instanceof Dog);      // true
        System.out.println(a instanceof Cat);      // false

CLASSCASTEXCEPTION
------------------
- ClassCastException is a RuntimeException.

    - It occurs at runtime when an invalid downcasting operation is performed.

    - When does it occur?
        - When we try to convert a reference into a specific class, but the object is NOT actually an instance of that class, Java throws ClassCastException.

    - Example
        Case 1
            class Parent {}
            class Child extends Parent {}

            Child c = (Child) new Parent();   // ClassCastException

        Case 2
            Parent p = new Parent();
            Child c = (Child) p;              // ClassCastException

    - Safe Way
        - Always check with instanceof before downcasting.

        if (p instanceof Child) {
            Child c = (Child) p;
        }
        else {
            System.out.println("Invalid Downcasting");
        }


Eclipse
-------
- Steps
    - launch the eclipse
    - create the project
    - create the package
    - create the class
    - write the program and run it

    convention of project -> Pascal
    convention of package -> reverse of domain of company (com.companyName)

    - Assignment
        - create 5 project
            - create 5 packages each
                - create 3 class, 1 interface, 1 abstract class


----------------------------------------------------------------

Dynamic Reading
---------------
- The process of reading data from the user through keyboard at the execution time of the program is known as dynamic read.
    - Steps to achieve dynamic read
        1. Import scanner class
            - ex: 
                import java.util.Scanner
        2. Create object for the Scanner class
            Scanner sc = new Scanner(System.in);
        3. By using reference variable sc call the required method of Scanner class to read the values / data from the user.

    - taking the input from the user by keyboard

    - Scanner class -> java.util package
        - byte : nextByte()
        - short : nextShort()
        - int : nextInt()
        - long : nextLong()
        - float : nextFloat()
        - double : nextDouble()
        - char : (no direct method, we jugard it) => next().charAt(0)
        - boolean : nextBoolean()
        - String : next() , nextLine()

    * All are non-static methods

    - Q. wajp read 10 student details and print it.

-------------------------------------------------------

## Packages

1. PACKAGE
    - A package in Java is used to group related classes, interfaces and subclasses.
    - In simple words, it is a folder or directory which consists of several classes and interfaces.
    - Note:
        - A package contains compiled class files.

2. WHY PACKAGE?
    - Packages are used for the following purposes:
        1. Packages are used to avoid name conflicts.
        2. It increases maintainability.
        3. It is used to categorize classes and interfaces.
        4. It increases access protection.
        5. It is used to achieve code reusability.

3. TYPES OF PACKAGES
    - We have 2 types of packages:
        1. Built-in packages
        2. User-defined packages

    1. BUILT-IN PACKAGE
        - In Java, we have many built-in packages such as:
            java.lang
            java.util
            java.io
            java.sql
            java.swing
            java.awt
            etc.

        - These packages are provided as part of the Java platform and are available through the JDK/JRE.

        - Example 1:
            java.util.Scanner

            - Here:
                java  -> package name
                util  -> sub-package name
                Scanner -> class name
            
        - Example 2:
            java.lang.Math

            - Here:
                java  -> package name
                lang  -> sub-package name
                Math  -> class name

        - SUBPACKAGE
            - A package inside another package is called a sub-package.
            - It is used to categorize classes further.
            - Example:
                java
                |
                +-- util
                        |
                        +-- Scanner

                - Here:
                    java  -> package
                    util  -> sub-package
                    Scanner -> class
                    
        - HOW TO USE BUILT-IN PACKAGES
            - We can use built-in packages in two ways:
                1. By using fully qualified name
                2. By using import keyword
                
            1. USING FULLY QUALIFIED NAME
                - A fully qualified name contains the complete package name along with the class name.
                - By using a fully qualified name, the compiler can understand to which package the specified class belongs.

                - Example:
                    java.util.Scanner

                - Scanner is available in the java.util package.
                - It is commonly used to read data from the user at runtime.

                * CREATING SCANNER OBJECT USING FULLY QUALIFIED NAME
                    - Example:
                        java.util.Scanner sc =
                            new java.util.Scanner(System.in);

                    - By using the fully qualified class name, the compiler can understand that Scanner belongs to the java.util package.

                    - Complete example:
                        class FullyQualifiedExample {
                            public static void main(String[] args) {
                                java.util.Scanner sc =
                                        new java.util.Scanner(System.in);
                                System.out.println("Enter your name:");
                                String name = sc.nextLine();
                                System.out.println("Hello " + name);
                                sc.close();
                            }
                        }


                - DISADVANTAGE OF FULLY QUALIFIED NAME
                    1. We need to use the fully qualified name every time when accessing the class or interface.
                    2. Readability is low.

                - To overcome this problem, we can use the import statement.

            2. USING IMPORT STATEMENT
                - The import statement is used to import classes or interfaces present in packages or sub-packages.

                - Syntax:
                    import package.subpackage.class/interface;

                - By using the import statement, instead of using the fully qualified name every time, we can directly use the class name.
                - Example:
                    import java.util.Scanner;
                    Scanner sc = new Scanner(System.in);

                - EXAMPLE OF IMPORT
                    import java.util.Scanner;
                    class ImportExample {
                        public static void main(String[] args) {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter your name:");
                            String name = sc.nextLine();
                            System.out.println("Hello " + name);
                            sc.close();
                        }
                    }

                - Note:
                    - The import statement must be placed before the class declaration.

                * RULES TO USE IMPORT STATEMENT
                    1. Import statement should be used before the declaration of a class.
                    2. Import statement should end with a semicolon (;).
                    3. We can use multiple import statements in the same program.

                    - Example:
                        import java.util.Scanner;
                        import java.util.ArrayList;
                        import java.util.Date;

                * ADVANTAGES OF IMPORT
                    1. We can directly use the class name instead of using the fully qualified name.
                    2. By importing a class/package once, we can use the class/interface of that package multiple times.

                    - Note:
                        java.lang
                        - is implicitly imported by the compiler.

                    - Therefore, classes such as String, Math and System can be used without explicitly importing java.lang.
                    - Example:
                        String name = "Ayush";
                        System.out.println(name);

                    - No explicit import is required for these classes.


    2. USER-DEFINED PACKAGE
        - In Java, we can create our own package.
        - A package name should be unique. Therefore, it is common to follow the reverse of the company's domain name as the package name.
        - Example:
            com.companyname.projectname.modulename
        - Syntax:
            package packageName;

        - Package names conventionally use lowercase letters.
        - Example:
            package com.company.project;
        
        * EXAMPLES OF USER-DEFINED PACKAGE
            - Example 1:
                package myPack;
            - Example 2:
                package com.testYantra.ola.Signup;

            - These are examples of user-defined package declarations.
        

        * CREATING A SUBPACKAGE
            - A subpackage can be created using:
                package package_name.subpackage_name;

            - Example:
                package jspiders.java.part1;
                - Here:
                    jspiders -> package
                    java     -> subpackage
                    part1    -> subpackage

        * RULES FOR USER-DEFINED PACKAGE
            1. Package declaration should be the first statement in the Java source file.
            2. A Java source file can contain only one package declaration.
            3. A package can contain multiple classes/interfaces.
            4. A source file can have at most one public top-level class/interface.
            5. If you want more than one public top-level class, create a separate source file for each public class.
            6. If a source file contains a public class/interface, the source file name must be the same as the public class/interface name.

            - Example:
                package myPack;
                public class Demo {

                }

                - File name:
                    Demo.java

    - NOTE: PACKAGE + IMPORT + CLASS SEQUENCE
        - If we want to use package and import statements in the same program, we have to follow this sequence:
            1. package
            2. import statement
            3. class / interface

        - Example:
            package myPack;
            import java.util.Scanner;
            public class Demo {
            }

        - General structure:
            package packageName;
            import packageName.ClassName;
            class ClassName {
            }

-----------------------------------------------------------------------

Wrapper Classes
---------------
- What is Wrapper Class
    - In java, every primitive datatype has a corresponding class which works like a wrapper for primitive.
    - Hence this class is known as wrapper class.

    * The wrapper class in java provides mechanism to wrap the primitive into a object.
    * All the wrapper classes are final classes present in java.lang package.

    - convert primitive data type into non primitive wrapper class

        Primitive data type   ---------->   Wrapper Class
            boolean                           Boolean
            char                             Character
            byte                               Byte
            short                             Short
            int                               Integer
            long                              Long
            float                             Float
            double                            Double
    - NOTE:
        - Amoung these wrapper classes Byte, Short, Integer, Long, Float, Double are subclasses of Number class.

    - Advantage of Wrapper Class
        1. Autoboxing
        2. Auto Unboxing
        3. Parsing

    - Types
        1. Boxing
        2. Auto Boxing
        3. Auto UnBoxing

    1. Boxing
        - The process of coverting primitive data into corresponding non primitive wrapper type data is known as Boxing.
        - ex:
            Integer i = new Integer(67);
            System.out.println(i); // 67
            Character c = new Character('B');
            System.out.println(c); // B

            Double i = new Double(6.7);
            System.out.println(i); // 6.7
            Boolean c = new Boolean(true);
            System.out.prinltn(c); // true
            Long l = new Long(345356334);
            System.out.println(l); // 345356334

    2. Auto Boxing
        - The process of coverting primitive data into corresponding non primitive wrapper type data implicitly is known as Auto Boxing.
        - ex:
            Integer i = 67;
            System.out.println(i); // 67
            Character c = 'B';
            System.out.println(c); // B

            Double i = 6.7;
            System.out.println(i); // 6.7
            Boolean c = true;
            System.out.println(c); // true
            Long l = 345356334;
            System.out.println(l); // 345356334

    3. Auto UnBoxing
        - The process of converting non primitive wrapper data into corresponding primitive type data implicitly is known as Auto UnBoxing.
        - ex:
            Integer i = 67;
            System.out.println(i); // 67
            int b = i;
            System.out.println(b); // 67

            Character c = 'B';
            System.out.println(c); // B
            char b = c;
            System.out.println(b); // B


Parsing
-------
- convert primitive string into actural primitive values

--------------------------------------------------------------------------

Upcasting
---------
    - Syntax
        B b = new B(); // child class
        A a = b; // upcasting -> converting child into parent

        A a = new B(); // Upcasting... (optimised)

        B b = new B(); // child class object reference
        A a = new A(); // Parent class object refernce
        a = b; // Upcasting

    - disadvantage
        - we cannot use child variable using parent reference


Downcasting
-----------
    - Syntax 
        B b = new B(); // object reference
        A a = b; // upcasting
        B b1 = (B) a; // downcasting

    - Note 
        - check whether the object belong to the particular class or not.
        - Class cast exception
            - check the reference
                - instanceOf
            - handle the exception


    - instanceof 
        - it is a keyword
        - take 2 values
        - return true/false


## POLYMORPHISM
- It came from two greek words
    - poly -> many
    - morph -> methods/forms

    - ### Compile Time Polymorphism
        - Method Overloading
        - Construction Overloading
        - Method Shadowing/hiding
        - Variable Showding
    
    - ### Run Time Polymorphism
        - Method Overriding

    - #### Method Shadowing / Hiding
        - If parent class and child class having same declaration of static method
        - change in implementation

    - #### Method Overriding
        - If parent class and child class having same declaration of non-static method
        - change in implementation

    - #### Variable Shadowing
        - If parent class and child class having same name variable
        - change in value

    - #### Diff. B/W compiletime and runtime
        - CompileTime
            - static binding
            - depend on object reference
        - RunTime
            - dynamic binding
            - depends on Object creation


POLYMORPHISM
------------
- Polymorphism is derived from two different Greek words 'Poly' means Numerous, 'Morphs' means form Which means Numerous form. Polymorphism is the ability of an object to exhibit different form with the same name.

    - For Understanding :
            One name              -----> Multiple forms
            One variable name     -----> Different values
            One method name       -----> Different behavior

    - TYPES OF POLYMORPHISM:
        - In java, we have two types of polymorphism,
            1. Compile-time polymorphism
            2. Runtime Polymorphism

        - COMPILE-TIME POLYMORPHISM:
            - If the binding is achieved at the compile-time and the same behavior is executed at run time is known as compile-time polymorphism.
            - It is also said to be static polymorphism.
            - NOTE:
                - Binding means an association of method call to the method definition.
            - It is achieved by :
                1. Method overloading
                2. constructor overloading
                3. Variable shadowing
                4. Method shadowing
                5. Operator overloading (does not support in java)

            1. METHOD OVERLOADING :
                - If more than one method is created with the same name but different formal arguments in the same class are known as method overloading.

                - Different formal arguments means :
                    - Differ in no. of FA
                    - Differ in type of FA
                    - Differ in order of FA

                - EXAMPLE: 
                    java.io.PrintStream;
                        println()
                        println(int a)
                        println(double d)
                        println(String s)

                - These are some of the overloaded methods (methods with the same name but different formal arguments) implemented in PrintStream class.

            2. CONSTRUCTOR OVERLOADING :
                - A class having more than one constructor with different formal arguments is known as constructor overloading.
                - ex:
                    class A
                    {
                        A() { }
                        A(int a){ }
                    }

            3. METHOD SHADOWING :
                - If the subclass and superclass have the static method with the same declaration, but different implementation is known as method shadowing.
                - Which method implementation gets executed, depending on what?
                    - In method shadowing binding is done at compile-time, hence it is compile-time polymorphism. 
                    - The execution of the method depends on the reference type and does not depend on the type of object created.

                - NOTE:
                    - The return type should be the same or it should be a covariant(parent or child) return type.
                    - Access modifier should be same or higher visibility than superclass method.
                    - Method shadowing is applicable only for the static method.
                    - It is compile time polymorphism.
                    - Execution of implemented method depends on the reference type of an object.

                - EXAMPLE : Method Shadowing
                    class Parent {
                        public static void test() {
                            System.out.println("From parent");
                        }
                    }

                    class Child extends Parent {
                        public static void test() {
                            System.out.println("From child");
                        }

                        public static void main(String[] args) {
                            Parent p = new Child();
                            p.test();    // from parent  // this is based on the ref variable type

                            Child c = new Child();
                            c.test();    // from child   // this is based on the ref variable type

                            Parent p1 = new Parent();
                            p1.test();   // from parent  // this is based on the ref variable type
                        }
                    }

            4. VARIABLE SHADOWING :
                - If the superclass and subclass have variables with the same name but change in values then it is known as variable shadowing.

                - Which variable is used, depending on what?
                    - In variable shadowing binding is done at compile-time, hence it is a compile-time polymorphism. The Variable used depends on the reference type and does not depend on the type of object created.

                - NOTE: 
                    - It is applicable for both static and non-static variables.
                    - It is a compile-time polymorphism.
                    - Variable usage depends on the type of reference and does not depend on the type of object created.

                - EXAMPLE : Variable Shadowing
                    class Parent
                    {
                        int x = 10; static int y = 9;
                    }

                    class Child extends Parent
                    {
                        int x = 20; static int y = 19;

                        public static void main(String[] args)
                        {
                            Parent p = new Child();

                            Sopln(p.x);    // 10   // this is based on the ref variable type
                            Sopln(p.y);    // 9

                            Child c = new Child();

                            Sopln(c.x);    // 20   // this is based on the ref variable type
                            Sopln(c.y);    // 19

                            Parent p1 = new Parent();

                            Sopln(p1.x);   // 10   // this is based on the ref variable type
                            Sopln(p1.y);   // 9
                        }
                    }

        - RUNTIME POLYMORPHISM :
            - If the binding occurs at compile time but different behaviour is achieved at the runtime then it is known as runtime polymorphism.
            - It is also known as dynamic binding.
            - It is achieved by method overriding.

            * #### METHOD OVERRIDING :
                - When the subclass and superclass have non static methods with the same declaration and different in implementation, it is known as method overriding.

                - Rule to achieve method overriding :
                    - IS-A relationship is mandatory.
                    - It is applicable only for nonstatic methods.
                    - The signature of the subclass method and superclass method should be the same.
                    - The return type of the subclass and superclass method should be the same until the 1.4 version but, from the 1.5 version, covariant return type in the overriding method is acceptable (subclass return type should be the same or child to the parent class return type).
                    - Access modifier should be same or higher visibility than superclass method.

                - EXAMPLE : Method Overriding
                    class Parent {
                        public void test() {
                            System.out.println("From parent");
                        }
                    }

                    class Child extends Parent {
                        @Override
                        public void test() {
                            System.out.println("From child");
                        }

                        public static void main(String[] args) {
                            Parent p = new Child();
                            p.test(); // from child  // this is based on the object created

                            Child c = new Child();
                            c.test(); // from child  // this is based on the object created

                            Parent p1 = new Parent();
                            p1.test(); // from parent  // this is based on the object created
                        }
                    }

                    Child c = new Child();
                    c.test(); // from child

                    Parent p = c;
                    p.test(); // from child

                - Internal runtime object is a child so child test() will get executed, it does not depend on the reference type.

                - NOTE:
                    - Variable overriding is not applicable.

        - @Override :
            - It is an annotation which giving the more information to the compiler about the operation we are performing which is overriding.
            - Also by this one we can specify the method is declared in parent but child is only changing the implementation.
            - It is not mandatory to use. But highly recommended to use.
            - If we will use, compiler will check the overriding process in prior.

-------------------
### Abstraction
hiding the implementation
- achive by the either abstract class and interface.

- Abstraction by interface
    - By default all methods are abstract inside interface
    - By default it is public 
    - By default all variables are static
    - access variable by directly or by using interface name
    
    - components allowed in interface (upto 1.8)
        - abstract method
        - static variable which is final
        - static method
        - non-static default concrete is allowed (by using default keyword)

    - components are not allowed
        - non-static concrete is not allowed
        - constructor is not allowed

Interface
----------
    - There are 3 types of interface
        1. Regular interface
            - more than 1 abstract methods
            - ex:
                List, Set, Map, Collection, etc...
        2. Functional inteface
            - only one abstract method
            - ex:
                Runnable -> run(), Comparable -> compareTo(), Comparator -> compare(), etc...

        3. Marker Interface
            - empty interface
            - these are having some special abilities (we can gain these ability by using these interface)
            - ex:
                Clonable (we can clone the object), Serializable (serialization, deserialization), etc...

- final keyword
    - prevent inheritance
        - we cannot create the child class of class with final keyword
    - prevent override
        - we cannot change the implementation of a method with final keyword in child class
    - prevent shadowing
        - we cannot change the value of variables with final keyword.
    
    - NOTE:
        - we cannot make constructor final because constructor is not getting created so there is no need.
        - we can stop creating child class by making class final or constructor private

## ABSTRACTION
--------------
- What is Abstraction?
    - It is a design process of hiding the implementation and showing only the functionality (only declaration) to the user is known as abstraction.

    - HOW TO ACHIEVE ABSTRACTION IN JAVA?
        - In java, we can achieve abstraction with the help of abstract classes and interfaces.
        - We can provide implementation to the abstract component with the help of inheritance and method overriding.

    - ABSTRACT MODIFIER
        - The abstract is a modifier, it is a keyword.
        - It is applicable for methods and classes.

    - ABSTRACT CLASS
        - If the class is prefixed with an abstract keyword / modifier then it is known as abstract class. We can't create object (instance) for the abstract class.
        - Characteristics:
            1. We can't create an instance of an abstract class.
            2. We can have abstract class without an abstract method.
            3. An abstract class can have both abstract and concrete method.
            4. If a class has at least one abstract method which is either declared or inherited but not overridden, then it is mandatory to make the class as abstract class.

        - EXAMPLE
            abstract class Atm
            {
                abstract public double withdrawal();
                abstract public void getBalance();
                abstract public void deposit();
            }
            // hiding implementation by providing only functionality
            Atm a = new Atm(); // CTE
        - NOTE:
            Only subclass of Atm is responsible for giving implementation to the methods declared in an Atm class.

    -  WHEN YOU HAVE TO GO FOR ABSTRACT METHOD
        1. When we don't have the clear idea about the implementation of the method.
        2. If want to leave the implementation of the method for the child who should override the method and give the implementation.

    - IMPLEMENTATION OF ABSTRACT METHOD
        - If a class extend abstract class then it should give implementation to all the abstract method of the superclass.
        - If inheriting class doesn't like to give implementation to the abstract method of superclass then it is mandatory to make subclass as an abstract class.
        - If a subclass is also becoming an abstract class then the next level child class is responsible to give implementation to the abstract methods.

    - STEPS TO IMPLEMENT ABSTRACT METHOD
        - STEP 1:
            Create a class.
        - STEP 2:
            Inherit the abstract class/component.
        - STEP 3:
            Override the abstract method inherited
            (Provide implementation to the inherited abstract method).

    - EXAMPLE - GIVING IMPLEMENTATION TO ABSTRACT METHOD
        abstract class WhatsApp {
            abstract public void send();
        }

        class Application extends WhatsApp {
            public void send() {
                System.out.println("Send() method is implemented");
            }
        }

    - CREATING OBJECT AND CALLING ABSTRACT METHOD
        - ex: 
            WhatsApp w = new WhatsApp(); // not possible
            Application a = new Application();
            a.send();

        - Note:
            - We can't create the object of abstract class but we can create the reference variable of abstract class and store the child reference which is concrete.

            WhatsApp w = new Application();
            w.send(); // O/P : Send() method is implemented

        - Here send() is not the child class method, it is declared in the parent and only implementation is given by child. So it is possible to access the member by the parent reference variable.

---------------------------------------------------------------------------

- CONCRETE CLASS
    - The class which is not prefixed with an abstract modifier and doesn't have any abstract method, either declared or inherited is known as concrete class.
    - NOTE:
        - In Java, we can create objects only for the concrete class.

- INTERFACE
    - It is a component in java which is used to achieve 100% abstraction and multiple inheritance.

    - Syntax:
        [Access Modifier] interface InterfaceName {
            // declare members
        }

    - When an interface is compiled we get a class file with an extension .class only.

    - Example: 
        Case 1:
            interface Demo1 {
                public static void main(String[] args) {
                    System.out.println("Hello World....!!!!");
                }
            }

        Case 2:
            interface Demo1 {
                int a; // CTE : Variable a is by default public, static, final.
                    //       A final variable must be initialized.
            }


    - INTERFACE - MEMBERS
        - EXAMPLE:
            interface Demo
            {
                void m1();
                void m2();
                public void m3();
                static final int y = 7;
            }

        - The Demo is an interface.

        - In the interface all the members by defaultly public in nature.
        - And abstract methods are by defaultly public and abstract.

    - MEMBERS THAT CAN BE DECLARED IN AN INTERFACE
        - What all are the members that can be declared in an interface?
        
            ---------------------------------------------------------------------------
            S.No.| Members              | Class | Interface
            ---------------------------------------------------------------------------
            1.  | Static variables     | Yes   | Yes, but only final static variables

            2.  | Non-static variables | Yes   | No

            3.  | Static methods       | Yes   | Yes, From JDK 1.8 v.
                |                      |       |
                |                      |       | NOTE:
                |                      |       | They are by default public in nature

            4.  | Non-static methods   | Yes   | Yes, but we can have only abstract
                |                      |       | non-static methods
                |                      |       |
                |                      |       | NOTE: Non-static methods are by default
                |                      |       | • public
                |                      |       | • abstract

            5.  | Constructors         | Yes   | No

            6.  | Initializers         | Yes   | No
                |(Static & non-static) |       |


        - NOTE:
            - In interface, all the members are by default have public access modifier.

    - NON-STATIC CONCRETE METHOD IN INTERFACE
        - ex:
            interface Demo2 {
                public void test()   // CTE
                {
                }
            }

        - Note : inside the interface non static concrete method is not allowed.

    - INHERITANCE WITH RESPECT TO INTERFACE

        - An interface can inherit any number of interfaces with the help of an extends keyword.
        - EXAMPLE: Single inheritance
            interface I1 {
            }

            interface I2 extends I1 {
            }

        - NOTE:
            - The interface which is inheriting an interface should not give implementation to the abstract methods. It should be given by any of the child class.
        - Note: 
            - We can't create the object for the interface, but we can create the reference variable of the interface and store the child type object reference.

    - EXTENDS AND IMPLEMENTS KEYWORD
        - Extends:
            - We can achieve inheritance in between class and class, or interface and interface by extends keyword.
        - Implements:
            - To achieve inheritance in between interface and class we are using implements keywords.

    - SINGLE LEVEL INHERITANCE
        - ex:
            I1...
                void t1();
                void t2();
                static void t3() { }
                    |
                    | I2 extends I1
                    ↓

            I2...
                void t4();


    - SINGLE LEVEL INHERITANCE - CONTINUATION
        - ex:
            I1...
                void t1();
                void t2();

                    |
                    | I2 extends I1
                    ↓
            I2...
                void t4();

    - EXAMPLE 1
        - Interface I1 have 3 methods
            2 - non static abstract (t1(), t2())
            1 - static (t3())

        - Interface I2 have 3 methods
            2 - inherited non static abstract methods (t1(), t2())
            1 - declared non static abstract methods (t4())


    - MULTI LEVEL INHERITANCE
        - ex:
            I1...
                void t1();
                void t2();
                static void t3() { }
                    |
                    | I2 extends I1
                    ↓

            I2...
                void t4();
                    |
                    | I3 extends I2
                    ↓
            I3...

    - HIERARCHICAL INHERITANCE

                            interface I1
                             /        \
                            /          \
                           ↓            ↓
        interface I2 extends I1       interface I3 extends I1

- MULTIPLE INHERITANCE

    - MULTIPLE INHERITANCE WITH RESPECT TO INTERFACE

            interface I1          interface I2
                \                  /
                 \                /
                  \              /
                   ↓            ↓
             interface C extends I1, I2

    - MULTIPLE INHERITANCE WITH RESPECT TO CLASS

            interface I1          interface I2
                \                  /
                 \                /
                  \              /
                   ↓            ↓
              class C implements I1, I2


    - MULTIPLE INHERITANCE WITH RESPECT TO BOTH CLASS AND INTERFACE

            interface I1        interface I2
                   \             /
                    \           /
                     \         /
                      ↓       ↓
                       class C
                         ↑
                         |
                       class A

        - class C extends A implements I1, I2

    - NOTE - WHY THERE IS NO DIAMOND PROBLEM WITH INTERFACE

        - In interface there is no diamond problem.
            - The reason:
                - They don't have constructors.
                - Non-static methods are abstract (do not have implementation).
                - Static methods are not inherited.

        - INHERITANCE OF AN INTERFACE BY THE CLASS:
            - Class can inherit an interface with the help of implements keywords. (class can be child of interface)
            - Class can inherit more than one interface. (One class can have more than one interface as parent)
            - Class can inherit a class and an interface at a time.

        - Note: A class can't be a Parent of interface.

    - CLASS CAN'T BE THE PARENT OF INTERFACE

             class A
                X
                |
                |
           interface I1

        - WHY CLASS CAN'T BE THE PARENT OF INTERFACE

            - Class can't be the parent of the interface because in every class there can be non-static concrete methods of object class which are inherited.
            - If we make class as parent, then all methods will be inherited to the child but inside the interface concrete non-static methods are not allowed.
    
    - NOTE :
        - IMPLEMENTATION OF INTERFACE METHODS
            - If the class inherits an interface then it should give implementation to the abstract non-static methods of an interface.
            - If the class is not ready to give implementation to the abstract methods of an interface then it is mandatory to make that class an abstract class.
            - The next level of child class is responsible for giving implementation to the rest of the abstract methods of an interface.

# Collections

## Collection Frameworks

- TreeSet
    - should be homogeneous (otherwise ClassCastException)
    - should not null (otherwise NullPointException)

- TreeMap
    - key should be homogeneous
    - key should not null

- HashTable
    - key or value should not null

- HashMap
    - Collection of enteries
    - key should not be duplicate

- forEach
    - Syntax
        for (datatype variable : reference_variable) {
            // Statement
        }
    - no need for condition
    - fully iterate
    - only move forward no backward
    - used in array and collection

- Generic
    - use to make homogeneous 

- Sorting
    - Collections.sort(array);

- ArrayList
    - add(index, value)
    - remove((Object) 4)
    - get(index)

- Set
    - add, clear
    - foreach loop, iterator

- List
    - add, remove, get
    - iterator, foreach and get
    - list iterator

-------------------------------------------
## Difference

1. Collection Hierarchy vs Map Hierarchy
    - Collection Hierarchy

    - Map Hierarchy

2. Array vs Collection
    - Array 
        - homogeneous

    - Collection
        - homogeneous as well as hetrogeneous
        - many more for crud operation

3. List vs Set
    - List
        - index based
        - maintain the order
        - duplicate allowed
        - multiple null values
        - access -> iterator, get, foreach loop, 

    - Set
        - not index based

4. Methods of Collection interface
5. Methods of Map interface
6. HashSet vs LinkedHashSet
7. HashMap vs LinkedHashMap
8. TreeSet 
9. TreeMap
10. ArrayList vs Vector
11. HashMap vs HashTable
12. Situation to use or not use ArrayList
    - easy to access the elements
    - when we have to add element inbetween the list
    - because of shift operation
13. Situation to use or not use LinkedList
    - easy to add, but hard to access the element in between
14. ArrayList vs LinkedList
15. What is node?

-------------------------------------------------------------------------------------------
## COLLECTIONS

- What is Collection in Java
    - A Collection represents a single unit of objects, i.e., a group.
    - What is framework in Java
        - It provides readymade architecture
        - It represents a set of classes and interfaces.

- What is Collection framework
    - The Colelction framework represents a unified architecture for storing and manipulating a group of objects. 
    - It has:
        1. Interfaces and its implementations, i.e., classes
        2. Algorithm (Java Collections can achieve all the operations that you perform on a data such as searching, sorting, inserting, manipulation and deletion.)

    - Why do we need collection framework in java
        - To store multiple objects or group of objects together we can generally use arrays. But arrays has some limitations.

        - Advantages of Collection over an array:
            - Array is fixed in size whereas Collection is dynamic in size.
            - Array is homogeneous whereas Collection is heterogeneous.
    
    - Collection framework has 2 important hierarchies:
        1. Collection hierarchy
        2. Map hierarchy

        1. Collection Hierarchy
                                Iterable > lang package
                                   |
                               Collection > util package
                                   |
         +---------------------------------------------------+
         |                         |                         |
        List                     Queue                      Set
         |                       |  |                       | |
         |-> ArrayList           |  --> PriorityQueue       | |-> HashSet
         |-> LinkedList          |-> Deque                  | |-> LinkedHashSet
         |-> Vector                   |-> ArrayDeque        |-> SortedSet
              |-> Stack                                           |-> TreeSet


        2. Map Hierarchy
                                Map
                                 |
                ---------------------------------------------
                |                   |                       |
            Hashtable            HashMap                SortedMap
                                    |                       |
                              LinkedHashMap            NavigableMap
                                                            |
                                                         TreeMap

- Iterable Interface
    - It is introduced in jdk 1.5
    - Iterable interface is declared in java.lang package.
    - Iterable interface contains iterator() method to iterate the elements of Collection interface as Collection is the child of Iterable interface.

    - Method declaration:
        public abstract Iterator<T> iterator();
        here, T is the type of elements returned by the Iterator.

- Collection Interface
    1. Collection is an interface which is one of the pillars of the Collection Framework and is defined in the `java.util` package. It was introduced in JDK 1.2.
    2. Collection interface provides the mechanism to store a group of objects (elements) together.
    3. All the elements in the Collection are stored in the form of Objects (i.e. only non-primitive data is allowed).

        - Collection does not store primitive data. When we try to add primitive data, the primitive is auto-boxed into its corresponding non-primitive wrapper type. Then it gets stored in the Collection.

        - Example:
            ArrayList al = new ArrayList();
            al.add(10);
                --> al.add(new Integer(10));
                    [Autoboxing will occur implicitly like this]

            al.add(true);
                --> al.add(new Boolean(true));
                    [Autoboxing will occur implicitly like this]

    4. As Collection interface is the child of Iterable interface, it also contains the `iterator()` method.

    5. It provides some predefined methods which help the programmer to perform the following tasks:
        - Add an element into the collection
        - Search an element in the collection
        - Remove an element from the collection
        - Access the elements present in the collection

        - Collection Interface Methods

            | Purpose                  | Return Type | Method Signature                    |
            |--------------------------|-------------|-------------------------------------|
            | To add the element       | boolean     | add(Object)                         |
            |                          | boolean     | addAll(Collection)                  |
            | To remove the element    | boolean     | remove(Object)                      |
            |                          | boolean     | removeAll(Collection)               |
            |                          | boolean     | retainAll(Collection)               |
            |                          | void        | clear()                             |
            | To search the elements   | boolean     | contains(Object)                    |
            |                          | boolean     | containsAll(Collection)             |
            | To access the elements   | Iterator    | iterator()                          |
            | Miscellaneous operation  | int         | size()                              |
            |                          | boolean     | isEmpty()                           |
            |                          | Object      | toArray()                           |

    - Note:
        All methods are public and abstract.

    6. Collection has 3 child interfaces:
        - List
        - Set
        - Queue


- ### General Characteristics of List, Set and Queue
    - List
        - Maintains insertion order of elements.
        - Duplicate elements are allowed.
    - Set
        - Doesn't maintain insertion order.
        - Duplicate elements are not allowed.
    - Queue
        - Maintains insertion order.
        - Duplicate elements are not allowed.


- ### Creating Objects of Collection Implementations
    - As Collection is an interface and List, Set and Queue are also interfaces, we can't directly create objects for them.
    - But we can create objects for their subclasses and store their references.

    - Example:
        Collection c  = new ArrayList();
        Collection c1 = new LinkedList();
        Collection c2 = new Vector();
        Collection c3 = new Stack();

        Collection c  = new HashSet();
        Collection c1 = new LinkedHashSet();
        Collection c2 = new TreeSet();

        Collection c  = new PriorityQueue();
        Collection c1 = new ArrayDeque();


## GENERICS
- 
    - Generics is one of the features of Collection introduced from JDK 1.5.
    - Generics defines the type of data or element type that can be stored in a collection.

    - Commonly represented as:
        <E>
    - Example:
        Collection<String>
        +-------+-------+-------+-------+
        | "Ram" | "Raj" | "Yash"| "Dev" |
        +-------+-------+-------+-------+

        Collection<Integer>
        +----+----+----+----+
        | 10 | 45 | 67 | 89 |
        +----+----+----+----+

        Collection<Student>
        +---------------+---------------+---------------+
        | new Student() | new Student() | new Student() |
        +---------------+---------------+---------------+


- ## Types of Collection
    - We can classify collections into two categories:
        1. Non-Generic Collection  
        2. Generic Collection


    1. NON-GENERIC COLLECTION
        - It is a heterogeneous (different types) collection of elements.
        - Every element stored in a collection is converted to `java.lang.Object` class type and stored.

        - Syntax to create Non-Generic Collection
            Collection_type variable;

        - Example:
            Collection c;
            ArrayList al;
            HashSet hs;
            etc.

        - Syntax to create Non-Generic Collection Object
            new Collection_name();
        
        - Example:
            new ArrayList();
            new HashSet();
            new PriorityQueue();
            etc.


    2. GENERIC COLLECTION
        - It is a homogeneous collection of elements (collection of same type of elements).

        - Syntax to create Generic Collection
            Collection_type<Non-primitive Datatype> variable;
        - Example:
            Collection<String> c1;
            ArrayList<Integer> al;
            HashSet<String> hs;
            etc.

        - Syntax to create Reference Variable for Generic Collection
            Collection_type<Non-primitive Datatype> variable;
        - Example:
            Collection<String> c1;
            ArrayList<Integer> al;
            HashSet<String> hs;
            etc.

        - Syntax to create Generic Collection Object:
            new Collection_name<Datatype>();
        - Example:
            new ArrayList<Integer>();
            new HashSet<String>();
            new LinkedList<String>();
            etc.

- ## LIST INTERFACE
    - Structure

                        List
                         |
            +------------+------------+
            |            |            |
        ArrayList     LinkedList     Vector
                                       |
                                     Stack

    - Methods of List Interface

        | Purpose            | Return Type | Method Signature                |
        | ------------------ | ----------- | ------------------------------- |
        | To add the element | boolean     | `add(Object)`                   |
        |                    | boolean     | `addAll(Collection)`            |
        |                    | void        | `add(int index, Object)`        |
        |                    | boolean     | `addAll(int index, Collection)` |
        | To remove element  | boolean     | `remove(Object)`                |
        |                    | boolean     | `removeAll(Collection)`         |
        |                    | boolean     | `retainAll(Collection)`         |
        |                    | void        | `clear()`                       |
        |                    | Object      | `remove(int index)`             |

    - Situations to use or not use ArrayList
        - Situations to use ArrayList
            - ArrayList is good for data retrieval & search operation. Because time taken to search any data in entire List is same.

        - Situations to not use ArrayList
            - If we try to add the data in between the list, then all the existing data gets shifted to the next position. Because of this shift operation, the performance becomes slow. Hence it is not suitable to insert and remove the data in between.

## LINKEDLIST
-------------
- LinkedList
    - LinkedList is one of the implementation classes of List Interface.
    - Present since JDK 1.2 and defined in java.util package.
    - LinkedList stores the data in the form of Nodes, where every node is connected to next and its previous node.
    - Nodes contain 3 parts. One is used to store the value and another 2 are used to store the address of next and previous nodes.
    - The first node does not have previous node information and the last node does not have next node information.

    - Situations to Use LinkedList
        - LinkedList doesn't have any shift operation, hence it is suitable for insertion or removal of data in between.

    - Situations Not to Use LinkedList
        - LinkedList is not suitable for any search / retrieval operation.
        - LinkedList are not good for addition / removal because the control has to start / traverse through first node.

- Difference Between ArrayList and LinkedList
    | ArrayList                                                           | LinkedList                                            |
    | ------------------------------------------------------------------- | ----------------------------------------------------- |
    | Stores the data in the form of array                                | Stores the data in the form of nodes                  |
    | Data Structure: growable / resizable array                          | Data Structure: Doubly LinkedList                     |
    | 3 overloaded constructors                                           | 2 overloaded constructors                             |
    | Initial & incremental capacity is applicable                        | Initial & incremental capacity is not applicable      |
    | Implements marker interfaces: Cloneable, Serializable, RandomAccess | Implements marker interfaces: Cloneable, Serializable |
    | Has shift operation                                                 | Has no shift operation                                |
    | Memory is continuous                                                | Memory is not continuous                              |

- Difference Between ArrayList & Vector
    | ArrayList                                             | Vector                                        |
    | ----------------------------------------------------- | --------------------------------------------- |
    | ArrayList is Multi Threaded.                          | Vector is Single Threaded.                    |
    | Present since JDK 1.2                                 | Present since JDK 1.0                         |
    | 3 overloaded constructors                             | 4 overloaded constructors                     |
    | Incremental capacity = `(current capacity × 3/2) + 1` | Incremental capacity = `current capacity × 2` |
    | Performance-wise faster                               | Performance-wise slower                       |

## ForEach
- Enhanced For-Each Loop
    1. It is a feature introduced from JDK 1.5.
    2. It is mainly used to iterate either a collection or an array completely in forward direction.
    3. Partial iteration of array or collection is not possible by using this.
    4. There is no need of providing any condition to run the loop.

    - Difference Between for and for-each
        | For Loop                                | For-Each Loop                         |
        | --------------------------------------- | ------------------------------------- |
        | Can iterate forward as well as backward | Can iterate only in forward direction |
        | Partial iteration is possible           | Partial iteration is not possible     |
        | Need to know the condition to use       | Can be used without condition         |
        | Present since beginning of Java         | Present since JDK 1.5                 |

## TreeSet
- TreeSet
    - TreeSet is one of the implementation classes of Set interface.
    - Present since JDK 1.2 and defined in java.util package.
    - TreeSet is mainly used for uniqueness and sorting.
    - TreeSet does not store duplicate data.
    - TreeSet implements default natural sorting order.
    - TreeSet cannot store even a single null element. If we add null, we get NullPointerException.

    - Default natural sorting order:
        Ascending order:
            • Number: 0 - 9
            • Alphabet: A - Z and a - z

    - More about TreeSet
        - TreeSet is not a hash-based collection. The data structure used is a balanced tree.
        - TreeSet is homogeneous, i.e., TreeSet can store only one type of data.
        - TreeSet either uses Comparable or Comparator interface.
            Comparable  → Default natural sorting
            Comparator  → Custom sorting
        - The element added to TreeSet must be of a comparable type, otherwise ClassCastException may occur.
        - All elements in TreeSet should be of the same type (homogeneous), otherwise ClassCastException may occur.
        - No indexing is available, therefore we cannot add/remove elements using an index.
        - It also has all the methods of the Collection interface.

    - Difference Between List and Set
        | List                                | Set                                              |
        | ----------------------------------- | ------------------------------------------------ |
        | List is index-based                 | Set is not index-based                           |
        | List can store duplicate data       | Set can store only unique data                   |
        | List can store multiple null values | Set can store only a single null value*          |
        | List maintains insertion order      | Set doesn't necessarily maintain insertion order |

## Map Hierarchy
- Map
    - Map is an interface which is a separate pillar/vertical of the Collection Framework and is defined in java.util package.
    - It is present since JDK 1.2.
    - Map does not inherit the Collection interface.
    - Map is a collection of entries, i.e., Map stores multiple entries.
    - Entry represents data in the form of key-value pairs.
    - Map is a data structure which helps programmers to store data in the form of key-value pairs.
    - Key and value together are known as an entry.
    - Every value is associated with a unique key.
    - Key must always be unique, but values can be duplicated or null.
    - One key can be associated with only one value.
    - Map helps us to access values easily with the help of their associated keys.


    - Note: 
        - One key-value pair is called an Entry or Mapping.

- Generic Map
    Map<K, V>

    - Example:
        Map<Integer, String>
        5 = "Rohan"
        7 = "Rahul"
        3 = "Dev"
        9 = "Subham"

- Map Methods
    | Return Type | Method Signature                          | Purpose                                                                    |
    | ----------- | ----------------------------------------- | -------------------------------------------------------------------------- |
    | `V`         | `put(K key, V value)`                     | 1. Adds an entry to the map (key-value pair).                              |
    |             |                                           | 2. Replaces the old value with a new value for an existing key in the map. |
    | `void`      | `putAll(Map<? extends K, ? extends V> m)` | Copies all the entries from the given map into the current map.            |
    | `boolean`   | `containsKey(Object key)`                 | If the key is present, returns `true`; otherwise, returns `false`.         |
    | `boolean`   | `containsValue(Object value)`             | If the value is present, returns `true`; otherwise, returns `false`.       |
    | `V`         | `remove(Object key)`                      | If the key is present, the entry is removed from the map and its value     |
    |             |                                           | is returned. If the key is not present, nothing is removed and `null`      |
    |             |                                           | is returned.                                                               |
    | `int`       | `size()`                                  | Returns the number of key-value mappings in the map.                       |
    | `boolean`   | `isEmpty()`                               | Returns `true` if the map contains no key-value mappings.                  |



## TreeMap
- TreeMap
    1. It is one of the implementation classes of Map interface.
    2. Present since JDK 1.2 and declared in java.util package.
    3. TreeMap is mainly used for sorting data based on key.
    4. TreeMap implements default natural sorting order on the key using Comparable interface.
    5. The key in TreeMap must be Comparable type. If not, we will get ClassCastException.
    6. For custom sorting, we use Comparator interface.
    7. It cannot store even a single null key.
    8. TreeMap is homogeneous.
    9. When we try to add null, we will get NullPointerException.


## Hashtable
- Hashtable
    1. Hashtable is one of the implementation classes of Map interface.
    2. Present since JDK 1.0 (legacy class) and present in java.util package.
    3. It is also a hash-based collection, hence the data structure used is Hashtable.
    4. Hashtable is single-threaded, i.e., methods are synchronized.
    5. Initial capacity is 11.
    6. Load factor or fill ratio is 75%.
    7. Hashtable is slower than HashMap because it is synchronized.
    8. Hashtable cannot store even a single null key.
    9. In Hashtable, both key and value can't be null. If either is null, we will get NullPointerException.

- Difference Between HashMap and Hashtable
        +---------------------------+-----------------------------+
        |          HashMap          |          Hashtable          |
        +---------------------------+-----------------------------+
        | It is multi-threaded.     | It is single-threaded.      |
        |                           |                             |
        | Present since JDK 1.2.    | Present since JDK 1.0.      |
        |                           |                             |
        | Can store a single        | Cannot store even a         |
        | null key.                 | single null key.            |
        |                           |                             |
        | Initial capacity = 16.    | Initial capacity = 11.      |
        |                           |                             |
        | It is faster.             | It is slower.               |
        +---------------------------+-----------------------------+

## Collections Class
- Collections Class
    1. It is a predefined class in Java for performing operations on the Collection Framework.
    2. It is defined in the java.util package.
    3. There are many predefined methods available for different operations such as:
        - sort()
        - reverse()
        - binarySearch()
        - replace()
        - etc.
       All these methods are static in nature.
    4. Since all methods are static in nature, we can call them using the Collections class name.
        - We need to import:
            java.util.Collections
    5. One important method that we commonly use is sort(), which is used to sort a List.   
    6. There are two overloaded methods for the sort() method.

-------------------------------------------------------------------------------

# Exceptions
- RunTime Exceptionsa
    - ArithmeticException // divide by 0
    - NullpointerException // ref.x or ref.m1() , ref == null
    - ClassCastException // downcasting or treeset
    - StringIndexOutOfBoundsException // chatAt()
    - ArrayIndexOutOfBoundsException // REF[Index]
    - NumberFormatException // Parsing


    - stack trace
        - details of exception (java.land.Exception)
        - program will stop and give the detail in which the location of exception and location of exception occurance is there.
        - contains
            - FullyQulaifiedName - i.e. packagename.subpackagename.classname
            - reason of the exception : why exception occure
            - location of the exception : packagename.subpackagename.classname.methodname(filename:linenumber)

    - default exception handler
        - generates the details
        - printStackTrace()

    - Types
        - Checked Exception
            - not reached
        - Unchecked Exception
            - reached

- Exception handling
    - by which we can continue our program
    - we can do by using try and catch block

    - try
        - statement block which is responible for exception

    - catch
        - it tells how should you handle the exception

    - what is try with mulitple catch
        - 
        - rules
            - parent should be at bottom and child should be at top otherwise it will give CTE.

throw & throws
--------------
- File handling
    - FileOutputStream 
        - use to create a file on a particular location
        - syntax:
            FileOutputStream o = new FileOutputStream("fileName.txt");

- throws keyword
    - in checked exception
        - programmer should either handle or declare the exception

    - declare the exception
        - by using throws
            - we cannot handle by using throws, we just 
            - it is used to declare the exception
            - use to specifies the unchecked / checked exception 
            - use to propogate the checked exception object from called to calling method
            - we can do to the unchecked but it is propogated by default

- throw keyword
    - create the exception manually
    - also used to create the custom exception


===============================================================
# EXCEPTION

- DEFINATION
    - The Exception is an unexpected problem which occurs during the execution of the program (i.e. nothing but RunTime). When an exception occurs, the program execution stops unexpectedly (this is known as abrupt stop of the program).

    - Note:
        1. Every Exception in Java is one of the child classes of the Throwable class, that's why we can say that every exception in Java is of "Throwable Type".
        2. Every Exception occurs because of one Statement.
        3. A statement will throw an exception during an unexpected problem (i.e. nothing but abnormal situation).
        4. All the exceptions in Java are classes (can be predefined or user-defined).

- WHAT HAPPENS IF EXCEPTION OCCURS
    - The program will stop suddenly and the rest part of the code after exception creation statements are not going to execute.
    - EXAMPLE
        class Demo {
            public static void main(String[] args) {
                int a = 6;
                int b = 0;

                System.out.println(5 + 7);

                System.out.println(a / b);
                // Because of one statement.
                // Every Exception in Java is one class and all are Throwable Type.
            }
        }

- LISTS OF IMPORTANT EXCEPTIONS AND STATEMENTS

    Statement                           |        Exception
    --------------------------------------------------------------------------
    a / b (if b = 0)                    |        ArithmeticException
    Obj1.reference_varObject.member     |        NullPointerException
    (ClassName)obj.reference_var        |        ClassCastException
    Array_reference[index]              |        ArrayIndexOutOfBoundsException
    String_ref[index]                   |        StringIndexOutOfBoundsException

- TYPES OF EXCEPTION
    - There are 2 types of Exceptions:
        1. Checked Exception
        2. Unchecked Exception


    1. CHECKED EXCEPTION
        - The compiler-aware exception is known as Checked Exception. That means compiler knows which statement is responsible for the Exception.
        - If this is the scenario, then the compiler will force the programmer to either handle or declare the exception. If it is not done, we will get an unreported compile-time error.

        - Example:
            // FileNotFoundException

            FileOutputStream f = new FileOutputStream("path");

            FileOutputStream f =
                new FileOutputStream("d://Part3/abc.txt");

        - FILENOTFOUNDException
            - FileNotFoundException is defined in the java.io package.
            - FileNotFoundException is a checked Exception.
            - We get FileNotFoundException when we try to create a file but the given path is wrong, or there is no permission, or the hard disk has no sufficient memory to store the file.

            - new FileOutputStream("Path/name") -> this line is responsible for FileNotFoundException.


        - UNCHECKED EXCEPTION
            - The compiler-unaware exception is known as Unchecked Exception, i.e., the compiler doesn't know the statements which are responsible for abnormal situations (Exception).
            - Hence, the compiler will not force the programmer either to handle or declare the exception.

            - Example: ArithmeticException
                C = a / b;   // if b = 0


- EXCEPTION HIERARCHY

                        Throwable
                       /         \
                      /           \
                 Exception       Error
                   |          
            +--------------------------+-----------------------------+----------------+---------------+
            |                          |                             |                |               |
        RuntimeException              IOException                   SQLException     AWTException    InterruptedException
        |                              |                          
        |-> ArithmeticException        |-> FileNotFoundException         
        |-> NullPointerException       |-> InterruptedIOException  
        |-> ClassCastException         |-> EOFException             
        |-> IndexOutOfBoundsException                                     
            |
            |-> ArrayIndexOutOfBoundsException
            |-> StringIndexOutOfBoundsException

        Error:
            -> VirtualMachineError
            -> StackOverflowError
            -> OutOfMemoryError
            -> AssertionError
            -> ExceptionInInitializerError
            -> IOError
            -> AWTError

    - NOTE
        1. In Throwable hierarchy, Error class and its subclasses and RuntimeException class and its subclasses are all known as Unchecked Exception.
        2. All the subclasses of the Exception class except RuntimeException class are considered as Checked Exception.
        3. Throwable and Exception classes are partially checked and partially unchecked classes.
        4. RuntimeException and Error classes are fully unchecked Exception classes.

- THROWABLE CLASS

    - Throwable class is defined in the java.lang package.
    - It is the supermost parent class of the Exception Hierarchy (means parent of all the Exceptions).
    - As Object class is the parent of all the classes in Java, so for the Throwable class also Object is the parent class.
    - In the Throwable class, toString() method of Object class is overridden. That is why all the subclasses of Throwable have the overridden toString() method.

    - That's why when any exception occurs, we get the fully qualified name of the exception.
    - Example:
        java.lang.ArithmeticException etc.

    - IMPORTANT METHODS OF THROWABLE CLASS
        1. String getMessage() → 
            - Used to return the reason of the exception.
        2. void printStackTrace() → 
            - Used to give the fully qualified name of the exception and the reason of the exception along with the flow/stack trace of the exception.

        * Both the above methods are non-static methods.


## EXCEPTION HANDLING

- Exception Handling:
    - Exception handling is a mechanism used in Java that is used to continue the normal flow of execution when an exception occurs during runtime.

    - HOW TO HANDLE THE EXCEPTION
        - In Java, we can handle an exception by using the try{} and catch(){} block.
        - Syntax to use the try and catch block:
            try
            {
                // statements
            }
            catch(declare one variable of Throwable type)
            {
                // statements
            }

    - IF EXCEPTION WILL OCCUR, WHAT WILL HAPPEN?
        - When an exception occurs:
            1. Execution of the program will be stopped.
            2. A Throwable type object will be created and the reference of the created object will be thrown.

    - HOW TO HANDLE THIS BY USING TRY AND CATCH
        - try{} block:
            - Create a try block and the statements which are responsible for exception should be written inside the try block.
            - When an exception occurs:
                1. Execution of the try block is stopped.
                2. A Throwable type object is created.
                3. The reference of the Throwable type object created is passed       to the catch block.

            - Example:
                try {
                    stmt 1;
                    stmt 2;       // Exception occurs

                    // Throwable type object is created

                    stmt 3;
                    stmt 4;       // stmt 3 and stmt 4 will not execute
                } catch(variable) {
                    // statements
                }

                // Reference of the Throwable type object is thrown to the catch block.

        - catch() block:
            - The catch block is used to catch the Throwable type reference thrown by the try block.
                1. If it catches, we say the exception is handled. Statements inside the catch block are executed and the normal flow of the program will continue.
                2. If it doesn't catch, we can say the exception is not handled. Statements written inside the catch block are not executed and the program is terminated.

        - Q. When do we say exception is handled?
            - We say exception is handled only if the Exception is caught by the catch block.

            - CASE 1: EXCEPTION OCCURS BUT IS NOT CAUGHT
                try {
                    sopln(10/0);    // ArithmeticException occurs
                }

                ArithmeticException@6788

                catch(NullPointerException e) {
                    // Not executed
                }
                // Not executed

            * Here the exception is not caught by the catch block because it only catches NullPointerException, not ArithmeticException.

            - CASE 2: EXCEPTION OCCURS AND IS CAUGHT
                try {
                    sopln(10/0);    // ArithmeticException occurs
                    Stmt 1;         // Not executed
                } catch(ArithmeticException e) {
                    stmt 2;         // Execute
                }
                Stmt 3;             // Execute

            * Here it is caught by the catch block.

        - try with mulitple catch block
            - A try block can be associated with more than one catch block.
            - Syntax:
                try {
                    // statements
                } catch(........) {
                    // statements
                } catch(........) {
                    // statements
                }
                .
                .
                .
                etc.

            - NOTE:
                - The exception type object is thrown from top to bottom order.


    - WORKFLOW OF THE TRY WITH MULTIPLE CATCH
        - Workflow:
            try {
                // statements
            } catch() {
                // statements
            } catch() {
                // statements
            } catch() {
                // statements
            }
            .
            .
            .

        - If the exception is caught by a catch block, then the try block does not throw the exception to the below catch blocks. Then execution of the rest of the catch blocks will be skipped.

    - RULE:
        - The order of catch blocks should be maintained such that:
            Child type should be on the top
            Parent type should be at the bottom.

        - EXAMPLE
            - CASE 1:
                try {
                    Sopln(10/0);
                } catch(Exception e) {
                }
                catch(ArithmeticException e) {
                }

            - CTE: Parent type is declared on the top and child type is declared on the bottom.

            - CASE 2:
                try {
                    soopln(10/0);
                } catch(ArithmeticException e) {
                }
                catch(Exception e) {
                }

            - CTE: Parent type is declared on the bottom and child type is declared on the top.


    - EXCEPTION OBJECT PROPAGATION
        - The movement of exception from the called method to the calling method when it is not handled is known as Exception Object Propagation.
            Calling Method                    Called Method
                |                                   |
                |                            Exception occurs
                |                                   |
                |                         Exception not handled
                |                                   |
                |<----------------------------------|
                     Exception Object Propagation


        - NOTE:
            - For unchecked exceptions, it is propagated automatically or implicitly.
            - For checked exceptions, it is not done implicitly. We have to do it explicitly by using the throws keyword.


        - CASE 1: EXCEPTION OCCURRED AND HANDLED BY THE CALLING METHOD
            class Case1 {
                public static void main(String args[]) {
                    try {
                        test();
                    } catch(ArithmeticException e) {
                        Sopln("Exception is handled by the calling method");
                    }
                }

                static void test() {
                    int a = 10/0;
                }
            }


        - CASE 2: EXCEPTION OCCURRED AND NOT HANDLED BY THE CALLING METHOD
            class Case1 {
                public static void main(String args[]) {
                    test();
                }

                static void test() {
                    int a = 10/0;
                }
            }

            - Output:
                Exception in thread "main" java.lang.ArithmeticException: / by zero
                    at Case1.test(Case1.java:8)
                    at Case1.main(Case1.java:4)

            * This is nothing but Exception Object Propagation.


### STACK TRACE 

- Stack Trace:
    - It provides the order in which the exception occurred and flowed from top to bottom of the stack.
    - It contains details of the exception, means: 
        - Fully Qualified Name, reason, and location.
        - Fully Qualified Name means:
            package name + sub-package name + class name.

        - Example:
            main(String[] args)              test()

                test();                  int a = 10/0;
                    |                           |
                    |                     Exception occurs
                    |                           |
                    |<--------------------------|
                    |
                Exception Object Propagation

        - Reason:
            - Why the exception occurs.
                Location:
                    • Package name
                    • Class name
                    • Method name
                    • File name
                    • Line number

        - Example Stack Trace:
            Exception in thread "main" java.lang.ArithmeticException: / by zero
                at Case1.test(Case1.java:8)
                at Case1.main(Case1.java:4)

        - EXAMPLE - 1
            import java.io.FileOutputStream;
            class FileNotFoundDemo1 {
                public static void main(String[] args) {
                    // to create a file demo.txt in e://file

                    FileOutputStream fout =
                        new FileOutputStream("e://f1//demo.txt");

                    System.out.println("file created");
                }
            }

            - We will get compile time error because new FileOutputStream("e://f1//demo.txt") is responsible for FileNotFoundException, which is a checked exception and it is neither handled nor declared.

        - HANDLING CHECKED EXCEPTION
            import java.io.FileOutputStream;
            import java.io.FileNotFoundException;

            class FileNotFoundDemo1 {
                public static void main(String[] args) {
                    // to create a file demo.txt in e://file
                    try {
                        FileOutputStream fout =
                            new FileOutputStream("e://f1//demo.txt");

                        System.out.println("file created");
                    }
                    catch(FileNotFoundException e) {
                        System.out.println("Some problem is there with file, check is");
                    }
                }
            }

### THROWS KEYWORD

- throws:
    - It is a keyword. It is used to declare an exception which is to be thrown to the caller.
    - It does not throw an exception. It specifies that there may occur an exception in the method.
    - throws keyword should be used in the method declaration statement.
    - It is used to propagate the checked exception object because checked exception is not propagated automatically.
    - We can declare more than one exception by providing comma.

    - Syntax:
        [AM] [M] return_type methodName([FA])
            throws exception1, exception2, exception3....
        {
            // stmt
        }

### DECLARING CHECKED EXCEPTION

    import java.io.FileOutputStream;

    class FileNotFoundDemo1 {
        public static void main(String[] args) throws FileNotFoundException
        {
            // to create a file demo.txt in e://file
            FileOutputStream fout = new FileOutputStream("e://f1/demo.txt");

            sopln("file created");
        }
    }

### finally { } BLOCK

- finally { }
    - It is a block which is used in exception handling.
    - finally block always gets executed even if the exception occurs or not and handled or not.
    - It is used along with try-catch block or only with try block.
    - A single try block can have maximum of one finally block.
    - Usually costly resources are closed in finally block (like DB connection, IO Stream).
    - We can't use finally block alone.

    - Syntax:
        try {
            // statements
        } catch(.....) {
            // statements
        }
        finally {
            // statements wants to be executed if still exception is not handled
        }

    - CASE 1: Exception occurred and handled by the calling method
        class Case1 {
            public static void main(String args[]) {
                try {
                    test();
                }
                catch(ArithmeticException e) {
                    sopln("Exception is handled by the calling method");
                }
                finally {
                    sopln("thank you");
                }
            }

            static void test() {
                int a = 10/0;
            }
        }

        - Output:
            Exception is handled by the calling method 
            thank you

    - CASE 2: Exception occurred and not handled by the calling method

        class Case1 {
            public static void main(String args[]) {
                test();
            }

            static void test() {
                try {
                    int a = 10/0;
                } catch(NullPointerException e) {
                    sopln("problem is there check");
                }
                finally {
                    sopln("thank you");
                }
            }
        }

        - Output:
            thank you
            Exception in thread "main" java.lang.ArithmeticException: / by zero
                at Case1.test(Case1.java:8)
                at Case1.main(Case1.java:4)

    - finally example where exception doesn't occur
        class FinallyBlockDemo {
            public static void main(String args[]) {
                try {
                    // statements
                }
                finally {
                    // statements
                }
            }
        }

    - NOTE
        - We can also use the finally block with try block alone.
            - Example:
                try {
                    // stmts
                }
                finally {
                    // stmts
                }

    - final vs finally{} vs finalize()
        - final:
            1. final is a keyword.
            2. It is applicable to class, variable and method.
                - final class can't be inherited,
                - final variable can't be re-initialized and
                - final method can't be overridden.

        - finally { }:
            1. finally { } is a block.
            2. Instruction written inside finally block will be executed even if the exception isn't handled.

        - finalize():
            1. finalize() is a method.
            2. finalize() method is used to perform clean-up processing just before the object is garbage collected.

    - GARBAGE COLLECTION / finalize() DIAGRAM

        Student s1 = new Student();
        s1 = new Student();

        Or

        s1 = null;

        - When the reference to the first object is removed, that object becomes eligible for garbage collection.

        - Garbage collector will call the finalize() method to check for any pending work of the object.

### throw KEYWORD

- throw:
    - It is a keyword.
    - It is used to throw exception manually.
    - By using the throw keyword we can throw checked and unchecked exception. But it is mainly used to throw custom exception.

    - Syntax:
        throw exception_object;
    - Example:
        throw new CustomException("String");


    - THROWING THE UNCHECKED EXCEPTION BY throw KEYWORD WITHOUT HANDLING IT

        class ThrowDemo {
            public static void main(String[] args) {
                int a = 15, b = 10;

                if(a > b)
                    throw new ArithmeticException("manually thrown");
                else
                    System.out.println("no exception");

                System.out.println("next stmt won't be executed");
            }
        }

        - OUTPUT:
            Exception in thread "main" java.lang.ArithmeticException: manually thrown

    - THROWING THE UNCHECKED EXCEPTION BY throw KEYWORD WITH THE HANDLING IT
        class ThrowDemo {
            public static void main(String[] args) {
                int a = 15, b = 10;

                if(a > b) {
                    try {
                        throw new ArithmeticException("manually thrown");
                    } catch(ArithmeticException ae) {
                        System.out.print("Handled");
                    }
                }
                else {
                    System.out.println("no exception");
                }
                System.out.println("next stmt will also executed");
            }
        }

        - OUTPUT:
            Handled
            next stmt will also executed


    * **Note**: if we don't handle the manually thrown exception we will get unreported exception.


### CUSTOM EXCEPTION

- Custom Exception
    - The user defined exception is known as the Custom exception.

    - Q. What is the requirements of the Custom Exception?
        - When the inbuilt exceptions are not enough for the software development, we can write or define our own exceptions.
        - Ex: InvalidPassword, InsufficientBalance etc.

    - How to create the Custom exception?
        1. Create a class with Exception_name which one you wants to create.
        2. Make the exception as child of the Any of the Exception (either checked or unchecked, for example Throwable or Exception or RuntimeException etc.).
        3. Override the getMessage() method (inside this which message you want to print mention there) inside the exception you created.

----------------------------------------------------------------

# String
    - Literal / Data : Anything enclosed within double quotes and length can be anything is known as String data.
    - predefined class which is defined in java.lang package

    - How many ways are there to take String in java:
        - There are 3 ways
            1. java.lang.String class
            2. java.lang.StringBuffer class
            3. java.lang.StringBuilder class

    - String Constant Pool / String Pool Area 
        - Area / memory block used to store the string type object
        - It is memory area which is present inside the Heap area and specifically alloacated for string type of object.
        - Inside this duplicate string object will be not created.
        - It is not allocated fro StringBuffer and StringBuilder object

    - feature
        - Secure
            - String is neither giving original address nor reference address, it is directly giving data and for this java allocated one specific memory area which is String Constant pool or String Pool Area.
        - String is case sensitive
            - if we use same value with different cases then it will create new object in SPA.
            - The time of we are taking duplicate string values in the program, jvm will not create duplicate object in the memory and refer those data with existing object, but if data are changes in cases then different object will be created with new reference.
            - So we can say that String is case sensitive.
        - Immutable
            - The time of we will try to perform some operation over the string, string won't allow to change the original string object, it will create the copy of original object and operation will be applicable on that.
            - So, we can say string is immutable.

            Advantage : security
            Disadvantage : memory waste
        
    - For StringBuffer & StringBuilder
        - There is no space in Static Pool Area
        - They are stored in a block inside Heap Area directly.


    - Some important lists of methods
        1. length()
        2. charAt(index z)
        3. indexOf(char e)
        4. concat(String s)

    
    StringBuilder
        - multi thread
    StringBuffer
        - single thread

# STRING

- String:
    1. Literal / Data : Anything enclosed within double quotes and length can be anything is known as String data.
    2. predefined class which is defined in java.lang package

    - How many ways are there to take String in Java:
        - There are 3 ways
            1. java.lang.String class
            2. java.lang.StringBuffer class
            3. java.lang.StringBuilder class

    - String Constant Pool
        1. It is memory area which is present inside the Heap area and specifically allocated for String type of object.
        2. Inside this duplicate String object will be not created.
        3. It is not allocated for StringBuffer and StringBuilder object.

    - Some Important Constructor of String class:
        - There are nearly 15 constructor inside the String class.
            1. String()
            2. String(String a)
            3. String(char[] a)
            4. String(StringBuffer b)
            5. String(StringBuilder a)
            etc

    - How to take the String in Java by String class:

        String name = "Dev";
        sopln(name); // Dev

        String email = new String("dev@gmail.com");
        sopln(email); // dev@gmail.com

        String s = new String();

        char[] a = {'S', 'H', 'R', 'E', 'E'};

        String w = new String(a);
        sopln(w); // SHREE

        StringBuffer f = new StringBuffer("Neha");
        String g = new String(f);
        sopln(g); // Neha

        StringBuilder e = new StringBuilder("Akash");
        String h = new String(e);
        sopln(h); // Akash

        etc

    - "Some important lists of methods"
        1. length()
        2. charAt(index z)
        3. indexOf(char e)
        4. toCharArray()
        5. toUpperCase()
        6. toLowerCase()
        7. concat(String a)
        8. equalsIgnoreCase(String a)
        9. trim()
        10. split()
        11. substring()

        etc

    - Characteristics of String:
        1. Secure
        2. Case Sensitive
        3. Immutable
        etc

    1. Secure:
        - String is neither giving original address nor reference address, it is directly giving data. And for this Java allocated one specific memory area which is String Constant Pool or String Pool Area.

    2. Case Sensitive:
        - The time of we are taking duplicate String values in the program, JVM will not create duplicate object in the memory and refer those data with existing object, but if data are changes in cases then different object will be created with new reference.
        - So we can say that String is case sensitive.

    3. Immutable:
        - The time of we will try to perform some operation on the String, String won't allow to change the original String object, it will create the copy of original object and operation will be applicable on that. So we can say String is immutable.

        - Advantage : Security
        - Disadvantage : Memory waste

    - Solution of immutable:
        - StringBuffer 
        - StringBuilder

        1. StringBuffer / StringBuilder

            StringBuffer s;
            StringBuilder s1;

            StringBuffer t = "bye";       // CTE
            StringBuilder y = "hy";       // CTE

            StringBuffer u = new StringBuffer("bye");
            sopln(u); // bye

            StringBuilder l = new StringBuilder("hy");
            sopln(l); // hy


            StringBuffer u1 = new StringBuffer("bye");
            sopln(u1); // bye

            u1.append("Debasis");
            sopln(u1); // byeDebasis


    - StringBuffer vs StringBuilder

        StringBuffer                     |   StringBuilder
        ------------                     |   ------------
        .                                |
        Singlethreaded                   |   Multithreaded
        performance wise slower          |   performance wise faster
        threads will be wait for each    |   threads will parallelly
        other to finish the task         |   execute
        .                                |
        present since 1.2                |   present since 1.5


    - Q. Diff b/w

        String s = "hy";
        String s1 = new String("hy");

        sopln(s == s1);        // false
        sopln(s.equals(s1));   // true

    - In the String class, equals() method is used to compare the content of the object.

---------------------------------------------------------------------------------------------

# Important Interview Questions
## Part I
-  
    1. 


## Part II
- 
    1. 


## Part III
- 
    1. 