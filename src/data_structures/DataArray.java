package data_structures;

public class DataArray {

    private int[] array;
    private int size;

    public DataArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public boolean insert(int value) {

        if (size == array.length) {
            System.out.println("Array is full.");
            return false;
        }

        array[size] = value;
        size++;

        return true;
    }

    public boolean delete(int value) {

        int index = search(value);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return true;
    }

    public int search(int value) {

        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public int get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }

    public void display() {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("----- Array Elements -----");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}