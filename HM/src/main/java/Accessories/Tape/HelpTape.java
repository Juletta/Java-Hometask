package Accessories.Tape;


import Flower.Color;
import static Accessories.Accessories.randomDouble;
import static Accessories.Accessories.randomInt;
import static Bouquet.FormBouquet.tape;
import org.apache.log4j.*;

public class HelpTape {

    private static final Logger logger = Logger.getLogger(HelpTape.class);
 
    public static void Initialize(Tape tape)
    {
        Color[] arrayColor= Color.values();
        int i=randomInt(0,arrayColor.length-1);
        tape.setColor(arrayColor[i]);
        Double pr=(randomDouble(1,3))/100;
        tape.setPrice((double)Math.round(pr*100d)/100);
        int numberTape=tape();                               //return tape length
        tape.setNumber(numberTape);
        i=randomInt(0,2);
        if (i==0) {
            Tape paperTape=new PaperTape();
            tape.setName("paperTape");
        }
        else if (i==1){
           Tape rope=new Rope();
            tape.setName("rope");
        }
        else {
            Tape satinTape=new SatinTape();
            tape.setName("satinTape");
        }
    }

    private Double getTapeCost(Tape tape)
    {
        double costTape = tape.getPrice() * tape.getNumber();
        return ((double) Math.round(costTape * 100d) / 100);
    }

}
