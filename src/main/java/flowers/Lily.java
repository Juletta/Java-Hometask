package flowers;

public class Lily extends Flower {

    public Lily( double price, int numberDelivery, Color color, int stemLength) {
        super( price, numberDelivery, color, stemLength);
    }

    @Override
    public void printInf(String name) {
        super.printInf("lily");
    }
}
