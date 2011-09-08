package aleaiactaest;

public class Dice {
    private int rollCount;
    private int[] counters = new int[6];

    Dice() {
        this.rollCount = 0;
        for (int counter : this.counters ){
            counter = 0;
        }
    }

    private void setCounterFor(int dips) {
        this.counters[dips-1]++;
    }

    public int roll() {
        this.rollCount++;
        int dips = RandomNumberGenerator.getRandomNumberInRange(1, 6);
        setCounterFor(dips);
        return dips;
    }

    public int[] getCounters() {
        return counters;
    }
}