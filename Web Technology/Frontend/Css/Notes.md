CSS
---

- Cascading StyleSheets (CSS)
    - **Discovered by Hakon Wium Lie**

    - CSS1
    - CSS2
    - CSS3 -> Latest Version
    - CSS4 -> not yet released

    - Three types
        1. Inline
            - applying the css in the same line by using style attribute
        2. Internal
            - applying the css using style tag, in the head tag of html
        3. External
            - Creating a seperate css file with .css extension and then we have to link that css file with link tag, inside the tag
        4. @import(URL)
            - for imposting multiple css files inside a single css file

    - Selectors
        - Selectors are used to target a html element so that we can apply the property.
        - Types of Selectors
            1. Simple Selectors
            2. Combinator
            3. Attribute Selector
            4. Pseudo Class Selector
            5. Pseudo Element Selector

        1. Simple Selector
            - id selector (#)
                - select by id 
            - className (.)
                - select by class name
                - single element can have more than one classes
                - multiple elements can have same class
            - tagName / element
                - select by tag/element name
            - grouping
                - select the whole group by gapping their selectors
                .development, .para, #startHeading {
                    width: 800px;
                }
            - universal (*)
                - used to target whole html
        
        2. Combinator Selector
            - Used to select html element based on their relationship with other elements

            1. decendent selector 
                - select all  elements inside that container
                - It select both direct and indirect children
                .box p {
                    color: green;
                }

            2. child selector 
                - select only it's own child element
                - it doesnot select deeper nested elements
                .box > p {
                    color: green;
                }

            3. imidiate / adjacent sibling selector 
                - Only select first next sibling
                - it shares the same parents
                .head1 + p {
                    color: pink;
                }

            4. general sibling selector 
                - selects all siblings elements
                .head1 ~ p {
                    color: red;
                }

        3. Attribute Selector
            - It is used to target an html element based on the html attibutes or values of the attribute
    
        4. pseudo Class Selector
            - It is used to select an html element based on it's special case or condition
            - it describe how an element behave not what it is. It starts with single colon (:) 
            - ex : 
                hover
                focus 
                active
                checked
                first-child
                last-child
                ... etc

        5. pseudo Element selector
            - used to select an html element or used to style a specific part of an element.
            - It allows you to style a part of a content not the whole element, it starts with (::)
            - ex 
                before
                after
                first-line
                first-letter
                selection
                ... etc
        
    - Units in CSS
        - it is used to define the size of an element and helps us to control the layout and spacing in our webpages.
        - There are three types of units in your css
            1. absolute unit
                - An absolute unit in css is a fixed measurement unit that does not change based on the screen size, parent element, or user browser preferences.
                - ex: px, mm, cm, etc...
            2. relative unit 
                - Relative units in css calculate dimensions ased on another external value, such as a prent element's size, the root element's font size, or the viewport's dimensions.
                - ex: %, em(element), rem(root element), vh, vw, etc...
            3. viewport unit
                - Css viewport units are relatice length measurements vased entirely on the dimensions of the browser's visible window area (the viewport).
                - ex: vw(viewport width), vh(viewport height), vmin, vmax, etc...


    