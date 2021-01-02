package com.test.stacks.normalStack;

import com.test.Lists.Employee;

import java.util.EmptyStackException;

public class arrayStack {

    private Employee[] stack;
    private int top=0;

    public arrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if (top==stack.length){
            // need to resize
            Employee[] newArray = new Employee[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;

        }
        stack[top++] = employee;

    }

    public Employee pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek(){
        if (isEmpty()) throw new EmptyStackException();
        return stack[top-1];
    }

    public int getSize(){
        return top;
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.print(stack[i]+"  <<>>  ");
        }
        System.out.println();

    }
    public boolean isEmpty(){
        return top==0;
    }
}
