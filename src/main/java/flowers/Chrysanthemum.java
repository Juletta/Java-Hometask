package flowers;

public class Chrysanthemum extends Flower {


    public Chrysanthemum(double price, int numberDelivery, Color color, int stemLength) {
        super(price, numberDelivery, color, stemLength);
    }

    @Override
    public void printInf(String name) {
        super.printInf("chrysanthemum");
    }

}
