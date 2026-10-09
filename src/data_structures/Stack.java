package data_structures;

public class Stack {

    private int[] stack;
    private int top;

    public Stack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public boolean push(int value) {

        if (isFull()) {
            System.out.println("Stack is full.");
            return false;
        }

        stack[++top] = value;
        return true;
    }

    public Integer pop() {

        if (isEmpty()) {
            return null;
        }

        return stack[top--];
    }

    public Integer peek() {

        if (isEmpty()) {
            return null;
        }

        return stack[top];
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("----- Stack -----");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}