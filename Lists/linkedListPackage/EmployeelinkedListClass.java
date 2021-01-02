package com.test.Lists.linkedListPackage;

// each item in the list is called a node
// the first item in the list is called the head of the list.

import com.test.Lists.Employee;

public class EmployeelinkedListClass {
    public static void main(String[] args) {

        Employee e1 = new Employee("honey","arora",123);
        Employee e2 = new Employee("jane","jones",234);
        Employee e3 = new Employee("john","doe",345);
        Employee e4 = new Employee("mary","smith",567);



        EmployeeLinkedList linkedList = new EmployeeLinkedList();
        linkedList.addToFront(e1);
        linkedList.addToFront(e2);
        linkedList.addToFront(e3);
        linkedList.addToFront(e4);


        linkedList.printList();
        System.out.println();
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.isEmpty());

       EmployeeNode w = linkedList.removeFromFront();
        System.out.println(linkedList.getSize());
        linkedList.printList();
        System.out.println();
        System.out.println(w);




    }
}
