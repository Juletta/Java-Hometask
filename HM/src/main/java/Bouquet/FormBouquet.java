package Bouquet;


import Accessories.Packing.HelpPacking;
import Accessories.Packing.Packing;
import Accessories.Tape.HelpTape;
import Accessories.Tape.Tape;
import org.apache.log4j.*;

import static Accessories.Packing.HelpPacking.*;
import static Accessories.Tape.HelpTape.*;

public class FormBouquet {

    private static final Logger logger = Logger.getLogger(FormBouquet.class);
    private static Bouquet bouquet;
    private Packing packing;
    private Tape tape;

    public FormBouquet() {
        this.bouquet = new Bouquet();
        bouquet.createBouquet();
        Initialize(packing);
        Initialize(this.tape);
    }

    public Bouquet getBouquet() {
        return bouquet;
    }

    public void setBouquet(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    public void setPacking(Packing packing) {
        this.packing = packing;
    }

    public void setTape(Tape tape) {
        this.tape = tape;
    }

    public static int packing()  //return the number of sheets for packing
    {
        int numberF = bouquet.getNumber();
        int numberPack = numberF / 7;
        return numberPack;
    }

    public static int tape()  //return tape length
    {
        int numberF = bouquet.getNumber();
        int numberTape = numberF * 2;
        return numberTape;
    }

}
