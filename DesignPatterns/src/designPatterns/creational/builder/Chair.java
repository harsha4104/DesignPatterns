package designPatterns.creational.builder;

public class Chair {

    private int legs;

    private String seat;

    private boolean isWheels;

    private int wheels;

    private boolean canRotate;

    private boolean canAdjust;

    public int getLegs() {
        return legs;
    }

    private void setLegs(int legs) {
        this.legs = legs;
    }

    public String getSeat() {
        return seat;
    }

    private void setSeat(String seat) {
        this.seat = seat;
    }

    public boolean isWheels() {
        return isWheels;
    }

    private void setWheels(boolean wheels) {
        isWheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    private void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isCanRotate() {
        return canRotate;
    }

    private void setCanRotate(boolean canRotate) {
        this.canRotate = canRotate;
    }

    public boolean isCanAdjust() {
        return canAdjust;
    }

    private void setCanAdjust(boolean canAdjust) {
        this.canAdjust = canAdjust;
    }

    private Chair(ChairBuilder chairBuilder){
        this.legs = chairBuilder.legs;
        this.seat = chairBuilder.seat;
        this.isWheels = chairBuilder.isWheels;
        this.wheels = chairBuilder.wheels;
        this.canAdjust = chairBuilder.canAdjust;
        this.canRotate = chairBuilder.canRotate;
    }

    static class ChairBuilder{

        private int legs;

        private String seat;

        private boolean isWheels;

        private int wheels;

        private boolean canRotate;

        private boolean canAdjust;

        public ChairBuilder withlegs(int legs){
            this.legs = legs;
            return this;
        }

        public ChairBuilder withSeat(String seat){
            this.seat = seat;
            return this;
        }

        public ChairBuilder isWheels(boolean isWheels){
            this.isWheels = isWheels;
            return this;
        }

        public ChairBuilder canRotate(boolean canRotate){
            this.canRotate = canRotate;
            return this;
        }

        public ChairBuilder canAdjust(boolean canAdjust){
            this.canAdjust = canAdjust;
            return this;
        }

        public ChairBuilder withWheels(int wheels){
            this.wheels = wheels;
            return this;
        }

        public Chair build(){
            return new Chair(this);
        }
    }
}
