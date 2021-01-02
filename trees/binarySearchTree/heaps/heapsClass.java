package com.test.trees.binarySearchTree.heaps;

public class heapsClass {
    private int[] maxHeap;
    private int size=0;
    public heapsClass(int capacity){
        maxHeap = new int[capacity];

    }

    public boolean isFull(){
        return size==maxHeap.length;
    }

    public int getParent(int index){
        return (index-1)/2;
    }

    public void insert(int val){
        if (isFull())
            throw new IndexOutOfBoundsException();

        maxHeap[size] = val;
        fixHeapAbove(size);
        size++;
    }

    private void fixHeapAbove(int index){
        int newVal = maxHeap[index];
        while (index>0 &&newVal>maxHeap[getParent(index)]){
            maxHeap[index] = maxHeap[getParent(index)];
            index = getParent(index);
        }

        maxHeap[index] = newVal;
    }

    public int delete(int index){
        if (isEmpty())
            throw new IndexOutOfBoundsException("Heap Is Empty");

        int parentIndex = getParent(index);
        int deletedValue = maxHeap[index];
        maxHeap[index] = maxHeap[size-1];

        if (index==0|| maxHeap[index]<maxHeap[parentIndex]){
            fixHeapBelow(index,size-1);
        }

        else {
            fixHeapAbove(index);
        }
        size--;

        return deletedValue;

    }

    public int peek(){
        if (isEmpty())
            throw new IndexOutOfBoundsException("EMPTY HEAP");
        return maxHeap[0];
    }


    public void printHeap(){
        System.out.println("----------------------------------------");
        for (int i=0;i<size;i++){
            System.out.print(maxHeap[i]+"   ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");
    }

    private void fixHeapBelow(int index,int lastheapindex){

        int childToSwap;

        while (index<=lastheapindex){
            int leftchild = getChild(index,true);
            int rightchild = getChild(index,false);

            if (leftchild<=lastheapindex){
                if (rightchild>lastheapindex){
                    childToSwap = leftchild;
                }
                else {
                    childToSwap = maxHeap[leftchild] > maxHeap[rightchild] ? leftchild: rightchild;
                }


                if (maxHeap[index] < maxHeap[childToSwap]){
                    int temp = maxHeap[index];
                    maxHeap[index] = maxHeap[childToSwap];
                    maxHeap[childToSwap] = temp;
                }
                else
                    break;

                index = childToSwap;

            }
            else {
                break;
            }


        }

    }

    // logic here is that the first element of maxheap will swap with lastelement index and then we heapify the heap leaving the last element
    // this will make second largest element to come in the place of root and then we repeat the steps to swap it with second last element and the process goes on.
    public void sortHeap(){
        int lastheapindex = size-1;
        for (int i = 0; i < lastheapindex; i++) {
            int temp = maxHeap[0];
            maxHeap[0] = maxHeap[lastheapindex-i];
            maxHeap[lastheapindex-i] = temp;

            fixHeapBelow(0,lastheapindex-i-1);

        }
    }


    public boolean isEmpty(){
        return size==0;
    }

    public int getChild(int index,boolean left){
        return 2*(index) + (left?1:2);
    }

}
