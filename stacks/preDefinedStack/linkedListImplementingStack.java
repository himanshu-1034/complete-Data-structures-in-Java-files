package com.test.stacks.preDefinedStack;

import com.test.Lists.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedListImplementingStack {
    private LinkedList<Employee> stack;

   public linkedListImplementingStack(){
        stack = new LinkedList<Employee>();
    }
    public void push(Employee employee){
        stack.push(employee);
    }
    public Employee pop(){
        return stack.pop();
    }
    public Employee peek(){
        return stack.peek();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void PrintStack(){
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" <<>> ");
        System.out.println();
    }

}
