package com.dsa;

public class BinarySearchTree {

    Node root;

    public Node addNode(Node root, int value){
        if(root==null){
            return new Node(value);
        }

        if(root.value<value){
            root.right = addNode(root.right, value);
        }
        else {
            root.left = addNode(root.left, value);
        }

        return root;
    }
    public Node minNode(Node n){
        Node tmp = n;
        while (tmp.left != null){
            tmp=tmp.left;
        }
        return tmp;
    }
    public Node deleteNode(Node root, int value){
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
                Node tmp = minNode(root.right);
                root.value = tmp.value;
                root.right = deleteNode(root.right,root.value);

            }
        }
        return root;

    }

    public void preOreder(Node n){
        if(n==null)return;
        preOreder(n.left);
        System.out.println(n.value);
        preOreder(n.right);
    }

}

class Node{
    int value;
    Node left,right;

    Node(int value){
        this.value=value;
    }
}