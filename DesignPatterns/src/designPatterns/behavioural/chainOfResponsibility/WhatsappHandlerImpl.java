package designPatterns.behavioural.chainOfResponsibility;

public class WhatsappHandlerImpl implements RequestHandler{

    RequestHandler handler;

    public WhatsappHandlerImpl(){
        handler = null;
    }
    @Override
    public void handle(RequestType requestType) {
        if(requestType.equals(RequestType.WHATSAPP)){
            System.out.println("Request is handled by Whatsapp handler");
        }
        else{
            System.out.println("Request can not be fullfilled.");
        }
    }
}
