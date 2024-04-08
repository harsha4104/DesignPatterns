package designPatterns.behavioural.observer;

public interface MessageBroker {

    void addConsumer(Consumer consumer);

    void removeConsumer(Consumer consumer);

    void updateCosumer(String msg);
}
