package Accessories;

import Flower.Color;
import java.util.Random;

public abstract class Accessories {

    protected Double price;
    protected String name;
    protected Color color;

    public Accessories(double price, Color color, String name)
    {
        this.price=price;
        this.color=color;
        this.name=name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public static int randomInt(int a,int b)
    {
        Random rnd = new Random();
        int rezult=rnd.nextInt((b-a)+1)+a;
        return rezult;
    }

    public static Double randomDouble(int a,int b)
    {
        Random rnd=new Random();
        Double rezult=(a+(b-a)*rnd.nextDouble());
        return (double)Math.round(rezult*100d)/100;
    }

}
