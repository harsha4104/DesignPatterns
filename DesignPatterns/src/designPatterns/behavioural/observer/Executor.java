package designPatterns.behavioural.observer;

public class Executor {

    public static void main(String[] args){
        MessageBroker messageBroker = new MessageBrokerImpl();
        Producer producer = new ProducerImpl(messageBroker);
        Consumer consumer = new ConsumerImpl("Harsh");
        messageBroker.addConsumer(consumer);
        consumer = new ConsumerImpl("Jay");
        messageBroker.addConsumer(consumer);
        consumer = new ConsumerImpl("Deeksha");
        messageBroker.addConsumer(consumer);

        producer.notify("Hi, This is the message");

        messageBroker.removeConsumer(consumer);

        producer.notify("Hi, This is the second message");
    }
}
