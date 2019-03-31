package Flower;

public class Rose extends Flower {

    public String[] getIncompatible() {
        setIncompatible();
        return incompatible;
    }

    @Override
    public void printInf(String name) {
        super.printInf("rose");
    }
}
