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
        