package Accessories.Packing;

import Flower.*;
import static Accessories.Accessories.*;
import static Bouquet.FormBouquet.packing;
import org.apache.log4j.*;

public class HelpPacking {

    private static final Logger logger = Logger.getLogger(HelpPacking.class);
    private Double costPack;

    public HelpPacking() {
        costPack = 0.0;
    }

    public static void Initialize(Packing packing) {
        Color[] arrayColor = Color.values();
        int i = randomInt(0, arrayColor.length - 1);
        packing.setColor(arrayColor[i]);
        Double pr = randomDouble(1, 3);
        packing.setPrice(pr);
        int numberPack = packing();
        packing.setNumber(numberPack);
        i = randomInt(0, 1);
        if (i == 0) {
            Paper paper = new Paper();
            packing.setName("paper");
        } else {
            Net net = new Net();
            packing.setName("net");
        }
    }

    private Double costCalculation(Packing packing) {
        costPack = packing.getPrice() * packing.getNumber();
        return ((double) Math.round(costPack * 100d) / 100);
    }
}


