package com.test.stacks.stackChallenge;


import java.util.EmptyStackException;

public class stackClass{
    private char[] stack;
    private int top=0;

    public stackClass(int capacity){
        stack = new char[capacity];
    }

    public void push(char employee){
        if (top==stack.length){
            // need to resize
            char[] newArray = new char[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;

        }
        stack[top++] = employee;

    }

    public char pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        char employee = stack[--top];
        return employee;
    }



    public int getSize(){
        return top;
    }


    public boolean isEmpty(){
        return top==0;
    }
}
