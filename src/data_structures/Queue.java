package data_structures;

public class Queue {

    private int[] queue;
    private int front;
    private int rear;
    private int count;

    public Queue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    public boolean enqueue(int value) {

        if (isFull()) {
            System.out.println("Queue is full.");
            return false;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        count++;

        return true;
    }

    public Integer dequeue() {

        if (isEmpty()) {
            return null;
        }

        int value = queue[front];

        front = (front + 1) % queue.length;
        count--;

        return value;
    }

    public Integer peek() {

        if (isEmpty()) {
            return null;
        }

        return queue[front];
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("----- Queue -----");

        int index = front;

        for (int i = 0; i < count; i++) {

            System.out.print(queue[index] + " ");

            index = (index + 1) % queue.length;
        }

        System.out.println();
    }
}