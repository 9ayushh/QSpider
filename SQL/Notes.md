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
        - SELECTION
            - mainly used to retrive the data by selecting rows and columns
        - JOINS
            - mainly used to fetch the data from multiple table simultaneously

    2. Data Definition Language (DDL)
        - used to give structure to the database

        - CREATE
        - RENAME
        - ALTER
        - TRUNCATE
        - DROP

    3. Data Manipulation Language (DML)
        - it deals with the data in database

        - INSERT
        - UPDATE
        - DELETE

    4. Transaction Control Language (TCL)
        - COMMIT
        - SAVEPOINT
        - ROLLBACK

    5. Data Control Language (DCL)
        - to give access to the data

        - GRANT
        - REVOTE





