package designPatterns.behavioural.chainOfResponsibility;

public class EmailHandlerImpl implements RequestHandler{

    RequestHandler handler;

    public EmailHandlerImpl(RequestHandler handler){
        this.handler = handler;
    }
    @Override
    public void handle(RequestType requestType) {
        if(requestType.equals(RequestType.EMAIL)){
            System.out.println("Request is handled by email handler");
            return;
        }

        handler.handle(requestType);
    }
}
