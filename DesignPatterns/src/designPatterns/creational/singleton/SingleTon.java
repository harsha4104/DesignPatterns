package designPatterns.creational.singleton;

public class SingleTon {

    private static SingleTon instance;

    public static SingleTon getInstance() {
        if(instance == null) {
            synchronized (SingleTon.class) {
                // double locking is only useful when the piece of code is inside synchronised block
                // only one thread will access this block at a time if one thread already created the instance other thread will
                // be blocked by the inner if check. Also, the thread which don't executed the first will be directly go down
                // and returned the instance.
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }

//        if(instance == null){
//            Thread.sleep(1000);
//            instance = new SingleTon();
//        }

        return instance;
    }

    // other way to do the same thing. Just make the method synchronized
    public static synchronized SingleTon getInstanceSynchronized(){
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }

    private SingleTon(){

    }
}


