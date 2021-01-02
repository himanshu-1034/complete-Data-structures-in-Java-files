package com.test.Lists.doublyLinkedList;


import com.test.Lists.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private int size;
    private EmployeeNode tail;

    public void addToFront(Employee emp) {
        EmployeeNode node = new EmployeeNode(emp);


        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;

    }

    public boolean isEmpty() {
        return head == null;
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

    public EmployeeNode removeFromFront() {
        if (head == null) return null;
        else {
            EmployeeNode removenode = head;

            if (head.getNext() == null) {
                tail = null;
            } else {
                head.getNext().setPrevious(null);
            }

            head = head.getNext();
            size--;
            removenode.setNext(null);  // this is just for formality
            return removenode;
        }
    }

    public EmployeeNode removeFromLast() {
        if (isEmpty()) return null;
        EmployeeNode removenode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);

        }
        tail = tail.getPrevious();
        removenode.setPrevious(null);

        size--;

        return removenode;
    }

    public boolean addBefore(Employee newEmp, Employee oldEmp) {

        if (head==null) return false;

        EmployeeNode newempnode = new EmployeeNode(newEmp);
        //EmployeeNode oldempnode = new EmployeeNode(oldEmp);
        EmployeeNode current = head;

        while (current!=null && !current.getEmployee().equals(oldEmp)){
            current=current.getNext();
        }
        if (current==null) return false;

        newempnode.setNext(current);
        newempnode.setPrevious(current.getPrevious());
        current.setPrevious(newempnode);

        if (head==current)
        {   head = newempnode;}
        else {
            newempnode.getPrevious().setNext(newempnode);
        }
        size++;
        return true;





        // below code works if you are sure that oldemployee already exists in the list.
//        if (oldempnode == head) {
//            newempnode.setNext(head);
//            head.setPrevious(newempnode);
//            head = newempnode;
//
//            size++;
//            return true;
//
//        } else if (oldempnode == tail) {
//            newempnode.setNext(tail);
//            newempnode.setPrevious(tail.getPrevious());
//            tail.getPrevious().setNext(newempnode);
//            tail.setPrevious(newempnode);
//
//            size++;
//            return true;
//        }
//        else{
//            newempnode.setNext(oldempnode);
//            newempnode.setPrevious(oldempnode.getPrevious());
//            oldempnode.getPrevious().setNext(newempnode);
//            oldempnode.setPrevious(newempnode);
//            size++;
//            return true;
//
//        }
    }
}

