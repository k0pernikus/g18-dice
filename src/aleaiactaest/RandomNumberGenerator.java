package aleaiactaest;

public class RandomNumberGenerator {

    public static int getRandomNumberInRange(int lowerRange, int upperRange) {
        double randomNumber = (Math.random() * (upperRange - lowerRange + 1) + lowerRange);
        return (int) randomNumber;
    }
}
