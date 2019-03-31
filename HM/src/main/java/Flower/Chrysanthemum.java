package Flower;

public class Chrysanthemum extends Flower {


    public String[] getIncompatible() {
        setIncompatible();
        return incompatible;
    }

    @Override
    public void printInf(String name) {
        super.printInf("chrysanthemum");
    }

}
