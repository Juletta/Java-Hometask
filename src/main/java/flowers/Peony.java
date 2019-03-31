package flowers;

public class Peony extends Flower {


    public Peony( double price, int numberDelivery, Color color, int stemLength) {
        super( price, numberDelivery, color, stemLength);
    }

    @Override
    public void printInf(String name) {
        super.printInf("peony");
    }
}
