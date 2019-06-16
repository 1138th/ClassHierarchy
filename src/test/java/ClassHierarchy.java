import Bouquet.Bouquet;
import Flowers.*;
import Stock.Stock;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassHierarchy {

    public static void main(String[] args) {

        //------------------------- initialize block -------------------------
        Map<Integer, Flower> stock = new HashMap<Integer, Flower>();
        Map<Integer, Map<Integer, HashMap<Flower, Integer>>> bouquet = new HashMap<Integer, Map<Integer, HashMap<Flower, Integer>>>();
        int bouquetIndex = 0;
        stock = new Stock().createStock();
        Scanner scan = new Scanner(System.in);
        String input;
        String[] array;

        //------------------------- creating stock block -------------------------
        System.out.println("welcome to flower shop.\nyour stock:");
        new Stock().printStock(stock);

        //------------------------- editing stock block -------------------------
        System.out.println("prices and quantities was generated randomly.\n" +
                "you want to make changes? (y/n)");
        input = scan.nextLine();
        while (!(input.equals("y") || input.equals("n"))){
            System.out.println("please enter correct command (y/n)");
            input = scan.nextLine();
        }
        if (input.equals("y")){
            System.out.println("enter changes you want to be made with next syntax:\n" +
                    "{flower_name} {flower_price} {flower_quantity} [{flower_name} {flower_price} {flower_quantity} etc]" +
                    "now you starting editing stock");
            while (!input.equals("exit")){
                System.out.println("available commands:\n" +
                        "stock\t\tshow flowers' names, quantities and prices in actual stock\n" +
                        "exit\t\tend editing stock");
                input = scan.nextLine();
                array = input.split(" ");
                if (input.equals("stock")) new Stock().printStock(stock);
                else if (!input.equals("exit")){
                    if (!(new Stock().canEditStock(array))) System.out.println("please enter information for edit stock correctly:\n" +
                            "{flower_name} {flower_price} {flower_quantity} [{flower_name} {flower_price} {flower_quantity} etc]");
                    else {
                        new Stock().editStock(stock, array);
                    }
                }
            }
            System.out.println("you finished making changes");
        } else System.out.println("you did not make any changes");

        //------------------------- starting work with flower shop -------------------------
        input = "null";
        System.out.println("now you starting to work with shop");
        while (!input.equals("exit")){
            System.out.println("available commands:\n" +
                    "stock\t\tshow flowers' names, quantities and prices in actual stock\n" +
                    "bouquet\t\tinitiate bouquet creating\n" +
                    "mybouquets\tshow collected bouquets\n" +
                    "update\t\tadd flowers to stock (by default adding random values)\n" +
                    "exit\t\tquit from shop");
            input = scan.nextLine();
            if (input.equals("stock")) new Stock().printStock(stock);
            else if (input.equals("bouquet")){
                System.out.println("type \"exit\" to finish making bouquet\n" +
                        "now create bouquet by command:\n" +
                        "{flower_name} {flower_quantity} [{flower_name} {flower_quantity} etc]");
                while (!input.equals("exit")){
                    input = scan.nextLine();
                    array = input.split(" ");
                    if (!input.equals("exit")) {
                        if (!(new Bouquet().canCreateBouquet(array)))
                            System.out.println("please enter information for making bouquet correctly:\n" +
                                    "{flower_name} {flower_quantity} [{flower_name} {flower_quantity} etc]");
                        else{
                            bouquet.put(bouquetIndex++, new Bouquet().createBouquet(stock, array));
                        }
                    }
                }
                input = "null";
            } else if (input.equals("mybouquets")) {
                for (Map.Entry<Integer, Map<Integer, HashMap<Flower, Integer>>> item: bouquet.entrySet()) {
                    System.out.println("bouquet " + (item.getKey() + 1) + ": ");
                    for (Map.Entry<Integer, HashMap<Flower, Integer>> nestedItem: item.getValue().entrySet()) {
                        for (Map.Entry<Flower, Integer> nestedNestedItem :nestedItem.getValue().entrySet()){
                            System.out.println("\tflower: " + nestedNestedItem.getKey().getName() +
                                    "\tquantity: " + nestedNestedItem.getValue());
                        }
                    }
                }
            }
        }

        //------------------------- clearing all after work -------------------------
        for (Map.Entry<Integer, Map<Integer, HashMap<Flower, Integer>>> item: bouquet.entrySet()) {
            bouquet.get(item.getKey()).clear();            
        }
        new Stock().clearStock(stock);
        scan.close();

    }
}