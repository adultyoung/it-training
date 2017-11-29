/**
 * @(#)Task_3.class   1.0  28/11/2017
 */
package Massive;

import java.util.Arrays;
import java.util.Random;

/**
 * Класс определяет сумму элементов целочисленного массива, находящего между минимальным и максимальным значением.
 *
 *  @version 1.0 29 Nov 2017
 *  @author Vlad Marchenko
 */

public class task_3 {

    private static Random rand = new Random(); //обьявление нового Random функции.

    public static void main(String[] args) {

        int[] arr = new int[10];
        //присвоение случайных значений массиву.
        for (int c = 0; c < arr.length; c++) {
            arr[c] = rand.nextInt(100);
        }
        System.out.println("Массив: " + Arrays.toString(arr));

        int max = arr[0];
        int maxInd = 0;
        int min = arr[0];
        int minInd = 0;
        //нахождение максимального и минимального значения массива и его индекса.
        for (int i = 0; i != arr.length; i ++){
            if (arr[i] > max) {
                max = arr[i];
                maxInd = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minInd = i;
            }
        }
        System.out.println(getSumm(minInd, maxInd, arr, 0));

    }

    /** Функция определяетс сумму чисел в массиве, расположенного в пределах максимума и минимума массива */
    private static String getSumm (int min, int max, int[] arr, int summ) {
        if (min < max) {
            min ++;
            for (; min < max; min ++) {
                summ += arr[min];
            }
            return "Сумма равна: " + summ;
        } else {
            min --;
            for (; min > max; min --) {
                summ += arr[min];
            }
            return "Сумма равна: " + summ;
        }
    }
}
