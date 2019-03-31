package Bouquet;

import Flower.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import org.apache.log4j.*;

import static Accessories.Accessories.randomInt;


final public class Bouquet extends Flower{

    private static final Logger logger = Logger.getLogger(Bouquet.class);
    private ArrayList<Flower> flowers = new ArrayList<Flower>();
    private int numberOfTypesF;
    private int[] numberFlowers;
    private int number;
    private Flower[] namesFlowers;

    public Bouquet(double price, int numberDelivery, Color color, int stemLength) {
        super(price, numberDelivery, color, stemLength);
    }


    private Flower generateTypeFlower()
    {
        Random rnd = new Random();
        int n=rnd.nextInt((5-1)+1)+1;
        switch (n)
        {
            //todo: create random parameters in constructor
            case 1: {
                Flower peony=new Peony(15.3,1, Color.BEIDGE,40);
                peony.Initializ();
                return peony;
            }
            case 2:{
                Flower iris=new Iris(15.3,1, Color.BEIDGE,40);
                iris.Initializ();
                return iris;
            }
            case 3:{
                Flower chrysanthemum=new Chrysanthemum(15.3,1, Color.BEIDGE,40);
                chrysanthemum.Initializ();
                return chrysanthemum;
            }
            case 4:{
                Flower lily=new Lily(15.3,1, Color.BEIDGE,40);
                lily.Initializ();
                return lily;
            }
            case 5:{
                Flower rose=new Rose(15.3,1, Color.BEIDGE,40);
                rose.Initializ();
                return rose;
            }
        }
        return generateTypeFlower();
    }

    public void createBouquet()
    {
        setNumberOfTypesF(numberOfTypesF = randomInt(1,3));
        setNumberFlowers(numberFlowers=new int[numberOfTypesF]);
        setNamesFlowers(namesFlowers=new Flower[numberOfTypesF]);
        int i = 0;
        while (i < numberOfTypesF) {
            numberFlowers[i]=randomInt(1,50);
            addFlower(namesFlowers[i]= generateTypeFlower(), numberFlowers[i]);
            namesFlowers[i].setName(generateTypeFlower().getName());
            i++;
        }
    }

    public void addFlower(Flower flower, int num)
    {
        for (int i=0;i<num;i++) {
            flowers.add(i,flower);
        }
    }

    public void printBouquet()
    {
       for(int i=0;i<numberOfTypesF;i++)
        {
            namesFlowers[i].printInf("rose");
            logger.info("Number -"+numberFlowers[i]);
        }
    }

    public void checkNumber()
    {
        number=0;
        for (int i=0;i<getNumberOfTypesF();i++)
        {
            number+=getNumberFlowers()[i];
        }
        setNumber(number);

    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public int getNumberOfTypesF() {return numberOfTypesF;}

    public void setNumberOfTypesF(int numberOfTypesF)
    {
        this.numberOfTypesF=numberOfTypesF;
    }

    public int[] getNumberFlowers(){return numberFlowers;}

    public void setNumberFlowers(int[] numberFlowers)
    {
        this.numberFlowers=numberFlowers;
    }

    public Flower[] getNamesFlowers(){return namesFlowers;}
    public void setNamesFlowers(Flower[] namesFlowers)
    {
        this.namesFlowers=namesFlowers;
    }

    public int getNumber() {
        checkNumber();
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Bouquet\n" +
                "flowers=" + flowers +
                ", numberOfTypesF=" + numberOfTypesF +
                ", numberFlowers=" + Arrays.toString(numberFlowers) +
                ", number=" + number +
                ", namesFlowers=" + Arrays.toString(namesFlowers) +
                '}';
    }
}
