/**
 * @(#)Task_5.class   1.0  28/11/2017
 */
package Massive;

/**
 * Класс заменяет 1 на *, 0 на пробел все элементы двумерного массива, заполненного "бабочкой".
 *
 *  @version 1.0 28 Nov 2017
 *  @author Vlad Marchenko
 */

public class task_5 {
    public static void main(String[] args) {
        String arr[][] = {
                {"1","1","1","1","1"},
                {"0","1","1","1","0"},
                {"0","0","1","0","0"},
                {"0","1","1","1","0"},
                {"1","1","1","1","1"}
        };
        int i = 0;
        int j = 0;
        // Заменяем 1 на *, 0 на пробел
        for (; i < 5; i++) {
            for (j=0; j < 5; j++) {
                if (arr[i][j].equals("1")) {
                    arr[i][j] = "*";
                    System.out.print(arr[i][j]);
                } else {
                    arr[i][j] = " ";
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }

       /* int arr[][] = new int[5][5];
        int i, j;

        for (i = 0; i < arr.length / 2 + 1; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i)))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }

        for (i = arr.length - 1; i >= arr.length / 2 + 1; i--) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                out.print(arr[i][j]);
            }
            out.println(" ");
        }*/
    }
}
