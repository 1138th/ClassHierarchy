package ValueFiller;

import java.util.Random;

public class FillValue {

    public static int randomQuantity(){
        Random rand = new Random();
        return (rand.nextInt(20) + 10); //10-30
    }

    public static int randomPrice(){
        Random rand = new Random();
        return (rand.nextInt(400) + 500); //500-900
    }
}
