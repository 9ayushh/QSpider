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


function toggleButton() {
    var res = document.querySelector("body");
    var content = document.querySelector('button');
    var a = res.classList.toggle("abc");
    if(a){
        content.innerText = "Light";
    } else {
        content.innerText = "Dark";
    }
}

