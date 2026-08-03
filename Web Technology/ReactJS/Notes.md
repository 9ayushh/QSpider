# REACT JS

## Downloading

- Step 1 : Download Node.js
- Step 2 : Installing dependencies
    - npm create vite@latest
    - project name : ______________
    - package : _________________
    - framework : react
    - variant : javascript(choosed) / typescript / js with react / typescript with react
    - linter : enlint (choosed) / oslint

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

- ### Features
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
    - Component based architecture
    - Declarative
    - virtual DOM 

