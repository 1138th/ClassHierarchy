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
        String input = "null";
        System.out.println("welcome to flower shop.");
        while (!input.equals("exit")){
            System.out.println("available commands:\n" +
                    "stock\n" +
                    "\tshow flowers' name, quantity and price in actual stock\n" +
                    "bouquet {flower_name} {flower_quantity} [{flower_name} {flower_quantity} etc]\n" +
                    "\tcreate bouquet of flower_quantity flower_name\n" +
                    "update\n" +
                    "\tadd flowers to stock\n" +
                    "exit\n" +
                    "\tquit from shop\n");
            input = scan.nextLine();
        }
        new Stock().clearStock(stock);
        scan.close();

    }
}