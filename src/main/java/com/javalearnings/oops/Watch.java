package com.javalearnings.oops;

public class Watch {
    private String Type;

    public Watch(String type) {
        this.Type = type;

    }

    public String DifferentType() {
        return Type;

    }

    public void connectblutooth(String Phone) {
        System.out.println("Connecting:" + Phone);
    }
}
    class SmartWatch extends Watch {
        public SmartWatch(String Type) {
            super(Type);
        }

        public void Activities(String Phone) {
            System.out.println("Activities:" + Phone);
        }
    }
        class Analog extends Watch{
            public Analog(String Type){
                super(Type);
            }
            public void useAnalog(String Settings){
                System.out.println("useAnalog:"+ Settings);
            }
        }
        class main{
            public static void main(String[]args){


                SmartWatch SmartWatch = new SmartWatch("Noisefit");
                Analog Analog = new Analog("Rolex");

                System.out.println(SmartWatch.DifferentType());
                SmartWatch.Activities("Gym");

                System.out.println(Analog.DifferentType());
                Analog.useAnalog("Dial");

    }
}
