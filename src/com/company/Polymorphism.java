package com.company;


interface printaple {


}

class A implements printaple {
    public void print() {

        System.out.println("print A ");
    }


}

class b implements printaple {
    public void print() {

        System.out.println("print B ");
    }


}

public class Polymorphism {

    public void invoke(printaple p) {
        if (p instanceof A) {

            A a = (A) p;
            a.print();
        }
        if (p instanceof b) {

            b a = (b) p;
            a.print();
        }


    }

    public static void main(String[] args) {
        Polymorphism polymorphism=new Polymorphism();
        polymorphism.invoke(new A());
        polymorphism.invoke(new b());
    }


}
