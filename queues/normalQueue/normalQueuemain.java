package com.test.queues.normalQueue;
// add or (enqueue)
// remove or (dequeue)
// peek
// FIFO


import com.test.Lists.Employee;
// circular queue logic is added in the add method to avoid unneccesary size updation.
public class normalQueuemain {
    public static void main(String[] args) {
        Employee e1 = new Employee("honey","arora",123);
        Employee e2 = new Employee("jane","jones",234);
        Employee e3 = new Employee("john","doe",345);
        Employee e4 = new Employee("mary","smith",567);

        queueArrayWithCircularQueue queue = new queueArrayWithCircularQueue(4);
        queue.add(e1);
        queue.add(e2);
        queue.add(e3);
        queue.printQueue();
        queue.add(e4);
        queue.printQueue();
        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        System.out.println(queue.size());
        queue.printQueue();
        queue.add(e1);
        System.out.println(queue.size());
    }
}
