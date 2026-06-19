 SQL - Structural Query Language

Day 2...
5 Types of DataTypes
    1. Char
    2. Varchar
    3. Varchar2
    4. Number
    5. Large Object
        - Blob
        - Clob

    Extras 
        - Date

---------------------------------------
Day 3...
Constraints
    1. Unique
    2. Not Null
    3. Check 
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
        - REVOTE
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
Projection:
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
            