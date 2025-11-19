package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int n = 299;          
        int digits = 0;       
        int[] a = new int[9];
      
        if (n == 0) {
            digits = 1;
           
        } else {
            int temp = n;
            int idx = 8; 
            while (temp > 0 && idx >= 0) {
                int digit = temp % 10;
                a[idx] = digit;
                temp = temp / 10;
                idx--;
                digits++;
            }
           
        }

        System.out.println("n = " + n);
        System.out.println("digits = " + digits);
        System.out.println("a = " + Arrays.toString(a));
    }
}
