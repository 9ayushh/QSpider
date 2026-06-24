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

    - Elements
        - opening tag + closing tag + content
        - There are three types of elements
            - Block element
                - Those elements which occupies the complete width of the screen irrespective of there content
                - We can change the size of block element
            - inline element
                - which occupies the width according to the content resident inside it
                - we cannot change the size of inline element
            - inline-block element
                - Those element which is having the property of both block and inline element are known as inline-block element

    - Box Model
        - When we run html code inside the browser all the elements present inside the html will be represented as a rectangular box inside a browser, this representation is known as box model
        - It consist of 4 parts
            1. margin
                - give the space outside the border
                - the space between the elements are known as margin
            2. border
                - give the boundary
                - outline of content is known as border
            3. padding
                - give the space between the border and content is known as padding
            4. content

        - Properties
            - box-sizing: border-box;
            - box-sizing: content-box;

    - Text & Font
        - 
    - Background

    - CSS position
        - This position property in CSS defines how an HTML element is placed on a web page. It works alongside the offset coordinates (top, bottom, right, left) and z-index.

        position: static(default);
                 relative
                  absolute
                  fixed
                  sticky
        
        position: static;
        - In CSS, position: static; is the default positioning method for every HTML element, meaning the element automatically confroms to the normal.

        position: relative;
        - In CSS, position: relative; keeps an element in its normal spot on the page but allows you to move it around without affecting the elements around it.

        position: absolute;
        - The element is taken out of the normal page flow and you can place it exactly where you want using properties like top, left, right, and bottom.
        - It does not stay in its original place
        - It moves relative to its nearest positioned parent
        - It no such parent exists -> It moves relative to the whole page (body)

        position: fixed;
        - It means the element stays in the same position on the screen, even when the user scrolls the page.
        - It keeps an element locked to a specific spot on the screen, regardless of scrolling.

        position: sticky;
        - It means an element behaves like relative at first, but when you scroll to a certain point, it becomes fixed and sticks to the screen.
        - It lets an element scroll normally until it reaches a specified position, when it sticks there like a fixed element.
        
    Flex 
        - Flex refers to Flexbox(Flexible Box Layout), which layout model used to easily arrange, align, and distribute space among items in a row or a column. It makes web pages responsive by dynamically expanding or shrinking items.

        1. display:flex
            - Applying display: flex; to an HTML element turns it into a flex container. Its immediate child elements automatically become flex items.
        
        2. flex-direction
            - flex-direction is a CSS property that sets the direction items flow inside a flexbox container
            - It decides if items stack in a row or a column.

        3. justify-content
            - This property used to arrange and space out items horizontally inside a container.
            - (NOTE: if you change your layout's direction to a column using flex-direction:column, justify-content flips and controls the veritcal arrangement instead).
            - justify-content: flex-start/flex-end/center/space-around/space-between/space-evenly

        4. align-items
            - This property that controls how items inside a container line up up-and-down (vertically)
            - (NOTE: If you change your layout direction to columns, these directions swap, but for standard rows, just remember: align-items is your vertical control!)
            - align-items: flex-start/flex-end/center;

        5. gap
            - Gap in CSS is a property that creats space between items inside a layout.
            - It acts like an automatic invisible divider between boxes, preventing them from touching each other.

        6. flex-wrap
            - flex-wrap is a CSS property that decides whether your items should stay on one single line or drop down to a new line when they run out of space.
            - flex-wrap : nowrap/wrap/wrap-reverse

        7. align-content
            - controls the spacing between multiple rows or columns of flex items.
            - It decides how extra space is distributed when your items wrap across more than one line.

        

                

    