package com.test.stacks.preDefinedStack;

import com.test.Lists.Employee;

public class stackMainClass {
    public static void main(String[] args) {
        Employee e1 = new Employee("honey","arora",123);
        Employee e2 = new Employee("jane","jones",234);
        Employee e3 = new Employee("john","doe",345);
        Employee e4 = new Employee("mary","smith",567);

        linkedListImplementingStack stack = new linkedListImplementingStack();
        stack.push(e1);
        stack.push(e2);
        stack.push(e3);
        stack.push(e4);
        stack.PrintStack();

        System.out.println(stack.peek());
        stack.PrintStack();
        stack.pop();
        stack.PrintStack();

    }
}
