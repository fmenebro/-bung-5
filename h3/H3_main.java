package h3;

import java.util.Arrays;

public class H3_main {
    public static void main(String[] args) {
       
        int[][] einheiten = new int[2][15];

      
        int[] values = {
            50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1
        };
        System.arraycopy(values, 0, einheiten[0], 0, values.length);

       
        int input = 6279; 

        int remaining = input;

     
        for (int i = 0; i < einheiten[0].length; i++) {
            int value = einheiten[0][i];
            if (value <= 0) {
                einheiten[1][i] = 0;
                continue;
            }
            int count = remaining / value;
            einheiten[1][i] = count;
            remaining = remaining - count * value;
        }

     
        System.out.println("Werte (in Cent): " + Arrays.toString(einheiten[0]));
        System.out.println("Anzahl der Stücke: " + Arrays.toString(einheiten[1]));
        System.out.println("Ursprünglicher Betrag (in Cent): " + input);
        System.out.println("Verbleibender Rest (in Cent, sollte 0 sein): " + remaining);
    }
}
