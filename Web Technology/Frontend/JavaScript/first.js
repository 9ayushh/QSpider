
// console.log("hello");

// console.log(window);
// console.log(this);

// Variables
// var a = "String";
// var a = 243232;
// var a = 111.11;
// var a = true;
// var a = null;
// var a = 'a';
// var a = undefined;
// var a = arr[];

// console.log("Task 1");
// console.log("Task 2");
// console.log("Task 3");

// // for loop
// for(let i=0; i<100000; i++){
//     console.log(i);
// }

// console.log("Task 4");
// console.log("Task 5");

// console.log("Statement1"); console.log("Statement2") // semicolon is mandotary

//! variable

//& var
// only declaration --> possible
// var a;

// only initialization --> possible
// a = 100

// declaration & initialization (same) --> possible
// var a = 100;

// re-declaration --> possible
// var a = 288;

// re-initialization --> possible
// a = "string"

//& let
// only declaration --> possible
// let abc;

// only initialization --> possible
// abc = 100;

// declaration & initialization (same) --> possible
// let a = 10000;

// re-declaration --> not possible
// let a = 23;

// re-initialization --> possible
// a = "string"

//& const
// only declaration --> not possible
// const abc;

// only initialization --> not possible
// abc = 100;

// declaration & initialization (same) --> possible
// const a = 10000;

// re-declaration --> not possible
// const a = 23;

// re-initialization --> not possible
// a = "string"


// ! Data type

// & primitive (immutable):

// ?number
// let no = 1345
// console.log(no);
// console.log(typeof no);


// ?string  
// let str = "Isha"
// console.log(str);
// console.log(typeof str);


// ?boolean
// let bool = true
// console.log(bool);
// console.log(typeof bool);


// ?null
// let xyz = null;
// console.log(xyz);
// console.log(typeof xyz);


// ?undefined
// let data;
// console.log(data);
// console.log(typeof data);


// ?bigInt
// let bigData = 1345n
// console.log(bigData);
// console.log(typeof bigData);

// ?Symbol
// let sym1= Symbol("hii");
// let sym2=Symbol("hii");
// console.log(sym1 == sym2);
// console.log(sym2 == sym1);
// console.log(typeof sym1);
// console.log(typeof sym2);

//& Non primitive (mutable):

// ?function
// function abc(){
//   console.log("function");
// }
// console.log(typeof abc); //function

// ?array
// let arr = []
// console.log(arr);
// console.log(typeof arr); //object

// ?object
// let obj =  {}
// console.log(obj);
// console.log(typeof obj); //object

// !TypeCasting

// ? Implicit typecasting

// console.log([] + []);
// console.log([] + {});
// console.log({} + []);

// console.log(typeof "str");
// console.log(typeof str);
// console.log(typeof new String("abc"));

// console.log(2 + "2"); // 22
// console.log(2 * "2"); // 4
// console.log(2 + "hii"); // 2hii
// console.log(2 * "hii"); // NaN
// console.log(typeof(2 + "asd")); // string
// console.log(typeof(typeof(2 + "asd"))); // string

// console.log(typeof JSPIDER); // function
// console.log(typeof String); // function
// console.log(typeof Array); // function
// console.log(typeof Object); // function

// console.log(typeof String()); // string
// console.log(typeof Array()); // object
// console.log(typeof Object()); // object


// ? Explicit typecasting

// console.log(typeof NaN);

// console.log(Number(true));
// console.log(Boolean(1));
// console.log(String(false));

// Scope of a variable

// ? Global
// var a = 100;

// ?  Script
// let b = 200;
// const c = 300;

// console.log(a);
// console.log(b);
// console.log(c);

// debugger

// ? Block
// {
// var a = 100; // global
// let b = 200; // block
// const c = 300; // block
// }       
// console.log(a);
// console.log(b);
// console.log(c);

// ? Local / Functional Scope
// function abc() {
//     var a = 100;
//     let b = 200;
//     const c = 300;
// }
// abc();

// ! Hoisting

// var a = 10;
// function abc() {
//     console.log(a); // undefined because a is only declared by hoisting
//     var a = 10000;
//     console.log(a); // 10000
// }
// console.log(a); // 10 because a = 10
// abc();
// console.log(a); // 10 because var inside function is only work inside function

// ! Decision / Conditional Statement

// if("") {
//     console.log("truthy val");
// } else {
//     console.log("falsy val");
// }

// ? else if

// let a = 5;
// let b = 9;
// let c = 3;
// if(a > b && a > c) {
//     // console.log("a is greater");
//     console.log(`${a} is greater`);
// } else if (b > c) {
//     // console.log("b is greater");
//     console.log(`${b} is greater`);
// } else {
//     // console.log("c is greater");
//     console.log(`${c} is greater`);
// }

// ? Switch

// let day = 2;

// switch (day) {
//     case "MON": {
//         console.log(`${day} Monday`);
//         break;
//     }
//     case "TUE": {
//         console.log(`${day} Tuesday`);
//         break;
//     }
//     case "WED": {
//         console.log(`${day} Wednesday`);
//         break;
//     }
//     case "THUR": {
//         console.log(`${day} Thursday`);
//         break;
//     }
//     case "FRI": {
//         console.log(`${day} Friday`);
//         break;
//     }
//     case "SAT": {
//         console.log(`${day} Saturday`);
//         break;
//     }
//     case "SUN": {
//         console.log(`${day} Sunday`);
//         break;
//     }
// }

// ? Ternary operator

// let a = 5;
// let b = 6;
// let c = (a > b)? console.log(`${a} is greater`) : console.log(`${b} is greater`);

// console.log(c);

// ! Loops

// ? for loop
// for(let i=0; i<5; i++){
//     console.log(i);
// }

// ? while loop
// let i = 0;
// while (i< 5) {
//     console.log(i);
//     i++;
// }

// ? do-while loop
// let i = 0;
// do {
//     console.log(i);
//     i++;
// } while (i < 5) 

// ? nested loop


// ! Output methods in JS

// console.log("Statement");

// document.writeln("Statement");

// alert("Password not matched");

// let res = confirm("Are you 18+");
// console.log(res);

// let no1 = Number(prompt("Enter no 1"));
// let no2 = parseInt(prompt("Enter no 2"));
// console.log(no1 + no2);
// console.log(typeof no1);
// console.log(typeof no2);

// parseInt -> extract the integer value from a string

// ! Function

// function sorry(){
//     document.writeln("Sorry");
// }
// sorry();

// ? Named function
// function test(a, b) {
//     console.log(a+b);
// }
// test(100, 200);

// ? Anonymous function
// function() {
    
// }

// ? Arrow function
// let fun = () => {
//     console.log("arrow function");
// }
// fun();

// ~ Property 1
// let sum = a => {
//     console.log(a);
// }
// sum(100);

// ~ Property 2
// let fun1 = () => console.log("statement 1");
// fun1()

// ~ Property 3
// let fun1 = data => data;
// console.log(fun1(1000));

// ? IIFE
// (
//     () => {
//         var x = 5;
//         console.log("IIFE");
//     }
// )()
// console.log(x);
// only 1 time execution.


// ? Function with expression

// let fnWithEx = function() {
//     console.log("Function with expression");
// } // function is known as First class function

// let fnWithEx2 = () => {
//     console.log("Function with Expression");
// } // function is known as first class/ first citizen function

// fnWithEx();
// fnWithEx2();


// ? Higher Order function / Callback function
// function HOF(a, b, callback) {
//     callback(a,b);
// } // Higher order function
// HOF(
//     100, 200, 
//     function(i, j){ console.log(i+j)} // callback function
// );

// ? Recursive Function
// function findFactorial(n){
//     // base case
//     if(n==1) {
//         return 1;
//     }
//     return n * findFactorial(n-1);
// }
// let res = findFactorial(5);
// console.log(res);

// ? Generative function
// function* genFn() {
//     yield "data1";
//     yield "data2";
//     yield "data3";
//     yield "data4";
//     return "data5";
// }
// let res = genFn();
// console.log(res.next()); // data1
// console.log(res.next()); // data2
// console.log(res.next()); // data3
// console.log(res.next()); // data4
// console.log(res.next()); // data5 done = true
// // undefined if return is not there

// ? Pure function
// function pure(a, b) {
//     console.log(a*b);
// }
// pure(100,2); // same output for all
// pure(100,2);
// pure(100,2);

// ? impure function
// let count = 1;
// function impure(a, b) {
//     console.log(a*b*count);
//     count++;
// }
// impure(100,2); // different output for all
// impure(100,2);
// impure(100,2);

// ? default parameters
// function abc(a = 100, b = 200){ // default values
//     // console.log(a);
//     // console.log(b);
//     console.log(a+b); // 
// }
// abc(); // 300
// abc(500,500); // 1000
// abc(500); // 700

// ? arguments object
// function sum() {
//     console.log(arguments[0]);
//     console.log(arguments[1]);
//     console.log(arguments[0] + arguments[1]);
// }
// sum(100,200);

// ? Nested function
// function outer() {
//     var a = 100;
    
//     function inner() {
//         var b = 200;
//         console.log(a+b);
//     }
//     inner();

// }
// outer();

// ! JavaScript Currying
// function sum(a) {
//     console.log("function 1");
//     return function(b) {
//         console.log("function 2");
//         return function(c) {
//             console.log("function 3");
//             console.log(a+b+c);
//         }
//     }
// }
// // method 1
// let fun2 = sum();
// let fun3 = fun2();
// fun3();

// // method 2 
// sum(200)(300)(100);
