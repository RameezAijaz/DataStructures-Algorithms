package com.dsa;

public class Heap {
    int maxSize, size=0;
    int[] heapArray;

    Heap(int maxSize){
        this.maxSize = maxSize;
        this.heapArray = new int[maxSize+1];
    }

    public boolean isEmpty(){
        return this.size==0;
    }
    public boolean isFull(){
        return this.size == this.maxSize;
    }
    public boolean isLeaf(int i){
        return (i>=size/2) && (i<=size);
    }
    public int getParent(int i){
        return i/2;
    }
    public int getLeft(int i){
        return (2*i);
    }
    public int getRight(int i){
        return (2*i) + 1;
    }
    public int getMin(){
        if(isEmpty()) return -1;
        return this.heapArray[0];
    }

    public void addNode(int value){
        if(isFull())
            return;

        this.heapArray[this.size++] = value;
        heapifyUp(this.size-1);
    }
    public void deleteNode(int ind){
        if(isEmpty())
            return;

        this.heapArray[ind] = this.heapArray[--this.size];
        heapifyDown(ind);
    }

    public void heapifyUp(int index){

        while (index > 0 && this.heapArray[getParent(index)] > this.heapArray[index]){
            Utility.swap(this.heapArray, getParent(index), index);
            index = getParent(index);

        }


    }

    public void heapifyDown(int index){

        while (!isLeaf(index) && (this.heapArray[index]>this.heapArray[getLeft(index)] || this.heapArray[index]>this.heapArray[getRight(index)])){

            if(this.heapArray[getRight(index)] > this.heapArray[getLeft(index)]){

                Utility.swap(this.heapArray, getLeft(index), index);
                index = getLeft(index);
            }
            else {

                Utility.swap(this.heapArray, getRight(index), index);
                index = getRight(index);

            }



        }


    }
}
