package Flower;

public class Iris extends Flower {


    public String[] getIncompatible() {
        setIncompatible();
        return incompatible;
    }

    @Override
    public void printInf(String name) {
        super.printInf("iris");
    }
}
