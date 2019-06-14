package Flowers;

public class RedRose extends Rose {

    public RedRose(){
        this.name = "red rose";
        this.price = 500;
        this.quantity = 20;
    }

    @Override
    public String toString() {
        return ("red roses: \t\t" +
                "price = " + price + "\t" +
                "quantity = " + quantity);
    }
}
