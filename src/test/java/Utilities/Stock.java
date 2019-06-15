package Utilities;

import Flowers.*;

import java.util.HashMap;
import java.util.Map;

public class Stock {

    public Map<Integer, Flower> initializeStock(){
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
            System.out.println(item.getValue());
        }
    }
}
