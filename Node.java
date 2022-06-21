package com.learning;

public class Node<E> {
    Node<E> next;
    E data;

    Node(E data){
        this.data = data;
    }
}
