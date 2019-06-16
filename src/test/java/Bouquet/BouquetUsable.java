package Bouquet;

import Flowers.Flower;

import java.util.HashMap;
import java.util.Map;

interface BouquetUsable {

    boolean canCreateBouquet(String[] string);

    Map createBouquet(Map<Integer, Flower> map, String[] string);

    void clearBouquet(Map<Integer, HashMap<Flower, Integer>> map);
}