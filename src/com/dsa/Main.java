package com.dsa;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.root = binarySearchTree.addNode(binarySearchTree.root, 6);
        binarySearchTree.root = binarySearchTree.addNode(binarySearchTree.root, 2);
        binarySearchTree.root = binarySearchTree.addNode(binarySearchTree.root, 5);
        binarySearchTree.root = binarySearchTree.addNode(binarySearchTree.root, 3);
        binarySearchTree.root = binarySearchTree.addNode(binarySearchTree.root, 1);
        binarySearchTree.preOreder(binarySearchTree.root);
        binarySearchTree.root = binarySearchTree.deleteNode(binarySearchTree.root, 6);
        binarySearchTree.preOreder(binarySearchTree.root);


        System.out.println("_____BUBBLE__SORT______");
        int[] tmp = new int[]{8,7,6,5,4,3,2,1};
        Sort.bubbleSort(tmp);

        for(int t:tmp){
            System.out.println(t);
        }

        System.out.println("_____INSERTION__SORT______");
        int[] tmp1 = new int[]{8,7,6,5,4,3,2,1};
        Sort.insertionSort(tmp1);

        for(int t:tmp1){
            System.out.println(t);
        }

        System.out.println("_____MERGE__SORT______");
        int[] tmp2 = new int[]{8,7,6,5,4,3,2,1};
        tmp2 = Sort.mergeSort(tmp2);

        for(int t:tmp2){
            System.out.println(t);
        }

        System.out.println("_____QUICK__SORT______");
        int[] tmp3 = new int[]{8,7,6,5,4,3,2,1};
        tmp3 = Sort.quickSort(tmp3);

        for(int t:tmp3){
            System.out.println(t);
        }

        System.out.println("_____COUNTING__SORT______");
        int[] tmp4 = new int[]{8,8,8,1,2,4,2,9};
        tmp4 = Sort.countingSort(tmp4);

        for(int t:tmp4){
            System.out.println(t);
        }

        System.out.println("_____BUCKET__SORT______");
        int[] tmp5 = new int[]{11,4,25,35,46,51,92,64,12,77,32,82};
        tmp5 = Sort.bucketSort(tmp5);

        for(int t:tmp5){
            System.out.println(t);
        }

        System.out.println("_____RADIX__SORT______");
        int[] tmp6 = new int[]{3, 100, 23, 123, 61, 24, 56};
        tmp6 = Sort.radixSort(tmp6);

        for(int t:tmp6){
            System.out.println(t);
        }

    }
}
