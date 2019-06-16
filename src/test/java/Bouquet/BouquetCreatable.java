package Bouquet;

import Flowers.Flower;

import java.util.Map;

interface BouquetCreatable {

    boolean canCreateBouquet(String[] string);

    Map createBouquet(Map<Integer, Flower> map, String[] string);
}