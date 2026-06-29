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
                    |__ FLASHBACK TABLE TABLE_NAME TO BEFORE DROP; -> To restore the table
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

        7369  |  SMITH   |   CLERK       |   7902  |  17-DEC-80   |    800   |          |  20     |  RESEARCH       |  DALLAS
        7499  |  ALLEN   |   SALESMAN    |   7698  |  20-FEB-81   |   1600   |    300   |  30     |  SALES          |  CHICAGO
        7521  |  WARD    |   SALESMAN    |   7698  |  22-FEB-81   |   1250   |    500   |  30     |  SALES          |  CHICAGO
        7566  |  JONES   |   MANAGER     |   7839  |  02-APR-81   |   2975   |          |  20     |  RESEARCH       |  DALLAS
        7654  |  MARTIN  |   SALESMAN    |   7698  |  28-SEP-81   |   1250   |   1400   |  30     |  SALES          |  CHICAGO
        7698  |  BLAKE   |   MANAGER     |   7839  |  01-MAY-81   |   2850   |          |  30     |  SALES          |  CHICAGO
        7782  |  CLARK   |   MANAGER     |   7839  |  09-JUN-81   |   2450   |          |  10     |  ACCOUNTING     |  NEW YORK
        7788  |  SCOTT   |   ANALYST     |   7566  |  19-APR-87   |   3000   |          |  20     |  RESEARCH       |  DALLAS
        7839  |  KING    |   PRESIDENT   |         |  17-NOV-81   |   5000   |          |  10     |  ACCOUNTING     |  NEW YORK
        7844  |  TURNER  |   SALESMAN    |   7698  |  08-SEP-81   |   1500   |      0   |  30     |  SALES          |  CHICAGO
        7876  |  ADAMS   |   CLERK       |   7788  |  23-MAY-87   |   1100   |          |  20     |  RESEARCH       |  DALLAS
        7900  |  JAMES   |   CLERK       |   7698  |  03-DEC-81   |    950   |          |  30     |  SALES          |  CHICAGO
        7902  |  FORD    |   ANALYST     |   7566  |  03-DEC-81   |   3000   |          |  20     |  RESEARCH       |  DALLAS
        7934  |  MILLER  |   CLERK       |   7782  |  23-JAN-82   |   1300   |          |  10     |  ACCOUNTING     |  NEW YORK

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

# EDIT OR ED -> ENTER (change as you like -> save the file) -> USE / THEN ENTER
    
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


