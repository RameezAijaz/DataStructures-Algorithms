package com.dsa;

public class LinkedList {

    LLNode head, currentNode;

    public void addNode(int value){

        if(this.head == null){
            this.head = new LLNode(value);
            this.currentNode = this.head;
        }
        else {
            LLNode tmp = new LLNode(value);
            tmp.prev = this.currentNode;
            this.currentNode.next = tmp;
            this.currentNode = this.currentNode.next;
        }

    }

    public void deleteNodeFromStart(){
        if(this.head == null){
            return;
        }
        if(this.head.next == null){
            this.head = null;
            return;
        }

        this.head.next.prev = null;
        this.head = this.head.next;
    }
    public void deleteNodeFromEnd(){
        if(this.currentNode == null) {
            return;
        }
        if(this.currentNode.prev == null){
            this.currentNode = null;
            return;
        }
        this.currentNode.prev.next = null;
        this.currentNode = this.currentNode.prev;
    }
    public void traverseForward(){
        LLNode tmp = this.head;
        while (tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
    public void traverseBackward(){
        LLNode tmp = this.currentNode;
        while (tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.prev;
        }
    }
}

class LLNode {
    int value;
    LLNode next;
    LLNode prev;
    LLNode(int value){
        this.value = value;
    }
}