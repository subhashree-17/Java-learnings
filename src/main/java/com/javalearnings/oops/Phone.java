package com.javalearnings.oops;

public class Phone {
    private final String name;
    private final long number;
    private final String mail;
    private final float charger;


    public Phone(String name, long number, String mail, float charger) {
        this.name=name;
        this.number=number;
        this.mail=mail;
        this.charger=charger;


    }



    public static void main(String[]args){
        String name ="Subhashree";
        long number =8608992461L;
        String mail = "cvsubhashree17@gmail.com";
        float mark=66f;

        Phone Phone = new Phone(name,number,mail,mark);
        Phone .print();

    }
    private void print(){
        System.out.println("Phone name:"+name);
        System.out.println("Phone number:"+number);
        System.out.println("Phone mail:"+mail);
        System.out.println("Phone charger:"+charger);
    }

}

