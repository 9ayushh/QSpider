SQL 
    - Structural Query Language
    - to communicate with the database

Database
    - container used to store the data in a systematic and organised way

Data
    raw fact that describe the attribute or entity
        - entity object (table_name)
        - attribute-property (col_name)
        - rawfact-info. (information)

DBMS
    - Database Management System
    - query language used to communicate dbms with flat files
    - 

RBMS
    - rational databse management system
    - used to format the data in tabular form

CRUD operation
    - Create / Insert
    - Read / Retrive / Fetch
    - Update
    - Delete / Drop

Relational data
    - data is always stored in the form of tables

table
    - combination of rows and columns

cell
    - intersection of rows and columns/ smallest unit of table

EF Codd's Rules
    1. Only one value can be stored in a single cell
    2. If we want to add same value simultaneously in two table than we must establish a realtionship b/w those two tables by key attributes
    3. RDBMS used to store the data in tabular form including meta data(data about data)
    4. The data entered into a table can be validated into two steps by assigning datatype and contraints

Day 2...
DataTypes 
    - 
    1. Char
        - used to stored the character data
        - col_name char(size);
        - 2000 characters8s
    2. Varchar
        - include numbers/digits
        - col_name varchar(size);
        - 2000 characters
    3. Varchar2
        - varchar is internally consider as varchar2
        - updated version of varchar
        - col_name varchar2(size);
        - 4000 characters
    4. Number 
        - numeric data
        - col_name number(precision[scale])
        - Precision[Scale]
            - Precision - 0 to 38
            - Scale - -84 to 127
    5. Large Object
        - to store large object data
        - Clob - Character large object
            - to store large no. of character
            - col_name clob
        - Blob - Binary large object
            - binary values of multimedia
            - col_name blob

    Extras 
        - Date
            - DD/MON/YYYY
            - DD/MON/YY

---------------------------------------
Day 3...
Constraints
    1. Unique
    2. Not Null
    3. Check 
        - col_name datatype check (condition)
        example
            phone_no -> Number(10) check(phone_no > 0) check(length(phone_no) = 10)

    4. Primary Key - 
        - used to identify the records uniquely in the table
        - to set the realtion btw two or more tables
            - Characteristics
                - avoid the repeation values
                - should be unique
                - should not be null
                - follows not null constriants
                - only one primary key is created in a table
                - for easily identify , we use the unique identity column for primary key
        - Syntax:
            col datatype primary key
        
    5. Froeign Key
        - used to establish a relation between tables
        - primary key of another table is known as the foreign key of this table
            - Characteristics
                - contain duplicate values/ accepts duplicate values
                - does not follows the unique
                - null values are allowed/ not follows the not null
                - multiple foreign keys can be created in the table
                - To became a foreign key in a table, it must be a primary key in its own table
                - Foreign key is also known as referencial integrity constraints.

    Note: We use key attribute to define the realtion between two or more tables

--------------------------------------------------------------------------------------------
Day 4...

imp databases
    - Sys 
    - System 
        - management for whole sql 
        - ex - password changes/ or login
    - Scott
    - HR

    - check the account 
        - show user

    - to change to the system account 
        - conn system

    - to change the password in system account
        - alter user username account unlock identified by password;

---------------------------------------------------------------------------------------------
Day 5...
Introduction to the Software
    1. show user -> display the current user
    2. select * from tab; -> display all tables
    3. desc table_name; -> display table datatype
    4. select * from table_name; -> display table data
    5. set pages 200 lines 200; -> increase the size of the pages and content
    6. spool "C:\Users\vivek\OneDrive\Desktop\Ayush\QSpider\SQL\SQLA16\fileName"; -> used to start the saving file
    7. spool off; -> end the saving and display the content in the file
    8. cl scr; -> clear screen

----- Topic start -----
Statements
    - DQL (Data Query Language)
    - DDL (Data Definition Language)
    - DML (Data Manipulation Language)
    - TCL (Transaction Control Language)
    - DCL (Data Control Language)

    1. Data Query Language (DQL)
        - it is mainly used to fetch/retrive the data from the database 

        - SELECT
            - mainly used to fetch the data from the databases and display it over the output console.

        - PROJECTION
            - mainly used to retrive the data by selecting only the columns
            - Syntax:
                SELECT * / [distinct] COLNAME / EXPRESSION [alias]
                FROM TABLE_NAME;

            - There are predefine words in SQL... some are SELECT, FROM, WHERE, etc...
            - Way of writing  --->  top to bottom
            - Way of execution  --->  bottom to top

        - SELECTION
            - mainly used to retrive the data by selecting rows and columns

        - JOINS
            - mainly used to fetch the data from multiple table simultaneously

    2. Data Definition Language (DDL)
        - used to deals with the table structure in the database

        - CREATE
        - RENAME
        - ALTER
        - TRUNCATE
        - DROP

    3. Data Manipulation Language (DML)
        - it deals with the data of a table.

        - INSERT
        - UPDATE
        - DELETE

    4. Transaction Control Language (TCL)
        - COMMIT
            - to save the transaction parmanently
        - SAVEPOINT
            - to save the transaction temporary
        - ROLLBACK
            - to delete the savepoints/ to fall back to the previous savepoint

    5. Data Control Language (DCL)
        - to give access to the data

        - GRANT
            - give the access of data to other users
        - REVOKE
            - to take back the access of the data from other users

    * Imp - What is the difference between TRUNCATE, DROP and DELETE *
        - TRUNCATE -> when we want to delete the data but not the structure
            - mainly used to delete all the data from a table without affecting table structure
            - Cannot be recycle/restored
            - DDL Statement
            - Syntax: TRUNCATE TABLE TABLE_NAME;

        - DROP -> when we want to delete the data as well as structure
            - mainly used to delete all the data as well as table structure
            - DROP
                |__ Recycle Bin    
                    |__ PURGE TABLE TABLE_NAME; -> To permanently delete the table
                                        \_ TABLE_NAME -> should be the bin address in "__"
                    |__ FLASHBACK TABLE TABLE_NAME TO BEFORE DROP; -> To restore the table
                                        \_ TABLE_NAME -> should be the bin address in "__"
            - DDL Statement
            - Syntax: DROP TABLE TABLE_NAME;
            - Syntax: DROP TABLE TABLE_NAME PURGE; -> To permanently delete

        - DELETE -> when we want to delete rows 
            - mainly used to delete a specific row or particular row
            - Cannot be recycle/restored
            - DML Statement
            - Syntax: DELETE FROM TABLE_NAME WHERE <FILTER CONDITION>;



# TASK  
    - Write the table   
    1. DEPT
        DEPTNO |  DNAME          |  LOC

        10     |  ACCOUNTING     |  NEW YORK
        20     |  RESEARCH       |  DALLAS
        30     |  SALES          |  CHICAGO
        40     |  OPERATIONS     |  BOSTON

    2. EMP
        EMPNO |  ENAME   |   JOB         |   MGR   |  HIREDATE    |   SAL    |  COMM    |  DEPTNO

        7369  |  SMITH   |   CLERK       |   7902  |  17-DEC-80   |    800   |          |  20     |  
        7499  |  ALLEN   |   SALESMAN    |   7698  |  20-FEB-81   |   1600   |    300   |  30     |  
        7521  |  WARD    |   SALESMAN    |   7698  |  22-FEB-81   |   1250   |    500   |  30     |  
        7566  |  JONES   |   MANAGER     |   7839  |  02-APR-81   |   2975   |          |  20     |  
        7654  |  MARTIN  |   SALESMAN    |   7698  |  28-SEP-81   |   1250   |   1400   |  30     |  
        7698  |  BLAKE   |   MANAGER     |   7839  |  01-MAY-81   |   2850   |          |  30     |  
        7782  |  CLARK   |   MANAGER     |   7839  |  09-JUN-81   |   2450   |          |  10     |  
        7788  |  SCOTT   |   ANALYST     |   7566  |  19-APR-87   |   3000   |          |  20     |  
        7839  |  KING    |   PRESIDENT   |         |  17-NOV-81   |   5000   |          |  10     |  
        7844  |  TURNER  |   SALESMAN    |   7698  |  08-SEP-81   |   1500   |      0   |  30     |  
        7876  |  ADAMS   |   CLERK       |   7788  |  23-MAY-87   |   1100   |          |  20     |  
        7900  |  JAMES   |   CLERK       |   7698  |  03-DEC-81   |    950   |          |  30     | 
        7902  |  FORD    |   ANALYST     |   7566  |  03-DEC-81   |   3000   |          |  20     |  
        7934  |  MILLER  |   CLERK       |   7782  |  23-JAN-82   |   1300   |          |  10     |  

-------------------------------------
Day 6...

Activity

Projection:
    - Write a query to display (WAQTD) name of all the employees
        SELECT ENAME FROM EMP;
    - Write a query to display (WAQTD) department name of all the employees
        SELECT DNAME FROM DEPT;
    - Write a query to display (WAQTD) name, job and salary of all the employees
        SELECT ENAME, JOB, SAL FROM EMP;
    - Write a query to display name and commission given to all the employees
        SELECT ENAME, COMM FROM EMP;
    - Write a query to display employee id and department number of all the employees in emp table
        SELECT EMPNO, DEPTNO FROM EMP;
    - Write a query to display ename and hiredate of all the employees
        SELECT ENAME, HIREDATE FROM EMP;
    - Write a query to display name and designation of all the employees
        SELECT ENAME, JOB FROM EMP;
    - Write a query to display name, job and salary given to all the employees
        SELECT ENAME, JOB, SAL FROM EMP;
    - Write a query to display dname present in department table
        SELECT DNAME FROM DEPT;
    - Write a query to display dname and location present in dept table
        SELECT ENAME, LOC FROM DEPT;

------------------------------------------------------------------------------------
Projection
----------
    - select * / [distinct] colName / exp [alias]

    - distinct
        - mainly used to avoid duplicate values into a particular column.
        - Syntax : SELECT DISTINCT COL_NAME FROM TABLE_NAME;

        - Q1 - WAQTD... Write a query to display unique job of all the employees
        - Q2 - Write a query to display unique department of emp
        - Q3 - Write a query to display unique salary of emp
        - Q4 - Write a query to display unique job as well as unique salary of emp

        - Characterstics of distinct clause
            1. distinct should be pass as a first argument inside select clause
            2. if we are passing two columns in distinct clause it will check combination of values, if combination is matching it will consider as duplicate records but combination is not matching means it consider as unique record.

    - Expression [alias]
        - Any mathematical operation which gives us a result is known as expression
        - ex: SAL( + EPX)

        - Null Value function
            - any expression done on null value then it will give the null as an output
            - NVL function 
                - NVL (COL_NAME, VALUE)
        
        - To display the all data with extra columns
            - we use (.)
            - ex: SELECT TABLE_NAME. *, COL_NAME/EXPRESSION
                  FROM TABLE_NAME;

        - Alias
            - Alias is an alternative name given to a column or a expression
            - Alias is temporary in nature
            - We can provide alias with or without using AS keyword
            - ex: 
                1. with AS and with " "
                    SELECT EXPRESSION AS "ALIAS" FROM TABLE_NAME;
                        - whatever passed inside the "" will consider as a single string
                2. with AS and without " "
                    SELECT EXPRESSION AS ALIAS FROM TABLE_NAME;
                        - whatever the alias is it should be a single word or seprated by _
                3. without AS and with " "
                    SELECT EXPRESSION "ALIAS" FROM TABLE_NAME;
                        - whatever passed inside the "" will consider as a single string
                4. without AS and without " "
                    SELECT EXPRESSION ALIAS FROM TABLE_NAME;
                        - whatever the alias is it should be a single word or seprated by _

    - Q1 Write a query to display annual salary of all employees
    - Q2 Write a query to display increment of rs 300 in a salary of all employees
    - Q3 Write a query to display decrement of 20% of salary in an annual sal of all employees
    - Q4 Write a query to display total salay of all employees
    - Q4 Write a query to display details of all the employees along with that display annual salary of all employees

    ---------------------------------------------------------------------------------------------------------------------
    ASSIGNMENT
        1. Write a query to display name of the employee along with their annual salary
        2. Write a query to display ENAME and JOB from all the employee with their half term salary
        3. Write a query to display all the details of the employee along with an annual salary bonus of 2000
        4. Write a query to display NAME, SALARY and SALARY wit hike of (any value)
        5. Write a query to display total salary given to each employee (sal + comm)
        6. Write a query to display name and salary with the deduction of 25%
        7. Write a query to display name and salary with the monthly hike of 50
        8. Write a query to display name and annual salary with the deduction of 10%
        9. Write a query to display details of all the employees along with annual salary
        10. Write a query to display name and designation along with 100 penality in salary
    --------------------------------------------------------------------------------------------------------------------------

    Execution Process (of Projection)
        - Always FROM clause will execute first
        - FROM clause will go to the database and search for the table name
        - If we found the table, it will be put under execution
        - After FROM clause SELECT clause will execute
        - The job of SELECT clause is to display data on the output screen
        - We can pass three argument in SELECT clause 
            1. * -> astricks - to display all the data
            2. [distinct] col_name -> to display a particular column
            3. expression [alias] -> to display the column with an expression / perform arthimetic operation
        - Semicolon(;) -> it is used to execute a query

Selection
---------
    - mainly used to retrive the row and column
    - Syntax
        SELECT COL_NAME/EXPRESSION
        FROM TABLE_NAME
        WHERE <FILTER CONDITON>;
    - Order of Execution
        1. FROM clause
        2. WHERE -> [execute row by row]
        3. SELECT -> [row by row]

    - Questions
        1. Write a query to display details of an employee if employee is working in department 20
        2. Write a query to display details of an employee if employee is working as a manager (record is in character, so it will inside '')
        3. Write a query to display name, job, sal of employee if employee is earning more than 2000
        4. Write a query to display details of employee if employee is hired after 80
    
    ASSIGNMENT
    1. WAQTD THE ANNUAL SALARY OF THE EMPLOYEE WHOSE NAME IS SMITH.
    2. WAQTD NAME OF THE EMPLOYEES WORKING AS CLERK.
    3. WAQTD SALARY OF THE EMPLOYEE WHO ARE WORKING AS SALESMAN.
    4. WAQTD DETAILS OF ALL THE EMP WHO EARNS MORE THAN 2000.
    5. WQATD DETAILS OF THE EMP WHOSE NAME IS JONES.
    6. WAQTD DETAILS OF THE EMP WHO HIRED AFTER 01-JAN-81.
    7. WAQTD NAME AND SAL ALONG WITH HIS ANNUAL SALARY IF THE ANNUAL SALARY IS MORE THAN 12000.
    8. WAQTD EMPNO OF THE EMPLOYEES WHO ARE WORKING IN DEPT 30.
    9. WAQTD ENAME AND HIREDATE IF THEY ARE HIRED BEFORE 1981.
    10. WAQTD DETAILS OF THE EMPWORKING AS MANAGER.
    11. WAQTD NAME AND SALARY GIVEN TO AN EMPLOYEE IF EMPLOYEE EARNS COMMISSION OF RS.1400.
    12. WAQTD DETAILS OF THE EMP HAVING COMMISSION MORE THE SALARY.
    13. WAQTD EMPNO OF EMPLOYEES HIRED BEFORE THE YEAR 87.
    14. WAQTD DETAILS OF THE EMP WORKING AS AN ANALYST.
    15. WAQTD DETAILS OF THE EMP EARNING MORE THAN 2000 RUPEES PER MONTH.

Operators
---------
    - Arithematic Operators (+, -, *, /)
    - Concatination Operators (|| -> Pipeline operator)
    - Comparision Operators (=, != or <>)
    - Relational Operators (<, >, <=, =>)
    - Logical Operators (and, or, not)
    - Special Operators
        1. IN
        2. NOT IN
        3. IS
        4. IS NOT
        5. BETWEEN
        6. NOT BETWEEN
        7. LIKE
        8. NOT LIKE
    - Subquery
        - ALL
        - ANY
    
1. Arithematic Operator
    - +, -, *, /

2. Concatination Operators
    - 'str' || 'str'
    - WAQTD a string Mr Smith for all the employees
    - WAQTD a string hi i am smith.

*EDIT OR ED -> ENTER (change as you like -> save the file) -> USE / THEN ENTER*
    
3. Comparision Operators
4. Relational Operaotrs
5. Logical Operators
    - and, or, not

    - WAQTD details of an emp if emp is working as a manager in dept 20
    - WAQTD details of an emp, if emp is working as a salesman but earning less than 4000
    - WAQTD name, job and sal of emp if emp is earning more than 2000 but less than 3000
    - WAQTD hired date of emp if emp is hired in 81 
    - WAQTD details of an emp if emp is either working as a manager or a salesman
    - WAQTD details of an emp if emp is either working in dept 20 or 30

    - WAQTD details of an emp if emp is earning more than 1000 but working in dept 30
    - WAQTD details of an emp if emp is earning more than 1000 but less than 4000
    - WAQTD hiredate of emp if emp is hired in 87
    - WAQTD details of an emp if emp is either working in dept 10 or 20

6. Special Operator
    - if we have multiple values and used to pass multiple condition, so instead of writing again and again, we have Special Operator.
    - Syntax
        COL_NAME IN(VAL1, VAL2, VAL3...VALn)
    - IN
        - used to replace = and OR
        - mainly used to handle multiple values on the right hand side. 
        - If any one value is satisfying the condition, it returns true.

        -  WAQTD details of an emp who are working as a manager or salesman.
    
    - NOT IN
        - working as !=.
        - It works similiar like In operator.
        - If any value is not satisfying the condition then it returns true

        - WAQTD details of an emp who are not working as a manager or salesman

    - IS    
        - mainly used to compare the Null values
        - Syntax
            COL_NAME IS NULL

        - WAQTD details of an emp if emp is not earning any comm.

    - IS NOT
        - mainly used to compare not NULL values

        - WAQTD details of an emp if emp is earning some comm.

    - BETWEEN
        - mainly used to obtain a value between a given range 
        - It includes ranges as well.
        - Syntax
            COL_NAME BETWEEN LOWER_RANGE AND HIGHER RANGE

        - WAQTD details of emp if emp is earning in the range of 2000 and 3000

    - NOT BETWEEN
        - mainly used to accept the values which are out of a given range
        - it exclude the range as well.

        - WAQTD hiredate of emp if emp is hired in 81.

    - LIKE
        - mainly used to match the patterns
        - Syntax
            COL_NAME LIKE 'PATTERN'

        - operator
            % -> three function
                - used to accept multiple characters
                - it will accept a character multiple times
                - it will accepts no character as well

            _ -> 
                - it will accept only a single character

        - WAQTD name of emp which is Starting with S
            - SELECT ENAME FROM EMP WHERE ENAME LIKE 'S%';
        - WAQTD ENAME which ends with A
        - WAQTD ENAME which consist of a letter A.
        - WAQTD ENAME which consist of  two letter A.
        - WAQTD ENAME whose second char is M.
            SELECT * FROM EMP WHERE ENAME LIKE '_M%';
        - WAQTD HIREDATE if emp is hired in 81.
        - WAQTD HIREDATE if emp is hired in FEB.
        - WAQTD name of emp which consist of %
            // use of escape character - ESCAPE 'anyCharacter'
            SELECT ENAME FROM EMP WHERE ENAME LIKE '%@%%' ESCAPE '@';

            - Insert Syntax
                INSERT INTO TABLE_NAME(COL_NAMES) VALUE(1001, 'NIBDA%_')

    - NOT LIKE
        - mainly used to exclude the pattern

-------------------------------------------------------------------------
ASS 2 // skiped questions
    9. OUT OF SYLLABUS
    11.
    12.
    18.
    21. HOW CAN WE EXACTLY USED
    47.
    56.
    60.
    65.
    90.
    97.
    127. STUDENT TABLE
    211.
    215.
    227.
    257.
-------------------------------------------------------------------------

Functions
---------
    - it is a block of code or a set of instruction used to perform a specific task
    - functions are of two types
        1. pre-defined function
        2. user-defined functions

    1. pre-defined function
        - Single row function
            - which accepts multiple input and gives multiple respective output.
            - ex:
                - length('harshal') // 7
                - length('rule') // 4
        - Multi row function / aggregrate function / group function
            - which accepts multiple input in a single shot and gives a single output
            - types
                - MAX()
                - MIN()
                - AVG()
                - SUM()
                - COUNT() // it returns total no. of rows/values present in a column
            - Chacterstics
                - We can only pass single argument inside a multi row function.
                - Multi row functions ignores all NULL values 
                - We are not suppose to pass any col_name along with multi row function inside SELECT clause
                - We cannot pass the multi row function inside the WHERE clause
                - Count is the only function which accepts * as an argument to count the rows (always use * with count, by default)

            - WAQTD max sal of emp;
            - WAQTD min sal earned by a manager
            - WAQTD avg sal earned by emp who are working as a salesman but earning more than 1000
            - WAQTD total sal earned by emp who are not earning any comm
            - WAQTD total no. of emp who are earning some comm
            - WAQTD max sal of emp along with that display the name of emp who is earning max sal
        
        - Group by
            - mainly used to group similar kind of records
            - Syntax:
                SELECT GROUP_FUNCTION / MULTI_ROW_FUNCTION / GROUP_BY_EXPRESSION
                FROM TABLE_NAME
                [WHERE <FILTER CONDITION>]   --> filter condition - COL_NAME OPERATOR VALUE
                GROUP BY COL_NAME/EXPRESSION ;
            - order of execution
                1. FROM clause
                2. WHERE (row by row)
                3. GROUP BY (row by row)
                4. SELECT
            - Characterstics
                - We can pass an expression/col_name with the group function 
                - The col_name which is passed in GROUP BY function is known as the Group by expression when passed with group function
                - The grouping is done by the combination of all the columns

            - WAQTD total number of emp working in each dept
                SELECT COUNT(*), DEPTNO FROM EMP GROUP BY DEPTNO;
            - WAQTD total no. of emp in each job along with that display the name
                SELECT COUNT(*), ENAME FROM EMP GROUP BY JOB, ENAME;
                - Group by will group by the combination
            - WAQTD total no. of emp present in each job if emp is earning more than 2000 but hired in 81
            - WAQTD max sal earned by emp in each dept if emp is not earning any comm
            
        - Having
            - Syntax:
                SELECT GROUP FUNCTION / GROUP BY EXPRESSION
                FROM TABLE_NAME
                [WHERE <FILTER CONDITION>]
                GROUP BY COL_NAME / EXPRESSION
                HAVING <GROUP FILTER CONDITION>

                // Group filter condition is nothing but condition on multi row function

            - execution flow
                1. FROM ...
                2. WHERE (row by row)
                3. GROUP BY (row by row)
                4. HAVING (group by group)
                5. SELECT (group by group)

            - WAQTD total no. of emp working in each dept if each dept consist of more than 1 emp
            - WAQTD max sal, min sal earned by emp in each job if total sal in each job must be greater than 3000

        - Order by
            - mainly used to arrange the data either in acending or decending order
            - Syntax:
                SELECT COL_NAME/EXPRESSION
                FROM TABLE_NAME
                [WHERE <FILTER CONDITION>]
                [GROUP BY COL_NAME/EXP]
                [HAVING <GFC>]
                ORDER BY COL_NAME/EXPRESSION [ASC]/DESC
            
            - order of execution
                1. FROM
                2. WHERE
                3. GROUP BY
                4. HAVING
                5. SELECT
                6. ORDER BY
            
            - WAQTD details of an emp arrange the data in ascending order according to the sal
            - WAQTD details of an emp arrange the data in desc according to the sal
    
Sub Query
---------
    - A query written inside an another query is known as subquery.
    __________________
    |    Outer Query  |
    |                 |
    |  ____Output___  |
    |  |           |  |  ---------> Result
    |  |   Inner   |  |
    |  |   Query   |  |
    |  |___________|  |
    |_________________|

    result <--- Outer Query <--- Inner query

    CASE 1
        - Whenever an unknown is present in a question, to find out this unknown we use subquery CASE 1 concept
        - Order of execution
            1. (FROM -> Subquery
            2. WHERE -> subquery
            3. SELECT -> subquery)
            4. FROM -> outerquery
            5. WHERE -> outerquery
            6. SELECT -> outerquery

        - WAQTD name of emp who are earning more than 2000 // general question
        - WAQTD name of emp who are earning more than Scott.
            SELECT ENAME
            FROM EMP
            WHERE (SAL > (SELECT SAL FROM EMP WHERE ENAME='SCOTT'));
        - WAQTD name of emp who are working in a same job as Allen
        - WAQTD details of an emp who are working in a same dept as smith
        - WAQTD details of an emp if emp is hire before blake

    CASE 2
        - Whenever data to be displayed it's present in one table and condition to be applied is present in another table, then we use subquery CASE 2 concept
        - order of execution
            - same as case 1

        - WAQTD name of emp if emp is working in sales dept
        - WAQTD department name and location of Johns ...
        - WAQTD name of emp if emp is working in new york

Types of Sub Query
------------------
    1. Single Row SubQuery
        - Whenever a subquery is returning a single output or value then that subquery is known as single row subquery.
        - SRS can be handled by normal operator as well as special operator.

    2. Multi Row SubQuery
        - A Subquery which returns more than one output or value then that subquery is known as multirow subquery.
        - MRS can only be handled by special operator e.g. IN

SubQuery Operators
------------------
    1. All:
        - All operator return true if all the values present on right hand side satisfies the condition.
        - Use of ALL 
            >ALL (OR)       >=ALL (AND)
            <ALL (AND)        <=ALL (OR)
        - Always used along with relational operators.
    
    2. ANY:
        - All operator return true if any one value present on right hand side satisfies the condition.
        - use of ANY
            >ANY (AND)        >=ANY (OR)
            <ANY (OR)        <=ANY (AND)
        - Always used along with relataional operator.

Nested SubQuery
---------------

Employee Manger RealtionShip
----------------------------
    - Manager 
        MGR = EMPNO -> like find employee having mgr
    
    - Employee
        EMPNO = MGR -> like find employees reporting to mgr

    - WAQTD details of an emp if an emp is earning more than scott's manager and earning less than blake's manager

Pseudo Columns
--------------
    - Pseudo columns are the false columns which are present in the backend of a table but not visible to you.
    - There are two types of pseudo coloums which are present in sql
        1. ROWID
        2. ROWNUM

    1. ROWID
        - ROWID is 18 char unique id generated for each record which is present in a table.
        - Characterstics of ROWID
            - unique in nature
            - it is of 18 characters
            - it is generated while inserting a record into a table
            - it is static in nature
        - Accessing
            SELECT ROWID
            FROM EMP;
        
    2. ROWNUM
        - ROWNUM is a serial number provided to each record while fetching the data from a table.
        - Characterstics of ROWNUM
            - it always starts with 1.
            - it is dynamic in nature

        - Accessing
            SELECT ROWNUM
            FROM EMP;

        - WAQTD serial no. for emp data if emp are hired in 81
        - WAQTD details of first 5 emp record 
        - WAQTD details of the 5th emp record
            SELECT *
            FROM (SELECT EMP.*, ROWNUM AS SNO FROM EMP)
            WHERE SNO = 5
        - WAQTD details of last 5 emp records
        - WAQTD nth max sal of emp
            SELECT *
            FROM (SELECT ENAME, SAL, ROWNUM AS SNO 
                  FROM (SELECT SAL,ENAME 
                        FROM EMP ORDER BY SAL DESC))
            WHERE SNO = &N

            - & -> used to give dynamic value
        - (LIMIT & OFFSET) --> used in MySQL not in oracle 
            SELECT SAL
            FROM EMP
            ORDER BY SAL DESC
            LIMIT 1 -> show 1 record
            OFFSET 4 -> skip 4 records
            -> means shows 5th record

-----------------------------------------------------------------


STATEMENTS
----------

1. DDL 
    - CREATE
        - mainly used to create a table
        - Syntax:
            CREATE TABLE TRAINER
            (
            TID NUMBER(4) CHECK(TID > 0) CHECK(LENGTH(TID) = 4) PRIMARY KEY, // IN MYSQL -> INSTEAD OF NUMBER() => INT
            TNAME VARCHAR(30) NOT NULL,
            COURSE VARCHAR(40)
            )

    - RENAME
        - mainly used to change the name of a table structure
        - Syntax:
            RENAME OLD_TABLE_NAME TO NEW_TABLE_NAME;
            // IN MYSQL -> RENAME TABLE OLD_TABLE_NAME TO NEW_TABLE_NAME;
        - DESC TABLE_NAME -> Give the description of table 
    
    - ALTER
        - used to modify the stucture of a table

        1. Add a new column
        - Syntax:
            ALTER TABLE TABLE_NAME
            ADD COL_NAME DT CONSTRAINTS;
        
        2. Change the name of a particular column
        - Syntax:
            ALTER TABLE TABLE_NAME
            RENAME COLUMN OLD_NAME TO NEW_NAME
        
        3. Delete the column
        - Syntax:
            ALTER TABLE TABLE_NAME
            DROP COLUMN COL_NAME;
        
        4. Modify datatype
        - Syntax:
            ALTER TABLE TABLE_NAME
            MODIFY COL_NAME NEW_DATATYPE;

        5. Modify constraints (here we can only convert not null to null or vice versa)
        - Syntax:
            ALTER TABLE TABLE_NAME
            MODIFY COL_NAME EXISTING_DATATYPE NEW_CONSTRAINTS;

        6. To add a constraint separately in an existing columns
        - Syntax:
            ALTER TABLE TABLE_NAME
            ADD CONSTRAINT CONTRAINT_REFERENCE_NAME CONSTRAINT_NAME(COL_NAME);

            - CONTRAINT_REFERENCE_NAME -> Reference name by which system stores the data inside the metadata table
                - CONSTRAINT_NAME_COL_NAME_TABLE_NAME
                - ex:
                    UK_PHONE_NO_STUD

                - To check all the constraints and it's reference_name
                    SELECT * FROM USER_CONSTRAINTS;
            
        7. To drop the constraint from a column
        - Syntax
            ALTER TABLE TABLE_NAME
            DROP CONSTRAINT REFERENCE_NAME;
        
        8. To add a foreign key
            - There are 3 ways to add a foreign key

            1. 1st way
                - we can add a foreign key by using alter statement
                - Syntax
                    // To add a new column inside the table
                    ALTER TABLE TABLE_NAME
                    ADD COL_NAME DATATYPE 

                    // To set the reference
                    ALTER TABLE TABLE_NAME
                    ADD CONTRAINT REFERENCE_NAME CONTRAINT_NAME(COL_NAME) 
                    REFERENCES PARENT_TABLE_NAME(PARENT_COL_NAME)

            2. 2nd way
                - we can add a foreign key while creating the table
                - Syntax:
                    CREATE TABLE TABLE_NAME(
                    SID NUMBER(4),
                    CONSTRAINT REF_NAME FOREIGN KEY(COL_NAME) REFERENCES PARENT_TABLE_NAME(PARENT_COL_NAME)
                    )

            3. shortcut way
                - shortcut way (no use of REF_NAME)
                - Syntax:
                    SID NUMBER(4),
                    FOREIGN KEY(COL_NAME) REFERENCES PARENT_TABLE_NAME(PARENT_COL_NAME)

    - Truncate
        - delete all the data from the table without affecting the table structure

    - Drop
        - delete all the data from the table as well as delete the structure 

        - We cannot drop the data from a table whose primary key is used in another table

- DML (Data Manipulation Language)
    - Deals with the data 
    1. INSERT
        - to insert new data into the table
        - there are two syntax
        1. Syntax:
            INSERT INTO TABLE_NAME VALUES (VAL1, VAL2, VAL3, VAL4);

            - we cannot pass only one or two value while passing in table name, we have to give all values 

        2. Syntax:
            INSERT INTO TABLE_NAME(COL1_NAME, COL2_NAME ...) VALUES (VAL1, VAL2 ...);
            
            - values should be equal to columns passed

    2. UPDATE
        - mainly used to modify a specific data
        - Syntax:
            UPDATE TABLE_NAME
            SET COL1_NAME = VALUE, COL2_NAME=VALUE
            WHERE <FILTER CONDITION>

        - WAQT Update gender of 'NIBDA'
        - WAQT update student name of id 1001.
    
    3. DELETE
        - mainly used to delete a specific row or specific record
        - Syntax:
            DELETE FROM TABLE_NAME
            WHERE <FILTER CONDITION>

- TCL (Transaction Control Language)
    - all the DML operations are known as transactions
    - these transactions are non auto commited means not automatically get saved
    - to save these transactions we use TCL Statements

    1. COMMIT
        - mainly used to save all the transactions permanently
        - Syntax:
            COMMIT;

    2. SAVEPOINT
        - mainly used to save the transactions temporarily
        - used to save a particular location
        - Syntax:
            SAVEPOINT SAVEPOINT_NAME;
    
    3. ROLLBACK
        - used to delete the transaction which are saved temporarily by the savepoint.
        - Syntax:
            ROLLBACK TO SAVEPOINT_NAME;

- DCL (Data Control Language)
    - mainly used to control the flow of a data between the users.

    1. GRANT
        - used to give an access of a data to a particular user
        - Syntax:
            GRANT PERMISSION_NAME/PREVILAGE_NAME
            ON TABLE_NAME
            TO USER_NAME;

    2. REVOKE
        - used to take back the access of a data from a particular user
        - Syntax:
            REVOKE PERMISSION_NAME
            ON TABLE_NAME
            FROM USER_NAME;


-----------------------------------------------------

JOINS
-----
    - mainly used to fetch the data from multiple table simultaneously

    - Types of JOINS
        1. CROSS / Cartiessian JOIN
        2. INNER / Equii JOIN
        3. NATURAL JOIN
        4. OUTER JOIN
            i. LEFT OUTER JOIN
            ii. RIGHT OUTER JOIN
            iii. FULL OUTER JOIN
        5. SELF JOIN

    1. CROSS / Cartiessian JOIN
        - merge all the records of table1 with the all the records of table2

        - Syntax 1 => for MYSQL(uses ANSI)
            SELECT COL/EXP
            FROM TABLE_NAME1 CROSS JOIN TABLE_NAME2;
        
        - Syntax 2 => for ORACLE
            SELECT COL/EXP
            FROM TABLE_NAME1, TABLE_NAME2;

        - Drawback
            - It does not check matching and unmatching records

        - matching - if record is same as the merging record.
        - unmatching - if record is not same as the merging record.

    2. INNER / Equii JOIN
        - mainly used to fetch the matching records

        - Syntax 1 => for MYSQL(uses ANSI)
            SELECT COL/EXP
            FROM TABLE_NAME1 INNER JOIN TABLE_NAME2
            ON <JOIN CONDITION>;
        
        - Syntax 2 => for ORACLE
            SELECT COL/EXP
            FROM TABLE_NAME1, TABLE_NAME2
            WHERE <JOIN CONDITION>;

        - <JOIN CONDITION> 
            TABLE_NAME1.COMMON_COL = TABLE_NAME2.COMMON_COL

    - WAQTD ename and dname if emp is working as a manager in location new york
    - WAQTD ename, deptname, deptno, loc of emp if emp is hired in 81 but emp should be working in a research dept and loc should be dallas

    3. NATURAL JOIN
        - It will behave like an INNER JOIN if there will be a relationship available between 2 tables else it will behave like a CROSS JOIN.

        - Syntax (uses ANSI)
            SELECT CO/EXP
            FROM TABLE_NAME1 NATURAL JOIN TABLE_NAME2;

    4. OUTER JOIN
        - mainly used to fetch unmatched as well as matched records from both the tables.

        - Types
            i. LEFT OUTER JOIN
                - mainly used to fetch unmatched record from left table as well as matching record from both the tables.
                - Syntax 1 (ANSI):
                    SELECT COL/EXP
                    FROM TABLE_NAME1 LEFT JOIN TABLE_NAME2
                    ON <JOIN CONDITION>;

                - Syntax 2 (ORACLE):
                    SELECT COL/EXP
                    FROM TABLE_NAME1, TABLE_NAME2
                    WHERE <JOIN CONDITION>;

                    - <JOIN CONDITION>
                        TABLE1.COMMON_COL = TABLE2.COMMON_COL(+)


            ii. RIGHT OUTER JOIN
                - mainly used to fetch unmatched record from right table as well as matching record from both the tables.
                - Syntax 1 (ANSI):
                    SELECT COL/EXP
                    FROM TABLE_NAME1 RIGHT JOIN TABLE_NAME2
                    ON <JOIN CONDITION>;

                - Syntax 2 (ORACLE):
                    SELECT COL/EXP
                    FROM TABLE_NAME1, TABLE_NAME2
                    WHERE <JOIN CONDITION>;

                    - <JOIN CONDITION>
                        TABLE1.COMMON_COL(+) = TABLE2.COMMON_COL

            iii. FULL OUTER JOIN
                - mainly used to fetch unmatched and matched record from both the tables.
                - Syntax (ANSI):
                    SELECT COL/EXP
                    FROM TABLE_NAME1 FULL JOIN TABLE_NAME2
                    ON <JOIN CONDITION>;

    - 5. SELF JOIN
        - mainly used to join the table with itself
        - Syntax 1 (ANSI):
            SELECT COL/EXP
            FROM TABLE_NAME1 T1 JOIN TABLE_NAME2 T2
            ON <JOIN CONDITION>; 

        - Syntax 2 (ORACLE):
            SELECT COL/EXP
            FROM TABLE_NAME1 T1, TABLE_NAME2 T2
            WHERE <JOIN CONDITION>;
        
    - WAQTD ename & manager name of all the emp
    - WAQTD ename & manager name of scott
    - WAQTD ename, manager name, manager's manager name of smith
    - WAQTD ename and manager name if emp is earning more than it's manager
    - WAQTD ename, his dept name, manager name, manager dept name
    - WAQTD ename, his dept name, manager name, manager dept name if emp and manager working in same loc


IMP QUESTIONS
    1. nth max , nth min salary (all three ways)
    2. diff
        - delete, drop and trucate
        - primary key, foreign key
        - where clause, having clause
        - dbms, rdbms
    3. explain all the sql statements/commands
    4. constraints
    5. clauses and it's functions
    6. pseudo columns
        - find first 5 records / last 5 records

    ADVANCE (theory)
        1. window function (practical)
            - rownum
            - rownum
            - rank function
            - lead function/lag function
        2. index
        3. views
        4. triggers
        5. acid properties
        6. union
        7. union all
        8. CTE - common table expression
        9. store procedures
