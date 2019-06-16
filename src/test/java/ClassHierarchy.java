import Flowers.*;
import Stock.Stock;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassHierarchy {
    public static void main(String[] args) {
        Map<Integer, Flower> stock = new HashMap<Integer, Flower>();
        stock = new Stock().createStock();
        Scanner scan = new Scanner(System.in);
        String input;
        while (!(input = scan.nextLine()).equals("exit")){

        }
        new Stock().clearStock(stock);
        scan.close();
    }
}