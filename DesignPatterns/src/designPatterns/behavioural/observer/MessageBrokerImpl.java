package designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class MessageBrokerImpl implements MessageBroker{

    List<Consumer> consumers;

    public MessageBrokerImpl(){
        this.consumers = new ArrayList<>();
    }

    @Override
    public void addConsumer(Consumer consumer){
        if(!consumers.contains(consumer)){
            consumers.add(consumer);
        }
    }

    @Override
    public void removeConsumer(Consumer consumer){
        if(consumers.contains(consumer)){
            consumers.remove(consumer);
        }
    }

    @Override
    public void updateCosumer(String msg){
        for(Consumer consumer: consumers){
            consumer.notify(msg);
        }
    }
}
