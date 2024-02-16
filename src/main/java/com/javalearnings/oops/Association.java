package com.javalearnings.oops;

import static com.javalearnings.oops.Association.FastFood.*;

public class Association {
    static class FastFood{
        private String variety;
        private String cost;

        public FastFood(String variety,String cost){
            this.variety=variety;
            this.cost=cost;
        }
        public void print(){
            System.out.println("FastFood variety:"+variety);
            System.out.println("FastFood cost:"+cost);

        }

    }
    static class FoodTypes{
        private String Food;
        private String taste;
        public FoodTypes(String Food,String taste){
            this.Food=Food;
            this.taste=taste;
        }
        public void print(){
            System.out.println("FoodTypes Food:"+Food);
            System.out.println("FoodTypes taste " + taste);
        }

    }

    public static void main(String[] args) {
        FastFood FastFood = new FastFood("Indianthali", "350");
        FastFood.print();

        FoodTypes FoodTypes = new FoodTypes("sambarrice","Spicy");
        FoodTypes.print();
    }


}
