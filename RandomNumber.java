import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random(); // Create an instance of Random

        System.out.println("Generating 10 random numbers:");

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // Generate a random number between 0 and 99
            System.out.println("Random Number " + (i + 1) + ": " + randomNumber);
        }
    }
}
