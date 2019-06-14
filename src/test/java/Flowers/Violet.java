package Flowers;

public class Violet extends Flower{
    private String  name;
    private int price;
    private int quantity;

    public Violet(){
        this.name = "violet";
        this.price = 500;
        this.quantity = 20;
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
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}