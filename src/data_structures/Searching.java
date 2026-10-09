package data_structures;

public class Searching {

    public static int linearSearch(int[] array, int size, int target) {

        for (int i = 0; i < size; i++) {

            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] array, int size, int target) {

        int low = 0;
        int high = size - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int linearSteps(int[] array, int size, int target) {

        int steps = 0;

        for (int i = 0; i < size; i++) {

            steps++;

            if (array[i] == target) {
                return steps;
            }
        }

        return steps;
    }

    public static int binarySteps(int[] array, int size, int target) {

        int low = 0;
        int high = size - 1;
        int steps = 0;

        while (low <= high) {

            steps++;

            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return steps;
            }

            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return steps;
    }
}