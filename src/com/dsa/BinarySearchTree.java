package com.dsa;

public class BinarySearchTree {

    BSTNode root;

    public BSTNode addNode(BSTNode root, int value){
        if(root==null){
            return new BSTNode(value);
        }

        if(root.value<value){
            root.right = addNode(root.right, value);
        }
        else {
            root.left = addNode(root.left, value);
        }

        return root;
    }
    public BSTNode minNode(BSTNode n){
        BSTNode tmp = n;
        while (tmp.left != null){
            tmp=tmp.left;
        }
        return tmp;
    }
    public BSTNode deleteNode(BSTNode root, int value){
        if(root == null){
            return root;
        }

        if(root.value<value){
            root.right = deleteNode(root.right, value);
        }
        else if(root.value>value){
            root.left = deleteNode(root.left, value);
        }
        else {
            if(root.left==null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else {
                BSTNode tmp = minNode(root.right);
                root.value = tmp.value;
                root.right = deleteNode(root.right,root.value);

            }
        }
        return root;

    }

    public void preOreder(BSTNode n){
        if(n==null)return;
        preOreder(n.left);
        System.out.println(n.value);
        preOreder(n.right);
    }

}

class BSTNode{
    int value;
    BSTNode left,right;
    BSTNode(int value){
        this.value=value;
    }
}