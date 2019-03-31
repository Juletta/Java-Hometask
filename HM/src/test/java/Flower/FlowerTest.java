package Flower;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

public class FlowerTest {

Flower flower;
    @Test
    public void getPrice() {
    }

    @Test
    public void setPrice() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getNumberDelivary() {
    }

    @Test
    public void setNumberDelivary() {
    }

    @Test
    public void getStemLength() {
    }

    @Test
    public void setStemLength() {
    }

    @Test
    public void getIncompatible() {
    }

    @Test
    public void setIncompatible() {
    }

    @Test
    public void getColor() {
    }

    @Test
    public void setColor() {
    }

    @Test
    public void initializ() {
       /* flower.setColor(Color.BEIDGE);
        flower.setPrice(3.1);
        flower.setName("flower");
        Calendar now = Calendar.getInstance();
        flower.setNumberDelivery(now.get(Calendar.DATE) - 1);
        flower.setStemLength(50);
        boolean expected=false;
        if (flower.getColor()!=null&&flower.getPrice()!=0.0&&flower.getName()!=null&&flower.getNumberDelivery()!=0&&flower.getStemLength()!=0) {expected=true;}
        else expected=false;
        boolean actual=false;
      Flower flower2=null;
        flower2.Initializ();
        if (flower2.getColor()!=null&&flower2.getPrice()!=0.0&&flower2.getName()!=null&&flower2.getNumberDelivery()!=0&&flower2.getStemLength()!=0) {actual=true;}
        else actual=false;
        assertEquals(expected,actual);*/
    }

    @Before
    public void setUpPrint()
    {
        flower.setColor(Color.BEIDGE);
        flower.setPrice(3.1);
        flower.setName("flower");
        Calendar now = Calendar.getInstance();
        flower.setNumberDelivery(now.get(Calendar.DATE) - 1);
        flower.setStemLength(50);
    }
    @Test
    public void printInf() {
       /* String expected="Flower name is " + flower.getName() + " Color " + flower.getColor() + " Length " + flower.getStemLength() + " Price " + flower.getPrice() + " Date delivary " + flower.getNumberDelivery();
        assertEquals(expected,flower.printInf("flower"));*/
    }
}