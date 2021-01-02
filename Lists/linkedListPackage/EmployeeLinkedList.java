package com.test.Lists.linkedListPackage;

import com.test.Lists.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee emp) {
        EmployeeNode node = new EmployeeNode(emp);
        node.setNext(head);
        head = node;
        size++;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int getSize() {
        return size;
    }


    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current + " ");
            current = current.getNext();
        }
    }

    public EmployeeNode removeFromFront(){
        if (head==null) return null;
        else {
            EmployeeNode removenode = head;
            head = head.getNext();
            size--;
            removenode.setNext(null);  // this is just for formality
            return removenode;
        }
    }

}
