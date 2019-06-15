import Flowers.*;
import Utilities.Stock;

import java.util.HashMap;
import java.util.Map;

public class ClassHierarchy {
    public static void main(String[] args) {
        Map<Integer, Flower> stock = new HashMap<Integer, Flower>();
        stock = new Stock().initializeStock();
        Stock.printStock(stock);
    }
}