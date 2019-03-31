package flowers;

import org.apache.log4j.*;

import java.util.Calendar;
import java.util.Random;

import static Accessories.Accessories.*;

public abstract class Flower {

    public static final Logger logger = Logger.getLogger(Flower.class);
    protected double price;
    protected String name;
    protected int numberDelivery;
    protected int stemLength;
    protected Color color;

    public Flower(double price, int numberDelivery, Color color, int stemLength) {
        this.price = price;
        this.numberDelivery = numberDelivery;
        this.stemLength = stemLength;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberDelivery() {
        return numberDelivery;
    }

    public void setNumberDelivery(int numberDelivery) {
        this.numberDelivery = numberDelivery;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        if (stemLength > 10 && stemLength < 100) {
            this.stemLength = stemLength;
        }
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public void Initializ() {
        Random rnd = new Random();
        try {
            Color[] arrayColor = Color.values();
            int i = rnd.nextInt(((arrayColor.length - 1) + 0) + 1) + 0;
            setColor(arrayColor[i]);
            color = arrayColor[i];
            price = randomDouble(2, 7);
            name = "flower";
            Calendar now = Calendar.getInstance();
            numberDelivery = rnd.nextInt((now.get(Calendar.DATE) - (now.get(Calendar.DATE) - 15)) + 1) + (now.get(Calendar.DATE) - 15);
            stemLength = randomInt(20, 100);
        } catch (IndexOutOfBoundsException indoute) {
            logger.error(indoute);
        } catch (NullPointerException nulex) {
            logger.error(nulex.getMessage());
        }
    }

    public void printInf(String name) {
        try {
            logger.info("Flower name is " + name + " Color " + color + " Length " + stemLength + " Price " + price + " Date delivary " + numberDelivery);
        } catch (NullPointerException nulex) {
            logger.error(nulex.getMessage());
        }
    }
}
