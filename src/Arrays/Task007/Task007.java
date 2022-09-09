package Arrays.Task007;

import java.util.Arrays;

public class Task007 {
    public static void main(String[] args) {
        int[] one = new int[5];
        int[] two = new int[5];

        for (int i = 0; i < one.length; i++) {
            one[i] = (int) Math.floor(Math.random() * 5);
        }
        for (int i = 0; i < two.length; i++) {
            two[i] = (int) Math.floor(Math.random() * 5);
        }
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        int sumOne = 0;
        int sumTwo = 0;

        for (int i = 0; i < one.length; i++) {
            sumOne += one[i];
        }

        for (int i = 0; i < two.length; i++) {
            sumTwo += two[i];
        }
        System.out.println("Среднее арифметическое первого массива: " + sumOne / one.length);
        System.out.println("Среднее арифметическое второго массива: " + sumTwo / two.length);
        if (sumOne / one.length < sumTwo / two.length) {
            System.out.println("Среднее арифметичкое первого массива меньше второго");
        } else if ((sumOne / one.length > sumTwo / two.length)) {
            System.out.println("Среднее арифметичкое первого массива больше второго");
        } else System.out.println("Средние арифметические равны");

    }
}
