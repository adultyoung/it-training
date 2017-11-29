/**
 * @(#)Task_4.class   1.0  28/11/2017
 */
package Massive;

import java.util.Arrays;
import java.util.Random;

/**
 * Класс определяет, является ли массив строго возрастающей прогрессией или нет.
 *
 *  @version 1.0 29 Nov 2017
 *  @author Vlad Marchenko
 */

public class task_4 {

    private static Random rand = new Random(); // Обьявление новой функции Random

    public static void main(String[] args) {

        int[] arr = new int[4];
        // Заполнение случайными значениями массива
        for (int c = 0; c < arr.length; c++) {
            arr[c] = rand.nextInt(90) +10;
        }
        System.out.println("Массив: " + Arrays.toString(arr));
        // Опредедение несоответствий строго возрастающей прогресси
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] >= arr[i]) {
                System.out.println("Строго возрастающей прогрессии нет");
                return;
            }
        }
        System.out.println("Строго возрастающая прогрессия есть");

    }
}
