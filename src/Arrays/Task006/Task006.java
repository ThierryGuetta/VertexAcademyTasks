package Arrays.Task006;

import java.util.Arrays;

public class Task006 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * (99 - 10) * 10);
        }
        System.out.println(Arrays.toString(array));

        boolean index = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) index = false;
        }
        if (index) {
            System.out.println("Строгая последовательность");
        } else {
            System.out.println("Не строгая последовательность");
        }
    }
}

