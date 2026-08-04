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


    - CRS ->  
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
    - once requirement collection will fdone, then we can go to the feasibility study
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



    






