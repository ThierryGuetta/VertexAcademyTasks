package Arrays.Task004;

import java.util.Arrays;

public class Task004 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * (15 - (-15))) + (-15);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Номер ячейки максимального элемента: " + index);
    }
}