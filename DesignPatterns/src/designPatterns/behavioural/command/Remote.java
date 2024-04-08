package designPatterns.behavioural.command;

public class Remote {

    private Command lightOnCommand;

    private Command lightOffCommand;

    public Remote(Command lightOnCommand, Command lightOffCommand){
        this.lightOffCommand = lightOffCommand;
        this.lightOnCommand = lightOnCommand;
    }

    public void lightOn(){
        lightOnCommand.execute();
    }

    public void lightOf(){
        lightOffCommand.execute();
    }
}
