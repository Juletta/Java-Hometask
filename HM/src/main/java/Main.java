import Bouquet.FormBouquet;
import WorkWithABouquet.BouquetManager;


public class Main {
    public static void main(String[] args) {
        FormBouquet bouquet=new FormBouquet();
        bouquet.getBouquet().createBouquet();
        BouquetManager manager =new BouquetManager();
        bouquet.printFormBouquet();
        manager.costCalculation(bouquet);
        manager.sortByFreshness(bouquet);
        manager.flowerSearch(bouquet,30,80);
    }
    //todo:improve code
}
