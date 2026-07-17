# JavaScript
    
JavaScript
----------
    - It is used to add dynamic functionalities in our websites
    - ex:
        - fetching the data from API
        - authentication
        - authorization
    - It is Scripting as well as programming language
    - It is object-based programming language
    - It is partially object-oriented programming language because in js, there is prototyple inheritance

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
    i. functions
    ii. arrays
    iii. objects


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

      - hot code -> the code that keeps repeating

      This information is sent to the JIT compiler

  - JIT compiler:
    - JIT  = Just-In-Time compiler
    - In V8, the JIT compiker is called TurboFan.

    - JIT compiler:
      - Takes frequently used ("hot") code
      - Converts it into highly optimized machine code 
      - Make the program much faster
      - This is why javascript can run close to native speed


- Type Casting:
---------------
  - Conversion of one data type into another data type is knowm as type casting.

  - There are two types of typecasting in javascript:
    1. Implicit typecasting (type coersion)
        - Those typecasting which is done automatically by the js is known as Implicit typecasting.

    2. Explicit typecasting 
        - Those typecasting which is done manually by the developer or programmer is known as Explicit typecasting.


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
            console.log(a); // only accessable
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

Hoisting
--------
    - Before declaration and initialization, if we are trying to access the value of a variable this is known as hoisting.
    - It is a default js behaviour that moves all the variable declaration and fucntion declaration to the top of their scope.
    - If we are trying to hoist the variable that is declare by using var keyword, then it will gives undefined.
    - If we are trying to hoist the variable that is declared by using let and const, then the output will be *uncaught reference error* because the variables went into a dead zone which is known as TDZ (Temporal Dead Zone)

Decision / Conditional Statement
--------------------------------
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

    - else if
    - Switch


Loops in JS
-----------
    - for
    - while
    - do-while
    - nested loop

    - Advance loop
        - forEach
        - for-in
        - for-of
        - map
        - filter
        - reduce


Output Methods in JS
--------------------

    1. Console.log("Statement");  // It is used fro testing purpose
    2. document.writeln("Statement"); // It is used to display the data on the UI.
    3. alert("Password not matched"); // It is a popup method in JS
    4. confirm("Are you 18+"); // It is another popup methods, in which two options are present
    5. prompt("Enter your age: "); // It is a popup method, which is used to take the input from the user


Functions
---------
    - code reusability and code optimization
    - It is a reusable piece of code which helps us to avoid the repeatition of code in our program
    - It helps us to follow dry principle (don't repeat yourself)

    - Types of function
        1. Named function
            - Function which is having some name is called name function.
            - Arguments: Data which is passed while calling the function is called arguments.
            - Parameter: Function accepts arguments inside the paranthesis is called parameters.

            - ex:
                function test(a, b) {
                    console.log(a+b);
                }
                test(100, 200);

        2. Anonymous function
            - Function which doesn't have any name is called anonymous function.

            - ex:
                function() {
                    
                }

        3. Arrow function
            - It is also known as fat arrow function. It is the shorter form of writting function.

            - ex:
                let fun = () => {
                    console.log("arrow function");
                }
                fun();

            - Property 1 : 
                - If there is only 1 parameter then there is no need of using paranthesis.
                - ex:
                    let sum = a => {
                        console.log(a);
                    }
                    sum(100);

            - Property 2 : 
                - If there is only one statement then there is no need of using curly bracket. 
                - But if there are multiple statements and we have not used curly brackets, then output will be suffled.
                - ex:
                    let fun1 = () => console.log("statement 1");
                    fun1();

            - Property 3 : 
                - If there is only one statement, which is the returned stataement then theere is no need of using curly brackets, as well as return keyword.
                - It is known as implicit return.
                - ex:
                    let fun1 = data => data;
                    console.log(fun1(1000));


        4. IIFE (Immediate Invoke Function Expression)
            - After creating the function immediately, we are invoking the function, is known as IIFE.
            - It helps us to prevent the global variable pollution.
            - ex:
                (function() {
                    console.log("IIFE");
                })()

                (() => {
                    console.log("IIFE");
                })()

        5. Function with expression
            - When we are storing function as a value inside a variable it is known as function with expression.
            - And the stored function is known as First Class function / First Citizen function / First Order Function
            - ex:
                let fnWithEx = function() {
                    console.log("Function with expression");
                }
                let fnWithEx2 = () => {
                    console.log("Function with Expression");
                }
                fnWithEx();
                fnWithEx2();

        6. First Class / First Citizen Function
            - The function which stored as a value inside a variable is known as First Class function / First Citizen function / First Order Function

        7. Higher Order function
            - A function which accepts another function as an argument is known as Higher Order function.
            - ex:

        8. Callback function
            - A function which is passed as an argument is known callback function.

        9. Recursive function
            - function which calls itself, is called recursive function.

        10. Generative function
            - It is a special type of function which can paused and resume it's execution.
            - yield : It is a keyword which is used to pause the execution of the generative function.
            - next() : It is method which is used to resume the execution of generative function. It return an object which contains two properties.
            - value : data which is given by yield keyword.
            - done : It stores the boolean value, which specifies weather the execution of generative function is completed or not.
            - ex:
                function* genFn() {
                    yield "data1";
                    yield "data2";
                    yield "data3";
                    yield "data4";
                }
                let res = genFn();
                console.log(res.next()); // data1
                console.log(res.next()); // data2
                console.log(res.next()); // data3
                console.log(res.next()); // data4
                console.log(res.next()); // undefined


        11. Pure function
            - Function which gives same output for the same input, or which does not modify the external state is known as pure function.
            - ex:
                function pure(a, b) {
                    console.log(a*b);
                }
                pure(100,2); // same output for all
                pure(100,2);
                pure(100,2);

        12. Impure function
            - Function which gives different output for the same input, or which modifies the external state is known as impure function.
            - ex:
                let count = 1;
                function impure(a, b) {
                    console.log(a*b*count);
                    count++;
                }
                impure(100,2); // different output for all
                impure(100,2);
                impure(100,2);

    - Default parameters
        - Default values which is initialized to the function parameters. So in case of absence of arguments these default values will be used.
        - ex:
            function abc(a = 100, b = 200){ // default values
                console.log(a);
                console.log(b);
                console.log(a+b); // 
            }
            abc(); // 300
            abc(500,500); // 1000
            abc(500); // 700

    - Arguments Object 
        - It is a default array like object preseent in the non-arow function, which allows us to access all the arguments passed while calling the function without using the parameters.
        - ex:
            function sum() {
                console.log(arguments[0]);
                console.log(arguments[1]);
                console.log(arguments[0] + arguments[1]);
            }
            sum(100,200);
    
    - Nested Function
        - function present inside a function is known as nested function.
        - ex:
            function outer() {
                var a = 100;
                function inner() {
                    var b = 200;
                    console.log(a+b);
                }
                inner();
            }
            outer();

        - Closure => object : 
            - stores the data about the parent variables which are going to used in future.
            - It is a object created by the outer function, when the inner function is trying to access the data, which is present in the outer function.

    - JavaScript Currying
        - Currying is a functional programming technique that transforms a function taking multiple arguments into a sequence of nested functions, each taking a single argument. Instead of evaluating f(a, b, c) all at once, currying decomposes it to execute as f(a)(b)(c).
        - ex:
            function sum(a) {
                console.log("function 1");
                return function(b) {
                    console.log("function 2");
                    return function(c) {
                        console.log("function 3");
                        console.log(a+b+c);
                    }
                }
            }
            // method 1
            let fun2 = sum();
            let fun3 = fun2();
            fun3();
            // method 2 
            sum(200)(300)(100);

    - Function Hoisting 
        - It is possible in only in non-arrow function.
        - Named function are fully hoisted.
        - It will hoist all the functions at the top of the program.
        - ex:
            abc();
            function abc() {
                console.log("Function hoisting"); // Function hoisting
            }

String
------
    - Sequence of characters
    - ways of creating strings
        - Literal's way
            - ex:
                let str = "qwertyu";
                console.log(str);
                console.log(typeof str);

        - literal's way
            - ex:
                let str = 'qwertyu';
                console.log(str);
                console.log(typeof str);

        - Difference b/w "" & ''
            - ex:
                console.log("JavaScript doesn't support OOP's")
                console.log('This is "JS" Session')

        - template literals
            - advantage of template literals:
                - we can create multi-line string.
                - string interpolation -> embeded variables inside the string is known as string interpolation
            - ex:
                let str = `This
                is
                JS`;
                console.log(str);
                console.log(typeof str);

            - ex:
                let sub = "JS";
                console.log(`This is ${subj} class`);

        - Typecasting
            - ex:
                let str = String(true);
                console.log(str);
                console.log(typeof str);

    - Properties of String
        - length
            - using length property we can calculate length of string.
            - ex:
                let str = "qwertyuiopwertyui";
                console.log(str.length);

    - Methods of String
        - to access the character of any string
            - .at() // accepts negative values
                - It accepts index and find the character present at that index.
                - It supports negative index.

            - .charAt() // give empty string on negative values
                - It accepts index and find the character present at that index.
                - It doesn't supports negative index.

            - .charCodeAt()
                - It accepts index value and returns the ascii value of that character present at that index.

            - str[0] // by using array
                - Property access way to get character from string
    
        - slice(starting index, ending index --> excluded)
            - It is used to extract sequence of characters. It accepts two arguments starting index and ending index.

        - substring()
            - It accepts two arguments starting and ending index and return the sequence of characters.
            - negative values are converted into 0.
            - if starting index is greater than ending index then values are swapped.
        
        - .toUpperCase()
            - It converts the string into UpperCase.
            - ex:
                console.log(str.toUpperCase());

        - .toLowerCase()
            - It converts the string into LowerCase.
            - ex:
                console.log(str.toLowerCase());

        - .padStart()
            - It is used to adds the current string with a given string at the start of the string.
            - It accepts two arguments i.e., maxLength, "newString that we want to add."
            - ex:
                let str = "JAVA";
                console.log(str.padStart(maxLength, charcters));

        - .padEnd()
            - It is used to adds the current string with a given string at the end of the string.
            - ex:
                let str = "JAVA";
                console.log(str.padEnd(maxLength, charcters));

        - trimStart()
            - It removes extra whitespaces from start of the string.
            - ex:  
                let userName = "  nikhil015  ";
                console.log(userName.trimStart()); // remove space from start

        - trimEnd()
            - It removes extra whitespaces from end of the string.
            - ex:
                console.log(userName.trimEnd()); // remove space from end

        - trim()
            - It removes extra whitespaces from both ends start as well as end of the string.
            - ex:
                console.log(userName.trim()); // remove space from start and end

        - replace()
            - It replaces the first matching substring in the string.
            - ex: 
                let str = "Akshit is a good boy. Akshit is in 4th year."
                console.log(str.replace("find string", "replace string"))

        - replaceAll()
            - It replaces All the matching substring in the string
            - ex:
                console.log(str.replaceAll("find string", "replace string"))

        - .match()
            - Matches a string with a regular expression, and returns an array containing the results of that search.
            - ex:
                console.log(str.match("substring"));

        - .search()
            - Returns the index of the first matching substring.
            - ex:
                console.log(str.search("substring"));

        - concat()
            - It is used to merge two or more string, and returns a new String.
            - ex:
                let str = "JS";
                let str2 = "JAVA";
                let str3 = "python";
                console.log(str.concat(str2,str3));

        - repeat
            - Returns a string value that is made from count copies expended together. 
            - If count is 0, the empty string is returned.
            - ex:
                let str = "data ";
                console.log(str.repeat(5));

        - indexOf
            - It returns the indexOf first matching substring, or -1 if it is not present.
            - It accepts two arguments i.e., "substring" and "position" --> optional
            - ex:
                let str = "Akshit is a good boy. Akshit is in 4th year.";
                console.log(str.indexOf("Akshit",0));

        - lastIndexOf
            - Returns the last occurrence of a substring in the string, or -1 if it is not present.
            - ex:
                console.log(str.lastIndexOf("Akshit"));

        - includes
            - It returns the boolean value i.e., true or false, checks whether substring is present in the string or not.
            - ex:
                console.log(str.includes("Akshit"));