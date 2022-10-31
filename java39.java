package Java39;

import java.util.Random;

public class java39 {
    public static void main(String[] args) {
        Random random = new Random();
        int random_int = random.nextInt(31);
        int random_int2 = random.nextInt(31);
        Fighter f1 = new Fighter("A", random_int, 120, 100);
        Fighter f2 = new Fighter("B", random_int2, 85, 85);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
