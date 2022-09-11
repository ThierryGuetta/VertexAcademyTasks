package Arrays.Task008;

import java.util.Arrays;
import java.util.Scanner;

public class Task008 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше 3х");
        do {
            n = scanner.nextInt();
            if (n <= 3) {
                System.out.println("Введите число больше 3х");
            } else break;
        } while (scanner.hasNextInt());
        if (n == 0) return;

        int[] firstArray = new int[n];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) Math.floor(Math.random() * n);
        }
        System.out.println("Первый массив: " + Arrays.toString(firstArray));

        int index = 0;
        for (int j : firstArray) {
            if (j % 2 == 0) index++;
        }

        int[] secondArray = new int[index];

        index = 0;
            for (int k : firstArray) {
                if (k % 2 == 0) {
                    secondArray[index] = k;
                    index++;
                }
            }
        if (secondArray.length == 0) {
            System.out.println("Второй массив пуст");
        } else {
            System.out.println("Второй массив: " + Arrays.toString(secondArray));
        }
    }
}
