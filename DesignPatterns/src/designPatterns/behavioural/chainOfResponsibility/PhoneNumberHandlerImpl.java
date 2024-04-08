package designPatterns.behavioural.chainOfResponsibility;

public class PhoneNumberHandlerImpl implements RequestHandler{

    RequestHandler handler;

    public PhoneNumberHandlerImpl(RequestHandler handler){
        this.handler = handler;
    }
    @Override
    public void handle(RequestType requestType) {
        if(requestType.equals(RequestType.PHONE)){
            System.out.println("Request is handled by the phone handler");
            return;
        }
        handler.handle(requestType);

    }
}
