package designPatterns.creational.abstractFactory;

public class Computer {

    private String cpu;

    private String ram;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
}
