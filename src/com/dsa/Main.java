package com.dsa;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("_____BINARY_TREE______");
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.root = binarySearchTree.addNode(binarySearchTree.root, 6);
        binarySearchTree.root = binarySearchTree.addNode(binarySearchTree.root, 2);
        binarySearchTree.root = binarySearchTree.addNode(binarySearchTree.root, 5);
        binarySearchTree.root = binarySearchTree.addNode(binarySearchTree.root, 3);
        binarySearchTree.root = binarySearchTree.addNode(binarySearchTree.root, 1);
        binarySearchTree.preOreder(binarySearchTree.root);
        binarySearchTree.root = binarySearchTree.deleteNode(binarySearchTree.root, 6);


        binarySearchTree.preOreder(binarySearchTree.root);


        System.out.println("_____LINKED_LIST______");
        LinkedList linkedList = new LinkedList();
        for(int i=0; i<10; i++){
            linkedList.addNode(i);
        }

        System.out.println("__TRAVERSE_FORWARD____");
        linkedList.traverseForward();
        System.out.println("__DELETE_FROM_START____");
        linkedList.deleteNodeFromStart();
        System.out.println("__TRAVERSE_FORWARD____");
        linkedList.traverseForward();

        System.out.println("__TRAVERSE_BACKWARD____");
        linkedList.traverseBackward();
        System.out.println("__DELETE_FROM_END____");
        linkedList.deleteNodeFromEnd();
        System.out.println("__TRAVERSE_BACKWARD____");
        linkedList.traverseBackward();


        System.out.println("_____QUEUE______");
        Queue queue = new Queue();
        for(int i=0; i<10; i++){
            queue.enQueue(i);
        }

        System.out.println("__DEQUEUE____");

        for(int i=0; i<10; i++){
            System.out.println(queue.deQueue());
        }


        System.out.println("_____STACK_____");
        Stack stack = new Stack();
        for(int i=0; i<10; i++){
            stack.push(i);
        }

        System.out.println("__POP____");
        for(int i=0; i<10; i++){
            System.out.println(stack.pop());
        }



        System.out.println("_____MIN_HEAP______");
        Heap heap = new Heap(10);

        heap.addNode(9);
        heap.addNode(8);
        heap.addNode(7);
        heap.addNode(6);
        heap.addNode(5);
        heap.addNode(4);
        heap.addNode(3);
        heap.addNode(2);
        heap.addNode(1);
        heap.addNode(0);


        for(int i=0; i<10; i++){
            heap.addNode(9-i);
        }
        for(int i=0; i<10; i++){
            System.out.println(heap.getMin());
            heap.deleteNode(0);
        }



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
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        int[] shrtPath = ShortestPath.Dijkstra(graph, 0);
        System.out.println("__________________________SHORTEST PATH_____________________________________");
        for(int i=0; i<shrtPath.length; i++){
            System.out.println(i+" -->  "+shrtPath[i]);
        }

    }
}
