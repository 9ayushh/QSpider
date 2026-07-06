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
        - line-height
        - letter-spacing
        - word-spacing

        - text-decoration-line
        - text-decoration-thickness
        - text-decoration-style
        - text-decoration-color
        - text-align
        - text-transform
        - text-shadow

        - font-size
        - font-weight
        - font-style
        - font-family
    
    - Background Image 
        - background-image: url();
        - background-color
        - background-repeat
        - background-position
        - background-size

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

        - Flex-Item Properties
            1. Order:
                - The order property in CSS flexbox lets you change the visual order of your item without touching your HTML code. It rearranges items by sorting them from the lowest number to the highest number.
                - The default value of order is 0.
            
            2. Flex-grow:
                - Flex-grow is a CSS property that dictates how a flex item expands to fill any empty space inside its parent container.
                - Negative values are invalid.
                - The default value of flex-grow is 0.
            
            3. Flex-shrink
                - controls how much an item shrinks when there isn't enough space to fit all items in a container.
                - The default value of flex-shrink is 1.

    Grid
        - CSS Grid is a highly powerful two-dimensional layout system built directly into CSS. Unlike Flexbox, which primarily handles content in a single direction (either rows or columns), CSS Grid lets you align and arrange elements in both horizontal rows and vertical columns simultaneously.
        - It works on a parent-child relationship: It turns a parent element into a grid container, and its direct children automatically become grid items.
            1. display : grid
                - It is a CSS rule that turns an HTML element into a grid container, letting you arrange its content into two dimensions. It gives you total control over web layouts by letting you work in two dimensions simultaneously: horizontally and vertically.
            2. grid-template-rows :
                - The grid-template-rows property in CSS tells the browser how many rows a grid layout should have and how tall each row should be.
            3. grid-template-columns :
                - It is a CSS property that tells the browser how many columns a grid should have and how wide each column should be.
            4. grid-row-start / grid-row-end
                - grid-row-start and grid-row-end tell a grid item exactly which horizontal lines to start and stop at, which controls its vertical position and height.
            5. grid-column-start / grid-column-end
                - grid-column-start and grid-column-end are CSS properties that tell a specific item inside a grid container where to start and where to stop horizontally.

    Font-Awesome
        - Used to give the icons
            - fontawesome.com/v4/icons
            - fontawesome - cdnjs.com/libraries/font-awesome
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.1/css/all.min.css" integrity="sha512-2SwdPD6INVrV/lHTZbO2nodKhrnDdJK9/kg2XD1r9uGqPo1cUbujc+IYdlYdEErWNu69gVcYgdxlmVmzTWnetw==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    Transition in CSS
        - CSS transition is a tool used to make changes to a website's style happen smoothely over time instead of instantly

        1. transition-property:
            transition-property in CSS tells which CSS property you want to animate smoothly

        2. transition-duration
            tranisition-duration tells the browser how much time a css transition should take from the start to the end of the change.

        3. transition-timing-function
            - transition-timing-function defines the speed curve of a CSS transition. It tells the browser how the transition progresses from the start to the end, such as starting slowly, ending slowly, or moving at a constant speed.

                - linear → Moves at the same speed.
                - ease → Slow → Fast → Slow (default).
                - ease-in → Slow at first, then speeds up.
                - ease-out → Fast at first, then slows down.
                - ease-in-out → Slow → Fast → Slow.
        
        4. transition-delay
            - transition-delay specifies how long the browser should wait before starting the transition.

    Transform
        - The transform property is used to change the position, size, rotation, or shape of an element without affecting the layout of other elements.
            1. transform: translateX() = moves an element horizontally (left or right) along the X-axis.
            2. transform: translateY() = moves an element vertically (top or down) along the Y-axis
            3. transform: translate() = moves an element both horizontally and vertically at the same time.
            4. transform: rotate() = rotates an element clockwise or counterclockwise around its center.
            5. transform: skew() = slants(tilts) an element along the X-axis, Y-axis, or both without rotating it.
        
    Animation
        - A CSS animation is away to make webpage elements change smoothly from one style to another over time. Instead of a sudden jump, the browser automatically creates a smooth, moving transiton.

        - To build an animation, you only need two pieces of code:
            1. The @keyframes Rule: This is your script. It defines what the element looks like at specific points in time (e.g., at the start, middle, and end).
            2. The animation Properties: This is your director. It tells a specific HTML element
            which script to play, how long to run, and whether to loop.

        ==> animation-name: is a CSS property used to choose which specific movement or visual change you want to apply to an HTML element.

        ==> animation-duration: is the property that tells a web browser exactly how many seconds or milliseconds an animation should take to finish one full cycle.

        ==> animation-delay: is a property that tells a web browser how long to wait before starting an animation.

        ==> animation-timing-function: sets the spped curve of an animation, controlling how it accelerates and decelerates over its duration.

        ==> animation-iteration-count: is a CSS property that tells an animation how many times to play or loop before it stops completely

        ==> animation-direction: determines whether your animation plays forward, backward, or cycles back and forth.

        The 4 main Values : normal, reverse, alternate, alternate reverse

    - Media Query
        - A media query is like an "IF Statement" for your website's design. It tells the browser: "If the screen is a certain size, Then change the way the website looks."
        - It is the main tool developers use to make websites look good on phones, tablets, and desktops without making completely separate versions of the site.
        
        ==> min-width means "this size or larger" (greater than or equal to) and max-width means "up to this size" (less than or equal to)

        ==> min-height and max-height in CSS media queries look at the vertical height of the browser window and decide when to apply your styles based on that size.

                

    