package com.learning;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int a;

    public void push(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            a++;
        } else {
            newNode.next = head;
            head = newNode;
            a++;
        }
    }

    public Node<E> search(E data) {
        Node<E> temp = head;
        Node<E> searchNode = null;
        while (temp == null) {
            System.out.println("empty Linked List");
}
