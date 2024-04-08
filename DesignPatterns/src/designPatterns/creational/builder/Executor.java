package designPatterns.creational.builder;

public class Executor {

    public static void main(String[] args){

        Chair chair = new Chair.ChairBuilder()
                .withlegs(4)
                .withSeat("Soft")
                .isWheels(true)
                .withWheels(8)
                .canAdjust(false)
                .canRotate(false)
                .build();


        System.out.println(chair.getLegs());
        System.out.println(chair.getSeat());
        System.out.println(chair.isWheels());
        System.out.println(chair.getWheels());

    }
}
