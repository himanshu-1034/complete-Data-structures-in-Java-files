package com.test.stacks.normalStack;
// abstract data type
// ideal backing data structure : linked list
// LIFO


import com.test.Lists.Employee;

public class stackMain {
    public static void main(String[] args) {

        arrayStack stack = new arrayStack(3);
        Employee e1 = new Employee("honey","arora",123);
        Employee e2 = new Employee("jane","jones",234);
        Employee e3 = new Employee("john","doe",345);
        Employee e4 = new Employee("mary","smith",567);
        stack.push(e1);
        stack.push(e2);
        stack.push(e3);

        stack.printStack();

        stack.pop();
        stack.printStack();

        System.out.println(stack.peek());
    }
}
