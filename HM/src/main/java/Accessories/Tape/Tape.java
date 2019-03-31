package Accessories.Tape;

import Accessories.Accessories;
import Flower.Color;

public class Tape extends Accessories {
    private int number;

    public Tape(double price, Color color, String name, int number) {
        super(price, color, name);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
