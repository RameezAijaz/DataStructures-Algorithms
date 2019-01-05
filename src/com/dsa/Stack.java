package com.dsa;

public class Stack {
    private LinkedList linkedList = new LinkedList();

    public void push(int value){
        this.linkedList.addNode(value);
    }

    public int pop(){
        if(isEmpty())
            return -1;
        int tmp = this.linkedList.currentNode.value;
        this.linkedList.deleteNodeFromEnd();
        return tmp;
    }

    public boolean isEmpty(){
        return this.linkedList.currentNode == null;
    }


}
