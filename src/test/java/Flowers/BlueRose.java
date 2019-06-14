package Flowers;

public class BlueRose extends Rose {

    public BlueRose(){
        this.name = "blue rose";
        this.price = 500;
        this.quantity = 20;
    }

    @Override
    public String toString() {
        return ("blue roses: \t" +
                "price = " + price + "\t" +
                "quantity = " + quantity);
    }
}
