package data_structures;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static DataArray array = new DataArray(20);

    static Stack stack = new Stack(10);

    static Queue queue = new Queue(10);

    static IntLinkedList linkedList =
            new IntLinkedList();

    static Graph graph = new Graph(20);

    public static void main(String[] args) {

        int choice;

        do {

            displayMainMenu();

            choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    arrayMenu();
                    break;

                case 2:
                    stackMenu();
                    break;

                case 3:
                    queueMenu();
                    break;

                case 4:
                    linkedListMenu();
                    break;

                case 5:
                    searchingMenu();
                    break;

                case 6:
                    graphMenu();
                    break;

                case 7:
                    performanceMenu();
                    break;

                case 8:
                    displayAllResults();
                    break;

                case 9:
                    System.out.println(
                            "Thank you for using the system.");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please try again.");
            }

        } while (choice != 9);

        input.close();
    }

    // MAIN MENU


    static void displayMainMenu() {

        System.out.println();
        System.out.println("==============================================");
        System.out.println(" DATA STRUCTURE & GRAPH PERFORMANCE ANALYZER");
        System.out.println("==============================================");

        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");

        System.out.println("==============================================");
    }


    // ARRAY

    static void arrayMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println("------------- ARRAY OPERATIONS -------------");

            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return");

            choice = readInt("Enter choice: ");

            switch (choice) {

                case 1:

                    int value =
                            readInt("Enter value: ");

                    if (array.insert(value)) {
                        System.out.println(
                                "Value inserted successfully.");
                    }

                    break;

                case 2:

                    value =
                            readInt("Enter value to delete: ");

                    if (array.delete(value)) {
                        System.out.println(
                                "Value deleted successfully.");
                    } else {
                        System.out.println(
                                "Value not found.");
                    }

                    break;

                case 3:

                    value =
                            readInt("Enter value to search: ");

                    int index =
                            array.search(value);

                    if (index == -1) {
                        System.out.println(
                                "Value not found.");
                    } else {
                        System.out.println(
                                "Value found at index "
                                        + index);
                    }

                    break;

                case 4:
                    array.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println(
                            "Invalid choice.");
            }

        } while (choice != 5);
    }


    // STACK


    static void stackMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println("------------- STACK OPERATIONS -------------");

            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return");

            choice = readInt("Enter choice: ");

            switch (choice) {

                case 1:

                    int value =
                            readInt("Enter value: ");

                    stack.push(value);

                    break;

                case 2:

                    Integer popped =
                            stack.pop();

                    if (popped == null) {
                        System.out.println(
                                "Cannot pop. Stack is empty.");
                    } else {
                        System.out.println(
                                "Popped value: " + popped);
                    }

                    break;

                case 3:

                    Integer top =
                            stack.peek();

                    if (top == null) {
                        System.out.println(
                                "Stack is empty.");
                    } else {
                        System.out.println(
                                "Top value: " + top);
                    }

                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println(
                            "Invalid choice.");
            }

        } while (choice != 5);
    }


    // QUEUE
 

    static void queueMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println("------------- QUEUE OPERATIONS -------------");

            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek / Front");
            System.out.println("4. Display");
            System.out.println("5. Return");

            choice = readInt("Enter choice: ");

            switch (choice) {

                case 1:

                    int value =
                            readInt("Enter value: ");

                    queue.enqueue(value);

                    break;

                case 2:

                    Integer removed =
                            queue.dequeue();

                    if (removed == null) {
                        System.out.println(
                                "Cannot dequeue. Queue is empty.");
                    } else {
                        System.out.println(
                                "Dequeued value: "
                                        + removed);
                    }

                    break;

                case 3:

                    Integer front =
                            queue.peek();

                    if (front == null) {
                        System.out.println(
                                "Queue is empty.");
                    } else {
                        System.out.println(
                                "Front value: " + front);
                    }

                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println(
                            "Invalid choice.");
            }

        } while (choice != 5);
    }


    // LINKED LIST
    static void linkedListMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println(
                    "---------- LINKED LIST OPERATIONS ----------");

            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return");

            choice = readInt("Enter choice: ");

            switch (choice) {

                case 1:

                    int value =
                            readInt("Enter value: ");

                    linkedList.insert(value);

                    System.out.println(
                            "Value inserted successfully.");

                    break;

                case 2:

                    value =
                            readInt("Enter value to delete: ");

                    if (linkedList.delete(value)) {
                        System.out.println(
                                "Value deleted successfully.");
                    } else {
                        System.out.println(
                                "Value not found.");
                    }

                    break;

                case 3:

                    value =
                            readInt("Enter value to search: ");

                    if (linkedList.search(value)) {
                        System.out.println(
                                "Value found.");
                    } else {
                        System.out.println(
                                "Value not found.");
                    }

                    break;

                case 4:
                    linkedList.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println(
                            "Invalid choice.");
            }

        } while (choice != 5);
    }


    // SEARCHING


    static void searchingMenu() {

        if (array.size() == 0) {

            System.out.println(
                    "Please insert values into the array first.");

            return;
        }

        int target =
                readInt("Enter value to search: ");

        int[] values =
                new int[array.size()];

        for (int i = 0; i < array.size(); i++) {
            values[i] = array.get(i);
        }

        int linear =
                Searching.linearSearch(
                        values,
                        values.length,
                        target);

        int[] sorted =
                values.clone();

        Arrays.sort(sorted);

        int binary =
                Searching.binarySearch(
                        sorted,
                        sorted.length,
                        target);

        System.out.println();
        System.out.println("------------- SEARCH RESULTS -------------");

        System.out.println(
                "Linear Search: "
                        + (linear == -1
                        ? "Not Found"
                        : "Found at index " + linear));

        System.out.println(
                "Binary Search: "
                        + (binary == -1
                        ? "Not Found"
                        : "Found at sorted index " + binary));

        System.out.println();
        System.out.println(
                "Binary Search requires sorted data.");

        System.out.println(
                "Linear Search complexity: O(n)");

        System.out.println(
                "Binary Search complexity: O(log n)");
    }


 // GRAPH

    static void graphMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println(
                    "------------- GRAPH OPERATIONS -------------");

            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. Search / Traverse the graph");
            System.out.println("5. BFS Traversal");
            System.out.println("6. DFS Traversal");
            System.out.println("7. Return");

            choice = readInt("Enter choice: ");

            switch (choice) {

                case 1:

                    String vertex =
                            readLine("Enter vertex name: ");

                    graph.addVertex(vertex);

                    break;

                case 2:

                    String from =
                            readLine("Enter first vertex: ");

                    String to =
                            readLine("Enter second vertex: ");

                    graph.addEdge(from, to);

                    break;

                case 3:

                    graph.displayGraph();

                    break;

                case 4:

                    String search =
                            readLine("Enter vertex name: ");

                    graph.search(search);

                    break;

                case 5:

                    String bfsStart =
                            readLine("Enter starting vertex: ");

                    graph.bfs(bfsStart);

                    break;

                case 6:

                    String dfsStart =
                            readLine("Enter starting vertex: ");

                    graph.dfs(dfsStart);

                    break;

                case 7:

                    System.out.println("Returning to main menu...");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);
    }

    // PERFORMANCE


    static void performanceMenu() {

        if (array.size() == 0) {

            System.out.println(
                    "Please insert array values first.");

            return;
        }

        int target =
                readInt("Enter search value: ");

        int[] values =
                new int[array.size()];

        for (int i = 0; i < array.size(); i++) {
            values[i] = array.get(i);
        }

        int[] sorted =
                values.clone();

        Arrays.sort(sorted);

        PerformanceAnalyzer.compareSearching(
                sorted,
                sorted.length,
                target);

        System.out.println();
        System.out.println(
                "Graph traversal performance can be observed");
        System.out.println(
                "through the operation counts displayed");
        System.out.println(
                "during BFS and DFS.");
    }


    // DISPLAY ALL


    static void displayAllResults() {

        System.out.println();
        System.out.println(
                "==============================================");
        System.out.println(
                "             ALL DATA STRUCTURES");
        System.out.println(
                "==============================================");

        System.out.println();
        array.display();

        System.out.println();
        stack.display();

        System.out.println();
        queue.display();

        System.out.println();
        linkedList.display();

        System.out.println();
        graph.displayGraph();

        System.out.println(
                "==============================================");
    }


    // INPUT METHODS

    static int readInt(String prompt) {

        while (true) {

            System.out.print(prompt);

            if (input.hasNextInt()) {

                int value =
                        input.nextInt();

                input.nextLine();

                return value;

            } else {

                System.out.println(
                        "Invalid input. Please enter an integer.");

                input.nextLine();
            }
        }
    }

    static String readLine(String prompt) {

        System.out.print(prompt);

        return input.nextLine().trim();
    }
}