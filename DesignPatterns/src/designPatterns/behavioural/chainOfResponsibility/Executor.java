package designPatterns.behavioural.chainOfResponsibility;

public class Executor {

    public static void main(String[] args){
        RequestHandler whatsapp = new WhatsappHandlerImpl();
        RequestHandler phone = new PhoneNumberHandlerImpl(whatsapp);

        RequestHandler email = new EmailHandlerImpl(phone);
        email.handle(RequestType.WHATSAPP);
    }


}
