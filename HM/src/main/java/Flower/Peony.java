package Flower;

public class Peony extends Flower {

    public String[] getIncompatible() {
        setIncompatible();
        return incompatible;
    }

    @Override
    public void printInf(String name) {
        super.printInf("peony");
    }
}
