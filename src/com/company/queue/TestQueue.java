package com.company.queue;

public class TestQueue {

    public static void main(String[] args) {


        MyQueue myQueue = new MyQueue();

        System.out.println(myQueue.getSize());
        myQueue.enqueue("ahmed");
        myQueue.enqueue("mohamed");
        myQueue.enqueue("eslam");
        System.out.println(myQueue.getSize());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.getSize());
        System.out.println(myQueue.search(1));
        System.out.println(myQueue.containsElement("mohamed"));
        System.out.println(myQueue.containsElement("ahmed"));





    }
}
