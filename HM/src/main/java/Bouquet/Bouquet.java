package Bouquet;

import Flower.*;


import java.util.ArrayList;
import java.util.Random;
import org.apache.log4j.*;

import static Accessories.Accessories.randomInt;


final public class Bouquet extends Flower{

    private static final Logger logger = Logger.getLogger(Bouquet.class);
    private ArrayList<Flower> bouquet;
    private int numberOfTypesF;
    private int[] numberFlowers;
    private int number;
    private Flower[] namesFlowers;

    public Bouquet() {
        this.number=0;
        this.bouquet = new ArrayList<Flower>();
        this.numberOfTypesF = 0;
        this.numberFlowers=new int[numberOfTypesF];
        this.namesFlowers=new Flower[numberOfTypesF];
    }

    private Flower typeFlower()
    {
        Random rnd = new Random();
        int n=rnd.nextInt((5-1)+1)+1;
        switch (n)
        {
            case 1: {
                Flower peony=new Peony();
                peony.Initializ();
                return peony;
            }
            case 2:{
                Flower iris=new Iris();
                iris.Initializ();
                return iris;
            }
            case 3:{
                Flower chrysanthemum=new Chrysanthemum();
                chrysanthemum.Initializ();
                return chrysanthemum;
            }
            case 4:{
                Flower lily=new Lily();
                lily.Initializ();
                return lily;
            }
            case 5:{
                Flower rose=new Rose();
                rose.Initializ();
                return rose;
            }
        }
        return typeFlower();
    }

    public void createBouquet()
    {
        setNumberOfTypesF(numberOfTypesF = randomInt(1,3));
        setNumberFlowers(numberFlowers=new int[numberOfTypesF]);
        setNamesFlowers(namesFlowers=new Flower[numberOfTypesF]);
        int i = 0;
        while (i < numberOfTypesF) {
            numberFlowers[i]=randomInt(1,50);
            addFlower(namesFlowers[i]=typeFlower(), numberFlowers[i]);
            namesFlowers[i].setName(typeFlower().getName());
            i++;
        }
    }

    public void addFlower(Flower flower, int num)
    {
        for (int i=0;i<num;i++) {
            bouquet.add(i,flower);
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

    public boolean checkNumber()
    {
        number=0;
        for (int i=0;i<getNumberOfTypesF();i++)
        {
            number+=getNumberFlowers()[i];
        }
        setNumber(number);
        if (number%2==0)
        {
            return false;
        }
        else {
            return true;
        }
    }

    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(ArrayList<Flower> flowers) {
        this.bouquet = flowers;
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
}
