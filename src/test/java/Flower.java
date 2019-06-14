public abstract class Flower {
    private String name;
    private double price;
    public abstract void setPrice(String name);
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
}