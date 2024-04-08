package designPatterns.creational.abstractFactory;

public class Executor {


    public static void main(String[] args){

        Computer pc = ComputerFactory.getComputer(new PCFactory("2Gz", "4GB"));

        Computer server = ComputerFactory.getComputer(new ServerFactory("4Gz", "32GB"));

        System.out.println(pc.getClass());
        System.out.println(server.getClass());
    }
}
