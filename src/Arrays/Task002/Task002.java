package Arrays.Task002;

import java.util.Random;
import java.util.Scanner;

public class Task002 {
    public static String[] cardSuit = {"Черви", "Буби", "Крести", "Пики"};
    public static String[] cardSeniority = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
    public static String[] randomCombination = new String[52];

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите допустимое количество игроков для игры (от 2х до 10):");
        int playersCount = scanner.nextInt();
        if (playersCount > 10 || playersCount == 0 || playersCount == 1) {
            System.out.println("Недопустимое количество игроков!");
            return;
        }
        System.out.println("Перемешиваем колоду...");
        Thread.sleep(2000);
        cardSorting();

        System.out.println("Раздаем карты...");
        Thread.sleep(2000);
        cardDistribution(playersCount);
    }


    public static void cardSorting() {

        for (int i = 0; i < cardSeniority.length; i++) {
            randomCombination[i] = cardSuit[0] + " " + cardSeniority[i];
        }
        for (int i = 0; i < cardSeniority.length; i++) {
            randomCombination[13 + i] = cardSuit[1] + " " + cardSeniority[i];
        }
        for (int i = 0; i < cardSeniority.length; i++) {
            randomCombination[26 + i] = cardSuit[2] + " " + cardSeniority[i];
        }
        for (int i = 0; i < cardSeniority.length; i++) {
            randomCombination[39 + i] = cardSuit[3] + " " + cardSeniority[i];
        }
        Random rnd = new Random();
        for (int i = 0; i < randomCombination.length; i++) {
            int index = rnd.nextInt(i + 1);
            String tmp = randomCombination[index];
            randomCombination[index] = randomCombination[i];
            randomCombination[i] = tmp;
        }
    }

    public static void cardDistribution(int playersCount) {
        int index = 0;
        for (int i = 1; i <= playersCount; i++) {
            System.out.print("У игрока " + i + " карты: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(randomCombination[index] + ", ");
                index++;
            }
            System.out.println();
        }
    }
}







