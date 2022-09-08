package Arrays.Task002;

import java.util.Arrays;
import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        String[] cardSuit = {"Черви", "Буби", "Крести", "Пики"};
        String[] cardSeniority = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        Scanner scanner = new Scanner(System.in);
        int playersCount = scanner.nextInt();
        if (playersCount > 5) System.out.println("Игроков больше пяти!");
        int cardCount = 5;


        String[][] combinationOnHands = new String[cardCount][1];
        String[][] combinationOnHands1 = new String[cardCount][1];
        String[][] combinationOnHands2 = new String[cardCount][1];
        String[][] combinationOnHand3 = new String[cardCount][1];
        String[][] combinationOnHands4 = new String[cardCount][1];


        String[] randomCombination = new String[5];
        for (int i = 0; i <= combinationOnHands.length-1; i++) {
            for (int j = 0; j <= randomCombination.length - 1; j++) {
                randomCombination[i] = cardSuit[(int) Math.round(Math.random() * (cardSuit.length - 1))]
                        + " " + cardSeniority[(int) Math.round(Math.random() * (cardSeniority.length - 1))];
            }
            combinationOnHands[i][0] = randomCombination[i];
        }

        for (int i = 1; i <= playersCount; i++) {
            System.out.println("У игрока " + i + " на руках карты " + Arrays.deepToString(combinationOnHands));
        }
    }
}

