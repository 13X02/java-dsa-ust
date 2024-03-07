package Assignment_Course_1;

import java.util.Arrays;
import java.util.LinkedList;

public class CollectionDemo {
    public static void main(String[] args) {
        // Arrays
        System.out.println("Arrays:");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = i + 1;
        }
        System.out.println("Array elements: " + Arrays.toString(array));

        // Linked List
        System.out.println("\nLinked List:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            linkedList.add(i);
        }
        System.out.print("Linked list elements: ");
        for (int num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Doubly Linked List
        System.out.println("\nDoubly Linked List:");
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        for (int i = 1; i <= 5; i++) {
            doublyLinkedList.add(i);
        }
        System.out.print("Doubly linked list elements: ");
        doublyLinkedList.printList();

        // Circular Linked List
        System.out.println("\nCircular Linked List:");
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        for (int i = 1; i <= 5; i++) {
            circularLinkedList.add(i);
        }
        System.out.print("Circular linked list elements: ");
        circularLinkedList.printList();
    }
}

class DoublyLinkedList<T> {
    Node<T> head;

    static class Node<T> {
        T data;
        Node<T> prev, next;

        Node(T d) {
            data = d;
            prev = next = null;
       }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class CircularLinkedList<T> {
    Node<T> head;

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T d) {
            data = d;
            next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node<T> temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void printList() {
        if (head == null)
            return;
        Node<T> temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
