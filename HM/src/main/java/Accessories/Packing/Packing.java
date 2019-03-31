package Accessories.Packing;

import Accessories.Accessories;
import Flower.Color;

public class Packing extends Accessories{

    private int number;

    public Packing(double price, Color color, String name,int number)
    {
        super(price,color,name);
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return "name: "+name+"\nprice: "+price+"\ncolor: "+color+"\nnumber: "+number;
    }
}
