package com.masterjedi;

/**
 * Created by MasterJedi on 04.09.2016.
 */
public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }

            if (x == 2) {
                System.out.print("b c");
            }

            x--;
            System.out.print("-");

            if (x == 1) {
                System.out.print("d");
                x--;
            }
        }
    }
}
