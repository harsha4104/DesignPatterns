package designPatterns.behavioural.observer;

public class ConsumerImpl implements Consumer{

    String name;

    public ConsumerImpl(String name){
        this.name = name;
    }
    @Override
    public void notify(String msg) {
        System.out.println(name+" reads "+msg);
    }
}
