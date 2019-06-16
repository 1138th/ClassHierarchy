package Stock;

import Flowers.*;
import ValueFiller.FillValue;

import java.util.HashMap;
import java.util.Map;

public class Stock implements StockUsable{

    public Map<Integer, Flower> createStock(){
        Flower violet = new Violet();
        Flower peony = new Peony();
        Flower redRose = new RedRose();
        Flower blueRose = new BlueRose();
        Map<Integer, Flower> stock = new HashMap<Integer, Flower>();
        stock.put(0, violet);
        stock.put(1, peony);
        stock.put(2, redRose);
        stock.put(3, blueRose);
        return  stock;
    }

    public boolean canEditStock(String[] editingParameters){
        int isInteger;
        if ((editingParameters.length % 3) != 0) return false;
        for (int i = 0; i < editingParameters.length; i += 3){
            if (!(editingParameters[i].equals("violet") || editingParameters[i].equals("peony") ||
                    editingParameters[i].equals("red-rose") || editingParameters[i].equals("blue-rose")))  return false;
            try {
                isInteger = Integer.parseInt(editingParameters[i + 1]);
                if (isInteger < 0) return false;
            } catch (NumberFormatException e){
                return false;
            }
            try {
                isInteger = Integer.parseInt(editingParameters[i + 2]);
                if (isInteger < 0) return false;
            } catch (NumberFormatException e){
                return false;
            }
        }
        return true;
    }

    public void editStock(Map<Integer, Flower> stock, String[] editingParameters){
        for (int i = 0; i < editingParameters.length; i += 3){
            for (Map.Entry<Integer, Flower> item: stock.entrySet()) {
                if (editingParameters[i].equals(item.getValue().getName())){
                    stock.get(item.getKey()).setPrice(Integer.parseInt(editingParameters[i + 1]));
                    stock.get(item.getKey()).setQuantity(Integer.parseInt(editingParameters[i + 2]));
                    System.out.println(item.getValue());
                }
            }
        }
    }

    public void printStock(Map<Integer, Flower> stock){
        for (Map.Entry<Integer, Flower> item: stock.entrySet()) {
            System.out.println("\t" + item.getValue());
        }
    }

    public void updateStock(Map<Integer, Flower> stock){
        int addingQuantity;
        System.out.println("added:");
        for (Map.Entry<Integer, Flower> item: stock.entrySet()) {
            addingQuantity = FillValue.randomQuantity();
            stock.get(item.getKey()).setQuantity(item.getValue().getQuantity() + addingQuantity);
            System.out.println("\t" + item.getValue().getName() + ": " + addingQuantity);
        }
    }

    public void clearStock(Map<Integer, Flower> stock){
        stock.clear();
    }
}
