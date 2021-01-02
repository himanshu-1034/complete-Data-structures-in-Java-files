package com.test.Lists.preDefinedLinkedList;

import com.test.Lists.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListJDK {
    public static void main(String[] args) {
        Employee e1 = new Employee("honey","arora",123);
        Employee e2 = new Employee("jane","jones",234);
        Employee e3 = new Employee("john","doe",345);
        Employee e4 = new Employee("mary","smith",567);

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(e1);
        linkedList.addFirst(e2);
        linkedList.addFirst(e3);
        
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();
        
        linkedList.addLast(e4);


        for (Employee e:linkedList
             ) {
            System.out.println(e);
        }
        System.out.println();
        

    }
}
