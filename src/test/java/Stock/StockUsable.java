package Stock;

import Flowers.Flower;

import java.util.Map;

interface StockUsable {

    Map createStock();

    void clearStock(Map<Integer, Flower> map);
}
