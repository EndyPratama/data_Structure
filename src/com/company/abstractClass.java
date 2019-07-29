package com.company;

public abstract class abstractClass {
    abstract void printStatus();//no method body and abstract

}

class Test extends abstractClass {
    @Override
    void printStatus() {

        System.out.println("status : ");
    }
}
