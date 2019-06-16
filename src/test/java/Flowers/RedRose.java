package Flowers;

import ValueFiller.FillValue;

public class RedRose extends Rose {

    public RedRose(){
        this.name = "red-rose";
        this.price = FillValue.randomPrice();
        this.quantity = FillValue.randomQuantity();
    }

    @Override
    public String toString() {
        return ("red-rose:\t" +
                "price: " + price + ",\t" +
                "quantity: " + quantity);
    }
}
