/**
 * @(#)Task_6.class 1.0  28/11/2017
 */
package Massive;

import java.util.Arrays;
import java.util.Random;

/**
 * Класс определяет, равны ли между собой соответствующие элементы двумерных массивов.
 *
 * @author Vlad Marchenko
 * @version 1.0 28 Nov 2017
 */

public class task_6 {

    private static Random rand = new Random();

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3}, {3, 2, 1}
        };
        int b[][] = {
                {3, 2, 1}, {1, 2, 3}
        };
        if (equalsTo(rand.nextInt(2), rand.nextInt(3), rand.nextInt(2), rand.nextInt(3), a, b)) {
            System.out.println("одинаковы");
        } else {
            System.out.println(" не одинаковы");
        }
    }

    public static boolean equalsTo(int x, int y, int i, int j, int arr[][], int ard[][]) {
        System.out.println("a[" + i + "][" + j + "] = " + arr[i][j]);
        System.out.println("b[" + x + "][" + y + "] = " + ard[x][y]);
        return arr[i][j] == ard[x][y];
    }
}
