import Flowers.*;

public class ClassHierarchy {
    public static void main(String[] args) {
        Flower violet = new Violet();
        System.out.println(violet.getName() + ", " + violet.getPrice() + ", " + violet.getQuantity());
        violet.setQuantity(50);
        violet.setPrice(300);
        System.out.println(violet.getName() + ", " + violet.getPrice() + ", " + violet.getQuantity());

    }
}