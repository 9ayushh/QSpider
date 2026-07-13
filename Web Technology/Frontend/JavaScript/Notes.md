# JavaScript
    
JavaScript
----------
    - It is used to add dynamic functionalities in our websites
    - ex:
        - fetching the data from API
        - authentication
        - authorization
        - 
    - It is Scripting as well as programming language
    - It is object-based programming language
    - It is partially object-oriented programming language because in js, there is prototypel inheritance

History of JavaScript
---------------------
    - It is developed in Sept 1995 by Brendan Eich in only 10 days
    - Initially it was named as MOCHA, then the name changes into LiveScript
    - Again for the marketing purpose, the name changes into JavaScript, because at that time, Java was very popular language. To get the popluarity from Java, the owner of the Java that is Sun Microsystem and owner of the JavaScript that is Natscape coorporation together they made an agreement and the name changes into JavaScript.
    - Again in 1997, JavaScript became ECMA(European Computer Manufacture Association) Script, then different version of ECMA script were released.
    - The latest version of ECMA script is ECMA Script 2026.
    - The famous version of ECMA script are ES6, ES7 and ES9.

Features of ECMA Script
-----------------------
    1. Let keyword
    2. Const keyword
    3. Arrow function
    4. Promise
    5. Symbols
    6. Async & Await
    7. Map, Filter & Reduce
    8. Spread operator
    9. Rest parameter
    ... etc

Features of JavaScript
----------------------
    1. Dynamic in nature
        - Variables are not bound to store specific data, inside one variable you can store any type of data
    2. Interpreted
        - The code will be checked line by line from top to bottom and left to right
    3. Synchronised
        - the code will be executed line by line from top to bottom and left to right
    4. Single threaded
        - It will be execute only one task at a time after completing the previous statement then only next line of code will be executed but we can make js from synchronous to asynchrounous by using promises and async-await
    5. Weekly and Loosly tight programming language
        - It means semicolon is not mandatory at the end of every line but if you're writing multiple statements in a same line, then you have to put semicolon.

Tokens:
-------
  - Smallest individual unit of a program is known as tokens.
  - It includes:
    1. Variables
    2. Identifiers
    3. Operators
    4. Data

Variables:
----------
  - Variables are just like containers which is used to store the data.
  - There are three types of variables:
    1. var 
        - everything is possible
    2. let 
        - redeclaration is not possible
    3. const 
        - only declare and initialization in single line is possible


Identifier:
-----------
  - Name given to a variable is known as identifier

  Rules of Identifiers:
    1. Name of identifier can't start with a number
    2. Special characters are not allowed only _ , $ are allowed.
    3. Reserved keywords can't used as identifiers.
    4. Spaces are not allowed between identifier.
    5. It is a case sensitive language i.e. uppercase and lowercase will be treated differently.

Operators:
----------
  
  Special operator:
    1. == vs ===
      ==: It checks only values
      ===: It checks values as well as data type. It is also known as strict type checking.

      console.log(2 == "2") //true
      console.log(0 == false) //true
      console.log(1 == true) //true

      console.log(2 === "2") //false
      console.log(0 === false) //false
      console.log(1 === true) //false

    2. typeof:
      - It tells which type of data, you are using.

Data Type:
----------
  1. Primitive (immutable) --> can't be changed
      i. Number 
      ii. String 
      iii. boolean 
      iv. null (typeof null is object) --> treated as a value and it represents absence of a value
      v. undefined
      vi. bigInt
      vii. symbol --> assign uniques identifier

  2. Non- primitive (mutable) --> can be changed


JS Engine:
----------
  - A javascript engine is a program inside the browser hat reads, converts and executes javascript code. It takes JS code, turns it into machine code using a compiler and runs it fast.

  - Google Chrome ----> V8 engine --> developed by google, made bu C++
  - Microsoft edge ----> V8 engine --> new
  - Microsoft edge ----> Chakra engine --> old
  - Mozilla Firefox ----> SpiderMonkey 
  - Safari (Apple) ----> JavaScriptCore (JSC) also called Nitro
  - Opera Browser ----> V8 engine

  - Parser:
    - The parser reads your javascript code word by word and checks if the syntax is valid.
    - If there is any syntax error -> it throws an error.
    - If everything is correct -> it converts the code into AST.

    Output: Abstract Syntax Tree (AST)

  - AST:
    - AST is a tree- structured representation of your code
    - It breaks your code into parts like:
      - variable declaration
      - Function calls
      - Expressions
      - Operators

      This makes it easier for the engine to understand what the code is supposed to do.

  - Interpreter:
    - Ther interpreter checks the code line by line and converts it into bytecode.
    - In chrome's V8 engine, this interpreter is caller Ignition.

    - Its goal:
      - Start executing your code as fast as possible
      - Provides quick results, even without optimization 

  - Profiler:
    - The profiler watches your running code and identifies:
      - which functions run repeatedly
      - which loops are heavy
      - which parts of the code are important (hot code)

      This information is sent to the JIT compiler

  - JIT compiler:
    - JIT  = Just-In-Time compiler
    - In V8, the JIT compiker is calle TurboFan.

    - JIT compiler:
      - Takes frequently used ("hot") code
      - Converts it into highly optimized machine code 
      - Make the program much faster
      - This is why javascript can run close to native speed

-------------------------------------------------------------------------------------

- Type Casting:
  - Conversion of one data type into another data type is knowm as type casting.

  - There are two types of typecasting in javascript:
    1. Implicit typecasting (type cohersion)
        - Those typecasting which is done automatically by the js is known as Implicit typecasting.

    2. Explicit typecasting 
        - Those typecasting which is done manually by the developer or programmer is known as Explicit typecasting.

-------------------------------------------------------------------------------------

Scope of a Variable
-------------------
    - Scopes:
        - Accessibility and availability of variable inside js program is known as scopes of the variable.

    - The scope of any variable is decided based on the two factors :
        1. Type of the variable : i.e. var, let, const
        2. Position of the variable inside the js

    - Global:
        - If you have declared any variable outside the block and fucntion using var keyword, then the scope of the variable is in the global scope.
        - ex:
            var a = 100;
    - Script Scope
        - If you have declared any variable outside the block and function by using let and const keyword, then the scope of the variable is in the script scope.
        - ex:
            let b = 200;
            const c = 300;

    - Block Scope
        - If the variables are declared by using var, let and const, inside the block. Then only var variable can be accessible outside the block. Block scope restrict the variable created by using let and const keyword from accessing outside it.
        - ex:
            {
                var a = 100;
                let b = 200;
                const c = 300;
            }
            console.log(a);
            console.log(b);
            console.log(c);

    - Local Scope / Function Scope
        - If the variables are declared by either using var, let or const, then the scopes of the variables is in the local scope, which means variables can be accessed only within the function, because local scope resticts the variables from accessing outside it.
        - ex:
            function abc() {
                var a = 100;
                let b = 200;
                const c = 300;
            }
            abc();

    - debugger - used to debug the code starting from where it was declared

    - Hoisting
        - Before declaration and initialization, if we are trying to access the value of a variable this is known as hoisting.
        - It is a default js behaviour that moves all the variable declaration and fucntion declaration to the top of their scope.
        - If we are trying to hoist the variable that is declare by using var keyword, then it will gives undefined.
        - If we are trying to hoist the variable that is declared by using let and const, then the output will be *uncaught reference error* because the variables went into a dead zone which is known as TDZ (Temporal Dead Zone)

    - Decision / Conditional Statement

        - Falsy values
            - 0
            - false
            - null
            - undefined
            - NaN
            - ""
            - 0n
            - -0

        - if-else
            if("") {
                console.log("truthy val");
            } else {
                console.log("falsy val");
            }


        