package com.dsa;

public class Queue {

    LinkedList linkedList = new LinkedList();

    public void enQueue(int value){
        linkedList.addNode(value);
    }

    public int deQueue(){
        int tmp = linkedList.head.value;
        linkedList.deleteNodeFromStart();
        return tmp;
    }
}
