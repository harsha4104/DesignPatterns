package designPatterns.creational.abstractFactory;

public class PCFactory implements ComputerAbstractFactory{

    String cpu;
    String ram;

    public PCFactory(String ram, String cpu){
        this.ram = ram;
        this.cpu = cpu;
    }
    @Override
    public Computer createComputer() {
        return new PCComputer(cpu, ram);
    }
}
