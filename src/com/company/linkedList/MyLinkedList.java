package com.company.linkedList;

import java.util.LinkedList;

public class MyLinkedList {
    Node first;
    Node last;
    int listSize;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.listSize = 0;
    }

    // add to last of  list
    public void addItem(Object item) {
        // if there are not items add element to first and last = first
        if (first == null) {
            this.first = new Node(item);
            this.last = this.first;

        }
        // otherwise , we want to update last value
        else {
            Node itemNode = new Node(item);
            this.last.setNextElement(itemNode);
            this.last = itemNode;

        }
        // inrement List Size
        listSize++;

    }

    // remove
    public Object remove() {
        // if element == null throw exception
        if (first == null)
            throw new IllegalArgumentException("List is Empty ");
        // get first element that will bw deleted
        Object itemNode = first.getItem();
        // set first element to next first Item
        this.first = first.getNextElement();

        // decrease list element
        listSize--;

        return itemNode;

    }

    // insert
    public void insert(Object item, int position) {
        if (getSize() < position)
            throw new IllegalArgumentException("The LinkedList Is smaller than position ");


        // set current node = first then iterate to reach posotion current Node
        Node currentNode = first;
        // get current of position Item
        for (int i = 1; i < position & currentNode != null; i++) {
            currentNode = currentNode.getNextElement();

        }

        // set current node = new Node
        // init new Node
        Node newNode = new Node(item);
        // get next Node Of current Node
        Node nextNode = currentNode.getNextElement();
        // set new Node Next = next Current Node
        newNode.setNextElement(nextNode);
        // set current node Next = new Node
        currentNode.setNextElement(newNode);

        // increase number Of element
        listSize++;


    }

    public Object removeAt(int position) {
        if (getSize() < position)
            throw new IllegalArgumentException("The LinkedList Is smaller than position to Delete  ");

        // current Item
        Node currentNode = first;
        // previous item
        Node prevNode = first;

        // prev = current
        // current = current next
        for (int i = 1; i < position & currentNode != null; i++) {
            prevNode = currentNode;
            currentNode = currentNode.getNextElement();
        }


        // get item will be deleted
        Object item = currentNode.getItem();

        // set prev next item = current next
        prevNode.setNextElement(currentNode.getNextElement());

        // decrease list count
        listSize--;

        return item;

    }

    // get element by position
    public Object get(int position) {
        if (first == null)
            throw new IllegalArgumentException("The List Is empty To get any Element ");
        // set current = first
        Node currentNode = first;
        // loop on all items to get item position
        for (int i = 1; i < getSize() & currentNode != null; i++) {
            // if pointer = position
            if (i == position)
                return currentNode.getItem();

            currentNode = currentNode.getNextElement();
        }
        // if not found return null
        return null;

    }

    // get element by position
    public int find(Object item) {
        if (first == null)
            throw new IllegalArgumentException("The List Is empty To get any Element ");
        // set current = first
        Node currentNode = first;
        // loop on all items to get item position
        for (int i = 1; i < getSize() & currentNode != null; i++) {
            // if item = current Node Item
            if (item.equals(currentNode.getItem()))
                return i;

            currentNode = currentNode.getNextElement();
        }
        // if not found return -1
        return -1;
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();

        Node currentNode = first;
        while (currentNode != null) {

            stringBuffer.append(currentNode.getItem());
            currentNode = currentNode.getNextElement();

            if (currentNode != null) {
                stringBuffer.append(" , ");

            }
        }

        return stringBuffer.toString();
    }

    // size
    public int getSize() {
        return listSize;
    }


    // Node class For LinkedList
    class Node {
        Node nextElement;
        Object item;

        public Node(Object item) {
            this.nextElement = null;
            this.item = item;
        }

        public Node getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node nextElement) {
            this.nextElement = nextElement;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }
    }
}
