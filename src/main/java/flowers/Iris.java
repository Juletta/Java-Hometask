package flowers;

public class Iris extends Flower {

    public Iris( double price, int numberDelivery, Color color, int stemLength) {
        super(price, numberDelivery, color, stemLength);
        name = "Iris";
    }

    @Override
    public void printInf(String name) {
        super.printInf("iris");
    }
}
