package com.company.stack;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {
        MyStack testStack=new MyStack();
        System.out.println(testStack.getSize());
        testStack.push("ahmed");
        testStack.push("mohamed");
        testStack.push("eslam");
        testStack.push("ali");
        System.out.println(testStack.containsItem("ali"));
        System.out.println(testStack.getSize());
        System.out.println(testStack.pop());
        System.out.println(testStack.getSize());
        System.out.println(testStack.containsItem("ali"));

    }
}