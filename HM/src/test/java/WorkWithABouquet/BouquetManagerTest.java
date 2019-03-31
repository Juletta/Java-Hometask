package WorkWithABouquet;

import Bouquet.Bouquet;
import Bouquet.FormBouquet;
import Flower.Color;
import Flower.Iris;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static WorkWithABouquet.BouquetManager.*;

public class BouquetManagerTest {

    FormBouquet formBouquet;
    Bouquet bouquet;
    Iris iris1;
    Iris iris2;
    Iris iris3;

    @Before
    public void setUpCost()throws Exception
    {
        formBouquet=new FormBouquet();
        bouquet = new Bouquet();
        iris1 = new Iris(15.3,1, Color.BEIDGE,40);
        iris2 = new Iris(19.8,1, Color.BEIDGE,40);
        iris3 = new Iris(45.4,1, Color.BEIDGE,40);


    }
    @Test
    public void getBouquetCost() {
        double expected = 15.3+19.8+45.4;
        double actual = BouquetManager.getBouquetCost(formBouquet);

        assertEquals(expected,actual,0.000000001);
    }

    @Test
    public void sortByFreshness() {
    }

    @Test
    public void flowerSearch() {
    }

    @Test
    public void sortByFreshness1() {
    }

    @Test
    public void flowerSearch1() {
    }
}