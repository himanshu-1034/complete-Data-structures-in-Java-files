package com.test.Lists.doublyLinkedList;
// each item has a previous and next function
// the list has a head and a tail.


import com.test.Lists.Employee;

public class doublyLinkedListClass {
    public static void main(String[] args) {
        Employee e1 = new Employee("honey","arora",123);
        Employee e2 = new Employee("jane","jones",234);
        Employee e3 = new Employee("john","doe",345);
        Employee e4 = new Employee("mary","smith",567);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(e1);
//        list.addToFront(e2);
        list.addToFront(e3);
        list.addToFront(e4);

        list.printList();

        list.addToEnd(e2);
        System.out.println();
        list.printList();
        System.out.println();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.removeFromLast();
        list.printList();
        System.out.println();
        System.out.println(list.getSize());



    }
}
