# Data Structure & Graph Performance Analyzer



## 01.PROJECT DESCRIPTION


A Java-based console application that demonstrates the practical application of data structures, algorithms, searching, graph traversal, and algorithmic complexity. The system allows users to interact with multiple data structures through an integrated menu-driven interface.


## 02.TECHNOLOGIES USED

Java (JDK 17+)
Eclipse IDE
Git and GitHub for collaboration


## 03.TEAM MEMBERS

| Member   | Name                              | Student ID   | Responsibility                            |
|----------|-----------------------------------|--------------|-------------------------------------------| 
| Member 1 | W.A.T.K. Chandrasiri              | 23DA2-0214   | Array + Linked List + Integration (Video) |
| Member 2 | R.M.T.R. Rathnayaka               | 23DA2-0253   | Stack + Queue                             |
| Member 3 | N.B.A. Nethmi Navodya Nishanka    | 23DA2-0182   | Searching + Performance                   |
| Member 4 | P.H. Senevirathna                 | 23DA2-0071   | Graph + Integration + Documentation       |


## 04.INDIVIDUAL CONTRIBUTIONS

### Member 1 - Array + Linked List + Integration (Video)

| Field                   | Details                                                                           |
|-------------------------|-----------------------------------------------------------------------------------|
| Student Name            |  W.A.T.K. Chandrasiri                                                             |
| Student ID              | 23DA2-0214                                                                        |
| Assigned Responsibility | Array + Linked List + Integration                                                 |
| Contribution 1          | Implemented DataArray.java with insert, delete, search, and display methods       |
| Contribution 2          | Handled full array and empty array scenarios                                      |
| Contribution 3          | Implemented IntLinkedList.java with insert, delete, search, and display methods   |
| Contribution 4          | Handled input validation and empty structure handling                             |
| Contribution 5          | Coordinated and merged the group demonstration video                              |


### Member 2 - Stack + Queue

| Field                   | Details                                                                           |
|-------------------------|-----------------------------------------------------------------------------------|
| Student Name            |  R.M.T.R. Rathnayaka                                                              |
| Student ID              | 23DA2-0253                                                                        |
| Assigned Responsibility | Stack + Queue                                                                     |
| Contribution 1          | Implemented Stack.java with push, pop, peek, and display methods                  |
| Contribution 2          | Handled empty stack and full stack conditions                                     |
| Contribution 3          | Implemented Queue.java with enqueue, dequeue, peek, and display methods           |
| Contribution 4          | Handled empty queue and full queue conditions                                     |
| Contribution 5          | Tested all edge cases including empty, full, and wrap-around                      |


### Member 3 - Searching + Performance + README

| Field                   | Details                                                                           |
|-------------------------|-----------------------------------------------------------------------------------|
| Student Name            |  N.B.A. Nethmi Navodya Nishanka                                                   |
| Student ID              | 23DA2-0182                                                                        |
| Assigned Responsibility | Searching + Performance + README                                                  |
| Contribution 1          | Implemented Searching.java with linearSearch and binarySearch methods             |
| Contribution 2          | linearSearch has O(n) complexity and binarySearch has O(log n) complexity         |
| Contribution 3          | Implemented linearSteps and binarySteps methods to count comparisons              |
| Contribution 4          | Implemented PerformanceAnalyzer.java with compareSearching method                 |
| Contribution 5          | compareSearching compares steps and execution time between both searches          |
| Contribution 6          | Added compareOnSizes method to demonstrate scaling across array sizes             |
| Contribution 7          | Tested array sizes: 100, 1000, 10000, 100000                                      |
| Contribution 8          | Tested all search scenarios including best case, worst case, and not found        |
| Contribution 9          | Documented complexity analysis for the group video                                |
| Contribution 10         | Created and maintained the README documentation                                   |



### Member 4 - Graph + Integration + Documentation

| Field                   | Details                                                                           |
|-------------------------|-----------------------------------------------------------------------------------|
| Student Name            |  P.H. Senevirathna                                                                |
| Student ID              | 23DA2-0071                                                                        |
| Assigned Responsibility | Graph + Integration + Documentation                                               |
| Contribution 1          | Implemented Graph.java using adjacency matrix representation                      |
| Contribution 2          | Added addVertex, addEdge, and displayGraph methods                                |
| Contribution 3          | Implemented BFS traversal using queue                                             |
| Contribution 4          | Implemented DFS traversal using recursion                                         |
| Contribution 5          | Handled duplicate vertex, duplicate edge, and invalid vertex scenarios            |
| Contribution 6          | Created Main.java with a unified main menu and connected the available modules    |
| Contribution 7          | Designed submenus for Array, Stack, Queue, Linked List, Searching, Graph, and Performance|
| Contribution 8          | Managed GitHub repository setup and collaboration                                 |
| Contribution 9          | Performed integration testing of the complete system                              |


## 05.MAIN SYSTEM FEATURES

| Menu Option | Module                 | Operations                                    |
|-------------|------------------------|-----------------------------------------------|
| 1           | Array Operations       | Insert, Delete, Search, Display               |
| 2           | Stack Operations       | Push, Pop, Peek, Display                      |
| 3           | Queue Operations       | Enqueue, Dequeue, Peek or Front, Display      |
| 4           | Linked List Operations | Insert, Delete, Search, Display               |
| 5           | Searching Operations   | Linear Search, Binary Search with complexity  |
| 6           | Graph Operations       | Add Vertex, Add Edge, Display Graph, BFS, DFS |
| 7           | Performance Comparison | Steps and time comparison between searches    |
| 8           | Display All Results    | Show all data structures at once              |
| 9           | Exit                   | Close the application                         |


## 06.ALGORITHMS AND COMPLEXITIES

| Operation          | Algorithm            | Complexity |
|--------------------|----------------------|--------------|
| Array Insert       | Direct write         | O(1)         |
| Array Delete       | Shift elements       | O(n)         |
| Array Search       | Linear Search        | O(n)         |
| Stack Push         | Index-based          | O(1)         |
| Stack Pop          | Index-based          | O(1)         |
| Queue Enqueue      | Circular queue       | O(1)         |
| Queue Dequeue      | Circular queue       | O(1)         |
| Linked List Insert | Traverse to end      | O(n)         |
| Linked List Delete | Traverse and remove  | O(n)         |
| Linked List Search | Traverse             | O(n)         |
| Linear Search      | Sequential           | O(n)         |
| Binary Search      | Divide and conquer   | O(log n)     |
| Graph BFS          | Queue-based          | O(V squared) |
| Graph DFS          | Recursive            | O(V squared) |


## 07.Instructions for Running the Program
    ### Requirements
        ⭐Java Development Kit (JDK) installed.
        ⭐Eclipse IDE
        ⭐All Java source files saved inside the data_structures package.
        
    ### Method 1: Run Using Eclipse IDE
        1.Open Eclipse IDE.
        2.Open or import the project.
        3.Ensure all Java files are inside the data_structures package.
        4.Open Main.java.
        5.Right-click inside the editor.
        6.Select Run As → Java Application.
        7.The main menu will appear in the Eclipse Console.
        8.Enter a menu number to perform the required operation.
        9.The main menu will appear. Enter the relevant number to select an operation.
     
   ### Main Menu Options

| Menu Option | Module                 | 
|-------------|------------------------|
| 1           | Array Operations       | 
| 2           | Stack Operations       | 
| 3           | Queue Operations       | 
| 4           | Linked List Operations | 
| 5           | Searching Operations   | 
| 6           | Graph Operations       | 
| 7           | Performance Comparison | 
| 8           | Display All Results    | 
| 9           | Exit                   |

Example
After starting the program, the following menu appears:

==============================================

 DATA STRUCTURE & GRAPH PERFORMANCE ANALYZER
 
==============================================
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit
    
=============================================

Enter your choice:

Enter 1 to access array operations, 6 to access graph operations, or 9 to exit the program.

Note: Make sure Java is installed and configured correctly before compiling and running the program.

