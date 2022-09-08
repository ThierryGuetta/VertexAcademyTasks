package Arrays.Task001;

import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World", "Welcome", "To", "My", "Solution", ":)"};

        for (int i = 0; i < stringArray.length / 2; i++) {
            String tmp = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - 1 - i];
            stringArray[stringArray.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(stringArray));
    }
}
