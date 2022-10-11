package Helpfunction;

import java.util.Random;

public class Chance {
    public static boolean raisechance(int percent) {
        Random rand = new Random();
        if (rand.nextInt(100) < percent) {
            return true;
        }
        return false;
    }
}
