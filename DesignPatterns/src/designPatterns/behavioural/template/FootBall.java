package designPatterns.behavioural.template;

public class FootBall extends Game{
    @Override
    public void initialize() {
        System.out.println("FootBall is initialized.");
    }

    @Override
    public void startPlay() {
        System.out.println("FootBall is being played.");
    }

    @Override
    public void endPlay() {
        System.out.println("FootBall is being ended.");
    }
}
