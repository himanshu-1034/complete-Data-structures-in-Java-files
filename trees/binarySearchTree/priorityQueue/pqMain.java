package com.test.trees.binarySearchTree.priorityQueue;

import java.util.PriorityQueue;

public class pqMain {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(25);
        pq.add(26);
        pq.add(-12);
        pq.add(-1234);
        pq.add(4356);
        // priority queue is the class implementing min heaps. it means it is a complete treee with minimum value as its root or first element.

        Object[] arrHeap = pq.toArray();
        for (Object num:arrHeap){
            System.out.print(num+"   ");
        }
        System.out.println();

        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());


        // poll and remove are basically the same.


    }
}
