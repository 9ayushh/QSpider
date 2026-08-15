# REACT JS

## Downloading

- Step 1 : Download Node.js
- Step 2 : Installing dependencies
    - npm create vite@latest
    - project name : ______________
    - package : _________________(package.json)
    - framework : react
    - variant : javascript(choosed) / typescript / js with react / typescript with react
    - linter : enlint (choosed) / oxlint(latest)

- Step 3 : Your project is running on given localhost...
    - npm run dev

## Descriptions
- node modules
    - all installed libraries present
- eslint.config.js
    - for security
- vite.config.js
    - for module bundle
    - fast execution with lightweight mechnaism
- code in src folder
- image in public folder

- .jsx => javaScript xml

- first file -> main.jsx
- other than main.jsx file... all other files should start with capital letter


## Notes
- ### React Js
    - It is the library of JavaScript which is maintain by `meta` and group of individual developers
    - It is developed by `jordan walk` a software engineer in facebook.
    - React was first deployed on facebook newsfeed in 2011 and later on instagram in 2012.

    - Angular / Vue js, backbone js, etc... are other libraries which is used for creating single page application.
    - Amoung these libraries, react is very popular and lightweight as comparision to other libraries.
    - It is created by facebook for thier internal application, later they made it open source.

    - To install the react file/folder we have to use node.js.

- ### Node Js
    - node.js is a runtime environment which is used for executing Js file outside the browser
    - When you install react, or any other library, we have to use npm.
    - npm and npx, it comes by default with node.js

    - npm
        - npm stands for node package manager
        - which is used to install, manage and store packages in your react application.

    - npx 
        - npx stands for node package execute
        - which is used to run a package directly without installing it permanently.
        - It downloads the packages temporary, execute it and download it permanently and deletes the packages after execution.

    - React used vite as a module bundler 
        - Vite is a fast and modern tool which is used to create run and built react application.
            - A module bundle combines all react files (html(images), css, js) into optimized file so the browser understand them.
    
    - React internally uses babel.
        - It is a transpiler that converts modern js and jsx into browser understandable js.

- ### Files and Folder present inside the React Application
    1. Node Modules
        - It is the folder where all the installed libraries of a react project is stored

    2. src
        - It is the main folder where all the codes are written.
    
    3. .gitignore
        - It is the file that tells the git which files and folders should not to be uploaded to the github.
    
    4. package-lock.json
        - It is the file that saves exact version of all the installed libraries, so the project works the same on every computer/system.
    
    5. package.json
        - It is the file that tells what the project is, which libraries it needs, and how to run the project.

    6. README.md
        - This file explains the project details and how to run it.

    7. vite.config.js
        - It is the configuration file which is used to customise and control the vite behaviour for a project.

    8. eslint.config.js
        - It is a tool that checks react code for mistake and bad coding practices.
        - It automatically detect error and enforces coding standards in react application.
        - It finds syntax error, missing brackets, wrong variable and warn about unused variables.


- ### Features of React
    - Single page application
        - Single page application loads the single html file and dynamically updates it's content as the user interact with app. 
        - This results in faster in smoother transition providing more app like experience.

    - Component based architecture
        - It is a way to build react application by breaking them into reusable, independent piece of code.
        - In react, we have 2 types of component
            1. Class Based Component
            2. Function Based Component

    - Declarative
        - React is Declarative because we describe what the UI should look like based on the state.
        - React automatically update the DOM accordingly.
        
    - virtual DOM 
        (Real DOM => Virtual DOM => Updated Virtual DOM)
        - It is the lightweight copy of real DOM
        - React uses virtual DOM to improve its performance instead of updating the actual real DOM, react first update the virtual DOM and figures out what change and then only updated data is patched to the real DOM.

        - Q. What is Reconciliation 
            - In reconciliation, the old virtual DOM is compare to the new Virtual DOM to identify the changes that needs to be updated in the real DOM.
            - Whenever something changes in the application, react creates a new virtual DOM in this new virtual DOM tree each element of the application is represented as a node.
            - When the state or prop of a component changes, react creates a new virtual DOM and then compares it with the privious virtual DOM tree, this comparision is called Diffing.
            - React uses Hofman Diffing algorithm to efficiently compares the old virtual DOM tree and newly Updated DOM tree.
            - After finding the difference, react updates only the changed node or element into the real DOM instead of re-rendering the entire application.
            - This process improves react application performance and makes it faster.

    -  React Fiber (At the time when a large amount of data is changed)
        - It is the new reconciliation engine, which is introduced in React 16.
        - It is an improved version of react reconciliation algorithm that makes rendering faster, smoother and un-interuptable.
        - React fiber helps react to handle large rendering task into small chunks so important user interactions remains fast and smooth.


- Difference between Class Based Component and Function Based Component
    - Class Based Component
        - JS classes
        - Statefull
        - Life Cycle Methods
        - Hooks
        - Render Method
        - this keyword

    - Function Based Component
        - JS functions 
        - Stateless
        - No Life Cycle Methods => can be done by using hook (useEffect)
        - No Hooks
        - No render Method
        - No this keyword

- NOTE: 
    - If we wants to display multiple elements from one component then we have to wrap all the elements under a single parent element

- div is used to display multi elements but div takes a node in DOM, so to remove this wrapper.

- Fragment
    - A fragment in react is used to group multiple elements without adding extra node in the DOM tree.
    - fragment helps us to avoid extra div wrapper
    - There are two ways for creating fragments
        - By using Fragment keyword.
            <Fragment></Fragment>
            - we can provides attribute to the fragment
        - By using no keyword and no tags 
            <></>
            - we cannot provides any attribute to this fragment

- ### Modules in JavaScript
    - A module in Js is the separate file that contains reusable code 
    - ex:
        variable, classes, functions, etc.
    - which can be exported and used in other files

    - Modules allows you to split your code into smaller manageable pieces
    - Instead of writing everything inside one big file, you can divide the code into multiple files and connect them using import and export.

    - Types of Modules in JS
        1. Common JS
            - It is the module system which is used in node.js
            - It uses `require` method and `module.export`
        2. ES6 modules
            - It is introduced in ES6 - (2015)
            - It uses import and export keywords

            - Types of ES Modules
                - Named Export and Import
                    - It allows you to export muliple variables and functions from a module using their names.
                    - It is called named import because you must have to use the exact exported name while importing.
                - Default Import Export
                    - A default export is used when a module export only one main value (function, class, object, variable)
                    - No curly brackets were used for default import.
                    - We can give it any name while importing.
                    - Each module can have only one default export.

- Expression {javaScript code}
    - used to provide js code inside the return.

- ### Use State
    - It is a React Hook, which helps function based component to make it stateless to stateful.
    - It accepts one value which is initial value.
    - It returns an array, which consist two values
        - variable, which holds the initial value
        - updater fucntion, which helps to update the initial value

- ### Props
    - It stands for properties.
    - It is a mechanism for passing the data from one component to another.
    - Props is available in both class based & function based component.
    - It is passed just like we passes attribute in the HTML.

    - Props drilling is passing the data from one component to nested child component.

    - The disadvantage of props drilling is unnecessary re-rendering of component.
    - To avoid this unnecessary we use one hook i.e. useContext (Context API).

    - Props are immutable and unidirectional

    - #### Default Props
        - Default Props are the pre defined values that a react component uses when a specific prop is not provided by the parent component
        - They act like backup values to ensure the component still works properly even if no values are passed.
        
    ### LifeCycle

    - There are three phase
        1. mounting phase
            - Whenever any component is renders first time on the UI, this phase is called mounting phase
        2. updation phase
            - Whenever in state or prop of a component changes and the component gets re-rendered, this phase comes under updation phase
        3. unmounting phase
            - Whenever the component is removed from the UI, this phase is known as unmounting phase

        - Note:
            - Besides these three main phases, there is one more phase that is error handling
            - error handling in react lifecycle is a process where react catches the error and prevents the entire app from crashing
            - react introduce this feature in react 16 with error boundaries
    
    - ### useEffect
        - useEffect is a React hook, which helps us to handling the side effect in react application.
        - side effects like, 
            fetch the data from api
            removing eventListener
            updating DOM, etc.
        - This hook can also be used for checking the phases of function based component
        - It accepts two argument, 
            1. Callback function which we wants to execute
            2. Dependency Array

    - ### useLayoutEffect
        - It is a react hook that runs synchronusly after the DOM has been updated but before the browser paints the screen.
        - It accepts 2 arguments 
            1. callback function
            2. dependency array


    - ### Ways to adding CSS in React
        - Inline CSS
            - It means writing styles directly on a jsx. element using the style attribute as a js object
            - In inline css properties are written in camelCase and the values are written mostly in string

        - Internal CSS 
            - It is defined inside the same file/component using a style tag in jsx
            - It is used for small components where css is not reused everywhere.

        - External CSS
            - In external css, we have to create seperate css file with .css extension and then we have to import the css file in our component.

        - Css Module
            - Css module allows you to scope css locally to a component avoiding global conflict. 
            - Each class gets a unique generated name.
            - In big react project, multiple developers can style components without overriding global css.