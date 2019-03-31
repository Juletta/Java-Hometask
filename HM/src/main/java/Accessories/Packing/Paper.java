package Accessories.Packing;

import Accessories.*;
import Flower.Color;


public class Paper extends Packing {

    public Paper(double price, Color color, String name, int number) {
        super(price, color, name, number);
    }

    @Override
    public void setName(String name) {
        super.setName("paper");
    }

}
