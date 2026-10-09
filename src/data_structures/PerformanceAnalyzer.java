package data_structures;

public class PerformanceAnalyzer {

    public static void compareSearching(int[] array, int size, int target) {

        long startLinear = System.nanoTime();

        int linearResult =
                Searching.linearSearch(array, size, target);

        long endLinear = System.nanoTime();

        long linearTime = endLinear - startLinear;

        long startBinary = System.nanoTime();

        int binaryResult =
                Searching.binarySearch(array, size, target);

        long endBinary = System.nanoTime();

        long binaryTime = endBinary - startBinary;

        int linearSteps =
                Searching.linearSteps(array, size, target);

        int binarySteps =
                Searching.binarySteps(array, size, target);

        System.out.println();
        System.out.println("==============================================");
        System.out.println(" SEARCH PERFORMANCE COMPARISON");
        System.out.println("==============================================");

        System.out.println("Target value : " + target);

        System.out.println("----------------------------------------------");

        System.out.println("Linear Search");
        System.out.println("Result       : "
                + (linearResult == -1 ? "Not Found" : "Found"));

        System.out.println("Steps        : " + linearSteps);
        System.out.println("Time         : " + linearTime + " ns");

        System.out.println("----------------------------------------------");

        System.out.println("Binary Search");
        System.out.println("Result       : "
                + (binaryResult == -1 ? "Not Found" : "Found"));

        System.out.println("Steps        : " + binarySteps);
        System.out.println("Time         : " + binaryTime + " ns");

        System.out.println("----------------------------------------------");

        System.out.println("Complexity:");
        System.out.println("Linear Search : O(n)");
        System.out.println("Binary Search : O(log n)");

        System.out.println("==============================================");
    }
}