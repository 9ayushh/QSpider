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
                - If the condition is satisfied then the instruction written inside the if block gets executed if not satisfied, the condition is checked in the else if block from top to bottom order and if the condition is satisfied in any of the else if block then, only that else if block is gets exevuted if not satisfied else block gets exevuted remaining blocks are skipped.

            Questions
            - Print the month name based on month number.
            - Print the day name based on day number.
            - Print the number of days available in the month based on the month number.
            - Check given character is uppercase character or lowercase character or digit character or special character
            - Find out largest of two numbers
            - If the character is in uppercase, convert it into lowercase and if the character is in lowercase, convert it into uppercase
            - Check the digit is even or odd.
        
        iv. switch statement:
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
        {  //method signature
            //instructions
        }  //method definition is whole structure

        In this above syntax access modifier, modifier and formal argument are optional 

    - Method call statement: It is used to call a method 
        Syntax:
            Method Name ([actual argument]);
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
        - Execution of claling method is paused
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
