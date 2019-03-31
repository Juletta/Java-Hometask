package Accessories.Packing;


import Flower.Color;

public class Net extends Packing {
    public Net(double price, Color color, String name, int number) {
        super(price, color, name, number);
    }

    @Override
    public void setName(String name) {
        super.setName("net");
    }
}
