package Arrays.Task003;

import java.util.Arrays;
import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strArray = string.split(" ");
        System.out.println(strArray.length);
    }
}
