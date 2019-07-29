package com.company.linkedList;

public class TrainLinkedList {

    MyLinkedList myLinkedList = new MyLinkedList();

    public static void main(String[] args) {
        TrainLinkedList initiateTrain = new TrainLinkedList();
        initiateTrain.initiateTrain();

        initiateTrain.firstStop();
        initiateTrain.secondStop();

    }


    // initiate Train
    public void initiateTrain() {

        // init all car Objects
        trainCar trainCar1 = new trainCar(CarType.BOx, "trainCar1");
        trainCar trainCar2 = new trainCar(CarType.BOx, "trainCar2");
        trainCar trainCar3 = new trainCar(CarType.BOx, "trainCar3");
        trainCar trainCar4 = new trainCar(CarType.BOx, "trainCar4");
        trainCar trainCar5 = new trainCar(CarType.BOx, "trainCar5");
        trainCar trainCar6 = new trainCar(CarType.BOx, "trainCar6");
        trainCar trainCar7 = new trainCar(CarType.BOx, "trainCar7");
        trainCar trainCar8 = new trainCar(CarType.BOx, "trainCar8");
        trainCar trainCar9 = new trainCar(CarType.BOx, "trainCar9");
        trainCar trainCar10 = new trainCar(CarType.BOx, "trainCar10");

        // put to Linked List
        myLinkedList.addItem(trainCar1);
        myLinkedList.addItem(trainCar2);
        myLinkedList.addItem(trainCar3);
        myLinkedList.addItem(trainCar4);
        myLinkedList.addItem(trainCar5);
        myLinkedList.addItem(trainCar6);
        myLinkedList.addItem(trainCar7);
        myLinkedList.addItem(trainCar8);
        myLinkedList.addItem(trainCar9);
        myLinkedList.addItem(trainCar10);

        //get size
        System.out.println("Size is : " + myLinkedList.getSize());

        // get by Item
        trainCar o = (trainCar) myLinkedList.get(3);
        System.out.println("Item 3 :  " + o.toString());
        // find By Item
        int i = myLinkedList.find(o);
        System.out.println("Positioon is : " + i);


        System.out.println("Successfully added to List ");
    }


    // first Stop
    public void firstStop() {

        // remove from trains
        Object remove = myLinkedList.remove();

        System.out.println("Removed Item : " + remove.toString());
        // add to train again
        trainCar trainCar = new trainCar(CarType.carBed, "car Edited 1 ");
        myLinkedList.addItem(trainCar);
        System.out.println("List : " + myLinkedList.toString());

    }

    // second stop
    public void secondStop() {
        Object o = myLinkedList.removeAt(5);

        System.out.println("the size is : " + myLinkedList.getSize());


        // add item to 5
        trainCar trainCar=new trainCar(CarType.carNormal , "Trsin Edit 5 ") ;

        myLinkedList.addItem(trainCar);
        System.out.println("List : " + myLinkedList.toString());

    }

    class trainCar {


        CarType type;
        String content;

        public trainCar(CarType type, String content) {
            this.type = type;
            this.content = content;
        }

        @Override
        public String toString() {
            return "trainCar{" +
                    "type=" + type +
                    ", content='" + content + '\'' +
                    '}';
        }
    }

    enum CarType {
        BOx, carBed, carNormal;

    }
}
