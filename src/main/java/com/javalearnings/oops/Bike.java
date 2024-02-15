package com.javalearnings.oops;

abstract class Bike {
    public abstract void on();

    public abstract void off();

}
class YamahaBike extends Bike {
    public void on() {
        System.out.println("on YamahaBike");

    }

    @Override
    public void off() {
        System.out.println("off YamahaBike");
    }
}
    class DukeBike extends Bike {
        @Override
        public void on() {
            System.out.println("on DukeBike");
        }

        @Override
        public void off() {
            System.out.println("off DukeBike");

        }
    }
        class demoBike {
            public static void main(String[] args) {
                Bike Yamaha = new YamahaBike();
                Yamaha.on();
                Yamaha.off();


                Bike Duke = new DukeBike();
                Duke.on();
                 Duke.off();
            }
        }