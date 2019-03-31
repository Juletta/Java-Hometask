package WorkWithABouquet;

import Bouquet.FormBouquet;
import Flower.Flower;

import java.util.ArrayList;

import org.apache.log4j.*;

public class BouquetManager {

    private static final Logger logger = Logger.getLogger(BouquetManager.class);

//    public static Double getBouquetCost(FormBouquet formBouquet) {
//        if (formBouquet == null) {
//            logger.warn("Bouquet is not formed!");
//            return 0.0;
//        }                                                             //considers the full cost of the bouquet(flowers+tape+packing)
//        else {
//            for (int i = 0; i < formBouquet.getBouquet().getNumberFlowers().length; i++) {
//                costFlowers += formBouquet.getBouquet().getNumberFlowers()[i] * formBouquet.getBouquet().getNamesFlowers()[i].getPrice();
//            }
//            costBouquet = costFlowers + formBouquet.getPacking().getCostPack() + formBouquet.getTape().getCostTape();
//            logger.info("Cost bouquet-" + (double) Math.round(costBouquet * 100d) / 100);
//            setCostBouquet(costBouquet);
//            return costBouquet;
//        }
//    }

    public static Double getBouquetCost(FormBouquet formBouquet){
        Double cost = 0.0;
        for (Flower flower:formBouquet.getBouquet().getFlowers()){
            cost+= flower.getPrice();
        }
        return cost;
    }

    public void sortByFreshness(FormBouquet formBouquet) {                                                               //sorts the flowers by freshness
        if (formBouquet == null) {
            logger.warn("Bouquet is not formed!");
        } else {
            for (int i = formBouquet.getBouquet().getNamesFlowers().length - 1; i > 0; i--) {                        //flower bubble sorting
                for (int j = 0; j < i; j++) {
                    if (formBouquet.getBouquet().getNamesFlowers()[j].getNumberDelivery() > formBouquet.getBouquet().getNamesFlowers()[j + 1].getNumberDelivery()) {
                        int tmp = formBouquet.getBouquet().getNamesFlowers()[j].getNumberDelivery();
                        formBouquet.getBouquet().getNamesFlowers()[j].setNumberDelivery(formBouquet.getBouquet().getNamesFlowers()[j + 1].getNumberDelivery());
                        formBouquet.getBouquet().getNamesFlowers()[j + 1].setNumberDelivery(tmp);
                    }
                }
            }
            logger.info("Sort flowers by freshness:");
            formBouquet.getBouquet().printBouquet();
        }
    }

    public void flowerSearch(FormBouquet formBouquet, int a, int b) {                                                               //search for flowers by stem length
        if (formBouquet == null) {
            logger.warn("Bouquet is not formed!");
        } else {
            ArrayList<Flower> flowers = new ArrayList<Flower>();
            for (int i = 0; i < formBouquet.getBouquet().getNamesFlowers().length; i++) {
                if (formBouquet.getBouquet().getNamesFlowers()[i].getStemLength() >= a && formBouquet.getBouquet().getNamesFlowers()[i].getStemLength() <= b) {
                    logger.info("Found a flower having a stem length from " + a + " to " + b + ":");
                    flowers.add(formBouquet.getBouquet().getNamesFlowers()[i]);
                    formBouquet.getBouquet().getNamesFlowers()[i].printInf("dvs");
                }
            }
            if (flowers.size() == 0) {
                logger.info("No flowers have a stem length from " + a + " to " + b);
            }
        }
    }
}
