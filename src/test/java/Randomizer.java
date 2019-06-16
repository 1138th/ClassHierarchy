import java.util.Random;

public class Randomizer {

    public int randomizeQuantity(){
        Random rand = new Random();
        return (rand.nextInt(20) + 10); //10-30
    }

    public int randomizePrice(){
        Random rand = new Random();
        return (rand.nextInt(400) + 500); //500-900
    }
}
