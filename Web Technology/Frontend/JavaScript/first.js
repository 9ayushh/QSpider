
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

var a = 10;
function abc() {
    console.log(a); // undefined because a is only declared by hoisting
    var a = 10000;
    console.log(a); // 10000
}
console.log(a); // 10 because a = 10
abc();
console.log(a); // 10 because var inside function is only work inside function

// ! Decision / Conditional Statement

if("") {
    console.log("truthy val");
} else {
    console.log("falsy val");
}