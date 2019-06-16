package Stock;

import Flowers.*;
import ValueFiller.FillValue;

import java.util.HashMap;
import java.util.Map;

public class Stock implements StockUsable{

    public Map<Integer, Flower> createStock(){
        Flower violet = new Violet();
        Flower peony = new Peony();
        Flower redRose = new RedRose();
        Flower blueRose = new BlueRose();
        Map<Integer, Flower> stock = new HashMap<Integer, Flower>();
        stock.put(0, violet);
        stock.put(1, peony);
        stock.put(2, redRose);
        stock.put(3, blueRose);
        return  stock;
    }

    public static void printStock(Map<Integer, Flower> stock){
        for (Map.Entry<Integer, Flower> item: stock.entrySet()) {
            System.out.println("\t" + item.getValue());
        }
    }

    public static void updateStock(Map<Integer, Flower> stock){
        for (Map.Entry<Integer, Flower> item: stock.entrySet()) {
            stock.get(item.getKey()).setQuantity(item.getValue().getQuantity() + FillValue.randomQuantity());
        }
    }

    public void clearStock(Map<Integer, Flower> stock){
        stock.clear();
    }
}
