package com.company.queue;

public class MyQueue {
    Object[] data;
    int front;
    int end;

    public MyQueue() {
        this(1000);
    }

    public MyQueue(int queueSize) {
        this.front = -1;
        this.end = -1;
        this.data = new Object[queueSize];
    }

    // size
    public int getSize() {

        // if not element
        if (front == -1 && end == -1) {
            return 0;

        }
        // if there are element
        else {
            return this.end - this.front + 1;
        }

    }

    // enqueu
    public void enqueue(Object item) {

        if ((end + 1) % data.length == front) {
            throw new IllegalArgumentException("the Queue is Full . ");
        }
        // if not element on queue
        else if (getSize() == 0) {
            front=0;
            end=0;
            this.data[end] = item;
        }
        // if there are items
        else {
            end++;
            this.data[end] = item;
        }


    }

    // dequeu
    public Object dequeue() {
        Object item = null;
        if (getSize() == 0) {
            throw new IllegalArgumentException("There are no items .");
        }
        // if there are one element
        else if (front == end) {
            // return element first
            item = this.data[front];
            // set element == null
            this.data[front] = null;
            // decrese front and end
            front = -1;
            end = -1;
        } else {
            // return element
            item = this.data[front];
            // set element == null
            this.data[front] = null;
            // increase front
            front++;
        }
        return item;
    }

    // contains
    public boolean containsElement(Object item) {

        boolean found = false;

        if (getSize() == 0)
            return found;


        for (int i = front; i < end; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return found;
    }

    // search
    public Object search(int position) {

        if (getSize() == 0 || position > getSize())
            throw new IllegalArgumentException("No item in the queue or Position is greeter than index ");

        int truePosition = 0;
        for (int i = front; i <= end ; i++) {
            if (truePosition == position) {
                return data[i];
            }
            truePosition++;
        }


        throw new IllegalArgumentException("Cant get item position : " + position);

    }
}
