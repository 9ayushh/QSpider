// ! BOM
// ~ window
// ~ history
// ~ location
// ~ screen


// ? ID
// var res = document.getElementById("head1");
// console.log(res);

// ? Class
// var res = document.getElementsByClassName("head2");
// console.log(res);

// ? TagName
// var res = document.getElementsByTagName("p");
// console.log(res);

// ? QuerySelector
// * By id
// var res = document.querySelector("#head1");
// console.log(res);

// * By ClassName
// var res = document.querySelector(".head2");
// console.log(res);

// * By TagName
// var res = document.querySelector("p");
// console.log(res);

// ? QuerySelectorAll
// var res = document.querySelectorAll(".head2");
// console.log(res);



// ! Manipulating Attribute through JS

// var inp = document.querySelector("input");

// ~ getting attribute value
// console.log(inp.placeholder);
// console.log(inp.type);

// ~ updating attribute
// inp.type = "password";

// ~ adding new attribute
// inp.minLength = 10;

// ~ getAttribute() 
// console.log(inp.getAttribute('type'));
// console.log(inp.getAttribute('placeholder'));

// ~ setAttribute()
// inp.setAttribute('type', "password");
// inp.setAttribute('minLength', "10");
// console.log(inp);


// ! Accessing the Content
// let ele = document.querySelector('.box');

// ~ innerHtml
// console.log(ele.innerHTML);

// ~ innerText
// console.log(ele.innerText);

// ~ textContent
// console.log(ele.textContent);


// ! Adding CSS

// let res = document.querySelector('h1');

// ? inline CSS
// res.style.color = "red";
// res.style.backgroundColor = "black";
// res.style.padding = "10px";
// res.style.borderRadius = "10px";

// ? internal CSS
// res.style.cssText = `color: green; background-color: red; padding: 10px; border-radius: 10px;`;

// ? external CSS
// ~ add class
// res.classList.add("abc");

// ~ remove class
// res.classList.remove("abc");

// ~ add class if not present, remove class if present
// res.classList.toggle("abc");


// ! Event Handler in JavaScripot

// var res = document.querySelector('button');
// res.addEventListener(onclick,"abc()");

// function abc() {
//     console.log("Button is Clicked");
// }

// let i = 0;
// function mouseMove() {
//     console.log(i);
//     i++;
// }


// Change mode
// function changeMode(){
//     var addingBackground = document.querySelector("body");
//     addingBackground.style.backgroundColor = "#000025";
//     addingBackground.style.color = "#ffffff";

// }


// function toggleButton() {
//     var res = document.querySelector("body");
//     var content = document.querySelector('button');
//     var a = res.classList.toggle("abc");
//     if(a){
//         content.innerText = "Light";
//     } else {
//         content.innerText = "Dark";
//     }
// }

// ^ .addEventListener('eventHandler', callback, boolean(false))

// ? event bubbling
// let bt = document.querySelector("button");
// bt.addEventListener("click", ()=> {
//     console.log("button is clicked");
//     bt.classList.toggle("abc");
// });

// ? event capturing
// let gp = document.querySelector('.grand-parent');
// gp.addEventListener("click", ()=> {
//     console.log("gp is clicked");
// }, true);

// let pr = document.querySelector('.parent');
// pr.addEventListener("click", ()=> {
//     console.log("parent is clicked");
// }, true);

// let child = document.querySelector('.child');
// child.addEventListener("click", () => {
//     console.log("child is clicked");
// }, true);


// ! Timing function
// ? setTimeout(callback, time)

// console.log("task 1")
// console.log("task 2")

// let clearTime = setTimeout(()=> {
//     for(let i=0; i< 1000000; i++){}
//     console.log("timing function");
// }, 3000)

// console.log("task 3")
// console.log("task 4")

// ? clearTimeout(name)
// document.querySelector('button').addEventListener('click', function() {
//     clearTimeout(clearTime);
//     alert('function cancelled');
// })


// ? setInterval(callback, time)
// var i = 0;
// let clear = setInterval(() => {
//     console.log('Time', i++);
// }, 1000)

// document.querySelector('button').addEventListener('click', function(){
//     clearInterval(clear);
//     alert('function cancelled');
// })

// ! Promise

// ~ Custom promise
// * new Promise(callback(resolve, rejected))

// let p1 = new Promise((resolve, rejected) => {
//     resolve('p1 is resolved');
//     rejected('p1 is rejected');  
// });
// console.log(p1);

// ~ Instance methods
// ? then
// ? catch
// ? finally

// p1.then((res) => {
//     console.log(res);
// }).catch((err) => {
//     console.log(err);
// }).finally(() => {
//     console.log("finally");
// })


//--------------------------------------------
// let p1 = new Promise((a,b) => {
//     a('abc');
//     b('xyz');
// });
// p1.then((res) => {
//     console.log(res);
// }).catch((err) => {
//     console.log(err);
// }).finally(() => {
//     console.log("finally");
// });

//--------------------------------------------

// * Promise All
// let p1 = new Promise((res, rej) => {
//     res('p1 resolved');
// });
// let p2 = new Promise((res, rej) => {
//     res('p2 resolved');
// });
// let p3 = new Promise((res, rej) => {
//     res('p3 resolved');
// });

// let pTotal = Promise.all([p1, p2, p3]);
// pTotal.then((res) => {
//     console.log(res);
// }).catch((err) => {
//     console.log(err);
// });

// * Promise.allSettled
// let p1 = new Promise((res, rej) => {
//     res('p1 resolved');
// });
// let p2 = new Promise((res, rej) => {
//     rej('p2 rejected');
// });
// let p3 = new Promise((res, rej) => {
//     res('p3 resolved');
// });

// let pTotal = Promise.allSettled([p1, p2, p3]);
// pTotal.then((res) => {
//     console.log(res);
// }).catch((err) => {
//     console.log(err);
// });

// * Promise.race
// let p1 = new Promise((res, rej) => {
//     setTimeout(() => {
//         res('p1 resolved');
//     }, 4000);
// });
// let p2 = new Promise((res, rej) => {
//     setTimeout(() => {
//         rej('p2 rejected');
//     }, 2000);
// });
// let p3 = new Promise((res, rej) => {
//     setTimeout(() => {
//         res('p3 resolved');
//     }, 3000);
// });

// let pTotal = Promise.race([p1, p2, p3]);
// pTotal.then((res) => {
//     console.log(res);
// }).catch((err) => {
//     console.log(err);
// });

// * Promise.any
// let p1 = new Promise((res, rej) => {
//     setTimeout(() => {
//         res('p1 resolved');
//     }, 4000);
// });
// let p2 = new Promise((res, rej) => {
//     setTimeout(() => {
//         rej('p2 rejected');
//     }, 2000);
// });
// let p3 = new Promise((res, rej) => {
//     setTimeout(() => {
//         res('p3 resolved');
//     }, 3000);
// });

// let pTotal = Promise.any([p1, p2, p3]);
// pTotal.then((res) => {
//     console.log(res);
// }).catch((err) => {
//     console.log(err);
// });


// -----------------------
// ! fetch()

// ~ OLD method
// let res = fetch("https://api.github.com/users");

// res.then((data) => {
//     return data.json();
// }).then((actualData)=>{
//     console.log(actualData);
// }).catch((err) => {
//     console.log(err);
// });

// ~ NEW method
// ? async await
// async function abc() {
//     let res = await fetch("https://api.github.com/users");
//     let actualRes = await res.json();
//     console.log(actualRes);
// }
// abc();

// ! Local Storage
// ? setItem()
// localStorage.setItem("id", 1);
// localStorage.setItem("name", "abc");
// localStorage.setItem("sal", 5678);

// ? getItem()
// let res = localStorage.getItem("name");
// console.log(res);

// ? removeItem()
// localStorage.removeItem("id");

// ? clear()
// localStorage.clear();

// ! Session Storage
// ? setItem()
// sessionStorage.setItem("id", 1);
// sessionStorage.setItem("name", "abc");
// sessionStorage.setItem("sal", 5678);

// ? getItem()
// let res = sessionStorage.getItem("name");
// console.log(res);

// ? removeItem()
// sessionStorage.removeItem("id");

// ? clear()
// sessionStorage.clear();

//^ -------------------------------------------
// * Event loop : Event loop is a mechanism in js that continuously check ...
// * whether the call stacks empty and moves tasks from queues to the stack for execution  .
//* call stack : A DS wheer js execute code line by line (LIFO)

// * web api : Feature provide by the browser (not js itself ) to handle async task like : 

// setTimeout
// dom event 
// API calls 

// callback queue  (Task Queue) : A queue where call back from async operation wait before execution , 
// microtask queue : A high priority queue for : promise(.then)

// Event loop is a process that 
// check if call stack is empty 
// first execute microtask 
// then execute callback queue tasks 

// console.log("start")
// setTimeout(()=>{
//   console.log("timeout 1")

//   Promise.resolve().then(()=>{
//     console.log("promise 1")
//   })
// })
// Promise.resolve().then(()=>{
//   console.log("promise 2 ")

//   setTimeout(()=>{
//     console.log("timeout 2");
//   },0);
// })
// console.log("end");

// *o/p is 
// start 
// end 
// promise 2
// timeout1
// promise 1
// timeout 2

//  for (var i = 0 ; i<4;i++){
//   setTimeout(()=>{
//     console.log(i)
//   },0)
//  }

console.log("A");

Promise.resolve().then(()=>{
  console.log("B")
  Promise.resolve().then(()=>{
    console.log("C")
  })
})

setTimeout(()=>{
  console.log("D")
})
console.log("E")