/**
 * @(#)Task_6.class   1.0  28/11/2017
 */
package Massive;

import java.util.Arrays;

/**
 * Класс определяет, равны ли между собой соответствующие элементы двумерных массивов.
 *
 *  @version 1.0 28 Nov 2017
 *  @author Vlad Marchenko
 */

public class task_6 {
    public static boolean equalsTo(int x,int y, int i, int j,Arrays arr[][],Arrays ard[][]) {
        return arr[x][y].equals(arr[i][j]);
    }
}
