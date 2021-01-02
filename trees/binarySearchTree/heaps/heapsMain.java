package com.test.trees.binarySearchTree.heaps;

// left child = 2(index of array)+1;
// right child = 2(index)+ 2;
// if value is indexoutofbounds then child is null.
// parent of child = floor((i-1)/2)
// if value is null or -1  then the node is root node and root node has no parent.



public class heapsMain {
    public static void main(String[] args) {
        heapsClass heap = new heapsClass(10);
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

        heap.delete(1);
        heap.printHeap();

        System.out.println();
        heap.sortHeap();
        heap.printHeap();

    }
}
