package Arrays.Task002;

import java.util.Arrays;
import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        String[] cardSuit = {"Черви", "Буби", "Крести", "Пики"};
        String[] cardSeniority = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        Scanner scanner = new Scanner(System.in);
        int playersCount = scanner.nextInt();
        int cardCount = 5;

        for (int i = 1; i <= playersCount; i++) {
            System.out.print("У игрока " + i + " на руках карты ");
            cardSorting(cardSuit,cardSeniority,cardCount);
        }
    }

        public static void cardSorting (String[]cardSuit, String[]cardSeniority,int cardCount){
            String[][] combinationOnHands = new String[cardCount][1];
            String[] randomCombination = new String[5];
            for (int i = 0; i <= combinationOnHands.length - 1; i++) {
                for (int j = 0; j <= randomCombination.length - 1; j++) {
                    randomCombination[i] = cardSuit[(int) Math.round(Math.random() * (cardSuit.length - 1))]
                            + " " + cardSeniority[(int) Math.round(Math.random() * (cardSeniority.length - 1))];
                }
                combinationOnHands[i][0] = randomCombination[i];

                System.out.println(Arrays.deepToString(combinationOnHands));
            }
        }
    }
