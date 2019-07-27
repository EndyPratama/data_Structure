package com.company.stack;

import java.util.Stack;

// lifo - > Last In First out
public class MyStack {
    Object[] data;
    int stackSize;

    // constructor
    public MyStack() {
        // stack Size
        stackSize = 0;
        // init stack Object
        this.data = new Object[1000];

    }

    // push
    public void push(Object item) {

        // add item to stack
        this.data[stackSize++] = item;

    }

    // pop
    public Object pop() {
        if (stackSize == 0) {
            throw new IllegalArgumentException("Not Items in Stack ");

        }
        // return last Item
        return this.data[--stackSize];

    }

    // search
    public Object search(Object item) {

        while (stackSize> 0 ){

            Object o = pop();
            if (o.equals(item))
                return o;

        }

        throw new IllegalArgumentException("Item not Found : "+ item);

    }

    // contains
    public boolean containsItem(Object item) {

        boolean found = false;

        for (int i = 0; i < stackSize; i++) {
            if (this.data[i].equals(item)) {
                found = true;
                break;
            }

        }

        return found;

    }

    // size
    public int getSize() {
        // return size of array
        return this.stackSize;

    }


}
