package Arrays.Task002;

import java.util.Arrays;
import java.util.Scanner;

public class Task002 {
    public static String[] cardSuit = {"Черви", "Буби", "Крести", "Пики"};
    public static String[] cardSeniority = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
    public static String[][] cardsOnHands = new String[5][1];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите допустимое количество игроков для игры:");
        int playersCount = scanner.nextInt();
        if (playersCount > 5 || playersCount == 0 || playersCount == 1) {
            System.out.println("Недопустимое количество игроков!");
            return;
        }

        for (int i = 1; i <= playersCount; i++) {
            System.out.println("У игрока " + i + " Карты: " + Arrays.deepToString(cardSorting()));
        }

    }

    public static String[][] cardSorting() {
        String[] randomCombination = new String[5];
        for (int i = 0; i <= cardsOnHands.length - 1; i++) {
            for (int j = 0; j <= randomCombination.length - 1; j++) {
                randomCombination[i] = cardSuit[(int) Math.round(Math.random() * (cardSuit.length - 1))]
                        + " " + cardSeniority[(int) Math.round(Math.random() * (cardSeniority.length - 1))];
            }
            cardsOnHands[i][0] = randomCombination[i];
        }
        return cardsOnHands;
    }
}


