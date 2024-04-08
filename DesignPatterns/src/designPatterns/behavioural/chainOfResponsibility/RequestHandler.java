package designPatterns.behavioural.chainOfResponsibility;

public interface RequestHandler {

    public void handle(RequestType requestType);
}
