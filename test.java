import java.util.Random;

public class RandomPrintExample {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random rand = new Random();

        // 1. Generate and print a random integer (full range)
        int randomInt = rand.nextInt();
        System.out.println("Random integer (full range): " + randomInt);

        // 2. Generate and print a random integer between 0 (inclusive) and 100 (exclusive)
        int randomBoundedInt = rand.nextInt(100);
        System.out.println("Random integer (0 to 99): " + randomBoundedInt);

        // 3. Generate and print a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = rand.nextDouble();
        System.out.println("Random double (0.0 to 1.0): " + randomDouble);
        
        // 4. Generate and print a random boolean
        boolean randomBoolean = rand.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);
    }
}