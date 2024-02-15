package com.javalearnings.oops;

public class ImmuneDiseases {
    public void cure(){
        System.out.println("The ImmuneDiseases is going to cure");

    }
}
class Type1diabetes extends ImmuneDiseases{
    @Override
    public void cure() {
        System.out.println("The Type1diabetes is going to cure");
    }
}
class MultipleSclerosis extends ImmuneDiseases{
    @Override
    public void cure() {
        System.out.println("The MultipleSclerosis is going to cure");
    }
}
class main{
    public static void main(String[]args){
        ImmuneDiseases Immunediseases1 = new Type1diabetes();
        ImmuneDiseases Immunediseases2 = new MultipleSclerosis();

        Immunediseases1.cure();
        Immunediseases2.cure();



    }

}