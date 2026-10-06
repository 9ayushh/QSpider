# Revision

1. What is Collection
2. Collection Hierarchy
3. Difference between List and Set
4. Difference between Array and ArrayList
5. Difference between ArrayList and LinkedList
6. Difference between Stack and Queue
7. Difference between HashSet and LinkedHashSet and TreeSet
8. Methods present in collection
9. Difference between ArrayList and Vector
10. What is Map
11. Map Hierarchy
12. Methods present in Map
13. Difference between add and put
14. Difference between HashMap and LinkedHashMap

 

----------------------------------------------------------------
# MultiThreading

- Process
    - process is an instance of a program
    - file transfer is difficult
    - heavy weight
    - An independent executing program.
    - Has its own memory and resources.
    - Creation is slower.
    - Communication between processes is more expensive.
    - Processes are more isolated.
- Thread
    - thread is the sub process
    - file transfer is easy
    - light weight
    - The smallest unit of execution inside a process.
    - Shares memory and resources with other threads of the same process.
    - Creation is faster.
    - Communication between threads is easier and faster.
    - Threads are closely connected.


- How we can create a threads
    - We have 2 ways to create a thread
        1. to extend the thread class and the override the method
        2. by implementing the runnable interface

- run() 
    - used to store the thread logic
- start()
    - start the thread execution
    - non-static method

    - NOTE
        - we cannot use multiple start method for single thread object
        - means One thread one start method

    method call --> Thread Schedular --> Operating System --> Thread

- join()
    - it is used to wait till the task will complete

while implement
- either we can make the class abstract or override the method

LifeCycle of Thread
    - create the thread
        - enter to a state (NEW state)
    - start the thread by using start()
        - complete the memory allocation and then move in runnable state (RUNNABLE state)
    - waiting/time waiting or block state
    - run the program by using run();
        - it move to the running state (RUNNING state)
    - Ending of the program
        - (TERMINATED state)

Problem
    1. RaceCondtion
        - Solution -> Locking
            - keyword -> synchronous

        - real time example
            - String buffer -> synchronous thread safe, v1.0
            - String builder -> async, not thread safe, v1.5

    2. Starvation
        High priority will executed
        Low priority will not been executed

    3. Producer & Consumer 
        - Solve by...
            - notify()
            - notifyAll()
            - wait()

    - Volatile keyword
        - make sure that the data is update


* INTERVIEW QUESTION ON MULTITHREADING
    1. Difference between multithreading and multitasking.
    2. Difference b/w thread and process
    3. Ways to create a thread
    4. Methods in a thread (wait(), join(), sleep(), etc)
    5. What is Synchronization
    6. What is volatile keyword
    7. Problems in Multithreading (race condtion, data inconsistence, deadlock, starvation)


# Java features
    - Why we need java 8
        - oops + procedural
        - functional interface
        - stream api
        - date and time
        - optional datatype



-----------------------

greater than 100
top 3 highest numbers 
2nd highest


-----------------------------
# JDBC

execute() -> for generic DDL
execute update() -> for DML
execute query() -> DQL

-----------------------------
# Spring

- Features
    - Application level framework
    - loose coupling
    - IOC / DI

- LifeCycle of Spring Bean
    - App Started
        |
    - Container Start (create all the object of the pojo class)
        |
    - Object is created
        |
    - Post construct methods
        |
    - Dependency Injection
        | (Ready to use )
    - Pre Destroy method

- Maven
    - pom -> project object model


@Configuration
@ComponentScan(basePackage = {})

@Component
    - to mark the class as spring bean

ApplicationContext con = new AnnotationConfigApplicationContext();


@Component -> class level annotation
    - @Repository -> db logic
    - @Service -> business logic
    - @Controller -> http req and response (return UI)
        - @RestController   (return -> JSON)
    - @ControllerAdvice -> Exception handling
        - @RestControllerAdvice


- 3 Ways of DI
    - Field / Variable Injection
    - Setter Inject
    - Constructor Injection


    @Value -> use to inject the values
    @Autowired

    @Primary 
    @Qualifier

    @Bean


JEE -> Java Enterprise Edition
    - JPA   => Java Persistance API
    - EJB   => Enterprise java beans
    - Servlet
    - Validation
    - JSP => Java servlet pages

Spring
    - IoC => Inversion of Control
    - DI => Dependency Injection

Modules
1. Spring core (IoC, DI, Annotations, SPEL, Lifecycle)
2. Spring MVC
3. Spring Boot
4. Spring JDBC
5. Spring JPA
6. Spring Security
7. Spring AI
8. Spring Cloud
9. Spring AOP

Application Context 
    - new ClassPathXmlApplicationContext("");
    - Represent the spring container
    - It is an implementation the xml class Based

    - ClassPath xml application context
    - Annoataion config application context

    - Syntax
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

ConfigurableApplicationContext
    - init-method="welcome"
    - destroy-method="close"

Accurators
    - use to check the health of the application
Pagination

LifeCycle of 

Container start
Bean is register 
create the object
call the init method
post contruct method
dependency injection
ready to use
pre destroy method


- What is bean ?
    - if the object is created by object container/ spring container is known as bean.

dependency injection
    - ways to assign value
    - there are three ways
        1. field injection
        2. setter injection
        3. constructor injection

- dependency injection by field
    - using property in config while registering bean
        <bean id="student" class="com.jsp.model.Student">
              <!-- giving the property -->
              <property name="roll" value="101"></property>
              <property name="name" value="Raj"></property>
              <property name="cgpa" value="8.7"></property>
              <property name="phone" value="9876543210"></property>

        </bean>


- Configuration
- Bean

- @Component
- @ComponentScan
- @Primary
- @Qualifier


- Scope of the Bean
    - Singleton - only one object
    - Prototype - multiple object

app.properties
@PropertySource to config file
add value to the app.properties file


# Spring Boot
@SpringBootApplication
    - addition of @Configuration + @ComponentScan + @EnableAutoConfiguration


- Http methods
Code  |  Name	                        |    Meaning

100	  |   Continue	                    |     Server got the request headers; client can send the body
200	  |   OK	                        |     Request succeeded
201	  |   Created              	        |     A new resource was created
202	  |   Accepted          	        |     Request accepted but not yet processed
204	  |   No Content        	        |     Success, but nothing to return
300	  |   Multiple Choices	            |     Several possible responses for the resource
301	  |   Moved Permanently	            |     Resource has a new permanent URL
400	  |   Bad Request	                |     Malformed or invalid request
401	  |   Unauthorized	                |     Authentication missing or invalid
402	  |   Payment Required	            |     Reserved; sometimes used for paywalls or billing
403	  |   Forbidden	                    |     Authenticated, but not allowed
404	  |   Not Found	                    |     Resource doesn't exist
405	  |   Method Not Allowed	        |     HTTP method not supported for this resource
406	  |   Not Acceptable	            |     Can't produce a response matching the Accept headers
408	  |   Request Timeout	            |     Server timed out waiting for the request
409	  |   Conflict	                    |     Conflicts with the current state of the resource
413	  |   Payload Too Large	            |     Request body exceeds the server's limit
429	  |   Too Many Requests	            |     Rate limit exceeded
500	  |   Internal Server Error	        |     Generic server failure
501	  |   Not Implemented	            |     Server doesn't support the requested functionality
502	  |   Bad Gateway	                |     Invalid response from an upstream server
503	  |   Service Unavailable	        |     Server overloaded or down for maintenance
504	  |   Gateway Timeout	            |     Upstream server didn't respond in time
505	  |   HTTP Version Not Supported	|     Server doesn't support the HTTP version used
507	  |   Insufficient Storage	        |     Server can't store what's needed to complete the request (WebDAV)

HTTP methods
    - Get
    - Post
    - Put 
    - Patch
    - Delete
    - Header

- Tomcat Server
    - servlet who can convert json into java as well as java into json

@RequestBody
@RequestParam
@PathVariable


-------------------
Hibernate ORM
    - ORM framework - JDBC
    - Object Realational Model/Mapping

    - class -> mapped to the table
    - object -> row or records
    - variable -> columns
    
    JDT (java datatypes) -> SDT (sql datatypes)


JPA
---
    - Java Persistance API
        
