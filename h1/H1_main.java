package h1;

import java.util.Arrays;

public class H1_main {
    public static void main(String[] args) {
         int[] myArray = {5, 6, 7, 10};

        System.out.println("Vorher: " + Arrays.toString(myArray));

        int left = 0;
        int right = myArray.length - 1;
        while (left < right) {
            int tmp = myArray[left];
            myArray[left] = myArray[right];
            myArray[right] = tmp;
            left++;
            right--;
        }

        System.out.println("Nachher: " + Arrays.toString(myArray));
    }
}
