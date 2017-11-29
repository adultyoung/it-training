/**
 * @(#)Task_7.class   1.0  28/11/2017
 */
package Massive;

import java.util.Random;

/**
 * Класс эмулирует выдачу случайной карты из калоды в 52 карты и выводит карту в виде "Карта of Масть" на экран.
 *
 *  @version 1.0 28 Nov 2017
 *  @author Vlad Marchenko
 */

public class task_7 {

    private static Random rand = new Random(); // Создание новой функции Random.

    public static void main(String[] args) {
        String y[] = new String[]{"Hearts","Spades","Clubs","Diamonds"};
        String x[] = new String[]{"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
        int i=rand.nextInt(13);
        int j =rand.nextInt(4);
        System.out.println(x[i]+" of "+y[j]);

    }
}
