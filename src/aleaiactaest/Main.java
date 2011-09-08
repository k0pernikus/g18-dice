package aleaiactaest;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int rollAmount = 0;
        int diceAmount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many dices do you need?");
        diceAmount = scanner.nextInt();

        System.out.println("How often do you want to roll the dices?");
        rollAmount = scanner.nextInt();

        // Creating the Dices

        Dice Dices[] = new Dice[diceAmount];

        // WTF JAVA, why can't I do this in a for each loop?
        for (int i = 0; i < diceAmount; i++){
            Dices[i] = new Dice();
        }

        // Rolling the dices

        for (Dice Dice : Dices) {
            for (int i = 0; i < rollAmount; i++) {
                Dice.roll();
            }
        }

        // Statistics


        int diceCount = 1;
        for (Dice Dice : Dices) {

            System.out.println("Die Verteilung von Würfel " + diceCount);

            int[] dipsCounters = Dice.getCounters();
            int dips = 1;

            for (int counter : dipsCounters) {
                System.out.println(dips + ":" + counter);
                dips++;
            }
            diceCount++;
        }
    }
}
