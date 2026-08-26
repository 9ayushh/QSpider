# Manual Testing - E8


flow of answering
    - what -> 1
    - when -> 2
    - why -> 2
    - [Types 
    - Adv/Dis Adv] -> when (when and why is not present)


SDLC
----
    - Software Development Life Cycle
    - step by step process of a software to follow

    - 7 Stages of SDLC
        1. Requirement Collections
        2. Feasibility Study
        3. Design
            - High level design
            - Low level design
        4. Coding
        5. Testing
        6. Installation
        7. Maintenence

    - Models
        1. Waterfall Model
        2. Spiral Model
        3. V Model
        4. Prototype Model
        5. Agile Model

        - Customize Model
        - Hybrid Model


    - CRS -> Customer Relation Specification
    - SLA -> Service Level Agreement
        - Agreement sent by the company to the user, that contain the services with the payment and time.

SDLC
----
    - It is a step by step procedure or standard procedure to develop a new software

    Q1 - When does SDLC start ?
        - When a company wants to start with a new project, they start with SDLC

    Q2 - Why should we follow SDLC. What will happen if we don't follow SDLC?
        1. We will to get to know how many engineers are required to work on the project.
        2. We will not get to know how much cost to be invested on the project
        3. There might not be proper supporting requirement document.
        4. Chances are there we might delay in releasing software to customer.

    Stages of SDLC/Diagram for SDLC
    1. Requirement collection => BA (business analyst) / PA (product analyst)
            |
    2. Feasibility study => PM (project manager), Architet, Finance and HR team
            |
    3. Design => Architect, Sr. Architect and technical arch
            |
    4. Coding => Sr. Develop Engineer, Jr. Develop engineer and Fresher
            |
    5. Testing => Sr. Test engineer, Jr Test Engineer and Fresher
            |
    6. Installation => IT engineer, site engineer, field Engineer
            |
    7. Maintains => Development engineer, Test engineer


WaterFall Model
---------------
    - It is a step by step procedure / standard procedure to develop a new software.
    - It is also known as basic model or sequential model or traditional model.

    - Diagram for waterfall model
    Requirement Collection
        |
        Feasibility Study
            |
            Design
                |
                Coding
                    |
                    Testing
                        |
                        Installation/Implementation
                            |
                            Maintainance

1. Requirement Collection
    - It is a requirement collection from customer place, BA will go to customer place and collect requirement's in Business language and come back to company and convert into software language and explain it to developer and test engineers. 
    - BA will act as a bridge between company and customer.

    Diagram on notebook 

    i. Customer will approach s/w company
    for s/w development.
                                2 yrs / 2 crore

    ii. Infy will hire ICICI Bank Manager.

                        Infosys
                    +----------------+
                    |      PM        |
                    |                |
                    |  Developers    |
                    |                |
                    |      T.E       |
                    +----------------+

    iii. Infosys will give training on s/w for
    ICICI Bank Manager.

    iv. Infosys will send ICICI Bank Manager to
    Customer Business (CB) as "BA"
    for requirement collection.

    v. BA will collect requirements in BL
    (Business Language) and come back
    to the company to convert BL into
    Software Language and explain it to
    Developers, T.E., PM, Architect, etc.


                Banking Business
                (City Bank)
                    Customer
                +---------------+
                |   CB Manager  |
                +---------------+


                (1000 Pages)
            Requirement Document
            +------------------------------+
            | Amount Transfer              |
            | Amount Balance               |
            | Loans                        |
            | OD                           |
            | Insurance                    |
            | Ledger Account               |
            +------------------------------+
                Business Language


                    ICICI Bank
                +------------------+
                |   Bank Manager   |
                +------------------+
    15-20 yrs Banking Domain
                    |
                    \_ Domain Expert

    Senior D.E. (10 yrs)
    Senior T.E. (6-7 yrs)

    Notes (Who can handle)
    70-80% Critical & Complex  ------> BA mandotary
    20-30% Small & Simple      ------> D.E & T.E

    - Who can became a business analyst?
        - Domain expert
            - if a person having around 15-20 years of experience in same domain and has got good knowledge on his domain is called domain expert.
        - Senior Developer
        - Senior Test Engineer

        NOTE: 
            - 72% - 80% of critical and complex project BA(Business Analyst) will be present 
            - 20% - 30% of small projects BA might not be present, so in that case Senior Developer Or Senior Test Engineer will play the role of BA.

2. Feasibility Study (Stage 2)
    - once requirement collection will done, then we can go to the feasibility study
    - it is done by a team, which consist of Business Analyst, Architect, HR Team, Finance Team and Project manager
    - This is the stage where company will decide to take a project or not (we can work on this project or not) 
    - and if we take up the project, then company will check for sufficient resource, technologies, lab setups and this is the stage, where company will get to know, if the company will get profit or not, this process is known as feasibility study.

    i. Role of Project manager
        - Project manager will interact with business analyst, hr team, finanace team and architect and gather the information.
        - He will decide to take up the project or not.

    ii. Role of Architect
        - Architect will always think from technical point of view and he will decide, technically is it possible to implement the project or not, if it is possible which kind of technology to be used, this decision is taken by architech.

    iii. Role of Business Analayst
        - Business Analayst will be involve in requirement.
        - BA will go to customer place and collect requirements in business language and comeback to company and convert the business language into software language and explain it to developer and test engineers.

    iv. Role of finance team
        - finance team will always think from money point of view (pov) and they see what is the operational cost required to work on the project and if they invest money do they get profit or not.

    v. Role of HR Team
        - HR will always think from resource pov.
        - They will check whether no. of engineers and lab setups are available or not.

    1. Business analyst
        - explain all requirement to all the team.
    2. Architect (multiple technical programming language - knowledge)
        - Technical Feasibility
            - decide the technologies which we use to design the software
    3. Hr Team
        - Resource Feasibility
        - Think on resource pov (resources)
            -> engineers
            -> lab set-ups
        - If lack of resources
            - Hiring -> for the project (technology)
    4. Finance Team
        - Financial feasibility
            1. how much investment needed
            2. how much profit we will get
    5. Project manager (yes/no)
        - ask the resources and finance to all the team.
        - then decide that the project is worth or not.


3. Design
    - Here we do, HLD and LLD of software

    1. HLD 
        - It is the architecture of the software product to be developed
        - It is done by architect and Senior Developers

    2. LLD
        - It describes, how each and every features in the product should work.
        - It is done by Senior Developers

    - HLD - High level design / External Architecture
    - LLD - Low level design / Internal Architecture

- 3 Tier Architecture / N Tier Architecture / High Level Design
    chrome( contain api ) 
        |
        | (Request)
        | 
    Web Server (validate) -> by HTTP Protocol
        |
        | (Request)
        | 
    Application Server (contain multiple files like home, login, etc...)
        |
        | (Request)
        | 
    DataBase Server ( contain user information)
        |
        | (Response)
        | 
    Application Server (contain multiple files like home, login, etc...)
        |
        | (Response)
        | 
    Web Server (validate) -> by HTTP Protocol
        |
        | (Response)
        | 
    Client (result)

- Low Level Design
    - In detail strucutre of each and every application
    - Internal features designs

4. Coding
    - Once after design is completed, we go for coding stage.
    - It is done by Senior Developers, Junior Developers, and Freshers by looking into low level design (LLD) and requirement

    - Image - url(pasted-image.png)

========================================================================================
DL (Dev Lead) --> 1. Sr. Developer
                  (8+ years of exp)
                        |
            -------------------------------
            |       Critical Features        |
            |-------------------------------|
            |  Signup                       |
            |  Login                        |
            |  Compose                      |
            |  Inbox                        |
            |                               |
            -------------------------------

        2. Jr. Developers
        (2 to 8 years of exp)
                        |
            -------------------------------
            |        Major Features         |
            |-------------------------------|
            |  Draft                        |
            |  Trash                        |
            |  Sent                         |
            |  Spam                         |
            |  Delete                       |
            -------------------------------

        3. Freshers
                    |
            -------------------------------
            |        Minor Features         |
            |-------------------------------|
            |  Cancel                       |
            |  Help                         |
            |  Terms and Conditions         |
            |  Feedback                     |
            -------------------------------


             Software                                     Java Program

    ---------------------------------        --------------------------------------------
   |            Software             |      | public class Main {                        |
   |                                 |      |                                            |
   |   X                 Y           |      |     public static void main(String[] args) |
   | +---------+      +---------+    |      |     {                                      |
   | |  100    |      |   90    |    |      |         int X = 100;                       |
   | +---------+      +---------+    |      |         int Y = 90;                        |
   |                                 |      |                                            |
   |          +-----------+          |      |         if (X > Y) {                       |
   |          |  COMPARE  |          |      |             System.out.println(            |
   |          +-----------+          |      |                 "X is greater " + X);      |
   |                ||               |      |         }                                  |
   |                \/               |      |         else {                             |
   -----------------------------------      |             System.out.println(            |
                  |                         |                 "Y is greater " + Y);      |
                  |                         |         }                                  |
                  v                         |     }                                      |
       X is greater                         | }                                          |
       It should print value                 --------------------------------------------

    -------------------------------------------------------------------------------

    - ex:
        - chats     --> 
        - calling   -->
        - settings  -->     critical features ( By Senior Developer )
        - groups    -->
        - payment   -->

        - status    -->
        - community -->     major features  (By Junior Develper)
        - channels  -->

        - meta ai   -->
        - camera    -->     minor features  (Fresher)
        - help      -->

    - Assigned by => Developer Lead

5. Testing
    - Once the coding is completed, developers will give the software to the test engineers, where the test engineers will test the software by entering all possible inputs into software to find out defects in the software according to customer requirements is called as testing.

                                            Customer (Req) (Business Language)

    CITY BANK
    Login (10 Pages)

    +-----------------+                           2 yrs / 3 Cr                           +------------------+
    |                 | ---------------------------------------------------------------> |                  |
    |    CUSTOMER     |                                                                  |     INFOSYS      |
    |                 |             Customer will approach software company              |                  |
    +-----------------+                  for software development                        +------------------+

                 
                      1. Requirement Collection (BA)

                        BA will convert Business Language into Software Language
                                        |
                                        V
                        If any user opens browser & enters URL:
                                    www.cb.com
                                    +--------------------------------+
                                    |          Login Page            |
                                    |--------------------------------|
                                    |                                |
                                    |  UN   [______________] ---------> UN text field should
                                    |                                |  accept between 2–8
                                    |  Pwd  [______________] ---------> characters.
                                    |                                |
                                    | [ LOGIN ]   [ CANCEL ] ---------> Password should
                                    |                                |  accept minimum
                                    +--------------------------------+  6 characters and
                                                                        include at least
                                                                        1 special character.

                        2. Feasibility Study

                        3. Design (Architect)
                            a) HLD
                            b) LLD

                        4. Coding
                            (Sr. Developer, Jr. Developer,
                            Freshers)


                5. Developer will give software to T.E
                                 |
                                 |
                                 V
                             T.E (Testing)
                Open the browser & enter URL: www.cb.com
          +-----------------------------------------------+
          |                 Login Page                    |
          |-----------------------------------------------|
          |                                               |
          |  UN   [______________] ----------------------------------------------------------------------+
          |                                               |                                              |
          |  Pwd  [______________] --------------------+  |                                              |
          |                                            |  |                                              |
          | [ LOGIN ]   [ CANCEL ]                     |  |                                              |
          +--------------------------------------------+  |                                              |
                                                          |                                              |
                                                          |                                              |
                                                          V                                              |
                                                                                                         |
                        i. ABC ---------------------- Not Accepting ---------- Defect                    |
                        ii. AB12CD ------------------- Not Accepting ---------- Defect                   |
                        iii. 67890543 ----------------- Accept                                           |
                        iv. dfgh&^4%$ ---------------- Not Accepting                                     |
                        v. $#%^&* ------------------- Accept                                             |
                        vi. B ------------------------ Accepting ------------- Defect                    |
                                                                                                         |
                                                                                                         |
        vii. XYZ782T ------------------ Accepting ------------ Defect                                    |
        viii. ayush123 ----------------- Accept                          <-------------------------------+
        ix. admin@12 ----------------- Accept
        x. abc --------------------- Not Accepting


    - Assigned test by => Test Lead
    - Tester have to create a Defect Report which contain all the defects
    - Then tester give the report to developer to fix the defects
    - Then Developer provide the fixed software to the tester and tester again test the defects
    - This is known as Retesting.

    - Retesting (only on the defected part)
        - testing the defects again is known as retesting.

    - Drawback
        1. Chances are there Developers will utilize testing time.
        2. Developers will be more consume on the developing rather than testing the s/w
        3. if developer find any defect he will not try to fix defect
        4. developer will not test +ve s/w from -ve point of view
        5. developers will be over confidence

6. Installation
    - Deployment
        - By Devops (Development operation)
    
    - Deployed on Production Server
        - Where the software is deployed

7. Maintanance
    - Maintance Period
        - timeperiod given to customer by which we maintain the software for free, after that charges will be there.

    - SLA
        - Service Level Agreement

    - Changes done
        - Adding a feature
        - Removing a feature
        - Modifying a feature
        - Fixing a Bug

- Why it is waterfall model
    - here, the backtracking is not possible.
    - it means once after the fesibility study is completed requirement will be freeze so we cannot go back and change requirements

- DrawBack of waterfall model
    - Testing is the small phase which is done only after coding, if there is a defect in requirement and design, it will flow till end and leads to lot of rework because requirement and design is not tested.
    - It is not flxible model
    - It leads to lot of rework that increases the  total cost of the project.
    - Turn around time taken to deliver the product to the customer is more
    - Developer were involved in testing
    - Requirements changes are not allowed inbetween

- Advantage of waterfall model
    - It is simple to adopt
    - Initial investment is less
    - we can stable product at the end because requirements are freezed in the beginning.

- Application
    - wherever we go short term project
    - whenever we build small or simple application
    - whenever we are sure that customer is not going to change requirements. 
    
(spiral skip)


V Model (Verification & Validation)
------------------------------------

- It is the step by step procedure or a standard procedure to develop a new software, in V & V model all the stages are tested.
- In order to overcome the drawback of both (waterfall and spiral model), we go for V & V model.

    - v.excaliDraw.png

    - Verification n
        1. verifying CRS, SRS, HLD, LLD and check whether it is according to requirement or not, is called as verification
        2. it is done by both developer and test engineers
        3. it is done before the software is develop
        4. it is also known as static testing

    - Validation
        1. Testing the functionality of any application or software by executing the test cases is called as validation.
        2. It is done by only test engineers
        3. It is done after the software is developed
        4. It is also called dynamic testing

    - **Complete V model diagram** -> *VModel_diagram.png*

    - Drawback:
        1. Initial investment is high
        2. Documentation is more (in every stage we should write test plan and test case)
        3. Managing interaction between developers and test engineers will be very tough

    - Advantages:
        1. Req. changes is allowed in any stage.
        2. Testing starts in very early stage of project development i.e. at req collection stage only
        3. All the stages are tested because of this it avoids downward flow of defects, which internally reduces lot of re-work.
        4. Total cost of project will be less.
        5. The output is given simultaneously, because of this project gets completed very fast.

    - Applications:
        1. Whenever we build complex products/applications
        2. Whenever we go for long term projects
        3. Whenever customer is expecting ver high quality product within short time of span we go for v model


Prototype Model
---------------
- Definition
    - Prototype model is a dummy model prepared by the web designers/ developers/ content developers wherein they convert text formate to image format by using tools like adobe photoshop, paint, Picasa or web HTML/

- Advantages
    1. Improved communication b/w customer and company.
    2. Initially itself customer will get to know what is the outcome.
    3. Initially itself developers will get to know what exactly they have to develop.
    4. customer can request for changes initially itself.

- Drawback
    1. there is an investment needed just to build prototype
    2. Actually development of the application starts very late because they are busy in designing and developing prototype.

- Application
    1. whenever customer is new to the business
    2. whenever customer is not are of full req
    3. when developers are new to domain
----------------
## What is software testing
- Defination
    1. The process of identifying the defects in the software is called as software testing
    2. Verifying the functionality of the software against req specification is called as software testing


- What is manual testing ?
    - Testing the software/Application repeatedly or again and again manually in order to find defects in the software according to the customer requirement is called as 'manual testing'.

- Advantages of manual testing ?
    - Manual testing is easy to learn, and beginners can start testing without deep technical knowledge.
    - It is suitable for small projects because it does not require any tools or special setup.
    - It is helpful for exploratory testing, where test engineers explore the application and test the sw
    - It gives a real user experience because the TE interacts with the application like a normal user .
    - It is very effective for UI testing since test engineer can easily check colors, alignment, and overall user interface .
    - Here test engineer can interacts with the application like a end user would.
    - Quality is good.

- Disadvantages of manual testing ?
    - Manual testing is time-consuming
    - Manual testing is monotonous & tedious job
    - There will be no consistency in testing
    - Resource utilization is more
    - Manual testing becomes difficult and slow when the project has a large number of test cases.
    - It is difficult to maintain manual test cases for long-term projects.

- What is automation testing ?
    - TE will write the code/script/pgm by using Tools like Selenium/QTP/Appium and run the programme against the application/software, where in pgm/Tool will automatically test the application and give the result as 'Pass' or 'Fail' this is called Automation testing.       
            OR
    - Automation testing is a testing method where we use tools or scripts to test the application automatically instead of testing it manually.

- Advantages of automation testing
    - It improves accuracy
    - It saves time by running repeated tests automatically.
    - Automation makes the testing process more reliable and consistent.
    - Automation reduces the workload of testers
    - Automation helps in testing large applications quickly and efficiently.
    - Automated tests can be reused for different versions of the application.


    * http://7.Name some Automation tools

    WEB AUTOMATION TOOLS <<
    Selenium WebDriver
    Cypress
    Playwright
    QTP/UFT
    TestCafe

    COMPUTER AUTOMATION TOOLS <<
    Winium
    SILK FUNCTONAL TEST
    RATIONAL FUNCTONAL TEST
    OATS(ORACLE APPLICATION TEST SUITE)
    TEST COMPLETE
    CANNOO

    MOBILE AUTOMATION TOOLS
    APPIUM
    SELENDROID
    MONKEY TALK
    ROBOTIUM
    Calabash
    Perfecto Mobile

- Difference between manual \& automation testing?
    - Manual Testing :
        - testing done manually by test engineer 1
        - Basic testing knowledge is require
        - time taken is more effort required is more 5
        - No script maintenance needed / need to maintain test cases 4
        - No pgm knowledge require 3
        - Cheaper for short-term 2 


Automation Testing :
Testing is done with the help of tools
Advance testing knowledge is require
time taken is less also reduces efforts
Need to maintain the test scripts 
basic Pgm knowledge is require  
Expensive for initial stage ( tools )  

Aug 18 - 5:37 pm
**PRINCIPLES OF SOFTWARE TESTING**

1.Testing shows the presence of defects, not their absence
Testing can find bugs, but it cannot prove that the software has zero bugs.

2.Exhaustive testing is impossible
We cannot test everything. So, we test important and high-risk areas first.

3.Early testing saves time and cost
Start testing early in the SDLC to catch defects when they are cheap to fix.

4.Defects cluster together
Most defects are usually found in a few modules or features.

5.Pesticide paradox
If we run the same tests again and again, they stop finding new bugs.
So we must update and improve test cases.

6.Testing is context dependent
Testing approach changes based on product type (banking app vs. game vs. website)

7.Absence of errors fallacy
Even if the software has no bugs, it is useless if it does NOT meet customer requirements.

-----------------
# Software testing
----------------
    - the process of identifing defects in the software is called as software testing.
    - verifying the functionality of an software or application against customer requirement specification is called as software testing.

- Why we do software testing
    1. Every software is developed to support the business, if there are any defects in the software it affects the business. So, before we use any software for the business it must be tested and all the problems must be solved and then should be given to customer.
    2. To improve the quality of the product.
    3. To check whether the product is working according to customer requirement

- Types of Software Testing
    - White box testing 
        - also known as open box testing / unit testing / transparent box testing
        - Testing each and every line of code is called as white box testing.
        - It is done by developers
        - Since, the code is visible it is also called as open box testing.
        - The smallest unit of s/w is one line of code, since developers are testing each and every line so it is called as unit testing.

    - Gray box testing (Not to mention) -> not practice in industries

    - Black box testing
        - also known as close box testing / behavioural testing / functional testing
        - Verifying the functionality of a s/w againt customer req. specification is called as black box testing.
        - It is done by test engineers
        - Since the code is not visible to the test engineer, it is called as close box testing.


- Why test engineer should not be involved in fixing defects?
    - Chances are there test engineer fixing one defect might introduce n number of defects.
    - Time taken to fix one defect will be more as compare to developers.
    - Chances are there if test engineer spend time in fixing one defect, he will not get the time to test remaining features and he will also not get the time to catch remaining bugs.
    
* Interview Question
    1. What is the difference b/w white box testing and black box testing?
        - White box testing
            1. Developers will do WBT
            2. Code is Visible
            3. A person should have programming knowledge to do WBT.
            4. A person should have knowledge on design.
            5. Here we test the logic of the code.
            6. It is done before s/w is developed.
            7. Here, developer will pass the input to code and check output according to requirement.

        - Black box testing
            1. TE will do BBT
            2. Code is not visible
            3. Programming knowledge is not required for manual BBT
            4. Knowledge on design is not required 
            5. Here we test the functionality of s/w
            6. It is done after s/w is developed
            7. Here TE will pass the input to s/w and check output according to requirement

## Black Box Testing
- Definition
    - Verifying the functionality of a s/w againt customer req. specification is called as black box testing. 
    - It is done by test engineers.
    - Since the code is not visible to the test engineer, it is called as close box testing.

    - Types of BBT
        1. Functionality Testing
        2. Integration Testing
        3. System Testing
        4. Acceptance Testing
        5. Smoke Testing
        6. Regression Testing
        7. Performance Testing
        8. Adhoc Testing
        9. Compatibility Testing
        10. Exploratory Testing
        11. Globlization Testing
        12. Usability Testing

    1. Functionality Testing
        (500 senarios and 100 test case)

        - Testing each and every *component* *thoroughly* against the requirement specification is called as functionality testing.

            *fig 7*

        - Note:
            - *Components*
                - link, testfield, text area, drop down, radio buttons, icons, etc.

                - icon components examples
                    hamburger icon
                    kebab icon
                    elipces
            - *Throughly*
                - means by entering all possible inputs/values/cases (positive or negative).

        - Types
            1. Positive Testing
            2. Negative Testing

        - Testing Scenarios
            Component Name |                    Scenario                    | Scenario Type | Scenario_Id
            Mobile No.     | To verify that + mobile no text field + should |      +ve      | MN_001
            (text field)   | accept only valid 10 digit mobile number       |               | 
            ...            | To verify that mobile no text field should not |      -ve      | MN_002
            ...            | accept alphabets                               |               |  
            ...            | ...                                            |               |  
            ...            | ...                                            |               |  



    req. 
        - min 3
        - max 20 characters 
        - letters and numbers only

        1. To verify that username text field should accept min 3 characters.
        2. To verify that username text field should accept max 20 characters
        3. To verify that username text field should accept letters
        4. To verify that username text field should accept numbers
        5. To verify that username text field should accept letters and numbers
        6. To verify that username text field should give "The username namefield is required"

        7. To verify that username text field should not accept less than 3 characters
        8. To verify that username text field should not accept more than 20 characters
        9. To verify that username text field should not accept symbols
        10. To verify that username text field should not accept letters with symbols
        11. To verify that username text field should not accepts numbers with symbols
        12. To verify that username text field should not accepts numbers, letters and symbols
        13. To verify that username text field should not accepts blank spaces at starting
        14. To verify that username text field should not accepts blank space at the end
        15. To verify that username text field should not accepts blank space in between
        16. To verify that username text field should not accepts not be blank

        17. To verify that username text field should turn blue when active state

        18. To verify that username text field should turn green when username is correct
        19. To verify that username text field should give "username is available" as message

        20. To verify that username text field should turn red when username is incorrect
        21. To verify that username text field should give "username is not available" as message

        22. To verify that username text field should be mandatory
        23. To verify that username text field should be red when blank



