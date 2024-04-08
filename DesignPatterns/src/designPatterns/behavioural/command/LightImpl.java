package designPatterns.behavioural.command;

public class LightImpl implements Light{

    public boolean light;
    @Override
    public void lightOn() {
        light = true;
        System.out.println("Light On");
    }

    @Override
    public void lightOff() {
        light = false;
        System.out.println("Light off");
    }
}
