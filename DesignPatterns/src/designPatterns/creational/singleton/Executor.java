package designPatterns.creational.singleton;

import designPatterns.creational.singleton.SingleTon;

public class Executor {

    public static void main(String[] args){

        Runnable createSingleTon = ()->{
            SingleTon instance = SingleTon.getInstance();
            System.out.println(instance);
        };
        Thread t1 = new Thread(createSingleTon);
        Thread t2 = new Thread(createSingleTon);

        t1.start();
        t2.start();
    }
}
