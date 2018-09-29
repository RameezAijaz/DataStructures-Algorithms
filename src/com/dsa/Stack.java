package com.dsa;

public class Stack {
    LinkedList linkedList = new LinkedList();

    public void push(int value){
        this.linkedList.addNode(value);
    }

    public int pop(){
        int tmp = this.linkedList.currentNode.value;
        this.linkedList.deleteNodeFromEnd();
        return tmp;
    }


}
