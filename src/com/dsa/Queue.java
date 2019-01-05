package com.dsa;

public class Queue {

    private LinkedList linkedList = new LinkedList();

    public void enQueue(int value){
        linkedList.addNode(value);
    }

    public int deQueue(){
        if(isEmpty()) return -1;
        int tmp = linkedList.head.value;
        linkedList.deleteNodeFromStart();
        return tmp;
    }

    public boolean isEmpty() {
        return linkedList.head == null;
    }
}
