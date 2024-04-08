package designPatterns.behavioural.command;

public class Executor {

    public static void main(String[] args){

        Light light = new LightImpl();

        Command on = new LightOnCommand(light);
        Command off = new LightOffCommand(light);

        Remote remote = new Remote(on, off);

        remote.lightOn();

        remote.lightOf();
    }
}
