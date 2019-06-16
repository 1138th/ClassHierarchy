package Bouquet;

import Flowers.Flower;

import java.util.Map;

interface BouquetCreatable {

    Map createBouquet(Map<Integer, Flower> map, String[] string);
}