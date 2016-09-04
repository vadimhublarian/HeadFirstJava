package com.masterjedi;

/**
 * Created by MasterJedi on 04.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            /* 1й вариант

                y = x - y;
            */

            /* 2й вариант

                y = y + x;
            */

            /* 3й вариант

                y = y + 2;
                if(y > 4){
                    y--;
                }
            */

            /* 4й вариант

                x++;
                y = y + x;
            */

            /* 5й вариант

                if(y < 5){
                    x++;
                    if(y < 3){
                        x--;
                    }
                }
                y = y + 2;
            */

            System.out.print(x + "" + y + " ");
            x++;
        }
    }
}
