package Flowers;

import ValueFiller.FillValue;

public class BlueRose extends Rose {

    public BlueRose(){
        this.name = "blue rose";
        this.price = FillValue.randomPrice();
        this.quantity = FillValue.randomQuantity();
    }

    @Override
    public String toString() {
        return ("blue roses:\t" +
                "price: " + price + ",\t" +
                "quantity: " + quantity);
    }
}
