package Stock;

import Flowers.Flower;

import java.util.Map;

interface StockUsable {

    Map createStock();

    void printStock(Map<Integer, Flower> map);

    void clearStock(Map<Integer, Flower> map);
}
