package Stock;

import Flowers.Flower;

import java.util.Map;

interface StockUsable {

    Map createStock();

    boolean canEditStock(String[] array);

    void editStock(Map<Integer, Flower> map, String[] array);

    void printStock(Map<Integer, Flower> map);

    void updateStock(Map<Integer, Flower> map);

    void clearStock(Map<Integer, Flower> map);
}
