/**
 * @(#)Task_10.class 1.0  28/11/2017
 */
package Massive;

import java.util.Random;

/**
 * Класс определяет значение факториала случайного числа и выводит его на экран..
 *
 *  @version 1.0 28 Nov 2017
 *  @author Vlad Marchenko
 */

public class Task_10 {

    private static Random rand = new Random(); // Создание новой функции Random.

    public static void main(String[] args) {

        int a = rand.nextInt(9 + 1);
        int f = 1;
        // Вычисление факториала.
        for (int ind = 1; ind <= a; ind++) {
            f *= ind;
        }
        System.out.println(a + "! = " + f);
    }
}
