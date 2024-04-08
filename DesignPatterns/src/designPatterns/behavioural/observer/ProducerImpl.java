package designPatterns.behavioural.observer;

public class ProducerImpl implements Producer{

    MessageBroker messageBroker;

    public ProducerImpl(MessageBroker messageBroker){
        this.messageBroker = messageBroker;
    }
    @Override
    public void notify(String msg) {
        messageBroker.updateCosumer(msg);
    }
}
