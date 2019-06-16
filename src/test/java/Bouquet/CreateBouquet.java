package Bouquet;

import Flowers.Flower;

import java.util.HashMap;
import java.util.Map;

public class CreateBouquet implements BouquetCreatable {

    public Map<Integer, Flower> createBouquet(Map<Integer, Flower> stock, String[] flowers) {
        Map<Integer, Flower> bouquet = new HashMap<Integer, Flower>();
        int flowersQuantity;
        for(int i = 0; i < flowers.length; i += 2){
            flowersQuantity = Integer.parseInt(flowers[i + 1]);
            switch (flowers[i]){
                case "violet":
            }
        }
        return bouquet;
    }
}
