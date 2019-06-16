package Flowers;

import ValueFiller.FillValue;

public class Peony extends Flower {

    private String  name;
    private int price;
    private int quantity;

    public Peony(){
        this.name = "peony";
        this.price = FillValue.randomPrice();
        this.quantity = FillValue.randomQuantity();
    }

    @Override
    public String toString() {
        return ("peony:\t\t" +
                "price: " + price + ",\t" +
                "quantity: " + quantity);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
