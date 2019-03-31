package Bouquet;

import Flower.Flower;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import Flower.*;
public class BouquetTest {

    ArrayList<Flower> bouquets;
    Bouquet bouquet;

    @Before
    public void setUpAdd()throws Exception{
        bouquet=new Bouquet();
        bouquets=new ArrayList<Flower>();
    }
    @Test
    public void addFlower() {
        Flower rose=new Rose();
        int num=3;
        for (int i=0;i<num;i++) {
            bouquets.add(i,rose);
        }
        bouquet.addFlower(rose,num);
        int expected=bouquets.size();
        assertEquals(expected,bouquet.getBouquet().size());
    }

    @Before
    public void setUpPrint()throws Exception {
        bouquet=new Bouquet();
    }
    @Test
    public void printBouquet() {
        Flower[] namesFlowers=new Flower[2];
        namesFlowers[0]=new Rose();
        namesFlowers[1]=new Chrysanthemum();
    }

    @Before
    public void setUpCheck()throws Exception
    {
        bouquet=new Bouquet();
    }
    @Test
    public void checkNumber() {
        bouquet.setNumberOfTypesF(2);
        int[] numberFlowers={5,11};
        int number= numberFlowers[0]+numberFlowers[1];
        boolean expected=true;
        if (number%2==0) {
            expected=false;
        }
        bouquet.setNumberFlowers(numberFlowers);
        assertEquals(expected,bouquet.checkNumber());
    }
    @Before
    public void setUpChec()throws Exception
    {
        bouquet=new Bouquet();
    }
    @Test
    public void checkNumbec() {
        bouquet.setNumberOfTypesF(2);
        int[] numberFlowers={5,10};
        int number= numberFlowers[0]+numberFlowers[1];
        boolean expected=false;
        if (number%2!=0) {
            expected=true;
        }
        bouquet.setNumberFlowers(numberFlowers);
        assertEquals(expected,bouquet.checkNumber());
    }
}