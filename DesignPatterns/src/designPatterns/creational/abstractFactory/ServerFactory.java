package designPatterns.creational.abstractFactory;

public class ServerFactory implements ComputerAbstractFactory{

    String cpu;

    String ram;

    public ServerFactory(String cpu, String ram){
        this.cpu = cpu;
        this.ram = ram;
    }
    @Override
    public Computer createComputer() {
        return new ServerComputer(cpu, ram);
    }
}
