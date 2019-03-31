package Bouquet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FormBouquetTest {

    FormBouquet formBouquet;

    @Before
    public void setUpPack() throws Exception
    {
        formBouquet=new FormBouquet();
    }
    @Test
    public void packing() {
        formBouquet.getBouquet().setNumber(15);
        int expected=formBouquet.getBouquet().getNumber()/7;
        assertEquals(expected,formBouquet.packing());
    }

    @Before
    public void setUpTape()
    {
        formBouquet=new FormBouquet();
    }
    @Test
    public void tape() {
        formBouquet.getBouquet().setNumber(15);
        int expected=formBouquet.getBouquet().getNumber()*2;
        assertEquals(expected,formBouquet.tape());
    }

    @Test
    public void printFormBouquet() {
    }
}