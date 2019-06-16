package Bouquet;

import Flowers.Flower;

import java.util.HashMap;
import java.util.Map;

interface BouquetUsable {

    Map createBouquet();

    boolean canCreateBouquet(String[] array);

    Map fillBouquet(Map<Integer, Flower> map, Map<Integer, Flower> map2, String[] string);

    int sellBouquet(Map<Integer, Flower> map);
}