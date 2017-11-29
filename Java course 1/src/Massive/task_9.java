/**
 * @(#)Task_9.class   1.0  28/11/2017
 */
package Massive;

import java.util.Random;

/**
 * Класс определяет, является ли целое число простым и выводит результат на экран.
 *
 *  @version 1.0 28 Nov 2017
 *  @author Vlad Marchenko
 */

public class task_9 {
    private static Random rand = new Random();

    public static void main(String[] args) {
        int a =  rand.nextInt(100);
        if ((a==2) || (a==3)) {
            System.out.println("Число " + a + " является простым числом");
        } else {
            if ((a % 2 == 0) || (a % 3 == 0)) {
                System.out.println("Число " + a + " не является простым числом");
            } else {
                System.out.println("Число " + a + " является простым числом");
            }
        }
    }
}
