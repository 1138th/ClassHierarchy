package Bouquet;

import Flowers.Flower;

import java.util.HashMap;
import java.util.Map;

public class Bouquet implements BouquetUsable {

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

    public Map<Integer, HashMap<Flower, Integer>> createBouquet(Map<Integer, Flower> stock, String[] bouquetList) {
        Map<Integer, HashMap<Flower, Integer>> bouquet = new HashMap<Integer, HashMap<Flower, Integer>>();
        int flowersQuantity, bouquetIndex = 0;
        for(int i = 0; i < bouquetList.length; i += 2){
            flowersQuantity = Integer.parseInt(bouquetList[i + 1]);
            for (Map.Entry<Integer, Flower> item: stock.entrySet()) {
                if (item.getValue().getName().equals(bouquetList[i])){
                    bouquet.put(bouquetIndex, new HashMap<Flower, Integer>());
                    bouquet.get(bouquetIndex++).put(item.getValue(), flowersQuantity);
                    stock.get(item.getKey()).setQuantity(stock.get(item.getKey()).getQuantity() - flowersQuantity);
                }
            }
        }
        return bouquet;
    }

    public void clearBouquet(Map<Integer, HashMap<Flower, Integer>> bouquet){
        bouquet.clear();
    }
}
