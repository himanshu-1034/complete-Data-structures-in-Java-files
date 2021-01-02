package com.test.queues.normalQueue;

import com.test.Lists.Employee;

import java.util.NoSuchElementException;

public class queueArrayWithCircularQueue {
    private Employee[] queue;
    private int front=0;
    private int rear=0;
    public queueArrayWithCircularQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        if (size()==queue.length-1){
            int numItems = size();
            Employee[] newarr = new Employee[queue.length*2];
            System.arraycopy(queue,front,newarr,0,queue.length-front);
            System.arraycopy(queue,0,newarr,queue.length-front,rear);

            queue = newarr;
            front=0;
            rear=numItems   ;
        }

        queue[rear] = employee;
        if (rear<queue.length-1) rear++;
        else rear=0;
    }

    public Employee remove(){
        if (size()==0) throw new NoSuchElementException();
        Employee employee = queue[front];
        queue[front] = null;
        front++;

        if (size()==0){
            rear=0;
            front=0;
        }

        else if(front==queue.length){
            front=0;
        }


        return employee;


    }
    public Employee peek(){
        if (size()==0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size(){
        if (front<=rear)
            return rear-front;
        else
            return rear-front+queue.length;
    }

    public void printQueue(){
        if (front<=rear){
            System.out.println("---------------------------------------------");
            for (int i=front;i<rear;i++){
                System.out.println(queue[i]);
            }
            System.out.println("---------------------------------------------");
        }
        else {
            System.out.println("---------------------------------------------");
            for (int i=front;i<queue.length;i++){
                System.out.println(queue[i]);
            }
            for (int i=0;i<rear;i++){
                System.out.println(queue[i]);
            }
            System.out.println("---------------------------------------------");
        }
    }

}
