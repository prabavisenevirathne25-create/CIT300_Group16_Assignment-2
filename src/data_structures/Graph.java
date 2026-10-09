package data_structures;

public class Graph {

    private String[] vertices;
    private int[][] adjacencyMatrix;
    private int count;
    private int capacity;

    public Graph(int capacity) {

        this.capacity = capacity;

        vertices = new String[capacity];
        adjacencyMatrix = new int[capacity][capacity];

        count = 0;
    }

    // Find a vertex
    private int findVertex(String name) {

        if (name == null) {
            return -1;
        }

        for (int i = 0; i < count; i++) {

            if (vertices[i].equalsIgnoreCase(name.trim())) {
                return i;
            }
        }

        return -1;
    }

    // Add vertex
    public boolean addVertex(String name) {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Vertex name cannot be empty.");
            return false;
        }

        name = name.trim();

        if (findVertex(name) != -1) {
            System.out.println("Vertex already exists.");
            return false;
        }

        if (count == capacity) {
            System.out.println("Graph is full.");
            return false;
        }

        vertices[count] = name;
        count++;

        return true;
    }

    // Add edge
    public boolean addEdge(String from, String to) {

        int a = findVertex(from);
        int b = findVertex(to);

        if (a == -1 || b == -1) {
            System.out.println("One or both vertices were not found.");
            return false;
        }

        if (a == b) {
            System.out.println("A vertex cannot connect to itself.");
            return false;
        }

        if (adjacencyMatrix[a][b] == 1) {
            System.out.println("Edge already exists.");
            return false;
        }

        adjacencyMatrix[a][b] = 1;
        adjacencyMatrix[b][a] = 1;

        return true;
    }

    // Display graph
    public void displayGraph() {

        if (count == 0) {
            System.out.println("Graph is empty.");
            return;
        }

        System.out.println();
        System.out.println("----- Graph Connection -----");

        for (int i = 0; i < count; i++) {

            System.out.print(vertices[i] + " -> ");

            boolean connected = false;

            for (int j = 0; j < count; j++) {

                if (adjacencyMatrix[i][j] == 1) {

                    System.out.print(vertices[j] + " ");
                    connected = true;
                }
            }

            if (!connected) {
                System.out.print("(no connections)");
            }

            System.out.println();
        }
    }

    // Search / Traverse the graph
    public void search(String start) {

        int index = findVertex(start);

        if (index == -1) {
            System.out.println("Vertex not found.");
            return;
        }

        System.out.println("Vertex found: " + vertices[index]);
    }

    // BFS Traversal
    public void bfs(String start) {

        int startIndex = findVertex(start);

        if (startIndex == -1) {
            System.out.println("Starting vertex not found.");
            return;
        }

        boolean[] visited = new boolean[count];

        int[] queue = new int[count];

        int front = 0;
        int rear = 0;

        visited[startIndex] = true;
        queue[rear++] = startIndex;

        int steps = 0;

        System.out.print("BFS: ");

        while (front < rear) {

            int current = queue[front++];

            System.out.print(vertices[current] + " ");

            steps++;

            for (int i = 0; i < count; i++) {

                if (adjacencyMatrix[current][i] == 1
                        && !visited[i]) {

                    visited[i] = true;
                    queue[rear++] = i;
                }
            }
        }

        System.out.println();

        System.out.println("BFS operations: " + steps);

        System.out.println(
                "Complexity: O(V squared) using adjacency matrix.");
    }

    // DFS Traversal
    public void dfs(String start) {

        int startIndex = findVertex(start);

        if (startIndex == -1) {
            System.out.println("Starting vertex not found.");
            return;
        }

        boolean[] visited = new boolean[count];

        System.out.print("DFS: ");

        int steps = dfsRecursive(startIndex, visited);

        System.out.println();

        System.out.println("DFS operations: " + steps);

        System.out.println(
                "Complexity: O(V squared) using adjacency matrix.");
    }

    // Recursive DFS
    private int dfsRecursive(int current,
                             boolean[] visited) {

        visited[current] = true;

        System.out.print(vertices[current] + " ");

        int steps = 1;

        for (int i = 0; i < count; i++) {

            if (adjacencyMatrix[current][i] == 1
                    && !visited[i]) {

                steps += dfsRecursive(i, visited);
            }
        }

        return steps;
    }
}