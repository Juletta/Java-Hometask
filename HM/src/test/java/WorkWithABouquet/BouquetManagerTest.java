package WorkWithABouquet;

import Bouquet.FormBouquet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BouquetManagerTest {

    FormBouquet formBouquet;
    BouquetManager bouquetManager;

    @Before
    public void setUpCost()throws Exception
    {
        formBouquet=new FormBouquet();
        bouquetManager=new BouquetManager();
        formBouquet.getBouquet().createBouquet();
    }
    @Test
    public void costCalculation() {
       /* int[] numberFlowers={5,10};
        formBouquet.getBouquet().setNumberFlowers(numberFlowers);
        formBouquet.getBouquet().getNamesFlowers()[0].setPrice(2.20);
        formBouquet.getBouquet().getNamesFlowers()[1].setPrice(3.25);
        double cost=formBouquet.getBouquet().getNumberFlowers()[0]*formBouquet.getBouquet().getNamesFlowers()[0].getPrice()+formBouquet.getBouquet().getNumberFlowers()[1]*formBouquet.getBouquet().getNamesFlowers()[1].getPrice();
        double actual=bouquetManager.costCalculation(formBouquet);
        assertEquals(cost,actual);*/
    }

    @Test
    public void sortByFreshness() {
    }

    @Test
    public void flowerSearch() {
    }
}