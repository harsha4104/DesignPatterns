package designPatterns.behavioural.template;

public class Cricket extends Game{
    @Override
    public void initialize() {
        System.out.println("Cricket is initialize.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket is being played.");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket is being ended.");
    }
}
