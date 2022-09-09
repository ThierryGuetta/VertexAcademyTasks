package Arrays.Task005;

import java.util.Arrays;

public class Task005 {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * (10 - 1) + 1);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            array[i * 2 + 1] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
