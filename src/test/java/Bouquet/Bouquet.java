package Bouquet;

import Flowers.*;
import Stock.Stock;

import java.util.HashMap;
import java.util.Map;

public class Bouquet implements BouquetUsable {

    public Map<Integer, Flower> createBouquet(){
        Flower violet = new Violet();
        Flower peony = new Peony();
        Flower redRose = new RedRose();
        Flower blueRose = new BlueRose();
        Map<Integer, Flower> bouquet = new HashMap<Integer, Flower>();
        bouquet.put(0, violet);
        bouquet.put(1, peony);
        bouquet.put(2, redRose);
        bouquet.put(3, blueRose);
        for (Map.Entry<Integer, Flower> item: bouquet.entrySet()) {
            bouquet.get(item.getKey()).setQuantity(0);
        }
        return  bouquet;
    }

    public boolean canCreateBouquet(String[] bouquetList){
        int isInteger;
        if ((bouquetList.length % 2) != 0) return false;
        for (int i = 0; i < bouquetList.length; i += 2){
            if (!(bouquetList[i].equals("violet") || bouquetList[i].equals("peony") ||
                    bouquetList[i].equals("red-rose") || bouquetList[i].equals("blue-rose")))  return false;
            try {
                isInteger = Integer.parseInt(bouquetList[i + 1]);
                if (isInteger < 0) return false;
            } catch (NumberFormatException e){
                return false;
            }
        }
        return true;
    }

    public Map<Integer, Flower> fillBouquet(Map<Integer, Flower> stock, Map<Integer, Flower> bouquet, String[] bouquetList) {
        Map<Integer, Flower> localBouquet = new Stock().createStock();
        for (Map.Entry<Integer, Flower> item: localBouquet.entrySet()) {
            localBouquet.get(item.getKey()).setQuantity(bouquet.get(item.getKey()).getQuantity());
        }
        for (int i = 0; i < bouquetList.length; i += 2){
            for (Map.Entry<Integer, Flower> item: localBouquet.entrySet()) {
                if (bouquetList[i].equals(item.getValue().getName())){
                    localBouquet.get(item.getKey()).setQuantity(localBouquet.get(item.getKey()).getQuantity() +
                            Integer.parseInt(bouquetList[i + 1]));
                    stock.get(item.getKey()).setQuantity(stock.get(item.getKey()).getQuantity() - Integer.parseInt(bouquetList[i + 1]));
                }
            }
        }
        return localBouquet;
    }

    public int sellBouquet(Map<Integer, Flower> bouquet){
        int cost = 0;
        for (Map.Entry<Integer, Flower> item: bouquet.entrySet()) {
            cost += item.getValue().getPrice();
        }
        return cost;
    }
}
