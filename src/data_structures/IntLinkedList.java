package data_structures;

public class IntLinkedList {

    private Node head;

    private static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean insert(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return true;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return true;
    }

    public boolean delete(int value) {

        if (head == null) {
            return false;
        }

        if (head.data == value) {
            head = head.next;
            return true;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data == value) {
                current.next = current.next.next;
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public boolean search(int value) {

        Node current = head;

        while (current != null) {

            if (current.data == value) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public void display() {

        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        System.out.println("----- Linked List -----");

        Node current = head;

        while (current != null) {

            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }
}