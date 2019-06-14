import Flowers.*;
import Utilities.Stock;

public class ClassHierarchy {
    public static void main(String[] args) {
        Flower violet = new Violet();
        Flower peony = new Peony();
        Flower redRose = new RedRose();
        Flower blueRose = new BlueRose();
        new Stock().printStock(violet, peony, redRose, blueRose);
    }
}