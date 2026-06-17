Core Java

Uptill now
programming lang
types 
java
history
structure
execution
- Pointer ( complex ) --> java is simple (no pointers)
data
    - primitive and non-primitive
types
print data
diff bw print and println
tokens - 
    6 types of tokens
        - Comments
        - keywords 53
        - Identifiers
        - literals
        - Seperators
        - Operators
AScaii
A - 
Z - 
a - 
z -

Separaters - punctuations
comments - //,/**/

-----------------------------------------------
create a variable
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
    - It is of two type of typecasting
        1. Primitive
        2. Non-primitive

    Primitive:
        - The process of converting one type of primitive data into another type of primitive data is known as primitive typecasting.

        - Two types
            - small to large (Widing) / Implicite primitive typecasting
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

86 65 78 83 72 73 75 65
118 97 110 115 104 105 107 97
     



